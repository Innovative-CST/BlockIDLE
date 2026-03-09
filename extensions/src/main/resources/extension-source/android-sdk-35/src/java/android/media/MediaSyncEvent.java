package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaSyncEvent implements Parcelable
{
    @NonNull
    public static final Creator<MediaSyncEvent> CREATOR;
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    
    MediaSyncEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaSyncEvent createEvent(final int eventType) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public MediaSyncEvent setAudioSessionId(final int audioSessionId) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSessionId() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
