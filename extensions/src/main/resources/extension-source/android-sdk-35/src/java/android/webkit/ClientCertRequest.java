package android.webkit;

import java.security.cert.X509Certificate;
import java.security.PrivateKey;
import java.security.Principal;

public abstract class ClientCertRequest
{
    public ClientCertRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract String[] getKeyTypes();
    
    @Nullable
    public abstract Principal[] getPrincipals();
    
    public abstract String getHost();
    
    public abstract int getPort();
    
    public abstract void proceed(final PrivateKey p0, final X509Certificate[] p1);
    
    public abstract void ignore();
    
    public abstract void cancel();
}
