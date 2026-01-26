package android.webkit;

import android.view.KeyEvent;
import android.net.http.SslError;
import android.os.Message;
import android.graphics.Bitmap;

public class WebViewClient
{
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;
    
    public WebViewClient() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldOverrideUrlLoading(final WebView view, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldOverrideUrlLoading(final WebView view, final WebResourceRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPageStarted(final WebView view, final String url, final Bitmap favicon) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPageFinished(final WebView view, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public void onLoadResource(final WebView view, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPageCommitVisible(final WebView view, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public WebResourceResponse shouldInterceptRequest(final WebView view, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WebResourceResponse shouldInterceptRequest(final WebView view, final WebResourceRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onTooManyRedirects(final WebView view, final Message cancelMsg, final Message continueMsg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onReceivedError(final WebView view, final int errorCode, final String description, final String failingUrl) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedError(final WebView view, final WebResourceRequest request, final WebResourceError error) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedHttpError(final WebView view, final WebResourceRequest request, final WebResourceResponse errorResponse) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFormResubmission(final WebView view, final Message dontResend, final Message resend) {
        throw new RuntimeException("Stub!");
    }
    
    public void doUpdateVisitedHistory(final WebView view, final String url, final boolean isReload) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedSslError(final WebView view, final SslErrorHandler handler, final SslError error) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedClientCertRequest(final WebView view, final ClientCertRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedHttpAuthRequest(final WebView view, final HttpAuthHandler handler, final String host, final String realm) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldOverrideKeyEvent(final WebView view, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUnhandledKeyEvent(final WebView view, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onScaleChanged(final WebView view, final float oldScale, final float newScale) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedLoginRequest(final WebView view, final String realm, @Nullable final String account, final String args) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onRenderProcessGone(final WebView view, final RenderProcessGoneDetail detail) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSafeBrowsingHit(final WebView view, final WebResourceRequest request, final int threatType, final SafeBrowsingResponse callback) {
        throw new RuntimeException("Stub!");
    }
}
