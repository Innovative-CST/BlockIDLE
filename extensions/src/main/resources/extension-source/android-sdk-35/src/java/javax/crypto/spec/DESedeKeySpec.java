package javax.crypto.spec;

import java.security.InvalidKeyException;
import java.security.spec.KeySpec;

public class DESedeKeySpec implements KeySpec
{
    public static final int DES_EDE_KEY_LEN = 24;
    
    public DESedeKeySpec(final byte[] key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public DESedeKeySpec(final byte[] key, final int offset) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isParityAdjusted(final byte[] key, final int offset) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
}
