package android.net.ipsec.ike;

import javax.security.auth.x500.X500Principal;

public final class IkeDerAsn1DnIdentification extends IkeIdentification
{
    @NonNull
    public final X500Principal derAsn1Dn;
    
    public IkeDerAsn1DnIdentification(@NonNull final X500Principal derAsn1Dn) {
        this.derAsn1Dn = null;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
}
