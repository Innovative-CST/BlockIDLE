package androidx.appcompat.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface DecorContentParent
{
    void setWindowCallback(final Window.Callback p0);
    
    void setWindowTitle(final CharSequence p0);
    
    CharSequence getTitle();
    
    void initFeature(final int p0);
    
    void setUiOptions(final int p0);
    
    boolean hasIcon();
    
    boolean hasLogo();
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setLogo(final int p0);
    
    boolean canShowOverflowMenu();
    
    boolean isOverflowMenuShowing();
    
    boolean isOverflowMenuShowPending();
    
    boolean showOverflowMenu();
    
    boolean hideOverflowMenu();
    
    void setMenuPrepared();
    
    void setMenu(final Menu p0, final MenuPresenter.Callback p1);
    
    void saveToolbarHierarchyState(final SparseArray<Parcelable> p0);
    
    void restoreToolbarHierarchyState(final SparseArray<Parcelable> p0);
    
    void dismissPopups();
}
