package android.net.http;

import java.time.Duration;
import java.util.Set;

public class QuicOptions
{
    QuicOptions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getAllowedQuicHosts() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasInMemoryServerConfigsCacheSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInMemoryServerConfigsCacheSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getHandshakeUserAgent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Duration getIdleConnectionTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAllowedQuicHost(@NonNull final String quicHost) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInMemoryServerConfigsCacheSize(final int inMemoryServerConfigsCacheSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHandshakeUserAgent(@NonNull final String handshakeUserAgent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIdleConnectionTimeout(@NonNull final Duration idleConnectionTimeout) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QuicOptions build() {
            throw new RuntimeException("Stub!");
        }
    }
}
