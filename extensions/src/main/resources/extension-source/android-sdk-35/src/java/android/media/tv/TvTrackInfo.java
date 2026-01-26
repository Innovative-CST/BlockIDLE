package android.media.tv;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class TvTrackInfo implements Parcelable
{
    @NonNull
    public static final Creator<TvTrackInfo> CREATOR;
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_SUBTITLE = 2;
    public static final int TYPE_VIDEO = 1;
    
    TvTrackInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getEncoding() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEncrypted() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSampleRate() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAudioDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHardOfHearing() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSpokenSubtitle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVideoFrameRate() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVideoPixelAspectRatio() {
        throw new RuntimeException("Stub!");
    }
    
    public byte getVideoActiveFormatDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtra() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
        public Builder(final int type, @NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLanguage(@NonNull final String language) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@NonNull final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncoding(@Nullable final String encoding) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncrypted(final boolean encrypted) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioChannelCount(final int audioChannelCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioSampleRate(final int audioSampleRate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioDescription(final boolean audioDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHardOfHearing(final boolean hardOfHearing) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSpokenSubtitle(final boolean spokenSubtitle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoWidth(final int videoWidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoHeight(final int videoHeight) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoFrameRate(final float videoFrameRate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoPixelAspectRatio(final float videoPixelAspectRatio) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVideoActiveFormatDescription(final byte videoActiveFormatDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtra(@NonNull final Bundle extra) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TvTrackInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
