package javax.crypto.spec;

import java.security.InvalidKeyException;
import java.security.spec.KeySpec;

public class DESKeySpec implements KeySpec
{
    public static final int DES_KEY_LEN = 8;
    
    public DESKeySpec(final byte[] key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public DESKeySpec(final byte[] key, final int offset) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isParityAdjusted(final byte[] key, final int offset) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isWeak(final byte[] key, final int offset) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
}
