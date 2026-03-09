package javax.crypto.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class DHParameterSpec implements AlgorithmParameterSpec
{
    public DHParameterSpec(final BigInteger p, final BigInteger g) {
        throw new RuntimeException("Stub!");
    }
    
    public DHParameterSpec(final BigInteger p, final BigInteger g, final int l) {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getP() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger getG() {
        throw new RuntimeException("Stub!");
    }
    
    public int getL() {
        throw new RuntimeException("Stub!");
    }
}
