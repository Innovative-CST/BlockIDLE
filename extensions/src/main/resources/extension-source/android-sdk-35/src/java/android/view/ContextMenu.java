package android.view;

import android.graphics.drawable.Drawable;

public interface ContextMenu extends Menu
{
    ContextMenu setHeaderTitle(final int p0);
    
    ContextMenu setHeaderTitle(final CharSequence p0);
    
    ContextMenu setHeaderIcon(final int p0);
    
    ContextMenu setHeaderIcon(final Drawable p0);
    
    ContextMenu setHeaderView(final View p0);
    
    void clearHeader();
    
    public interface ContextMenuInfo
    {
    }
}
