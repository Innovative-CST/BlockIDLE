package android.media.session;

import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Parcelable;
import android.media.Rating;
import android.net.Uri;
import android.content.Intent;
import android.os.ResultReceiver;
import java.util.List;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.AudioAttributes;
import android.content.ComponentName;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Bundle;
import android.content.Context;

public final class MediaSession
{
    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    
    public MediaSession(@NonNull final Context context, @NonNull final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public MediaSession(@NonNull final Context context, @NonNull final String tag, @Nullable final Bundle sessionInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSessionActivity(@Nullable final PendingIntent pi) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMediaButtonReceiver(@Nullable final PendingIntent mbr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMediaButtonBroadcastReceiver(@Nullable final ComponentName broadcastReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackToLocal(final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackToRemote(@NonNull final VolumeProvider volumeProvider) {
        throw new RuntimeException("Stub!");
    }
    
    public void setActive(final boolean active) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendSessionEvent(@NonNull final String event, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Token getSessionToken() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaController getController() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackState(@Nullable final PlaybackState state) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMetadata(@Nullable final MediaMetadata metadata) {
        throw new RuntimeException("Stub!");
    }
    
    public void setQueue(@Nullable final List<QueueItem> queue) {
        throw new RuntimeException("Stub!");
    }
    
    public void setQueueTitle(@Nullable final CharSequence title) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRatingType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtras(@Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCommand(@NonNull final String command, @Nullable final Bundle args, @Nullable final ResultReceiver cb) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onMediaButtonEvent(@NonNull final Intent mediaButtonIntent) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPrepare() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPrepareFromMediaId(final String mediaId, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPrepareFromSearch(final String query, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPrepareFromUri(final Uri uri, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlay() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlayFromSearch(final String query, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlayFromMediaId(final String mediaId, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlayFromUri(final Uri uri, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSkipToQueueItem(final long id) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPause() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSkipToNext() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSkipToPrevious() {
            throw new RuntimeException("Stub!");
        }
        
        public void onFastForward() {
            throw new RuntimeException("Stub!");
        }
        
        public void onRewind() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStop() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSeekTo(final long pos) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetRating(@NonNull final Rating rating) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetPlaybackSpeed(final float speed) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCustomAction(@NonNull final String action, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class QueueItem implements Parcelable
    {
        @NonNull
        public static final Creator<QueueItem> CREATOR;
        public static final int UNKNOWN_ID = -1;
        
        public QueueItem(final MediaDescription description, final long id) {
            throw new RuntimeException("Stub!");
        }
        
        public MediaDescription getDescription() {
            throw new RuntimeException("Stub!");
        }
        
        public long getQueueId() {
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
        
        @Override
        public String toString() {
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
    
    public static final class Token implements Parcelable
    {
        @NonNull
        public static final Creator<Token> CREATOR;
        
        Token() {
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
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
