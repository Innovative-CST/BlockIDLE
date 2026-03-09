package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class PlaybackParams implements Parcelable
{
    public static final int AUDIO_FALLBACK_MODE_DEFAULT = 0;
    public static final int AUDIO_FALLBACK_MODE_FAIL = 2;
    public static final int AUDIO_FALLBACK_MODE_MUTE = 1;
    @NonNull
    public static final Creator<PlaybackParams> CREATOR;
    
    public PlaybackParams() {
        throw new RuntimeException("Stub!");
    }
    
    public PlaybackParams allowDefaults() {
        throw new RuntimeException("Stub!");
    }
    
    public PlaybackParams setAudioFallbackMode(final int audioFallbackMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioFallbackMode() {
        throw new RuntimeException("Stub!");
    }
    
    public PlaybackParams setPitch(final float pitch) {
        throw new RuntimeException("Stub!");
    }
    
    public float getPitch() {
        throw new RuntimeException("Stub!");
    }
    
    public PlaybackParams setSpeed(final float speed) {
        throw new RuntimeException("Stub!");
    }
    
    public float getSpeed() {
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
    
    static {
        CREATOR = null;
    }
}
