package javax.crypto.spec;

import java.security.spec.KeySpec;

public class PBEKeySpec implements KeySpec
{
    public PBEKeySpec(final char[] password) {
        throw new RuntimeException("Stub!");
    }
    
    public PBEKeySpec(final char[] password, final byte[] salt, final int iterationCount, final int keyLength) {
        throw new RuntimeException("Stub!");
    }
    
    public PBEKeySpec(final char[] password, final byte[] salt, final int iterationCount) {
        throw new RuntimeException("Stub!");
    }
    
    public final void clearPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public final char[] getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] getSalt() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getIterationCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getKeyLength() {
        throw new RuntimeException("Stub!");
    }
}
