package android.crypto.hpke;

import java.security.spec.EncodedKeySpec;

public final class XdhKeySpec extends EncodedKeySpec
{
    public XdhKeySpec(@NonNull final byte[] encoded) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
