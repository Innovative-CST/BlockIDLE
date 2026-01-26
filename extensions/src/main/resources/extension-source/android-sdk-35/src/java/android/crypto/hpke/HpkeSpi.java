package android.crypto.hpke;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface HpkeSpi
{
    void engineInitSender(@NonNull final PublicKey p0, @Nullable final byte[] p1, @Nullable final PrivateKey p2, @Nullable final byte[] p3, @Nullable final byte[] p4) throws InvalidKeyException;
    
    void engineInitSenderWithSeed(@NonNull final PublicKey p0, @Nullable final byte[] p1, @Nullable final PrivateKey p2, @Nullable final byte[] p3, @Nullable final byte[] p4, @NonNull final byte[] p5) throws InvalidKeyException;
    
    void engineInitRecipient(@NonNull final byte[] p0, @NonNull final PrivateKey p1, @Nullable final byte[] p2, @Nullable final PublicKey p3, @Nullable final byte[] p4, @Nullable final byte[] p5) throws InvalidKeyException;
    
    @NonNull
    byte[] engineSeal(@NonNull final byte[] p0, @Nullable final byte[] p1);
    
    @NonNull
    byte[] engineOpen(@NonNull final byte[] p0, @Nullable final byte[] p1) throws GeneralSecurityException;
    
    @NonNull
    byte[] engineExport(final int p0, @Nullable final byte[] p1);
    
    @NonNull
    byte[] getEncapsulated();
}
