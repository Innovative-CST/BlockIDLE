package javax.crypto.spec;

import javax.crypto.SecretKey;
import java.security.spec.KeySpec;

public class SecretKeySpec implements KeySpec, SecretKey
{
    public SecretKeySpec(final byte[] key, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public SecretKeySpec(final byte[] key, final int offset, final int len, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public byte[] getEncoded() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
}
