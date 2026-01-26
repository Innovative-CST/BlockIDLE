package android.net.http;

import java.util.List;

public abstract class UrlResponseInfo
{
    public UrlResponseInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract String getUrl();
    
    @NonNull
    public abstract List<String> getUrlChain();
    
    public abstract int getHttpStatusCode();
    
    @NonNull
    public abstract String getHttpStatusText();
    
    @NonNull
    public abstract HeaderBlock getHeaders();
    
    public abstract boolean wasCached();
    
    @NonNull
    public abstract String getNegotiatedProtocol();
    
    public abstract long getReceivedByteCount();
}
