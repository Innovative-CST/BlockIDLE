package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioProfile implements Parcelable
{
    public static final int AUDIO_ENCAPSULATION_TYPE_IEC61937 = 1;
    public static final int AUDIO_ENCAPSULATION_TYPE_NONE = 0;
    public static final int AUDIO_ENCAPSULATION_TYPE_PCM = 2;
    @NonNull
    public static final Creator<AudioProfile> CREATOR;
    
    AudioProfile() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getChannelMasks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getChannelIndexMasks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getSampleRates() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEncapsulationType() {
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
}
