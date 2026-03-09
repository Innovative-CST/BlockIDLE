package android.security.identity;

import java.util.List;
import java.time.Instant;
import java.util.Map;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.KeyPair;

public abstract class IdentityCredential
{
    IdentityCredential() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract KeyPair createEphemeralKeyPair();
    
    @Deprecated
    public abstract void setReaderEphemeralPublicKey(@NonNull final PublicKey p0) throws InvalidKeyException;
    
    @Deprecated
    @NonNull
    public abstract byte[] encryptMessageToReader(@NonNull final byte[] p0);
    
    @Deprecated
    @NonNull
    public abstract byte[] decryptMessageFromReader(@NonNull final byte[] p0) throws MessageDecryptionException;
    
    @NonNull
    public abstract Collection<X509Certificate> getCredentialKeyCertificateChain();
    
    @Deprecated
    public abstract void setAllowUsingExhaustedKeys(final boolean p0);
    
    @Deprecated
    public void setAllowUsingExpiredKeys(final boolean allowUsingExpiredKeys) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract ResultData getEntries(@Nullable final byte[] p0, @NonNull final Map<String, Collection<String>> p1, @Nullable final byte[] p2, @Nullable final byte[] p3) throws EphemeralPublicKeyNotFoundException, InvalidReaderSignatureException, InvalidRequestMessageException, NoAuthenticationKeyAvailableException, SessionTranscriptMismatchException;
    
    @Deprecated
    public abstract void setAvailableAuthenticationKeys(final int p0, final int p1);
    
    @NonNull
    public abstract Collection<X509Certificate> getAuthKeysNeedingCertification();
    
    @Deprecated
    public abstract void storeStaticAuthenticationData(@NonNull final X509Certificate p0, @NonNull final byte[] p1) throws UnknownAuthenticationKeyException;
    
    public void storeStaticAuthenticationData(@NonNull final X509Certificate authenticationKey, @NonNull final Instant expirationDate, @NonNull final byte[] staticAuthData) throws UnknownAuthenticationKeyException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract int[] getAuthenticationDataUsageCount();
    
    @NonNull
    public byte[] proveOwnership(@NonNull final byte[] challenge) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] delete(@NonNull final byte[] challenge) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] update(@NonNull final PersonalizationData personalizationData) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAvailableAuthenticationKeys(final int keyCount, final int maxUsesPerKey, final long minValidTimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AuthenticationKeyMetadata> getAuthenticationKeyMetadata() {
        throw new RuntimeException("Stub!");
    }
}
