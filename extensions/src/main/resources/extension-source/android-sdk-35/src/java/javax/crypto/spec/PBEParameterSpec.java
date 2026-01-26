package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class PBEParameterSpec implements AlgorithmParameterSpec
{
    public PBEParameterSpec(final byte[] salt, final int iterationCount) {
        throw new RuntimeException("Stub!");
    }
    
    public PBEParameterSpec(final byte[] salt, final int iterationCount, final AlgorithmParameterSpec paramSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getSalt() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIterationCount() {
        throw new RuntimeException("Stub!");
    }
    
    public AlgorithmParameterSpec getParameterSpec() {
        throw new RuntimeException("Stub!");
    }
}
