package javax.net.ssl;

import java.util.Enumeration;

public interface SSLSessionContext
{
    SSLSession getSession(final byte[] p0);
    
    Enumeration<byte[]> getIds();
    
    void setSessionTimeout(final int p0) throws IllegalArgumentException;
    
    int getSessionTimeout();
    
    void setSessionCacheSize(final int p0) throws IllegalArgumentException;
    
    int getSessionCacheSize();
}
