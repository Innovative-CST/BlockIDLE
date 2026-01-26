package android.net.http;

import java.nio.ByteBuffer;

public abstract class BidirectionalStream
{
    public static final int STREAM_PRIORITY_HIGHEST = 4;
    public static final int STREAM_PRIORITY_IDLE = 0;
    public static final int STREAM_PRIORITY_LOW = 2;
    public static final int STREAM_PRIORITY_LOWEST = 1;
    public static final int STREAM_PRIORITY_MEDIUM = 3;
    
    public BidirectionalStream() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract String getHttpMethod();
    
    public abstract boolean hasTrafficStatsTag();
    
    public abstract int getTrafficStatsTag();
    
    public abstract boolean hasTrafficStatsUid();
    
    public abstract int getTrafficStatsUid();
    
    @NonNull
    public abstract HeaderBlock getHeaders();
    
    public abstract int getPriority();
    
    public abstract boolean isDelayRequestHeadersUntilFirstFlushEnabled();
    
    public abstract void start();
    
    public abstract void read(@NonNull final ByteBuffer p0);
    
    public abstract void write(@NonNull final ByteBuffer p0, final boolean p1);
    
    public abstract void flush();
    
    public abstract void cancel();
    
    public abstract boolean isDone();
    
    public abstract static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract Builder setHttpMethod(@NonNull final String p0);
        
        @NonNull
        public abstract Builder addHeader(@NonNull final String p0, @NonNull final String p1);
        
        @NonNull
        public abstract Builder setPriority(final int p0);
        
        @NonNull
        public abstract Builder setDelayRequestHeadersUntilFirstFlushEnabled(final boolean p0);
        
        @NonNull
        public abstract Builder setTrafficStatsTag(final int p0);
        
        @NonNull
        public abstract Builder setTrafficStatsUid(final int p0);
        
        @NonNull
        public abstract BidirectionalStream build();
    }
    
    public interface Callback
    {
        void onStreamReady(@NonNull final BidirectionalStream p0);
        
        void onResponseHeadersReceived(@NonNull final BidirectionalStream p0, @NonNull final UrlResponseInfo p1);
        
        void onReadCompleted(@NonNull final BidirectionalStream p0, @NonNull final UrlResponseInfo p1, @NonNull final ByteBuffer p2, final boolean p3);
        
        void onWriteCompleted(@NonNull final BidirectionalStream p0, @NonNull final UrlResponseInfo p1, @NonNull final ByteBuffer p2, final boolean p3);
        
        void onResponseTrailersReceived(@NonNull final BidirectionalStream p0, @NonNull final UrlResponseInfo p1, @NonNull final HeaderBlock p2);
        
        void onSucceeded(@NonNull final BidirectionalStream p0, @NonNull final UrlResponseInfo p1);
        
        void onFailed(@NonNull final BidirectionalStream p0, @Nullable final UrlResponseInfo p1, @NonNull final HttpException p2);
        
        void onCanceled(@NonNull final BidirectionalStream p0, @Nullable final UrlResponseInfo p1);
    }
}
