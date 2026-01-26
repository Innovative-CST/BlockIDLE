package android.security;

import java.security.cert.Certificate;
import java.util.List;
import java.security.KeyPair;

public final class AttestedKeyPair
{
    public AttestedKeyPair(@Nullable final KeyPair keyPair, @NonNull final List<Certificate> attestationRecord) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public KeyPair getKeyPair() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Certificate> getAttestationRecord() {
        throw new RuntimeException("Stub!");
    }
}
