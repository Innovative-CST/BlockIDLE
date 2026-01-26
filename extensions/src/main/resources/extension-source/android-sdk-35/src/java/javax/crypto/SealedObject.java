package javax.crypto;

import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.io.IOException;
import java.io.Serializable;

public class SealedObject implements Serializable
{
    protected byte[] encodedParams;
    
    public SealedObject(final Serializable object, final Cipher c) throws IOException, IllegalBlockSizeException {
        throw new RuntimeException("Stub!");
    }
    
    protected SealedObject(final SealedObject so) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public final Object getObject(final Key key) throws ClassNotFoundException, IOException, InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Object getObject(final Cipher c) throws BadPaddingException, ClassNotFoundException, IOException, IllegalBlockSizeException {
        throw new RuntimeException("Stub!");
    }
    
    public final Object getObject(final Key key, final String provider) throws ClassNotFoundException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
}
