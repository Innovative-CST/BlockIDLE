package javax.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class KeyAgreement
{
    protected KeyAgreement(final KeyAgreementSpi keyAgreeSpi, final Provider provider, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyAgreement getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyAgreement getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final KeyAgreement getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final SecureRandom random) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final AlgorithmParameterSpec params, final SecureRandom random) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final Key doPhase(final Key key, final boolean lastPhase) throws IllegalStateException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] generateSecret() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final int generateSecret(final byte[] sharedSecret, final int offset) throws IllegalStateException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final SecretKey generateSecret(final String algorithm) throws IllegalStateException, InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
}
