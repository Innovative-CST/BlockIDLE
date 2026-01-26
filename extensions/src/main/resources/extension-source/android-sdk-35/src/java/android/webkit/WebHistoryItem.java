package android.webkit;

import android.graphics.Bitmap;

public abstract class WebHistoryItem implements Cloneable
{
    public WebHistoryItem() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String getUrl();
    
    public abstract String getOriginalUrl();
    
    public abstract String getTitle();
    
    @Nullable
    public abstract Bitmap getFavicon();
    
    @Override
    protected abstract WebHistoryItem clone();
}
