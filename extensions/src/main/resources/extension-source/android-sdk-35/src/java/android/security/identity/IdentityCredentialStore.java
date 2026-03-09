package android.security.identity;

import android.content.Context;

public abstract class IdentityCredentialStore
{
    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = 1;
    
    IdentityCredentialStore() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static IdentityCredentialStore getInstance(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static IdentityCredentialStore getDirectAccessInstance(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract String[] getSupportedDocTypes();
    
    @NonNull
    public abstract WritableIdentityCredential createCredential(@NonNull final String p0, @NonNull final String p1) throws AlreadyPersonalizedException, DocTypeNotSupportedException;
    
    @Nullable
    public abstract IdentityCredential getCredentialByName(@NonNull final String p0, final int p1) throws CipherSuiteNotSupportedException;
    
    @Deprecated
    @Nullable
    public abstract byte[] deleteCredentialByName(@NonNull final String p0);
    
    @NonNull
    public PresentationSession createPresentationSession(final int cipherSuite) throws CipherSuiteNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
