package android.net.http;

import java.time.Instant;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.Executor;
import java.net.URLStreamHandlerFactory;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URL;
import android.net.Network;

public abstract class HttpEngine
{
    HttpEngine() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getVersionString() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void shutdown();
    
    public void bindToNetwork(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract URLConnection openConnection(@NonNull final URL p0) throws IOException;
    
    @NonNull
    public abstract URLStreamHandlerFactory createUrlStreamHandlerFactory();
    
    @NonNull
    public abstract UrlRequest.Builder newUrlRequestBuilder(@NonNull final String p0, @NonNull final Executor p1, @NonNull final UrlRequest.Callback p2);
    
    @NonNull
    public abstract BidirectionalStream.Builder newBidirectionalStreamBuilder(@NonNull final String p0, @NonNull final Executor p1, @NonNull final BidirectionalStream.Callback p2);
    
    public static class Builder
    {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDefaultUserAgent() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAgent(@NonNull final String userAgent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStoragePath(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnableQuic(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnableHttp2(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnableBrotli(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnableHttpCache(final int cacheMode, final long maxSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addQuicHint(@NonNull final String host, final int port, final int alternatePort) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addPublicKeyPins(@NonNull final String hostName, @NonNull final Set<byte[]> pinsSha256, final boolean includeSubdomains, @NonNull final Instant expirationInstant) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnablePublicKeyPinningBypassForLocalTrustAnchors(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setQuicOptions(@NonNull final QuicOptions quicOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDnsOptions(@NonNull final DnsOptions dnsOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConnectionMigrationOptions(@NonNull final ConnectionMigrationOptions connectionMigrationOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public HttpEngine build() {
            throw new RuntimeException("Stub!");
        }
    }
}
