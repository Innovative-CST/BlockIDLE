package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public final class ChaCha20ParameterSpec implements AlgorithmParameterSpec
{
    public ChaCha20ParameterSpec(final byte[] nonce, final int counter) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getNonce() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCounter() {
        throw new RuntimeException("Stub!");
    }
}
