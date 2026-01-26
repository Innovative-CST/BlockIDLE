package android.security.identity;

import java.security.cert.X509Certificate;

public class AccessControlProfile
{
    AccessControlProfile() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final AccessControlProfileId accessControlProfileId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAuthenticationRequired(final boolean userAuthenticationRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAuthenticationTimeout(final long userAuthenticationTimeoutMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReaderCertificate(@NonNull final X509Certificate readerCertificate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AccessControlProfile build() {
            throw new RuntimeException("Stub!");
        }
    }
}
