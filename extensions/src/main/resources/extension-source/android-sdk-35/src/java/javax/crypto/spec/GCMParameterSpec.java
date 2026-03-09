package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class GCMParameterSpec implements AlgorithmParameterSpec
{
    public GCMParameterSpec(final int tLen, final byte[] src) {
        throw new RuntimeException("Stub!");
    }
    
    public GCMParameterSpec(final int tLen, final byte[] src, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTLen() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getIV() {
        throw new RuntimeException("Stub!");
    }
}
