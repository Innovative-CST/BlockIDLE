package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class RC2ParameterSpec implements AlgorithmParameterSpec
{
    public RC2ParameterSpec(final int effectiveKeyBits) {
        throw new RuntimeException("Stub!");
    }
    
    public RC2ParameterSpec(final int effectiveKeyBits, final byte[] iv) {
        throw new RuntimeException("Stub!");
    }
    
    public RC2ParameterSpec(final int effectiveKeyBits, final byte[] iv, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEffectiveKeyBits() {
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
