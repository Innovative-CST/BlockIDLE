package android.webkit;

import android.content.Context;

public abstract class WebSettings
{
    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;
    @Deprecated
    public static final int FORCE_DARK_OFF = 0;
    @Deprecated
    public static final int FORCE_DARK_ON = 2;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    @Deprecated
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;
    public static final int MENU_ITEM_NONE = 0;
    public static final int MENU_ITEM_PROCESS_TEXT = 4;
    public static final int MENU_ITEM_SHARE = 1;
    public static final int MENU_ITEM_WEB_SEARCH = 2;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
    public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
    
    public WebSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setSupportZoom(final boolean p0);
    
    public abstract boolean supportZoom();
    
    public abstract void setMediaPlaybackRequiresUserGesture(final boolean p0);
    
    public abstract boolean getMediaPlaybackRequiresUserGesture();
    
    public abstract void setBuiltInZoomControls(final boolean p0);
    
    public abstract boolean getBuiltInZoomControls();
    
    public abstract void setDisplayZoomControls(final boolean p0);
    
    public abstract boolean getDisplayZoomControls();
    
    public abstract void setAllowFileAccess(final boolean p0);
    
    public abstract boolean getAllowFileAccess();
    
    public abstract void setAllowContentAccess(final boolean p0);
    
    public abstract boolean getAllowContentAccess();
    
    public abstract void setLoadWithOverviewMode(final boolean p0);
    
    public abstract boolean getLoadWithOverviewMode();
    
    @Deprecated
    public abstract void setEnableSmoothTransition(final boolean p0);
    
    @Deprecated
    public abstract boolean enableSmoothTransition();
    
    @Deprecated
    public abstract void setSaveFormData(final boolean p0);
    
    @Deprecated
    public abstract boolean getSaveFormData();
    
    @Deprecated
    public abstract void setSavePassword(final boolean p0);
    
    @Deprecated
    public abstract boolean getSavePassword();
    
    public abstract void setTextZoom(final int p0);
    
    public abstract int getTextZoom();
    
    @Deprecated
    public synchronized void setTextSize(final TextSize t) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized TextSize getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void setDefaultZoom(final ZoomDensity p0);
    
    @Deprecated
    public abstract ZoomDensity getDefaultZoom();
    
    @Deprecated
    public abstract void setLightTouchEnabled(final boolean p0);
    
    @Deprecated
    public abstract boolean getLightTouchEnabled();
    
    public abstract void setUseWideViewPort(final boolean p0);
    
    public abstract boolean getUseWideViewPort();
    
    public abstract void setSupportMultipleWindows(final boolean p0);
    
    public abstract boolean supportMultipleWindows();
    
    public abstract void setLayoutAlgorithm(final LayoutAlgorithm p0);
    
    public abstract LayoutAlgorithm getLayoutAlgorithm();
    
    public abstract void setStandardFontFamily(final String p0);
    
    public abstract String getStandardFontFamily();
    
    public abstract void setFixedFontFamily(final String p0);
    
    public abstract String getFixedFontFamily();
    
    public abstract void setSansSerifFontFamily(final String p0);
    
    public abstract String getSansSerifFontFamily();
    
    public abstract void setSerifFontFamily(final String p0);
    
    public abstract String getSerifFontFamily();
    
    public abstract void setCursiveFontFamily(final String p0);
    
    public abstract String getCursiveFontFamily();
    
    public abstract void setFantasyFontFamily(final String p0);
    
    public abstract String getFantasyFontFamily();
    
    public abstract void setMinimumFontSize(final int p0);
    
    public abstract int getMinimumFontSize();
    
    public abstract void setMinimumLogicalFontSize(final int p0);
    
    public abstract int getMinimumLogicalFontSize();
    
    public abstract void setDefaultFontSize(final int p0);
    
    public abstract int getDefaultFontSize();
    
    public abstract void setDefaultFixedFontSize(final int p0);
    
    public abstract int getDefaultFixedFontSize();
    
    public abstract void setLoadsImagesAutomatically(final boolean p0);
    
    public abstract boolean getLoadsImagesAutomatically();
    
    public abstract void setBlockNetworkImage(final boolean p0);
    
    public abstract boolean getBlockNetworkImage();
    
    public abstract void setBlockNetworkLoads(final boolean p0);
    
    public abstract boolean getBlockNetworkLoads();
    
    public abstract void setJavaScriptEnabled(final boolean p0);
    
    @Deprecated
    public abstract void setAllowUniversalAccessFromFileURLs(final boolean p0);
    
    @Deprecated
    public abstract void setAllowFileAccessFromFileURLs(final boolean p0);
    
    @Deprecated
    public abstract void setPluginState(final PluginState p0);
    
    @Deprecated
    public abstract void setDatabasePath(final String p0);
    
    @Deprecated
    public abstract void setGeolocationDatabasePath(final String p0);
    
    @Deprecated
    public abstract void setDatabaseEnabled(final boolean p0);
    
    public abstract void setDomStorageEnabled(final boolean p0);
    
    public abstract boolean getDomStorageEnabled();
    
    @Deprecated
    public abstract String getDatabasePath();
    
    @Deprecated
    public abstract boolean getDatabaseEnabled();
    
    public abstract void setGeolocationEnabled(final boolean p0);
    
    public abstract boolean getJavaScriptEnabled();
    
    public abstract boolean getAllowUniversalAccessFromFileURLs();
    
    public abstract boolean getAllowFileAccessFromFileURLs();
    
    @Deprecated
    public abstract PluginState getPluginState();
    
    public abstract void setJavaScriptCanOpenWindowsAutomatically(final boolean p0);
    
    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();
    
    public abstract void setDefaultTextEncodingName(final String p0);
    
    public abstract String getDefaultTextEncodingName();
    
    public abstract void setUserAgentString(@Nullable final String p0);
    
    public abstract String getUserAgentString();
    
    public static String getDefaultUserAgent(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setNeedInitialFocus(final boolean p0);
    
    @Deprecated
    public abstract void setRenderPriority(final RenderPriority p0);
    
    public abstract void setCacheMode(final int p0);
    
    public abstract int getCacheMode();
    
    public abstract void setMixedContentMode(final int p0);
    
    public abstract int getMixedContentMode();
    
    public abstract void setOffscreenPreRaster(final boolean p0);
    
    public abstract boolean getOffscreenPreRaster();
    
    public abstract void setSafeBrowsingEnabled(final boolean p0);
    
    public abstract boolean getSafeBrowsingEnabled();
    
    @Deprecated
    public void setForceDark(final int forceDark) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getForceDark() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlgorithmicDarkeningAllowed(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlgorithmicDarkeningAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setDisabledActionModeMenuItems(final int p0);
    
    public abstract int getDisabledActionModeMenuItems();
    
    public enum LayoutAlgorithm
    {
        NORMAL, 
        @Deprecated
        SINGLE_COLUMN, 
        @Deprecated
        NARROW_COLUMNS, 
        TEXT_AUTOSIZING;
    }
    
    public enum PluginState
    {
        ON, 
        ON_DEMAND, 
        OFF;
    }
    
    public enum RenderPriority
    {
        NORMAL, 
        HIGH, 
        LOW;
    }
    
    @Deprecated
    public enum TextSize
    {
        @Deprecated
        SMALLEST, 
        @Deprecated
        SMALLER, 
        @Deprecated
        NORMAL, 
        @Deprecated
        LARGER, 
        @Deprecated
        LARGEST;
    }
    
    public enum ZoomDensity
    {
        FAR, 
        MEDIUM, 
        CLOSE;
    }
}
