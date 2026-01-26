package javax.security.cert;

import java.security.SignatureException;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.PublicKey;

public abstract class Certificate
{
    public Certificate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract byte[] getEncoded() throws CertificateEncodingException;
    
    public abstract void verify(final PublicKey p0) throws CertificateException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, SignatureException;
    
    public abstract void verify(final PublicKey p0, final String p1) throws CertificateException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, SignatureException;
    
    @Override
    public abstract String toString();
    
    public abstract PublicKey getPublicKey();
}
