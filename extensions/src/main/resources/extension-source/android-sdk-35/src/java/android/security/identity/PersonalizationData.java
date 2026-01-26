package android.security.identity;

import java.util.Collection;

public class PersonalizationData
{
    PersonalizationData() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder putEntry(@NonNull final String namespace, @NonNull final String name, @NonNull final Collection<AccessControlProfileId> accessControlProfileIds, @NonNull final byte[] value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAccessControlProfile(@NonNull final AccessControlProfile profile) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersonalizationData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
