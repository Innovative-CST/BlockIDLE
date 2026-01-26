package android.media.session;

import android.media.Rating;
import android.net.Uri;
import android.os.Parcel;
import android.media.AudioAttributes;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.Handler;
import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;
import android.media.MediaMetadata;
import android.view.KeyEvent;
import android.content.Context;

public final class MediaController
{
    public MediaController(@NonNull final Context context, @NonNull final MediaSession.Token token) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TransportControls getTransportControls() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchMediaButtonEvent(@NonNull final KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PlaybackState getPlaybackState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaMetadata getMetadata() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<MediaSession.QueueItem> getQueue() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getQueueTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRatingType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PlaybackInfo getPlaybackInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PendingIntent getSessionActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaSession.Token getSessionToken() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVolumeTo(final int value, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void adjustVolume(final int direction, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@NonNull final Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCommand(@NonNull final String command, @Nullable final Bundle args, @Nullable final ResultReceiver cb) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getSessionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSessionDestroyed() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSessionEvent(@NonNull final String event, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlaybackStateChanged(@Nullable final PlaybackState state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onMetadataChanged(@Nullable final MediaMetadata metadata) {
            throw new RuntimeException("Stub!");
        }
        
        public void onQueueChanged(@Nullable final List<MediaSession.QueueItem> queue) {
            throw new RuntimeException("Stub!");
        }
        
        public void onQueueTitleChanged(@Nullable final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        public void onExtrasChanged(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAudioInfoChanged(@NonNull final PlaybackInfo playbackInfo) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PlaybackInfo implements Parcelable
    {
        @NonNull
        public static final Creator<PlaybackInfo> CREATOR;
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        
        PlaybackInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPlaybackType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolumeControl() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMaxVolume() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCurrentVolume() {
            throw new RuntimeException("Stub!");
        }
        
        public AudioAttributes getAudioAttributes() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getVolumeControlId() {
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
        
        static {
            CREATOR = null;
        }
    }
    
    public final class TransportControls
    {
        TransportControls() {
            throw new RuntimeException("Stub!");
        }
        
        public void prepare() {
            throw new RuntimeException("Stub!");
        }
        
        public void prepareFromMediaId(final String mediaId, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void prepareFromSearch(final String query, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void prepareFromUri(final Uri uri, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void play() {
            throw new RuntimeException("Stub!");
        }
        
        public void playFromMediaId(final String mediaId, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void playFromSearch(final String query, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void playFromUri(final Uri uri, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void skipToQueueItem(final long id) {
            throw new RuntimeException("Stub!");
        }
        
        public void pause() {
            throw new RuntimeException("Stub!");
        }
        
        public void stop() {
            throw new RuntimeException("Stub!");
        }
        
        public void seekTo(final long pos) {
            throw new RuntimeException("Stub!");
        }
        
        public void fastForward() {
            throw new RuntimeException("Stub!");
        }
        
        public void skipToNext() {
            throw new RuntimeException("Stub!");
        }
        
        public void rewind() {
            throw new RuntimeException("Stub!");
        }
        
        public void skipToPrevious() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRating(final Rating rating) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPlaybackSpeed(final float speed) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendCustomAction(@NonNull final PlaybackState.CustomAction customAction, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendCustomAction(@NonNull final String action, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
    }
}
