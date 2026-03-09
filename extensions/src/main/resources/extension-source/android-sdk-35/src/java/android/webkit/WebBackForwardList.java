package android.webkit;

import java.io.Serializable;

public abstract class WebBackForwardList implements Cloneable, Serializable
{
    public WebBackForwardList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract WebHistoryItem getCurrentItem();
    
    public abstract int getCurrentIndex();
    
    public abstract WebHistoryItem getItemAtIndex(final int p0);
    
    public abstract int getSize();
    
    @Override
    protected abstract WebBackForwardList clone();
}
