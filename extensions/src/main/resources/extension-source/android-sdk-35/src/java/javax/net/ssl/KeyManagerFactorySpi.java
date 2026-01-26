package javax.net.ssl;

import java.security.InvalidAlgorithmParameterException;
import java.security.UnrecoverableKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.security.KeyStore;

public abstract class KeyManagerFactorySpi
{
    public KeyManagerFactorySpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineInit(final KeyStore p0, final char[] p1) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException;
    
    protected abstract void engineInit(final ManagerFactoryParameters p0) throws InvalidAlgorithmParameterException;
    
    protected abstract KeyManager[] engineGetKeyManagers();
}
