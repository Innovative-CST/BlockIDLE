package android.webkit;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.graphics.Bitmap;

public class WebChromeClient
{
    public WebChromeClient() {
        throw new RuntimeException("Stub!");
    }
    
    public void onProgressChanged(final WebView view, final int newProgress) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedTitle(final WebView view, final String title) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedIcon(final WebView view, final Bitmap icon) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceivedTouchIconUrl(final WebView view, final String url, final boolean precomposed) {
        throw new RuntimeException("Stub!");
    }
    
    public void onShowCustomView(final View view, final CustomViewCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onShowCustomView(final View view, final int requestedOrientation, final CustomViewCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHideCustomView() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onCreateWindow(final WebView view, final boolean isDialog, final boolean isUserGesture, final Message resultMsg) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestFocus(final WebView view) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCloseWindow(final WebView window) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onJsAlert(final WebView view, final String url, final String message, final JsResult result) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onJsConfirm(final WebView view, final String url, final String message, final JsResult result) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onJsPrompt(final WebView view, final String url, final String message, final String defaultValue, final JsPromptResult result) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onJsBeforeUnload(final WebView view, final String url, final String message, final JsResult result) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onExceededDatabaseQuota(final String url, final String databaseIdentifier, final long quota, final long estimatedDatabaseSize, final long totalQuota, final WebStorage.QuotaUpdater quotaUpdater) {
        throw new RuntimeException("Stub!");
    }
    
    public void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onGeolocationPermissionsHidePrompt() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPermissionRequest(final PermissionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPermissionRequestCanceled(final PermissionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onJsTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onConsoleMessage(final String message, final int lineNumber, final String sourceID) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public View getVideoLoadingProgressView() {
        throw new RuntimeException("Stub!");
    }
    
    public void getVisitedHistory(final ValueCallback<String[]> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onShowFileChooser(final WebView webView, final ValueCallback<Uri[]> filePathCallback, final FileChooserParams fileChooserParams) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class FileChooserParams
    {
        public static final int MODE_OPEN = 0;
        public static final int MODE_OPEN_MULTIPLE = 1;
        public static final int MODE_SAVE = 3;
        
        public FileChooserParams() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public static Uri[] parseResult(final int resultCode, final Intent data) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract int getMode();
        
        public abstract String[] getAcceptTypes();
        
        public abstract boolean isCaptureEnabled();
        
        @Nullable
        public abstract CharSequence getTitle();
        
        @Nullable
        public abstract String getFilenameHint();
        
        public abstract Intent createIntent();
    }
    
    public interface CustomViewCallback
    {
        void onCustomViewHidden();
    }
}
