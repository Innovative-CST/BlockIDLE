package android.net.eap;

import java.security.cert.X509Certificate;

public final class EapSessionConfig
{
    EapSessionConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getEapIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapSimConfig getEapSimConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapAkaConfig getEapAkaConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapAkaPrimeConfig getEapAkaPrimeConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapMsChapV2Config getEapMsChapV2Config() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EapTtlsConfig getEapTtlsConfig() {
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
        public Builder setEapIdentity(@NonNull final byte[] eapIdentity) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapSimConfig(final int subId, final int apptype) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapAkaConfig(final int subId, final int apptype) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapAkaConfig(final int subId, final int apptype, @NonNull final EapAkaOption options) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapAkaPrimeConfig(final int subId, final int apptype, @NonNull final String networkName, final boolean allowMismatchedNetworkNames) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapMsChapV2Config(@NonNull final String username, @NonNull final String password) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEapTtlsConfig(@Nullable final X509Certificate serverCaCert, @NonNull final EapSessionConfig innerEapSessionConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EapSessionConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class EapAkaConfig extends EapMethodConfig
    {
        EapAkaConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EapAkaOption getEapAkaOption() {
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
        
        public int getSubId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAppType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class EapAkaOption
    {
        EapAkaOption() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getReauthId() {
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
            public Builder setReauthId(@NonNull final byte[] reauthId) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public EapAkaOption build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static class EapAkaPrimeConfig extends EapAkaConfig
    {
        EapAkaPrimeConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getNetworkName() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean allowsMismatchedNetworkNames() {
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
    
    public abstract static class EapMethodConfig
    {
        public static final int EAP_TYPE_AKA = 23;
        public static final int EAP_TYPE_AKA_PRIME = 50;
        public static final int EAP_TYPE_MSCHAP_V2 = 26;
        public static final int EAP_TYPE_SIM = 18;
        public static final int EAP_TYPE_TTLS = 21;
        
        EapMethodConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMethodType() {
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
    
    public static class EapMsChapV2Config extends EapMethodConfig
    {
        EapMsChapV2Config() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getUsername() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPassword() {
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
    
    public static class EapSimConfig extends EapMethodConfig
    {
        EapSimConfig() {
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
        
        public int getSubId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAppType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class EapTtlsConfig extends EapMethodConfig
    {
        EapTtlsConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public X509Certificate getServerCaCert() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EapSessionConfig getInnerEapSessionConfig() {
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
