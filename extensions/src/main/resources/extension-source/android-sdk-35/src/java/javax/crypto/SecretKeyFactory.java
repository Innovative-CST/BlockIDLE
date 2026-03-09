package javax.crypto;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class SecretKeyFactory
{
    protected SecretKeyFactory(final SecretKeyFactorySpi keyFacSpi, final Provider provider, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public static final SecretKeyFactory getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final SecretKeyFactory getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final SecretKeyFactory getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public final SecretKey generateSecret(final KeySpec keySpec) throws InvalidKeySpecException {
        throw new RuntimeException("Stub!");
    }
    
    public final KeySpec getKeySpec(final SecretKey key, final Class<?> keySpec) throws InvalidKeySpecException {
        throw new RuntimeException("Stub!");
    }
    
    public final SecretKey translateKey(final SecretKey key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
}
