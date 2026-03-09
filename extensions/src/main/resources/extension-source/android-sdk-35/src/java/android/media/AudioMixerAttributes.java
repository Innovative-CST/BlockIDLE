package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class AudioMixerAttributes implements Parcelable
{
    @NonNull
    public static final Creator<AudioMixerAttributes> CREATOR;
    public static final int MIXER_BEHAVIOR_BIT_PERFECT = 1;
    public static final int MIXER_BEHAVIOR_DEFAULT = 0;
    
    AudioMixerAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AudioFormat getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMixerBehavior() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final AudioFormat format) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AudioMixerAttributes build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMixerBehavior(final int mixerBehavior) {
            throw new RuntimeException("Stub!");
        }
    }
}
