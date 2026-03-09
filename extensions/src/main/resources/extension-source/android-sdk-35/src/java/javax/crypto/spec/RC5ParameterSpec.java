package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class RC5ParameterSpec implements AlgorithmParameterSpec
{
    public RC5ParameterSpec(final int version, final int rounds, final int wordSize) {
        throw new RuntimeException("Stub!");
    }
    
    public RC5ParameterSpec(final int version, final int rounds, final int wordSize, final byte[] iv) {
        throw new RuntimeException("Stub!");
    }
    
    public RC5ParameterSpec(final int version, final int rounds, final int wordSize, final byte[] iv, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRounds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWordSize() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getIV() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
