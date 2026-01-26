package android.media.session;

import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.List;
import android.content.ComponentName;
import android.media.Session2Token;

public final class MediaSessionManager
{
    MediaSessionManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifySession2Created(@NonNull final Session2Token token) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MediaController> getActiveSessions(@Nullable final ComponentName notificationListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaSession.Token getMediaKeyEventSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMediaKeyEventSessionPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Session2Token> getSession2Tokens() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnActiveSessionsChangedListener(@NonNull final OnActiveSessionsChangedListener sessionListener, @Nullable final ComponentName notificationListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnActiveSessionsChangedListener(@NonNull final OnActiveSessionsChangedListener sessionListener, @Nullable final ComponentName notificationListener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnActiveSessionsChangedListener(@NonNull final OnActiveSessionsChangedListener sessionListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnSession2TokensChangedListener(@NonNull final OnSession2TokensChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnSession2TokensChangedListener(@NonNull final OnSession2TokensChangedListener listener, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnSession2TokensChangedListener(@NonNull final OnSession2TokensChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTrustedForMediaControl(@NonNull final RemoteUserInfo userInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnMediaKeyEventSessionChangedListener(@NonNull final Executor executor, @NonNull final OnMediaKeyEventSessionChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnMediaKeyEventSessionChangedListener(@NonNull final OnMediaKeyEventSessionChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class RemoteUserInfo
    {
        public RemoteUserInfo(@NonNull final String packageName, final int pid, final int uid) {
            throw new RuntimeException("Stub!");
        }
        
        public String getPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPid() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUid() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnSession2TokensChangedListener
    {
        void onSession2TokensChanged(@NonNull final List<Session2Token> p0);
    }
    
    public interface OnMediaKeyEventSessionChangedListener
    {
        void onMediaKeyEventSessionChanged(@NonNull final String p0, @Nullable final MediaSession.Token p1);
    }
    
    public interface OnActiveSessionsChangedListener
    {
        void onActiveSessionsChanged(@Nullable final List<MediaController> p0);
    }
}
