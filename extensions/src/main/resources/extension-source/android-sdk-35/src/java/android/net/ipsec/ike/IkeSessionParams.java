package android.net.ipsec.ike;

import java.security.PrivateKey;
import android.net.eap.EapSessionConfig;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.List;
import android.net.Network;

public final class IkeSessionParams
{
    public static final int IKE_DPD_DELAY_SEC_DISABLED = Integer.MAX_VALUE;
    public static final int IKE_OPTION_ACCEPT_ANY_REMOTE_ID = 0;
    public static final int IKE_OPTION_EAP_ONLY_AUTH = 1;
    public static final int IKE_OPTION_FORCE_PORT_4500 = 3;
    public static final int IKE_OPTION_INITIAL_CONTACT = 4;
    public static final int IKE_OPTION_MOBIKE = 2;
    
    IkeSessionParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getServerHostname() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<IkeSaProposal> getIkeSaProposals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IkeIdentification getLocalIdentification() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IkeIdentification getRemoteIdentification() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IkeAuthConfig getLocalAuthConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IkeAuthConfig getRemoteAuthConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHardLifetimeSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSoftLifetimeSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDpdDelaySeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNattKeepAliveDelaySeconds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getRetransmissionTimeoutsMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasIkeOption(final int ikeOption) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getIkeOptions() {
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
        
        public Builder(@NonNull final IkeSessionParams ikeSessionParams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setServerHostname(@NonNull final String serverHostname) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetwork(@Nullable final Network network) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocalIdentification(@NonNull final IkeIdentification identification) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRemoteIdentification(@NonNull final IkeIdentification identification) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIkeSaProposal(@NonNull final IkeSaProposal proposal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthPsk(@NonNull final byte[] sharedKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthEap(@Nullable final X509Certificate serverCaCert, @NonNull final EapSessionConfig eapConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthDigitalSignature(@Nullable final X509Certificate serverCaCert, @NonNull final X509Certificate clientEndCert, @NonNull final PrivateKey clientPrivateKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthDigitalSignature(@Nullable final X509Certificate serverCaCert, @NonNull final X509Certificate clientEndCert, @NonNull final List<X509Certificate> clientIntermediateCerts, @NonNull final PrivateKey clientPrivateKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLifetimeSeconds(final int hardLifetimeSeconds, final int softLifetimeSeconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDpdDelaySeconds(final int dpdDelaySeconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNattKeepAliveDelaySeconds(final int nattKeepaliveDelaySeconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRetransmissionTimeoutsMillis(@NonNull final int[] retransTimeoutMillisList) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIkeOption(final int ikeOption) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeIkeOption(final int ikeOption) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public IkeSessionParams build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class IkeAuthConfig
    {
        IkeAuthConfig() {
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
    
    public static class IkeAuthDigitalSignLocalConfig extends IkeAuthConfig
    {
        IkeAuthDigitalSignLocalConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public X509Certificate getClientEndCertificate() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<X509Certificate> getIntermediateCertificates() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PrivateKey getPrivateKey() {
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
    
    public static class IkeAuthDigitalSignRemoteConfig extends IkeAuthConfig
    {
        IkeAuthDigitalSignRemoteConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public X509Certificate getRemoteCaCert() {
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
    
    public static class IkeAuthEapConfig extends IkeAuthConfig
    {
        IkeAuthEapConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EapSessionConfig getEapConfig() {
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
    
    public static class IkeAuthPskConfig extends IkeAuthConfig
    {
        IkeAuthPskConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] getPsk() {
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
}
