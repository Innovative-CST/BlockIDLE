package androidx.appcompat.widget;

import org.xmlpull.v1.XmlSerializer;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import java.io.FileInputStream;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import java.io.InputStream;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Collection;
import android.os.AsyncTask;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import android.content.Intent;
import android.content.Context;
import java.util.List;
import java.util.Map;
import android.database.DataSetObservable;

class ActivityChooserModel extends DataSetObservable
{
    static final boolean DEBUG = false;
    static final String LOG_TAG;
    static final String TAG_HISTORICAL_RECORDS = "historical-records";
    static final String TAG_HISTORICAL_RECORD = "historical-record";
    static final String ATTRIBUTE_ACTIVITY = "activity";
    static final String ATTRIBUTE_TIME = "time";
    static final String ATTRIBUTE_WEIGHT = "weight";
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final Object sRegistryLock;
    private static final Map<String, ActivityChooserModel> sDataModelRegistry;
    private final Object mInstanceLock;
    private final List<ActivityResolveInfo> mActivities;
    private final List<HistoricalRecord> mHistoricalRecords;
    final Context mContext;
    final String mHistoryFileName;
    private Intent mIntent;
    private ActivitySorter mActivitySorter;
    private int mHistoryMaxSize;
    boolean mCanReadHistoricalData;
    private boolean mReadShareHistoryCalled;
    private boolean mHistoricalRecordsChanged;
    private boolean mReloadActivities;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    
    public static ActivityChooserModel get(final Context context, final String historyFileName) {
        synchronized (ActivityChooserModel.sRegistryLock) {
            ActivityChooserModel dataModel = (ActivityChooserModel)ActivityChooserModel.sDataModelRegistry.get((Object)historyFileName);
            if (dataModel == null) {
                dataModel = new ActivityChooserModel(context, historyFileName);
                ActivityChooserModel.sDataModelRegistry.put((Object)historyFileName, (Object)dataModel);
            }
            return dataModel;
        }
    }
    
    private ActivityChooserModel(final Context context, final String historyFileName) {
        this.mInstanceLock = new Object();
        this.mActivities = (List<ActivityResolveInfo>)new ArrayList();
        this.mHistoricalRecords = (List<HistoricalRecord>)new ArrayList();
        this.mActivitySorter = new DefaultSorter();
        this.mHistoryMaxSize = 50;
        this.mCanReadHistoricalData = true;
        this.mReadShareHistoryCalled = false;
        this.mHistoricalRecordsChanged = true;
        this.mReloadActivities = false;
        this.mContext = context.getApplicationContext();
        if (!TextUtils.isEmpty((CharSequence)historyFileName) && !historyFileName.endsWith(".xml")) {
            this.mHistoryFileName = historyFileName + ".xml";
        }
        else {
            this.mHistoryFileName = historyFileName;
        }
    }
    
