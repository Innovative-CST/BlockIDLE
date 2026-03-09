package android.view;

public abstract class FrameStats
{
    public static final long UNDEFINED_TIME_NANO = -1L;
    
    public FrameStats() {
        throw new RuntimeException("Stub!");
    }
    
    public final long getRefreshPeriodNano() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getFrameCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final long getStartTimeNano() {
        throw new RuntimeException("Stub!");
    }
    
    public final long getEndTimeNano() {
        throw new RuntimeException("Stub!");
    }
    
    public final long getFramePresentedTimeNano(final int index) {
        throw new RuntimeException("Stub!");
    }
}
