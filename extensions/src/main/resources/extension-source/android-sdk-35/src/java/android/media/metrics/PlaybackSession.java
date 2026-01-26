package android.media.metrics;

public final class PlaybackSession implements AutoCloseable
{
    PlaybackSession() {
        throw new RuntimeException("Stub!");
    }
    
    public void reportPlaybackMetrics(@NonNull final PlaybackMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportPlaybackErrorEvent(@NonNull final PlaybackErrorEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportNetworkEvent(@NonNull final NetworkEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportPlaybackStateEvent(@NonNull final PlaybackStateEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportTrackChangeEvent(@NonNull final TrackChangeEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
