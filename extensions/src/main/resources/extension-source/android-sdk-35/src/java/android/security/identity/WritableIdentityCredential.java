package android.security.identity;

import java.security.cert.X509Certificate;
import java.util.Collection;

public abstract class WritableIdentityCredential
{
    WritableIdentityCredential() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract Collection<X509Certificate> getCredentialKeyCertificateChain(@NonNull final byte[] p0);
    
    @NonNull
    public abstract byte[] personalize(@NonNull final PersonalizationData p0);
}
