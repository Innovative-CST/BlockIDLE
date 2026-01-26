package android.inputmethodservice;

import android.view.inputmethod.InputMethodSession;
import android.view.inputmethod.InputMethod;
import android.content.res.Configuration;
import android.content.ComponentCallbacks;
import android.view.MotionEvent;
import android.os.IBinder;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.KeyEvent;
import android.app.Service;

public abstract class AbstractInputMethodService extends Service implements KeyEvent.Callback
{
    public AbstractInputMethodService() {
        throw new RuntimeException("Stub!");
    }
    
    public KeyEvent.DispatcherState getKeyDispatcherState() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract AbstractInputMethodImpl onCreateInputMethodInterface();
    
    public abstract AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
    
    @Override
    protected void dump(final FileDescriptor fd, final PrintWriter fout, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getSystemService(@RecentlyNonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterComponentCallbacks(@RecentlyNonNull final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConfigurationChanged(@RecentlyNonNull final Configuration configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerComponentCallbacks(@RecentlyNonNull final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract class AbstractInputMethodImpl implements InputMethod
    {
        public AbstractInputMethodImpl() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void createSession(final SessionCallback callback) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void setSessionEnabled(final InputMethodSession session, final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void revokeSession(final InputMethodSession session) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract class AbstractInputMethodSessionImpl implements InputMethodSession
    {
        public AbstractInputMethodSessionImpl() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isRevoked() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void revokeSelf() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void dispatchKeyEvent(final int seq, final KeyEvent event, final EventCallback callback) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void dispatchTrackballEvent(final int seq, final MotionEvent event, final EventCallback callback) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void dispatchGenericMotionEvent(final int seq, final MotionEvent event, final EventCallback callback) {
            throw new RuntimeException("Stub!");
        }
    }
}
