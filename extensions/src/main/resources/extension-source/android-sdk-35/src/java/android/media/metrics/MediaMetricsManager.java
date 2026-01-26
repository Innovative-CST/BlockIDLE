package android.media.metrics;

public final class MediaMetricsManager
{
    public static final long INVALID_TIMESTAMP = -1L;
    
    MediaMetricsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PlaybackSession createPlaybackSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RecordingSession createRecordingSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranscodingSession createTranscodingSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public EditingSession createEditingSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BundleSession createBundleSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void releaseSessionId(@NonNull final String sessionId) {
        throw new RuntimeException("Stub!");
    }
}
