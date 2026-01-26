package android.media.session;

import android.os.Bundle;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class PlaybackState implements Parcelable
{
    public static final long ACTION_FAST_FORWARD = 64L;
    public static final long ACTION_PAUSE = 2L;
    public static final long ACTION_PLAY = 4L;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
    public static final long ACTION_PLAY_FROM_URI = 8192L;
    public static final long ACTION_PLAY_PAUSE = 512L;
    public static final long ACTION_PREPARE = 16384L;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
    public static final long ACTION_PREPARE_FROM_URI = 131072L;
    public static final long ACTION_REWIND = 8L;
    public static final long ACTION_SEEK_TO = 256L;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304L;
    public static final long ACTION_SET_RATING = 128L;
    public static final long ACTION_SKIP_TO_NEXT = 32L;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
    public static final long ACTION_STOP = 1L;
    @NonNull
    public static final Creator<PlaybackState> CREATOR;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    
    PlaybackState() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public long getBufferedPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public float getPlaybackSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    public long getActions() {
        throw new RuntimeException("Stub!");
    }
    
    public List<CustomAction> getCustomActions() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getErrorMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastPositionUpdateTime() {
        throw new RuntimeException("Stub!");
    }
    
    public long getActiveQueueItemId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive() {
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
        
        public Builder(final PlaybackState from) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setState(final int state, final long position, final float playbackSpeed, final long updateTime) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setState(final int state, final long position, final float playbackSpeed) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setActions(final long actions) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCustomAction(final String action, final String name, final int icon) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCustomAction(final CustomAction customAction) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setBufferedPosition(final long bufferedPosition) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setActiveQueueItemId(final long id) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setErrorMessage(final CharSequence error) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtras(final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public PlaybackState build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CustomAction implements Parcelable
    {
        @NonNull
        public static final Creator<CustomAction> CREATOR;
        
        CustomAction() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        public String getAction() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIcon() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder(final String action, final CharSequence name, final int icon) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setExtras(final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
            
            public CustomAction build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
