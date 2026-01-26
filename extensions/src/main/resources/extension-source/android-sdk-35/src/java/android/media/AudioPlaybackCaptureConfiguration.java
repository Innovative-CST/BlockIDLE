package android.media;

import android.media.projection.MediaProjection;

public final class AudioPlaybackCaptureConfiguration
{
    AudioPlaybackCaptureConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaProjection getMediaProjection() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getMatchingUsages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getMatchingUids() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getExcludeUsages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getExcludeUids() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final MediaProjection projection) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMatchingUsage(final int usage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMatchingUid(final int uid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder excludeUsage(final int usage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder excludeUid(final int uid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AudioPlaybackCaptureConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
