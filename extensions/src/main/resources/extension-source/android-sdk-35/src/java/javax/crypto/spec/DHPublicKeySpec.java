package javax.crypto.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class DHPublicKeySpec implements KeySpec
{
    public DHPublicKeySpec(final BigInteger y, final BigInteger p, final BigInteger g) {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getY() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getP() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getG() {
        throw new RuntimeException("Stub!");
    }
}
