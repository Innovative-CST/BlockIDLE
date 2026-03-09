package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class IvParameterSpec implements AlgorithmParameterSpec
{
    public IvParameterSpec(final byte[] iv) {
        throw new RuntimeException("Stub!");
    }
    
    public IvParameterSpec(final byte[] iv, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getIV() {
        throw new RuntimeException("Stub!");
    }
}
