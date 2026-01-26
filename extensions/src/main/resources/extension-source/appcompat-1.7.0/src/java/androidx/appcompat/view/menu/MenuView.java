package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface MenuView
{
    void initialize(final MenuBuilder p0);
    
    int getWindowAnimations();
    
    public interface ItemView
    {
        void initialize(final MenuItemImpl p0, final int p1);
        
        MenuItemImpl getItemData();
        
        void setTitle(final CharSequence p0);
        
        void setEnabled(final boolean p0);
        
        void setCheckable(final boolean p0);
        
        void setChecked(final boolean p0);
        
        void setShortcut(final boolean p0, final char p1);
        
        void setIcon(final Drawable p0);
        
        boolean prefersCondensedTitle();
        
        boolean showsIcon();
    }
}
