package javax.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class KeyGenerator
{
    protected KeyGenerator(final KeyGeneratorSpi keyGenSpi, final Provider provider, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyGenerator getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyGenerator getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyGenerator getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final SecureRandom random) {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final AlgorithmParameterSpec params, final SecureRandom random) throws InvalidAlgorithmParameterException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int keysize) {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int keysize, final SecureRandom random) {
        throw new RuntimeException("Stub!");
    }
    
    public final SecretKey generateKey() {
        throw new RuntimeException("Stub!");
    }
}
