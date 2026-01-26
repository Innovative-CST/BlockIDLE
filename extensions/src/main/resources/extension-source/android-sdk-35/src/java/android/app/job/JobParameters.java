package android.app.job;

import android.os.Parcel;
import android.net.Network;
import android.net.Uri;
import android.content.ClipData;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Parcelable;

public class JobParameters implements Parcelable
{
    @NonNull
    public static final Creator<JobParameters> CREATOR;
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNDEFINED = 0;
    public static final int STOP_REASON_USER = 13;
    
    JobParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public int getJobId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getJobNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStopReason() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getTransientExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClipData getClipData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getClipGrantFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExpeditedJob() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserInitiatedJob() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOverrideDeadlineExpired() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri[] getTriggeredContentUris() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getTriggeredContentAuthorities() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public JobWorkItem dequeueWork() {
        throw new RuntimeException("Stub!");
    }
    
    public void completeWork(@NonNull final JobWorkItem work) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
