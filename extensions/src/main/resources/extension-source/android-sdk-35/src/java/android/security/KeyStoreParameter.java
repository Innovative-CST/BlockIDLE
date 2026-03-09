package android.security;

import android.content.Context;
import java.security.KeyStore;

@Deprecated
public final class KeyStoreParameter implements KeyStore.ProtectionParameter
{
    KeyStoreParameter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isEncryptionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static final class Builder
    {
        @Deprecated
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setEncryptionRequired(final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public KeyStoreParameter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
