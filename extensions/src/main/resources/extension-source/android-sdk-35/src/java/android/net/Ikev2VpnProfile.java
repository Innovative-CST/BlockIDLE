package android.net;

import android.net.ipsec.ike.IkeTunnelConnectionParams;
import java.util.List;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public final class Ikev2VpnProfile extends PlatformVpnProfile
{
    Ikev2VpnProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getServerAddr() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getUserIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getPresharedKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate getServerRootCaCert() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUsername() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PrivateKey getRsaPrivateKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate getUserCert() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ProxyInfo getProxyInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getAllowedAlgorithms() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBypassable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMetered() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxMtu() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IkeTunnelConnectionParams getIkeTunnelConnectionParams() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutomaticNattKeepaliveTimerEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutomaticIpVersionSelectionEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String serverAddr, @NonNull final String identity) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final IkeTunnelConnectionParams ikeTunConnParams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthUsernamePassword(@NonNull final String user, @NonNull final String pass, @Nullable final X509Certificate serverRootCa) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthDigitalSignature(@NonNull final X509Certificate userCert, @NonNull final PrivateKey key, @Nullable final X509Certificate serverRootCa) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthPsk(@NonNull final byte[] psk) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBypassable(final boolean isBypassable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProxy(@Nullable final ProxyInfo proxy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxMtu(final int mtu) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequiresInternetValidation(final boolean requiresInternetValidation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetered(final boolean isMetered) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowedAlgorithms(@NonNull final List<String> algorithmNames) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAutomaticNattKeepaliveTimerEnabled(final boolean isEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAutomaticIpVersionSelectionEnabled(final boolean isEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocalRoutesExcluded(final boolean excludeLocalRoutes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Ikev2VpnProfile build() {
            throw new RuntimeException("Stub!");
        }
    }
}
