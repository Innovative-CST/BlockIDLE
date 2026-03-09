package android.webkit;

public abstract class WebViewRenderProcessClient
{
    public WebViewRenderProcessClient() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onRenderProcessUnresponsive(@NonNull final WebView p0, @Nullable final WebViewRenderProcess p1);
    
    public abstract void onRenderProcessResponsive(@NonNull final WebView p0, @Nullable final WebViewRenderProcess p1);
}
