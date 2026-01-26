package android.os;

public final class Trace
{
    Trace() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public static void beginSection(@NonNull final String sectionName) {
        throw new RuntimeException("Stub!");
    }
    
    public static void endSection() {
        throw new RuntimeException("Stub!");
    }
    
    public static void beginAsyncSection(@NonNull final String methodName, final int cookie) {
        throw new RuntimeException("Stub!");
    }
    
    public static void endAsyncSection(@NonNull final String methodName, final int cookie) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setCounter(@NonNull final String counterName, final long counterValue) {
        throw new RuntimeException("Stub!");
    }
}
