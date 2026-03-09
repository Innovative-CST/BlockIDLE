package android.app;

import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import android.os.UserHandle;
import android.os.Parcelable;

public final class ApplicationExitInfo implements Parcelable
{
    @NonNull
    public static final Creator<ApplicationExitInfo> CREATOR;
    public static final int REASON_ANR = 6;
    public static final int REASON_CRASH = 4;
    public static final int REASON_CRASH_NATIVE = 5;
    public static final int REASON_DEPENDENCY_DIED = 12;
    public static final int REASON_EXCESSIVE_RESOURCE_USAGE = 9;
    public static final int REASON_EXIT_SELF = 1;
    public static final int REASON_FREEZER = 14;
    public static final int REASON_INITIALIZATION_FAILURE = 7;
    public static final int REASON_LOW_MEMORY = 3;
    public static final int REASON_OTHER = 13;
    public static final int REASON_PACKAGE_STATE_CHANGE = 15;
    public static final int REASON_PACKAGE_UPDATED = 16;
    public static final int REASON_PERMISSION_CHANGE = 8;
    public static final int REASON_SIGNALED = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_USER_REQUESTED = 10;
    public static final int REASON_USER_STOPPED = 11;
    
    ApplicationExitInfo() {
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
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public int getImportance() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPss() {
        throw new RuntimeException("Stub!");
    }
    
    public long getRss() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UserHandle getUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getProcessStateSummary() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputStream getTraceInputStream() throws IOException {
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
    public String toString() {
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
