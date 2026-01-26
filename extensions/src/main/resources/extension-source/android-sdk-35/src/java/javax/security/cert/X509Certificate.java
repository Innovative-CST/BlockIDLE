package javax.security.cert;

import java.security.Principal;
import java.math.BigInteger;
import java.util.Date;
import java.io.InputStream;

public abstract class X509Certificate extends Certificate
{
    public X509Certificate() {
        throw new RuntimeException("Stub!");
    }
    
    public static final X509Certificate getInstance(final InputStream inStream) throws CertificateException {
        throw new RuntimeException("Stub!");
    }
    
    public static final X509Certificate getInstance(final byte[] certData) throws CertificateException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;
    
    public abstract void checkValidity(final Date p0) throws CertificateExpiredException, CertificateNotYetValidException;
    
    public abstract int getVersion();
    
    public abstract BigInteger getSerialNumber();
    
    public abstract Principal getIssuerDN();
    
    public abstract Principal getSubjectDN();
    
    public abstract Date getNotBefore();
    
    public abstract Date getNotAfter();
    
    public abstract String getSigAlgName();
    
    public abstract String getSigAlgOID();
    
    public abstract byte[] getSigAlgParams();
}
