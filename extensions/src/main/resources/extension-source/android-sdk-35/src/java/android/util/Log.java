package android.util;

public final class Log
{
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    
    Log() {
        throw new RuntimeException("Stub!");
    }
    
    public static int v(@Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int v(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int d(@Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int d(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int i(@Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int i(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int w(@Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int w(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static native boolean isLoggable(@Nullable final String p0, final int p1);
    
    public static int w(@Nullable final String tag, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int e(@Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int e(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int wtf(@Nullable final String tag, @Nullable final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public static int wtf(@Nullable final String tag, @NonNull final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int wtf(@Nullable final String tag, @Nullable final String msg, @Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getStackTraceString(@Nullable final Throwable tr) {
        throw new RuntimeException("Stub!");
    }
    
    public static int println(final int priority, @Nullable final String tag, @NonNull final String msg) {
        throw new RuntimeException("Stub!");
    }
}
