package android.view;

import android.graphics.drawable.Drawable;

public interface SubMenu extends Menu
{
    SubMenu setHeaderTitle(final int p0);
    
    SubMenu setHeaderTitle(final CharSequence p0);
    
    SubMenu setHeaderIcon(final int p0);
    
    SubMenu setHeaderIcon(final Drawable p0);
    
    SubMenu setHeaderView(final View p0);
    
    void clearHeader();
    
    SubMenu setIcon(final int p0);
    
    SubMenu setIcon(final Drawable p0);
    
    MenuItem getItem();
}
