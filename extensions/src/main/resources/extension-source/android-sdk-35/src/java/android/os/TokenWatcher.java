package android.os;

import java.io.PrintWriter;

public abstract class TokenWatcher
{
    public TokenWatcher(final Handler h, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void acquired();
    
    public abstract void released();
    
    public void acquire(final IBinder token, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public void cleanup(final IBinder token, final boolean unlink) {
        throw new RuntimeException("Stub!");
    }
    
    public void release(final IBinder token) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAcquired() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final PrintWriter pw) {
        throw new RuntimeException("Stub!");
    }
}
