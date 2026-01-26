package androidx.appcompat.view.menu;

import androidx.annotation.NonNull;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface MenuPresenter
{
    void initForMenu(final Context p0, final MenuBuilder p1);
    
    MenuView getMenuView(final ViewGroup p0);
    
    void updateMenuView(final boolean p0);
    
    void setCallback(final Callback p0);
    
    boolean onSubMenuSelected(final SubMenuBuilder p0);
    
    void onCloseMenu(final MenuBuilder p0, final boolean p1);
    
    boolean flagActionItems();
    
    boolean expandItemActionView(final MenuBuilder p0, final MenuItemImpl p1);
    
    boolean collapseItemActionView(final MenuBuilder p0, final MenuItemImpl p1);
    
    int getId();
    
    Parcelable onSaveInstanceState();
    
    void onRestoreInstanceState(final Parcelable p0);
    
    public interface Callback
    {
        void onCloseMenu(@NonNull final MenuBuilder p0, final boolean p1);
        
        boolean onOpenSubMenu(@NonNull final MenuBuilder p0);
    }
}
