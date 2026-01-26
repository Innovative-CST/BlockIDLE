package android.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.FileDescriptor;
import android.content.pm.ConfigurationInfo;
import android.os.Debug;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.content.Intent;
import android.util.Size;
import java.util.List;

public class ActivityManager
{
    public static final String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
    public static final int LOCK_TASK_MODE_LOCKED = 1;
    public static final int LOCK_TASK_MODE_NONE = 0;
    public static final int LOCK_TASK_MODE_PINNED = 2;
    public static final String META_HOME_ALTERNATE = "android.app.home.alternate";
    public static final int MOVE_TASK_NO_USER_ACTION = 2;
    public static final int MOVE_TASK_WITH_HOME = 1;
    public static final int RECENT_IGNORE_UNAVAILABLE = 2;
    public static final int RECENT_WITH_EXCLUDED = 1;
    
    ActivityManager() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMemoryClass() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLargeMemoryClass() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLowRamDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<RecentTaskInfo> getRecentTasks(final int maxNum, final int flags) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public List<AppTask> getAppTasks() {
        throw new RuntimeException("Stub!");
    }
    
    public Size getAppTaskThumbnailSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int addAppTask(@NonNull final Activity activity, @NonNull final Intent intent, @Nullable final TaskDescription description, @NonNull final Bitmap thumbnail) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<RunningTaskInfo> getRunningTasks(final int maxNum) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void moveTaskToFront(final int taskId, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void moveTaskToFront(final int taskId, final int flags, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivityStartAllowedOnDisplay(@NonNull final Context context, final int displayId, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<RunningServiceInfo> getRunningServices(final int maxNum) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public PendingIntent getRunningServiceControlPanel(final ComponentName service) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void getMemoryInfo(final MemoryInfo outInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearApplicationUserData() {
        throw new RuntimeException("Stub!");
    }
    
    public List<ProcessErrorStateInfo> getProcessesInErrorState() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBackgroundRestricted() {
        throw new RuntimeException("Stub!");
    }
    
    public List<RunningAppProcessInfo> getRunningAppProcesses() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ApplicationStartInfo> getHistoricalProcessStartReasons(final int maxNum) {
        throw new RuntimeException("Stub!");
    }
    
    public void addApplicationStartInfoCompletionListener(@NonNull final Executor executor, @NonNull final Consumer<ApplicationStartInfo> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeApplicationStartInfoCompletionListener(@NonNull final Consumer<ApplicationStartInfo> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addStartInfoTimestamp(final int key, final long timestampNs) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ApplicationExitInfo> getHistoricalProcessExitReasons(@Nullable final String packageName, final int pid, final int maxNum) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProcessStateSummary(@Nullable final byte[] state) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLowMemoryKillReportSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public static void getMyMemoryState(final RunningAppProcessInfo outState) {
        throw new RuntimeException("Stub!");
    }
    
    public Debug.MemoryInfo[] getProcessMemoryInfo(final int[] pids) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void restartPackage(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void killBackgroundProcesses(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public ConfigurationInfo getDeviceConfigurationInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLauncherLargeIconDensity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLauncherLargeIconSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUserAMonkey() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isRunningInTestHarness() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isRunningInUserTestHarness() {
        throw new RuntimeException("Stub!");
    }
    
    public void dumpPackageState(final FileDescriptor fd, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWatchHeapLimit(final long pssSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearWatchHeapLimit() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isInLockTaskMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLockTaskModeState() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setVrThread(final int tid) {
        throw new RuntimeException("Stub!");
    }
    
    public void appNotResponding(@NonNull final String reason) {
        throw new RuntimeException("Stub!");
    }
    
    public static class AppTask
    {
        AppTask() {
            throw new RuntimeException("Stub!");
        }
        
        public void finishAndRemoveTask() {
            throw new RuntimeException("Stub!");
        }
        
        public RecentTaskInfo getTaskInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public void moveToFront() {
            throw new RuntimeException("Stub!");
        }
        
        public void startActivity(final Context context, final Intent intent, final Bundle options) {
            throw new RuntimeException("Stub!");
        }
        
        public void setExcludeFromRecents(final boolean exclude) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MemoryInfo implements Parcelable
    {
        @NonNull
        public static final Creator<MemoryInfo> CREATOR;
        public long advertisedMem;
        public long availMem;
        public boolean lowMemory;
        public long threshold;
        public long totalMem;
        
        public MemoryInfo() {
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
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class ProcessErrorStateInfo implements Parcelable
    {
        public static final int CRASHED = 1;
        @NonNull
        public static final Creator<ProcessErrorStateInfo> CREATOR;
        public static final int NOT_RESPONDING = 2;
        public static final int NO_ERROR = 0;
        public int condition;
        public byte[] crashData;
        public String longMsg;
        public int pid;
        public String processName;
        public String shortMsg;
        public String stackTrace;
        public String tag;
        public int uid;
        
        public ProcessErrorStateInfo() {
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
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class RecentTaskInfo extends TaskInfo implements Parcelable
    {
        @NonNull
        public static final Creator<RecentTaskInfo> CREATOR;
        @Deprecated
        public int affiliatedTaskId;
        @Deprecated
        public CharSequence description;
        @Deprecated
        public int id;
        @Deprecated
        public int persistentId;
        
        public RecentTaskInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        public void readFromParcel(final Parcel source) {
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
    
    public static class RunningAppProcessInfo implements Parcelable
    {
        @NonNull
        public static final Creator<RunningAppProcessInfo> CREATOR;
        @Deprecated
        public static final int IMPORTANCE_BACKGROUND = 400;
        public static final int IMPORTANCE_CACHED = 400;
        public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
        @Deprecated
        public static final int IMPORTANCE_EMPTY = 500;
        public static final int IMPORTANCE_FOREGROUND = 100;
        public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
        public static final int IMPORTANCE_GONE = 1000;
        public static final int IMPORTANCE_PERCEPTIBLE = 230;
        public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
        public static final int IMPORTANCE_SERVICE = 300;
        public static final int IMPORTANCE_TOP_SLEEPING = 325;
        @Deprecated
        public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
        public static final int IMPORTANCE_VISIBLE = 200;
        public static final int REASON_PROVIDER_IN_USE = 1;
        public static final int REASON_SERVICE_IN_USE = 2;
        public static final int REASON_UNKNOWN = 0;
        public int importance;
        public int importanceReasonCode;
        public ComponentName importanceReasonComponent;
        public int importanceReasonPid;
        public int lastTrimLevel;
        public int lru;
        public int pid;
        public String[] pkgList;
        public String processName;
        public int uid;
        
        public RunningAppProcessInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public RunningAppProcessInfo(final String pProcessName, final int pPid, final String[] pArr) {
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
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class RunningServiceInfo implements Parcelable
    {
        @NonNull
        public static final Creator<RunningServiceInfo> CREATOR;
        public static final int FLAG_FOREGROUND = 2;
        public static final int FLAG_PERSISTENT_PROCESS = 8;
        public static final int FLAG_STARTED = 1;
        public static final int FLAG_SYSTEM_PROCESS = 4;
        public long activeSince;
        public int clientCount;
        public int clientLabel;
        public String clientPackage;
        public int crashCount;
        public int flags;
        public boolean foreground;
        public long lastActivityTime;
        public int pid;
        public String process;
        public long restarting;
        public ComponentName service;
        public boolean started;
        public int uid;
        
        public RunningServiceInfo() {
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
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class RunningTaskInfo extends TaskInfo implements Parcelable
    {
        @NonNull
        public static final Creator<RunningTaskInfo> CREATOR;
        @Deprecated
        public CharSequence description;
        @Deprecated
        public int id;
        @Deprecated
        public int numRunning;
        @Deprecated
        public Bitmap thumbnail;
        
        public RunningTaskInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        public void readFromParcel(final Parcel source) {
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
    
    public static class TaskDescription implements Parcelable
    {
        @NonNull
        public static final Creator<TaskDescription> CREATOR;
        
        @Deprecated
        public TaskDescription(final String label, final int iconRes, final int colorPrimary) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TaskDescription(final String label, final int iconRes) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TaskDescription(final String label) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TaskDescription() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TaskDescription(final String label, final Bitmap icon, final int colorPrimary) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TaskDescription(final String label, final Bitmap icon) {
            throw new RuntimeException("Stub!");
        }
        
        public TaskDescription(final TaskDescription td) {
            throw new RuntimeException("Stub!");
        }
        
        public String getLabel() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Bitmap getIcon() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPrimaryColor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBackgroundColor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStatusBarColor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getNavigationBarColor() {
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
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setLabel(@Nullable final String label) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setIcon(final int iconRes) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setPrimaryColor(final int color) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setBackgroundColor(final int color) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setStatusBarColor(final int color) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setNavigationBarColor(final int color) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public TaskDescription build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
