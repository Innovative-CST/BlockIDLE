package android.media.metrics;

import android.os.Parcel;
import android.util.Size;
import java.util.List;
import android.os.Parcelable;

public final class MediaItemInfo implements Parcelable
{
    @NonNull
    public static final Creator<MediaItemInfo> CREATOR;
    public static final long DATA_TYPE_AUDIO = 4L;
    public static final long DATA_TYPE_DEPTH = 16L;
    public static final long DATA_TYPE_GAIN_MAP = 32L;
    public static final long DATA_TYPE_GAPLESS = 256L;
    public static final long DATA_TYPE_HIGH_DYNAMIC_RANGE_VIDEO = 1024L;
    public static final long DATA_TYPE_HIGH_FRAME_RATE = 64L;
    public static final long DATA_TYPE_IMAGE = 1L;
    public static final long DATA_TYPE_METADATA = 8L;
    public static final long DATA_TYPE_SPATIAL_AUDIO = 512L;
    public static final long DATA_TYPE_SPEED_SETTING_CUE_POINTS = 128L;
    public static final long DATA_TYPE_VIDEO = 2L;
    public static final int SOURCE_TYPE_CAMERA = 2;
    public static final int SOURCE_TYPE_EDITING_SESSION = 3;
    public static final int SOURCE_TYPE_GALLERY = 1;
    public static final int SOURCE_TYPE_GENERATED = 7;
    public static final int SOURCE_TYPE_LOCAL_FILE = 4;
    public static final int SOURCE_TYPE_REMOTE_FILE = 5;
    public static final int SOURCE_TYPE_REMOTE_LIVE_STREAM = 6;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int VALUE_UNSPECIFIED = -1;
    
    MediaItemInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getClipDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getContainerMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSampleMimeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getCodecNames() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSampleRateHz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAudioSampleCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Size getVideoSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVideoFrameRate() {
        throw new RuntimeException("Stub!");
    }
    
    public long getVideoSampleCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
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
        public Builder setSourceType(final int sourceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDataType(final long dataType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDurationMillis(final long durationMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClipDurationMillis(final long clipDurationMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContainerMimeType(@NonNull final String containerMimeType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSampleMimeType(@NonNull final String mimeType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCodecName(@NonNull final String codecName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioSampleRateHz(final int audioSampleRateHz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioChannelCount(final int audioChannelCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioSampleCount(final long audioSampleCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoSize(@NonNull final Size videoSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoDataSpace(final int videoDataSpace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoFrameRate(final float videoFrameRate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoSampleCount(final long videoSampleCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaItemInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
