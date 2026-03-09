package android.media;

import android.app.Notification;
import java.util.List;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class MediaSession2Service extends Service
{
    public static final String SERVICE_INTERFACE = "android.media.MediaSession2Service";
    
    public MediaSession2Service() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract MediaSession2 onGetSession(@NonNull final MediaSession2.ControllerInfo p0);
    
    @Nullable
    public abstract MediaNotification onUpdateNotification(@NonNull final MediaSession2 p0);
    
    public final void addSession(@NonNull final MediaSession2 session) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeSession(@NonNull final MediaSession2 session) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final List<MediaSession2> getSessions() {
        throw new RuntimeException("Stub!");
    }
    
    public static class MediaNotification
    {
        public MediaNotification(final int notificationId, @NonNull final Notification notification) {
            throw new RuntimeException("Stub!");
        }
        
        public int getNotificationId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Notification getNotification() {
            throw new RuntimeException("Stub!");
        }
    }
}
