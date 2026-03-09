package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class AudioAttributes implements Parcelable
{
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    @NonNull
    public static final Creator<AudioAttributes> CREATOR;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_HW_AV_SYNC = 16;
    @Deprecated
    public static final int FLAG_LOW_LATENCY = 256;
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    @Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    @Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    @Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    
    AudioAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getContentType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areHapticChannelsMuted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isContentSpatialized() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSpatializationBehavior() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAllowedCapturePolicy() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeControlStream() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final AudioAttributes aa) {
            throw new RuntimeException("Stub!");
        }
        
        public AudioAttributes build() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setUsage(final int usage) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setContentType(final int contentType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowedCapturePolicy(final int capturePolicy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsContentSpatialized(final boolean isSpatialized) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSpatializationBehavior(final int sb) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLegacyStreamType(final int streamType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHapticChannelsMuted(final boolean muted) {
            throw new RuntimeException("Stub!");
        }
    }
}
