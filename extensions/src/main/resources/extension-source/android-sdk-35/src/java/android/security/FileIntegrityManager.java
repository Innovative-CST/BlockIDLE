package android.security;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public final class FileIntegrityManager
{
    FileIntegrityManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isApkVeritySupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAppSourceCertificateTrusted(@NonNull final X509Certificate certificate) throws CertificateEncodingException {
        throw new RuntimeException("Stub!");
    }
}