    public void setIntent(final Intent intent) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == intent) {
                return;
            }
            this.mIntent = intent;
            this.mReloadActivities = true;
            this.ensureConsistentState();
        }
    }
    
    public Intent getIntent() {
        synchronized (this.mInstanceLock) {
            return this.mIntent;
        }
    }
    
    public int getActivityCount() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return this.mActivities.size();
        }
    }
    
    public ResolveInfo getActivity(final int index) {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return ((ActivityResolveInfo)this.mActivities.get(index)).resolveInfo;
        }
    }
    
    public int getActivityIndex(final ResolveInfo activity) {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            final List<ActivityResolveInfo> activities = this.mActivities;
            for (int activityCount = activities.size(), i = 0; i < activityCount; ++i) {
                final ActivityResolveInfo currentActivity = (ActivityResolveInfo)activities.get(i);
                if (currentActivity.resolveInfo == activity) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    public Intent chooseActivity(final int index) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            this.ensureConsistentState();
            final ActivityResolveInfo chosenActivity = (ActivityResolveInfo)this.mActivities.get(index);
            final ComponentName chosenName = new ComponentName(chosenActivity.resolveInfo.activityInfo.packageName, chosenActivity.resolveInfo.activityInfo.name);
            final Intent choiceIntent = new Intent(this.mIntent);
            choiceIntent.setComponent(chosenName);
            if (this.mActivityChoserModelPolicy != null) {
                final Intent choiceIntentCopy = new Intent(choiceIntent);
                final boolean handled = this.mActivityChoserModelPolicy.onChooseActivity(this, choiceIntentCopy);
                if (handled) {
                    return null;
                }
            }
            final HistoricalRecord historicalRecord = new HistoricalRecord(chosenName, System.currentTimeMillis(), 1.0f);
            this.addHistoricalRecord(historicalRecord);
            return choiceIntent;
        }
    }
    
    public void setOnChooseActivityListener(final OnChooseActivityListener listener) {
        synchronized (this.mInstanceLock) {
            this.mActivityChoserModelPolicy = listener;
        }
    }
    
    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            if (!this.mActivities.isEmpty()) {
                return ((ActivityResolveInfo)this.mActivities.get(0)).resolveInfo;
            }
        }
        return null;
    }
    
    public void setDefaultActivity(final int index) {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            final ActivityResolveInfo newDefaultActivity = (ActivityResolveInfo)this.mActivities.get(index);
            final ActivityResolveInfo oldDefaultActivity = (ActivityResolveInfo)this.mActivities.get(0);
            float weight;
            if (oldDefaultActivity != null) {
                weight = oldDefaultActivity.weight - newDefaultActivity.weight + 5.0f;
            }
            else {
                weight = 1.0f;
            }
            final ComponentName defaultName = new ComponentName(newDefaultActivity.resolveInfo.activityInfo.packageName, newDefaultActivity.resolveInfo.activityInfo.name);
            final HistoricalRecord historicalRecord = new HistoricalRecord(defaultName, System.currentTimeMillis(), weight);
            this.addHistoricalRecord(historicalRecord);
        }
    }
    
    private void persistHistoricalDataIfNeeded() {
        if (!this.mReadShareHistoryCalled) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (!this.mHistoricalRecordsChanged) {
            return;
        }
        this.mHistoricalRecordsChanged = false;
        if (!TextUtils.isEmpty((CharSequence)this.mHistoryFileName)) {
            new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] { new ArrayList((Collection)this.mHistoricalRecords), this.mHistoryFileName });
        }
    }
    
    public void setActivitySorter(final ActivitySorter activitySorter) {
        synchronized (this.mInstanceLock) {
            if (this.mActivitySorter == activitySorter) {
                return;
            }
            this.mActivitySorter = activitySorter;
            if (this.sortActivitiesIfNeeded()) {
                this.notifyChanged();
            }
        }
    }
    
    public void setHistoryMaxSize(final int historyMaxSize) {
        synchronized (this.mInstanceLock) {
            if (this.mHistoryMaxSize == historyMaxSize) {
                return;
            }
            this.mHistoryMaxSize = historyMaxSize;
            this.pruneExcessiveHistoricalRecordsIfNeeded();
            if (this.sortActivitiesIfNeeded()) {
                this.notifyChanged();
            }
        }
    }
    
    public int getHistoryMaxSize() {
        synchronized (this.mInstanceLock) {
            return this.mHistoryMaxSize;
        }
    }
    
    public int getHistorySize() {
        synchronized (this.mInstanceLock) {
            this.ensureConsistentState();
            return this.mHistoricalRecords.size();
        }
    }
    
    private void ensureConsistentState() {
        boolean stateChanged = this.loadActivitiesIfNeeded();
        stateChanged |= this.readHistoricalDataIfNeeded();
        this.pruneExcessiveHistoricalRecordsIfNeeded();
        if (stateChanged) {
            this.sortActivitiesIfNeeded();
            this.notifyChanged();
        }
    }
    
    private boolean sortActivitiesIfNeeded() {
        if (this.mActivitySorter != null && this.mIntent != null && !this.mActivities.isEmpty() && !this.mHistoricalRecords.isEmpty()) {
            this.mActivitySorter.sort(this.mIntent, this.mActivities, (List<HistoricalRecord>)Collections.unmodifiableList((List)this.mHistoricalRecords));
            return true;
        }
        return false;
    }
    
    private boolean loadActivitiesIfNeeded() {
        if (this.mReloadActivities && this.mIntent != null) {
            this.mReloadActivities = false;
            this.mActivities.clear();
            final List<ResolveInfo> resolveInfos = (List<ResolveInfo>)this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
            for (int resolveInfoCount = resolveInfos.size(), i = 0; i < resolveInfoCount; ++i) {
                final ResolveInfo resolveInfo = (ResolveInfo)resolveInfos.get(i);
                this.mActivities.add((Object)new ActivityResolveInfo(resolveInfo));
            }
            return true;
        }
        return false;
    }
    
    private boolean readHistoricalDataIfNeeded() {
        if (this.mCanReadHistoricalData && this.mHistoricalRecordsChanged && !TextUtils.isEmpty((CharSequence)this.mHistoryFileName)) {
            this.mCanReadHistoricalData = false;
            this.mReadShareHistoryCalled = true;
            this.readHistoricalDataImpl();
            return true;
        }
        return false;
    }
    
    private boolean addHistoricalRecord(final HistoricalRecord historicalRecord) {
        final boolean added = this.mHistoricalRecords.add((Object)historicalRecord);
        if (added) {
            this.mHistoricalRecordsChanged = true;
            this.pruneExcessiveHistoricalRecordsIfNeeded();
            this.persistHistoricalDataIfNeeded();
            this.sortActivitiesIfNeeded();
            this.notifyChanged();
        }
        return added;
    }
    
    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        final int pruneCount = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (pruneCount <= 0) {
            return;
        }
        this.mHistoricalRecordsChanged = true;
        for (int i = 0; i < pruneCount; ++i) {
            final HistoricalRecord historicalRecord = (HistoricalRecord)this.mHistoricalRecords.remove(0);
        }
    }
    
    private void readHistoricalDataImpl() {
        FileInputStream fis = null;
        try {
            fis = this.mContext.openFileInput(this.mHistoryFileName);
        }
        catch (final FileNotFoundException fnfe) {
            return;
        }
        try {
            final XmlPullParser parser = Xml.newPullParser();
            parser.setInput((InputStream)fis, "UTF-8");
            for (int type = 0; type != 1 && type != 2; type = parser.next()) {}
            if (!"historical-records".equals((Object)parser.getName())) {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            final List<HistoricalRecord> historicalRecords = this.mHistoricalRecords;
            historicalRecords.clear();
            while (true) {
                final int type = parser.next();
                if (type != 1) {
                    if (type == 3) {
                        continue;
                    }
                    if (type == 4) {
                        continue;
                    }
                    final String nodeName = parser.getName();
                    if (!"historical-record".equals((Object)nodeName)) {
                        throw new XmlPullParserException("Share records file not well-formed.");
                    }
                    final String activity = parser.getAttributeValue((String)null, "activity");
                    final long time = Long.parseLong(parser.getAttributeValue((String)null, "time"));
                    final float weight = Float.parseFloat(parser.getAttributeValue((String)null, "weight"));
                    final HistoricalRecord readRecord = new HistoricalRecord(activity, time, weight);
                    historicalRecords.add((Object)readRecord);
                }
            }
        }
        catch (final XmlPullParserException xppe) {
            Log.e(ActivityChooserModel.LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, (Throwable)xppe);
        }
        catch (final IOException ioe) {
            Log.e(ActivityChooserModel.LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, (Throwable)ioe);
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (final IOException ex) {}
            }
        }
    }
    
    static {
        LOG_TAG = ActivityChooserModel.class.getSimpleName();
        sRegistryLock = new Object();
        sDataModelRegistry = (Map)new HashMap();
    }
    
    public static final class HistoricalRecord
    {
        public final ComponentName activity;
        public final long time;
        public final float weight;
        
        public HistoricalRecord(final String activityName, final long time, final float weight) {
            this(ComponentName.unflattenFromString(activityName), time, weight);
        }
        
        public HistoricalRecord(final ComponentName activityName, final long time, final float weight) {
            this.activity = activityName;
            this.time = time;
            this.weight = weight;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = 31 * result + ((this.activity == null) ? 0 : this.activity.hashCode());
            result = 31 * result + (int)(this.time ^ this.time >>> 32);
            result = 31 * result + Float.floatToIntBits(this.weight);
            return result;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            final HistoricalRecord other = (HistoricalRecord)obj;
            if (this.activity == null) {
                if (other.activity != null) {
                    return false;
                }
            }
            else if (!this.activity.equals((Object)other.activity)) {
                return false;
            }
            return this.time == other.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(other.weight);
        }
        
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("[");
            builder.append("; activity:").append((Object)this.activity);
            builder.append("; time:").append(this.time);
            builder.append("; weight:").append((Object)new BigDecimal((double)this.weight));
            builder.append("]");
            return builder.toString();
        }
    }
    
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo>
    {
        public final ResolveInfo resolveInfo;
        public float weight;
        
        public ActivityResolveInfo(final ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }
        
        @Override
        public int hashCode() {
            return 31 + Float.floatToIntBits(this.weight);
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            final ActivityResolveInfo other = (ActivityResolveInfo)obj;
            return Float.floatToIntBits(this.weight) == Float.floatToIntBits(other.weight);
        }
        
        public int compareTo(final ActivityResolveInfo another) {
            return Float.floatToIntBits(another.weight) - Float.floatToIntBits(this.weight);
        }
        
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("[");
            builder.append("resolveInfo:").append(this.resolveInfo.toString());
            builder.append("; weight:").append((Object)new BigDecimal((double)this.weight));
            builder.append("]");
            return builder.toString();
        }
    }
    
    private static final class DefaultSorter implements ActivitySorter
    {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final Map<ComponentName, ActivityResolveInfo> mPackageNameToActivityMap;
        
        DefaultSorter() {
            this.mPackageNameToActivityMap = (Map<ComponentName, ActivityResolveInfo>)new HashMap();
        }
        
        @Override
        public void sort(final Intent intent, final List<ActivityResolveInfo> activities, final List<HistoricalRecord> historicalRecords) {
            final Map<ComponentName, ActivityResolveInfo> componentNameToActivityMap = this.mPackageNameToActivityMap;
            componentNameToActivityMap.clear();
            for (int activityCount = activities.size(), i = 0; i < activityCount; ++i) {
                final ActivityResolveInfo activity = (ActivityResolveInfo)activities.get(i);
                activity.weight = 0.0f;
                final ComponentName componentName = new ComponentName(activity.resolveInfo.activityInfo.packageName, activity.resolveInfo.activityInfo.name);
                componentNameToActivityMap.put((Object)componentName, (Object)activity);
            }
            final int lastShareIndex = historicalRecords.size() - 1;
            float nextRecordWeight = 1.0f;
            for (int j = lastShareIndex; j >= 0; --j) {
                final HistoricalRecord historicalRecord = (HistoricalRecord)historicalRecords.get(j);
                final ComponentName componentName2 = historicalRecord.activity;
                final ActivityResolveInfo activity2 = (ActivityResolveInfo)componentNameToActivityMap.get((Object)componentName2);
                if (activity2 != null) {
                    final ActivityResolveInfo activityResolveInfo = activity2;
                    activityResolveInfo.weight += historicalRecord.weight * nextRecordWeight;
                    nextRecordWeight *= 0.95f;
                }
            }
            Collections.sort((List)activities);
        }
    }
    
    private final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void>
    {
        PersistHistoryAsyncTask() {
        }
        
        public Void doInBackground(final Object... args) {
            final List<HistoricalRecord> historicalRecords = (List<HistoricalRecord>)args[0];
            final String historyFileName = (String)args[1];
            FileOutputStream fos = null;
            try {
                fos = ActivityChooserModel.this.mContext.openFileOutput(historyFileName, 0);
            }
            catch (final FileNotFoundException fnfe) {
                Log.e(ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + historyFileName, (Throwable)fnfe);
                return null;
            }
            final XmlSerializer serializer = Xml.newSerializer();
            try {
                serializer.setOutput((OutputStream)fos, (String)null);
                serializer.startDocument("UTF-8", Boolean.valueOf(true));
                serializer.startTag((String)null, "historical-records");
                for (int recordCount = historicalRecords.size(), i = 0; i < recordCount; ++i) {
                    final HistoricalRecord record = (HistoricalRecord)historicalRecords.remove(0);
                    serializer.startTag((String)null, "historical-record");
                    serializer.attribute((String)null, "activity", record.activity.flattenToString());
                    serializer.attribute((String)null, "time", String.valueOf(record.time));
                    serializer.attribute((String)null, "weight", String.valueOf(record.weight));
                    serializer.endTag((String)null, "historical-record");
                }
                serializer.endTag((String)null, "historical-records");
                serializer.endDocument();
            }
            catch (final IllegalArgumentException iae) {
                Log.e(ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + ActivityChooserModel.this.mHistoryFileName, (Throwable)iae);
            }
            catch (final IllegalStateException ise) {
                Log.e(ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + ActivityChooserModel.this.mHistoryFileName, (Throwable)ise);
            }
            catch (final IOException ioe) {
                Log.e(ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + ActivityChooserModel.this.mHistoryFileName, (Throwable)ioe);
            }
            finally {
                ActivityChooserModel.this.mCanReadHistoricalData = true;
                if (fos != null) {
                    try {
                        fos.close();
                    }
                    catch (final IOException ex) {}
                }
            }
            return null;
        }
    }
    
    public interface ActivitySorter
    {
        void sort(final Intent p0, final List<ActivityResolveInfo> p1, final List<HistoricalRecord> p2);
    }
    
    public interface OnChooseActivityListener
    {
        boolean onChooseActivity(final ActivityChooserModel p0, final Intent p1);
    }
    
    public interface ActivityChooserModelClient
    {
        void setActivityChooserModel(final ActivityChooserModel p0);
    }
}
