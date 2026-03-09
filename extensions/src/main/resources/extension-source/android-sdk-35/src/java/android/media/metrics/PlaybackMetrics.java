package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class PlaybackMetrics implements Parcelable
{
    public static final int CONTENT_TYPE_AD = 2;
    public static final int CONTENT_TYPE_MAIN = 1;
    public static final int CONTENT_TYPE_OTHER = 3;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    @NonNull
    public static final Creator<PlaybackMetrics> CREATOR;
    public static final int DRM_TYPE_CLEARKEY = 6;
    public static final int DRM_TYPE_NONE = 0;
    public static final int DRM_TYPE_OTHER = 1;
    public static final int DRM_TYPE_PLAY_READY = 2;
    public static final int DRM_TYPE_WIDEVINE_L1 = 3;
    public static final int DRM_TYPE_WIDEVINE_L3 = 4;
    public static final int DRM_TYPE_WV_L3_FALLBACK = 5;
    public static final int PLAYBACK_TYPE_LIVE = 2;
    public static final int PLAYBACK_TYPE_OTHER = 3;
    public static final int PLAYBACK_TYPE_UNKNOWN = 0;
    public static final int PLAYBACK_TYPE_VOD = 1;
    public static final int STREAM_SOURCE_DEVICE = 2;
    public static final int STREAM_SOURCE_MIXED = 3;
    public static final int STREAM_SOURCE_NETWORK = 1;
    public static final int STREAM_SOURCE_UNKNOWN = 0;
    public static final int STREAM_TYPE_DASH = 3;
    public static final int STREAM_TYPE_HLS = 4;
    public static final int STREAM_TYPE_OTHER = 1;
    public static final int STREAM_TYPE_PROGRESSIVE = 2;
    public static final int STREAM_TYPE_SS = 5;
    public static final int STREAM_TYPE_UNKNOWN = 0;
    
    PlaybackMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMediaDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamSource() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPlaybackType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDrmType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getContentType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPlayerName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPlayerVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public long[] getExperimentIds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoFramesPlayed() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoFramesDropped() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioUnderrunCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNetworkBytesRead() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLocalBytesRead() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNetworkTransferDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getDrmSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getMetricsBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMediaDurationMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStreamSource(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStreamType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPlaybackType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDrmType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContentType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPlayerName(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPlayerVersion(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addExperimentId(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoFramesPlayed(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoFramesDropped(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioUnderrunCount(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkBytesRead(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocalBytesRead(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkTransferDurationMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDrmSessionId(@NonNull final byte[] drmSessionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlaybackMetrics build() {
            throw new RuntimeException("Stub!");
        }
    }
}
