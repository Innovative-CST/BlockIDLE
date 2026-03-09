package android.security.identity;

import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.KeyPair;

public abstract class PresentationSession
{
    PresentationSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract KeyPair getEphemeralKeyPair();
    
    public abstract void setReaderEphemeralPublicKey(@NonNull final PublicKey p0) throws InvalidKeyException;
    
    public abstract void setSessionTranscript(@NonNull final byte[] p0);
    
    @Nullable
    public abstract CredentialDataResult getCredentialData(@NonNull final String p0, @NonNull final CredentialDataRequest p1) throws EphemeralPublicKeyNotFoundException, InvalidReaderSignatureException, InvalidRequestMessageException, NoAuthenticationKeyAvailableException;
}
