package android.service.media;

import android.media.session.MediaSessionManager;
import android.media.session.MediaSession;
import android.media.browse.MediaBrowser;
import java.util.List;
import android.os.Bundle;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class MediaBrowserService extends Service
{
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    
    public MediaBrowserService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull final String p0, final int p1, @Nullable final Bundle p2);
    
    public abstract void onLoadChildren(@NonNull final String p0, @NonNull final Result<List<MediaBrowser.MediaItem>> p1);
    
    public void onLoadChildren(@NonNull final String parentId, @NonNull final Result<List<MediaBrowser.MediaItem>> result, @NonNull final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public void onLoadItem(final String itemId, final Result<MediaBrowser.MediaItem> result) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSessionToken(final MediaSession.Token token) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaSession.Token getSessionToken() {
        throw new RuntimeException("Stub!");
    }
    
    public final Bundle getBrowserRootHints() {
        throw new RuntimeException("Stub!");
    }
    
    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyChildrenChanged(@NonNull final String parentId) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyChildrenChanged(@NonNull final String parentId, @NonNull final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class BrowserRoot
    {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        
        public BrowserRoot(@NonNull final String rootId, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public String getRootId() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class Result<T>
    {
        Result() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendResult(final T result) {
            throw new RuntimeException("Stub!");
        }
        
        public void detach() {
            throw new RuntimeException("Stub!");
        }
    }
}
