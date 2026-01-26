package android.media;

import android.media.session.MediaSessionManager;
import java.util.concurrent.Executor;
import android.app.PendingIntent;
import android.content.Context;
import java.util.List;
import android.os.Bundle;

public class MediaSession2 implements AutoCloseable
{
    MediaSession2() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Session2Token getToken() {
        throw new RuntimeException("Stub!");
    }
    
    public void broadcastSessionCommand(@NonNull final Session2Command command, @Nullable final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Object sendSessionCommand(@NonNull final ControllerInfo controller, @NonNull final Session2Command command, @Nullable final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelSessionCommand(@NonNull final ControllerInfo controller, @NonNull final Object token) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackActive(final boolean playbackActive) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPlaybackActive() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ControllerInfo> getConnectedControllers() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSessionActivity(@Nullable final PendingIntent pi) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSessionCallback(@NonNull final Executor executor, @NonNull final SessionCallback callback) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaSession2 build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ControllerInfo
    {
        ControllerInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUid() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getConnectionHints() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class SessionCallback
    {
        public SessionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Session2CommandGroup onConnect(@NonNull final MediaSession2 session, @NonNull final ControllerInfo controller) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPostConnect(@NonNull final MediaSession2 session, @NonNull final ControllerInfo controller) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(@NonNull final MediaSession2 session, @NonNull final ControllerInfo controller) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Session2Command.Result onSessionCommand(@NonNull final MediaSession2 session, @NonNull final ControllerInfo controller, @NonNull final Session2Command command, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCommandResult(@NonNull final MediaSession2 session, @NonNull final ControllerInfo controller, @NonNull final Object token, @NonNull final Session2Command command, @NonNull final Session2Command.Result result) {
            throw new RuntimeException("Stub!");
        }
    }
}
