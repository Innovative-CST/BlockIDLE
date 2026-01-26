package javax.security.auth.x500;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.security.auth.Destroyable;

public final class X500PrivateCredential implements Destroyable
{
    public X500PrivateCredential(final X509Certificate cert, final PrivateKey key) {
        throw new RuntimeException("Stub!");
    }
    
    public X500PrivateCredential(final X509Certificate cert, final PrivateKey key, final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public X509Certificate getCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    public PrivateKey getPrivateKey() {
        throw new RuntimeException("Stub!");
    }
    
    public String getAlias() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
}
