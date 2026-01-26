package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothCodecConfig implements Parcelable
{
    public static final int BITS_PER_SAMPLE_16 = 1;
    public static final int BITS_PER_SAMPLE_24 = 2;
    public static final int BITS_PER_SAMPLE_32 = 4;
    public static final int BITS_PER_SAMPLE_NONE = 0;
    public static final int CHANNEL_MODE_MONO = 1;
    public static final int CHANNEL_MODE_NONE = 0;
    public static final int CHANNEL_MODE_STEREO = 2;
    public static final int CODEC_PRIORITY_DEFAULT = 0;
    public static final int CODEC_PRIORITY_DISABLED = -1;
    public static final int CODEC_PRIORITY_HIGHEST = 1000000;
    @NonNull
    public static final Creator<BluetoothCodecConfig> CREATOR;
    public static final int SAMPLE_RATE_176400 = 16;
    public static final int SAMPLE_RATE_192000 = 32;
    public static final int SAMPLE_RATE_44100 = 1;
    public static final int SAMPLE_RATE_48000 = 2;
    public static final int SAMPLE_RATE_88200 = 4;
    public static final int SAMPLE_RATE_96000 = 8;
    public static final int SAMPLE_RATE_NONE = 0;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_AAC = 1;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_APTX = 2;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_APTX_HD = 3;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_INVALID = 1000000;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_LC3 = 5;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_LDAC = 4;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_OPUS = 6;
    @Deprecated
    public static final int SOURCE_CODEC_TYPE_SBC = 0;
    
    BluetoothCodecConfig() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCodecType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothCodecType getExtendedCodecType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMandatoryCodec() {
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
    
    public int getChannelMode() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCodecSpecific1() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCodecSpecific2() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCodecSpecific3() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCodecSpecific4() {
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
        
        @Deprecated
        @NonNull
        public Builder setCodecType(final int codecType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtendedCodecType(@Nullable final BluetoothCodecType codecType) {
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
        public Builder setChannelMode(final int channelMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecSpecific1(final long codecSpecific1) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecSpecific2(final long codecSpecific2) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecSpecific3(final long codecSpecific3) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecSpecific4(final long codecSpecific4) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BluetoothCodecConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
