package android.net.http;

import android.os.Bundle;
import java.security.cert.X509Certificate;
import java.util.Date;

public class SslCertificate
{
    @Deprecated
    public SslCertificate(final String issuedTo, final String issuedBy, final String validNotBefore, final String validNotAfter) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SslCertificate(final String issuedTo, final String issuedBy, final Date validNotBefore, final Date validNotAfter) {
        throw new RuntimeException("Stub!");
    }
    
    public SslCertificate(final X509Certificate certificate) {
        throw new RuntimeException("Stub!");
    }
    
    public static Bundle saveState(final SslCertificate certificate) {
        throw new RuntimeException("Stub!");
    }
    
    public static SslCertificate restoreState(final Bundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public Date getValidNotBeforeDate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getValidNotBefore() {
        throw new RuntimeException("Stub!");
    }
    
    public Date getValidNotAfterDate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getValidNotAfter() {
        throw new RuntimeException("Stub!");
    }
    
    public DName getIssuedTo() {
        throw new RuntimeException("Stub!");
    }
    
    public DName getIssuedBy() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate getX509Certificate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public class DName
    {
        public DName(final String dName) {
            throw new RuntimeException("Stub!");
        }
        
        public String getDName() {
            throw new RuntimeException("Stub!");
        }
        
        public String getCName() {
            throw new RuntimeException("Stub!");
        }
        
        public String getOName() {
            throw new RuntimeException("Stub!");
        }
        
        public String getUName() {
            throw new RuntimeException("Stub!");
        }
    }
}
