package javax.crypto;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public abstract class SecretKeyFactorySpi
{
    public SecretKeyFactorySpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract SecretKey engineGenerateSecret(final KeySpec p0) throws InvalidKeySpecException;
    
    protected abstract KeySpec engineGetKeySpec(final SecretKey p0, final Class<?> p1) throws InvalidKeySpecException;
    
    protected abstract SecretKey engineTranslateKey(final SecretKey p0) throws InvalidKeyException;
}
