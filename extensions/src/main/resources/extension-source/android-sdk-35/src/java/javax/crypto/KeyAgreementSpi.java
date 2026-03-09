package javax.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.Key;

public abstract class KeyAgreementSpi
{
    public KeyAgreementSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineInit(final Key p0, final SecureRandom p1) throws InvalidKeyException;
    
    protected abstract void engineInit(final Key p0, final AlgorithmParameterSpec p1, final SecureRandom p2) throws InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract Key engineDoPhase(final Key p0, final boolean p1) throws IllegalStateException, InvalidKeyException;
    
    protected abstract byte[] engineGenerateSecret() throws IllegalStateException;
    
    protected abstract int engineGenerateSecret(final byte[] p0, final int p1) throws IllegalStateException, ShortBufferException;
    
    protected abstract SecretKey engineGenerateSecret(final String p0) throws IllegalStateException, InvalidKeyException, NoSuchAlgorithmException;
}
