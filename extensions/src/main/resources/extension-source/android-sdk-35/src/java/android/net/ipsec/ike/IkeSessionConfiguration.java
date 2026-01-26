package android.net.ipsec.ike;

import android.net.eap.EapInfo;
import java.util.List;

public final class IkeSessionConfiguration
{
    public static final int EXTENSION_TYPE_FRAGMENTATION = 1;
    public static final int EXTENSION_TYPE_MOBIKE = 2;
    
    IkeSessionConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getRemoteApplicationVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<byte[]> getRemoteVendorIds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIkeExtensionEnabled(final int extensionType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IkeSessionConnectionInfo getIkeSessionConnectionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapInfo getEapInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final IkeSessionConnectionInfo ikeConnInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRemoteVendorId(@NonNull final byte[] remoteVendorId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearRemoteVendorIds() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRemoteApplicationVersion(@NonNull final String remoteApplicationVersion) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearRemoteApplicationVersion() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIkeExtension(final int extensionType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearIkeExtensions() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapInfo(@Nullable final EapInfo eapInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public IkeSessionConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
