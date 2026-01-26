package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class TrackChangeEvent extends Event implements Parcelable
{
    @NonNull
    public static final Creator<TrackChangeEvent> CREATOR;
    public static final int TRACK_CHANGE_REASON_ADAPTIVE = 4;
    public static final int TRACK_CHANGE_REASON_INITIAL = 2;
    public static final int TRACK_CHANGE_REASON_MANUAL = 3;
    public static final int TRACK_CHANGE_REASON_OTHER = 1;
    public static final int TRACK_CHANGE_REASON_UNKNOWN = 0;
    public static final int TRACK_STATE_OFF = 0;
    public static final int TRACK_STATE_ON = 1;
    public static final int TRACK_TYPE_AUDIO = 0;
    public static final int TRACK_TYPE_TEXT = 2;
    public static final int TRACK_TYPE_VIDEO = 1;
    
    TrackChangeEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTrackState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTrackChangeReason() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getContainerMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSampleMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getCodecName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBitrate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTrackType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getLanguageRegion() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSampleRate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVideoFrameRate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Bundle getMetricsBundle() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrackState(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrackChangeReason(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContainerMimeType(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSampleMimeType(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecName(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBitrate(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimeSinceCreatedMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLanguage(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLanguageRegion(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChannelCount(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioSampleRate(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWidth(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHeight(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoFrameRate(final float value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrackChangeEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
}
