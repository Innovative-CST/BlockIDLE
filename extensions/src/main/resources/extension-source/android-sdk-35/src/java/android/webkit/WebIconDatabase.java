package android.webkit;

import android.graphics.Bitmap;

@Deprecated
public abstract class WebIconDatabase
{
    @Deprecated
    public WebIconDatabase() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void open(final String p0);
    
    @Deprecated
    public abstract void close();
    
    @Deprecated
    public abstract void removeAllIcons();
    
    @Deprecated
    public abstract void requestIconForPageUrl(final String p0, final IconListener p1);
    
    @Deprecated
    public abstract void retainIconForPageUrl(final String p0);
    
    @Deprecated
    public abstract void releaseIconForPageUrl(final String p0);
    
    @Deprecated
    public static WebIconDatabase getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface IconListener
    {
        @Deprecated
        void onReceivedIcon(final String p0, final Bitmap p1);
    }
}
