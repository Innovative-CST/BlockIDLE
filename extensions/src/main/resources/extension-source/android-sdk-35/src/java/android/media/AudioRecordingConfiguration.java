package android.media;

import android.os.Parcel;
import android.media.audiofx.AudioEffect;
import java.util.List;
import android.os.Parcelable;

public final class AudioRecordingConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<AudioRecordingConfiguration> CREATOR;
    
    AudioRecordingConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getClientAudioSource() {
        throw new RuntimeException("Stub!");
    }
    
    public int getClientAudioSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public AudioFormat getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public AudioFormat getClientFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public AudioDeviceInfo getAudioDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClientSilenced() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSource() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioEffect.Descriptor> getClientEffects() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioEffect.Descriptor> getEffects() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
