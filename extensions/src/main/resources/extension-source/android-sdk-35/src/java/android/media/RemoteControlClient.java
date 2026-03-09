package android.media;

import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Looper;
import android.app.PendingIntent;

@Deprecated
public class RemoteControlClient
{
    @Deprecated
    public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_NEXT = 128;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_PAUSE = 16;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_PLAY = 4;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = 256;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_RATING = 512;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_REWIND = 2;
    @Deprecated
    public static final int FLAG_KEY_MEDIA_STOP = 32;
    @Deprecated
    public static final int PLAYSTATE_BUFFERING = 8;
    @Deprecated
    public static final int PLAYSTATE_ERROR = 9;
    @Deprecated
    public static final int PLAYSTATE_FAST_FORWARDING = 4;
    @Deprecated
    public static final int PLAYSTATE_PAUSED = 2;
    @Deprecated
    public static final int PLAYSTATE_PLAYING = 3;
    @Deprecated
    public static final int PLAYSTATE_REWINDING = 5;
    @Deprecated
    public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;
    @Deprecated
    public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;
    @Deprecated
    public static final int PLAYSTATE_STOPPED = 1;
    
    @Deprecated
    public RemoteControlClient(final PendingIntent mediaButtonIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RemoteControlClient(final PendingIntent mediaButtonIntent, final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MediaSession getMediaSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MetadataEditor editMetadata(final boolean startEmpty) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPlaybackState(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPlaybackState(final int state, final long timeInMs, final float playbackSpeed) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTransportControlFlags(final int transportControlFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMetadataUpdateListener(final OnMetadataUpdateListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPlaybackPositionUpdateListener(final OnPlaybackPositionUpdateListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnGetPlaybackPositionListener(final OnGetPlaybackPositionListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public class MetadataEditor extends MediaMetadataEditor
    {
        @Deprecated
        public static final int BITMAP_KEY_ARTWORK = 100;
        
        MetadataEditor() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Object clone() throws CloneNotSupportedException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized MetadataEditor putString(final int key, final String value) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized MetadataEditor putLong(final int key, final long value) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized MetadataEditor putBitmap(final int key, final Bitmap bitmap) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized MetadataEditor putObject(final int key, final Object object) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized void clear() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized void apply() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnPlaybackPositionUpdateListener
    {
        @Deprecated
        void onPlaybackPositionUpdate(final long p0);
    }
    
    @Deprecated
    public interface OnMetadataUpdateListener
    {
        @Deprecated
        void onMetadataUpdate(final int p0, final Object p1);
    }
    
    @Deprecated
    public interface OnGetPlaybackPositionListener
    {
        @Deprecated
        long onGetPlaybackPosition();
    }
}
