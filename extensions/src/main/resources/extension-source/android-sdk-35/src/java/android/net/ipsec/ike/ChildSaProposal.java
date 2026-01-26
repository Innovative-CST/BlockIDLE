package android.net.ipsec.ike;

import java.util.Set;

public final class ChildSaProposal extends SaProposal
{
    ChildSaProposal() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Set<Integer> getSupportedEncryptionAlgorithms() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Set<Integer> getSupportedIntegrityAlgorithms() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addEncryptionAlgorithm(final int algorithm, final int keyLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIntegrityAlgorithm(final int algorithm) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDhGroup(final int dhGroup) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ChildSaProposal build() {
            throw new RuntimeException("Stub!");
        }
    }
}
