package android.view;

public final class Choreographer
{
    Choreographer() {
        throw new RuntimeException("Stub!");
    }
    
    public static Choreographer getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public void postVsyncCallback(@NonNull final VsyncCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void postFrameCallback(final FrameCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void postFrameCallbackDelayed(final FrameCallback callback, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeFrameCallback(final FrameCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeVsyncCallback(@Nullable final VsyncCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static class FrameData
    {
        FrameData() {
            throw new RuntimeException("Stub!");
        }
        
        public long getFrameTimeNanos() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrameTimeline[] getFrameTimelines() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrameTimeline getPreferredFrameTimeline() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class FrameTimeline
    {
        FrameTimeline() {
            throw new RuntimeException("Stub!");
        }
        
        public long getVsyncId() {
            throw new RuntimeException("Stub!");
        }
        
        public long getExpectedPresentationTimeNanos() {
            throw new RuntimeException("Stub!");
        }
        
        public long getDeadlineNanos() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface VsyncCallback
    {
        void onVsync(@NonNull final FrameData p0);
    }
    
    public interface FrameCallback
    {
        void doFrame(final long p0);
    }
}
