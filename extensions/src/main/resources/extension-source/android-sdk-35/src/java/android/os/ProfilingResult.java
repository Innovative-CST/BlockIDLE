package android.os;

public final class ProfilingResult implements Parcelable
{
    @NonNull
    public static final Creator<ProfilingResult> CREATOR;
    public static final int ERROR_FAILED_EXECUTING = 4;
    public static final int ERROR_FAILED_INVALID_REQUEST = 7;
    public static final int ERROR_FAILED_NO_DISK_SPACE = 6;
    public static final int ERROR_FAILED_POST_PROCESSING = 5;
    public static final int ERROR_FAILED_PROFILING_IN_PROGRESS = 3;
    public static final int ERROR_FAILED_RATE_LIMIT_PROCESS = 2;
    public static final int ERROR_FAILED_RATE_LIMIT_SYSTEM = 1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = 8;
    
    ProfilingResult() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public int getErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getResultFilePath() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getErrorMessage() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
