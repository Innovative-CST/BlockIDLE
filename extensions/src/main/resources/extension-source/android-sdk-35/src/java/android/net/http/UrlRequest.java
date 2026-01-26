package android.net.http;

import android.net.Network;
import java.util.concurrent.Executor;
import java.nio.ByteBuffer;

public abstract class UrlRequest
{
    public static final int REQUEST_PRIORITY_HIGHEST = 4;
    public static final int REQUEST_PRIORITY_IDLE = 0;
    public static final int REQUEST_PRIORITY_LOW = 2;
    public static final int REQUEST_PRIORITY_LOWEST = 1;
    public static final int REQUEST_PRIORITY_MEDIUM = 3;
    
    UrlRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract String getHttpMethod();
    
    @NonNull
    public abstract HeaderBlock getHeaders();
    
    public abstract boolean isCacheDisabled();
    
    public abstract boolean isDirectExecutorAllowed();
    
    public abstract int getPriority();
    
    public abstract boolean hasTrafficStatsTag();
    
    public abstract int getTrafficStatsTag();
    
    public abstract boolean hasTrafficStatsUid();
    
    public abstract int getTrafficStatsUid();
    
    public abstract void start();
    
    public abstract void followRedirect();
    
    public abstract void read(@NonNull final ByteBuffer p0);
    
    public abstract void cancel();
    
    public abstract boolean isDone();
    
    public abstract void getStatus(@NonNull final StatusListener p0);
    
    public abstract static class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract Builder setHttpMethod(@NonNull final String p0);
        
        @NonNull
        public abstract Builder addHeader(@NonNull final String p0, @NonNull final String p1);
        
        @NonNull
        public abstract Builder setCacheDisabled(final boolean p0);
        
        @NonNull
        public abstract Builder setPriority(final int p0);
        
        @NonNull
        public abstract Builder setUploadDataProvider(@NonNull final UploadDataProvider p0, @NonNull final Executor p1);
        
        @NonNull
        public abstract Builder setDirectExecutorAllowed(final boolean p0);
        
        @NonNull
        public abstract Builder bindToNetwork(@Nullable final Network p0);
        
        @NonNull
        public abstract Builder setTrafficStatsTag(final int p0);
        
        @NonNull
        public abstract Builder setTrafficStatsUid(final int p0);
        
        @NonNull
        public abstract UrlRequest build();
    }
    
    public static class Status
    {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;
        
        Status() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface StatusListener
    {
        void onStatus(final int p0);
    }
    
    public interface Callback
    {
        void onRedirectReceived(@NonNull final UrlRequest p0, @NonNull final UrlResponseInfo p1, @NonNull final String p2) throws Exception;
        
        void onResponseStarted(@NonNull final UrlRequest p0, @NonNull final UrlResponseInfo p1) throws Exception;
        
        void onReadCompleted(@NonNull final UrlRequest p0, @NonNull final UrlResponseInfo p1, @NonNull final ByteBuffer p2) throws Exception;
        
        void onSucceeded(@NonNull final UrlRequest p0, @NonNull final UrlResponseInfo p1);
        
        void onFailed(@NonNull final UrlRequest p0, @Nullable final UrlResponseInfo p1, @NonNull final HttpException p2);
        
        void onCanceled(@NonNull final UrlRequest p0, @Nullable final UrlResponseInfo p1);
    }
}
