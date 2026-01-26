package android.app;

import android.os.Parcel;
import android.content.Intent;
import java.util.Map;
import android.os.Parcelable;

public final class ApplicationStartInfo implements Parcelable
{
    @NonNull
    public static final Creator<ApplicationStartInfo> CREATOR;
    public static final int LAUNCH_MODE_SINGLE_INSTANCE = 2;
    public static final int LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK = 4;
    public static final int LAUNCH_MODE_SINGLE_TASK = 3;
    public static final int LAUNCH_MODE_SINGLE_TOP = 1;
    public static final int LAUNCH_MODE_STANDARD = 0;
    public static final int STARTUP_STATE_ERROR = 1;
    public static final int STARTUP_STATE_FIRST_FRAME_DRAWN = 2;
    public static final int STARTUP_STATE_STARTED = 0;
    public static final int START_REASON_ALARM = 0;
    public static final int START_REASON_BACKUP = 1;
    public static final int START_REASON_BOOT_COMPLETE = 2;
    public static final int START_REASON_BROADCAST = 3;
    public static final int START_REASON_CONTENT_PROVIDER = 4;
    public static final int START_REASON_JOB = 5;
    public static final int START_REASON_LAUNCHER = 6;
    public static final int START_REASON_LAUNCHER_RECENTS = 7;
    public static final int START_REASON_OTHER = 8;
    public static final int START_REASON_PUSH = 9;
    public static final int START_REASON_SERVICE = 10;
    public static final int START_REASON_START_ACTIVITY = 11;
    public static final int START_TIMESTAMP_APPLICATION_ONCREATE = 2;
    public static final int START_TIMESTAMP_BIND_APPLICATION = 3;
    public static final int START_TIMESTAMP_FIRST_FRAME = 4;
    public static final int START_TIMESTAMP_FORK = 1;
    public static final int START_TIMESTAMP_FULLY_DRAWN = 5;
    public static final int START_TIMESTAMP_INITIAL_RENDERTHREAD_FRAME = 6;
    public static final int START_TIMESTAMP_LAUNCH = 0;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER = 30;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER_START = 21;
    public static final int START_TIMESTAMP_RESERVED_RANGE_SYSTEM = 20;
    public static final int START_TIMESTAMP_SURFACEFLINGER_COMPOSITION_COMPLETE = 7;
    public static final int START_TYPE_COLD = 1;
    public static final int START_TYPE_HOT = 3;
    public static final int START_TYPE_UNSET = 0;
    public static final int START_TYPE_WARM = 2;
    
    ApplicationStartInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartupState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRealUid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPackageUid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefiningUid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReason() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, Long> getStartupTimestamps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLaunchMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean wasForceStopped() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
