package javax.crypto.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class DHPrivateKeySpec implements KeySpec
{
    public DHPrivateKeySpec(final BigInteger x, final BigInteger p, final BigInteger g) {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getX() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getP() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getG() {
        throw new RuntimeException("Stub!");
    }
}
