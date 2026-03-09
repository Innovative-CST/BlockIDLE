package android.os;

import android.system.ErrnoException;

public abstract class ProxyFileDescriptorCallback
{
    public ProxyFileDescriptorCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public long onGetSize() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public int onRead(final long offset, final int size, final byte[] data) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public int onWrite(final long offset, final int size, final byte[] data) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public void onFsync() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onRelease();
}
