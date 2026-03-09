package javax.net.ssl;

import java.security.InvalidAlgorithmParameterException;
import java.security.UnrecoverableKeyException;
import java.security.KeyStoreException;
import java.security.KeyStore;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class KeyManagerFactory
{
    protected KeyManagerFactory(final KeyManagerFactorySpi factorySpi, final Provider provider, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public static final String getDefaultAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyManagerFactory getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyManagerFactory getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyManagerFactory getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final KeyStore ks, final char[] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final ManagerFactoryParameters spec) throws InvalidAlgorithmParameterException {
        throw new RuntimeException("Stub!");
    }
    
    public final KeyManager[] getKeyManagers() {
        throw new RuntimeException("Stub!");
    }
}
