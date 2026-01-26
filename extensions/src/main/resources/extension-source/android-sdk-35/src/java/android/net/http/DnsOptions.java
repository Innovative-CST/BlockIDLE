package android.net.http;

import java.time.Duration;

public final class DnsOptions
{
    public static final int DNS_OPTION_DISABLED = 2;
    public static final int DNS_OPTION_ENABLED = 1;
    public static final int DNS_OPTION_UNSPECIFIED = 0;
    
    DnsOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUseHttpStackDnsResolver() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPersistHostCache() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStaleDns() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Duration getPersistHostCachePeriod() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPreestablishConnectionsToStaleDnsResults() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public StaleDnsOptions getStaleDnsOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUseHttpStackDnsResolver(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStaleDns(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStaleDnsOptions(@NonNull final StaleDnsOptions staleDnsOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPreestablishConnectionsToStaleDnsResults(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPersistHostCache(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPersistHostCachePeriod(@NonNull final Duration persistHostCachePeriod) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DnsOptions build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class StaleDnsOptions
    {
        StaleDnsOptions() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Duration getFreshLookupTimeout() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Duration getMaxExpiredDelay() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAllowCrossNetworkUsage() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUseStaleOnNameNotResolved() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setFreshLookupTimeout(@NonNull final Duration freshLookupTimeout) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setMaxExpiredDelay(@NonNull final Duration maxExpiredDelay) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setAllowCrossNetworkUsage(final int state) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setUseStaleOnNameNotResolved(final int state) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public StaleDnsOptions build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
