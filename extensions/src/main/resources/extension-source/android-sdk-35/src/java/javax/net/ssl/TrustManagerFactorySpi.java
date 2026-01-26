package javax.net.ssl;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.KeyStore;

public abstract class TrustManagerFactorySpi
{
    public TrustManagerFactorySpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineInit(final KeyStore p0) throws KeyStoreException;
    
    protected abstract void engineInit(final ManagerFactoryParameters p0) throws InvalidAlgorithmParameterException;
    
    protected abstract TrustManager[] engineGetTrustManagers();
}
