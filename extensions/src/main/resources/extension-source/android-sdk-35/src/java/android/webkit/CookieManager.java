package android.webkit;

public abstract class CookieManager
{
    @Deprecated
    public CookieManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public static CookieManager getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setAcceptCookie(final boolean p0);
    
    public abstract boolean acceptCookie();
    
    public abstract void setAcceptThirdPartyCookies(final WebView p0, final boolean p1);
    
    public abstract boolean acceptThirdPartyCookies(final WebView p0);
    
    public abstract void setCookie(final String p0, final String p1);
    
    public abstract void setCookie(final String p0, final String p1, @Nullable final ValueCallback<Boolean> p2);
    
    public abstract String getCookie(final String p0);
    
    @Deprecated
    public abstract void removeSessionCookie();
    
    public abstract void removeSessionCookies(@Nullable final ValueCallback<Boolean> p0);
    
    @Deprecated
    public abstract void removeAllCookie();
    
    public abstract void removeAllCookies(@Nullable final ValueCallback<Boolean> p0);
    
    public abstract boolean hasCookies();
    
    @Deprecated
    public abstract void removeExpiredCookie();
    
    public abstract void flush();
    
    public static boolean allowFileSchemeCookies() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setAcceptFileSchemeCookies(final boolean accept) {
        throw new RuntimeException("Stub!");
    }
}
