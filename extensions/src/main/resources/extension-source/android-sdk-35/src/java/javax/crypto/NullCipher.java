package javax.crypto;

import java.security.Provider;

public class NullCipher extends Cipher
{
    public NullCipher() {
        super(null, null, null);
        throw new RuntimeException("Stub!");
    }
}
