package javax.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;

public abstract class KeyGeneratorSpi
{
    public KeyGeneratorSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineInit(final SecureRandom p0);
    
    protected abstract void engineInit(final AlgorithmParameterSpec p0, final SecureRandom p1) throws InvalidAlgorithmParameterException;
    
    protected abstract void engineInit(final int p0, final SecureRandom p1);
    
    protected abstract SecretKey engineGenerateKey();
}
