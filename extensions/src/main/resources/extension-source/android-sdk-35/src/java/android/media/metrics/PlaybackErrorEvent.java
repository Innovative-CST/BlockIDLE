package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class PlaybackErrorEvent extends Event implements Parcelable
{
    @NonNull
    public static final Creator<PlaybackErrorEvent> CREATOR;
    public static final int ERROR_AUDIO_TRACK_INIT_FAILED = 17;
    public static final int ERROR_AUDIO_TRACK_OTHER = 19;
    public static final int ERROR_AUDIO_TRACK_WRITE_FAILED = 18;
    public static final int ERROR_DECODER_INIT_FAILED = 13;
    public static final int ERROR_DECODING_FAILED = 14;
    public static final int ERROR_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 15;
    public static final int ERROR_DECODING_FORMAT_UNSUPPORTED = 35;
    public static final int ERROR_DECODING_OTHER = 16;
    public static final int ERROR_DRM_CONTENT_ERROR = 28;
    public static final int ERROR_DRM_DEVICE_REVOKED = 29;
    public static final int ERROR_DRM_DISALLOWED_OPERATION = 26;
    public static final int ERROR_DRM_LICENSE_ACQUISITION_FAILED = 25;
    public static final int ERROR_DRM_OTHER = 30;
    public static final int ERROR_DRM_PROVISIONING_FAILED = 24;
    public static final int ERROR_DRM_SCHEME_UNSUPPORTED = 23;
    public static final int ERROR_DRM_SYSTEM_ERROR = 27;
    public static final int ERROR_IO_BAD_HTTP_STATUS = 5;
    public static final int ERROR_IO_CONNECTION_CLOSED = 8;
    public static final int ERROR_IO_CONNECTION_TIMEOUT = 7;
    public static final int ERROR_IO_DNS_FAILED = 6;
    public static final int ERROR_IO_FILE_NOT_FOUND = 31;
    public static final int ERROR_IO_NETWORK_CONNECTION_FAILED = 4;
    public static final int ERROR_IO_NETWORK_UNAVAILABLE = 3;
    public static final int ERROR_IO_NO_PERMISSION = 32;
    public static final int ERROR_IO_OTHER = 9;
    public static final int ERROR_OTHER = 1;
    public static final int ERROR_PARSING_CONTAINER_MALFORMED = 11;
    public static final int ERROR_PARSING_CONTAINER_UNSUPPORTED = 34;
    public static final int ERROR_PARSING_MANIFEST_MALFORMED = 10;
    public static final int ERROR_PARSING_MANIFEST_UNSUPPORTED = 33;
    public static final int ERROR_PARSING_OTHER = 12;
    public static final int ERROR_PLAYER_BEHIND_LIVE_WINDOW = 21;
    public static final int ERROR_PLAYER_OTHER = 22;
    public static final int ERROR_PLAYER_REMOTE = 20;
    public static final int ERROR_RUNTIME = 2;
    public static final int ERROR_UNKNOWN = 0;
    
    PlaybackErrorEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
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
        public Builder setException(@NonNull final Exception value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setErrorCode(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubErrorCode(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimeSinceCreatedMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlaybackErrorEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
}
