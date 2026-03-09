package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothLeAudioCodecConfig implements Parcelable
{
    public static final int BITS_PER_SAMPLE_16 = 1;
    public static final int BITS_PER_SAMPLE_24 = 2;
    public static final int BITS_PER_SAMPLE_32 = 8;
    public static final int BITS_PER_SAMPLE_NONE = 0;
    public static final int CHANNEL_COUNT_1 = 1;
    public static final int CHANNEL_COUNT_2 = 2;
    public static final int CHANNEL_COUNT_NONE = 0;
    public static final int CODEC_PRIORITY_DEFAULT = 0;
    public static final int CODEC_PRIORITY_DISABLED = -1;
    public static final int CODEC_PRIORITY_HIGHEST = 1000000;
    @NonNull
    public static final Creator<BluetoothLeAudioCodecConfig> CREATOR;
    public static final int FRAME_DURATION_10000 = 2;
    public static final int FRAME_DURATION_7500 = 1;
    public static final int FRAME_DURATION_NONE = 0;
    public static final int SAMPLE_RATE_11025 = 2;
    public static final int SAMPLE_RATE_16000 = 4;
    public static final int SAMPLE_RATE_176400 = 1024;
    public static final int SAMPLE_RATE_192000 = 2048;
    public static final int SAMPLE_RATE_22050 = 8;
    public static final int SAMPLE_RATE_24000 = 16;
    public static final int SAMPLE_RATE_32000 = 32;
    public static final int SAMPLE_RATE_384000 = 4096;
    public static final int SAMPLE_RATE_44100 = 64;
    public static final int SAMPLE_RATE_48000 = 128;
    public static final int SAMPLE_RATE_8000 = 1;
    public static final int SAMPLE_RATE_88200 = 256;
    public static final int SAMPLE_RATE_96000 = 512;
    public static final int SAMPLE_RATE_NONE = 0;
    public static final int SOURCE_CODEC_TYPE_INVALID = 1000000;
    public static final int SOURCE_CODEC_TYPE_LC3 = 0;
    
    BluetoothLeAudioCodecConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCodecType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCodecName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCodecPriority() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBitsPerSample() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrameDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOctetsPerFrame() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinOctetsPerFrame() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxOctetsPerFrame() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final BluetoothLeAudioCodecConfig config) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecType(final int codecType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecPriority(final int codecPriority) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSampleRate(final int sampleRate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBitsPerSample(final int bitsPerSample) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChannelCount(final int channelCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFrameDuration(final int frameDuration) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOctetsPerFrame(final int octetsPerFrame) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinOctetsPerFrame(final int minOctetsPerFrame) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxOctetsPerFrame(final int maxOctetsPerFrame) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BluetoothLeAudioCodecConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
