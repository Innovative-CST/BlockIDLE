package android.media.audiofx;

public class HapticGenerator extends AudioEffect implements AutoCloseable
{
    HapticGenerator() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static HapticGenerator create(final int audioSession) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
