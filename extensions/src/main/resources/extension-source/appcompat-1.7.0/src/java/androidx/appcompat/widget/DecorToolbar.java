package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuBuilder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface DecorToolbar
{
    ViewGroup getViewGroup();
    
    Context getContext();
    
    boolean hasExpandedActionView();
    
    void collapseActionView();
    
    void setWindowCallback(final Window.Callback p0);
    
    void setWindowTitle(final CharSequence p0);
    
    CharSequence getTitle();
    
    void setTitle(final CharSequence p0);
    
    CharSequence getSubtitle();
    
    void setSubtitle(final CharSequence p0);
    
    void initProgress();
    
    void initIndeterminateProgress();
    
    boolean hasIcon();
    
    boolean hasLogo();
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setLogo(final int p0);
    
    void setLogo(final Drawable p0);
    
    boolean canShowOverflowMenu();
    
    boolean isOverflowMenuShowing();
    
    boolean isOverflowMenuShowPending();
    
    boolean showOverflowMenu();
    
    boolean hideOverflowMenu();
    
    void setMenuPrepared();
    
    void setMenu(final Menu p0, final MenuPresenter.Callback p1);
    
    void dismissPopupMenus();
    
    int getDisplayOptions();
    
    void setDisplayOptions(final int p0);
    
    void setEmbeddedTabView(final ScrollingTabContainerView p0);
    
    boolean hasEmbeddedTabs();
    
    boolean isTitleTruncated();
    
    void setCollapsible(final boolean p0);
    
    void setHomeButtonEnabled(final boolean p0);
    
    int getNavigationMode();
    
    void setNavigationMode(final int p0);
    
    void setDropdownParams(final SpinnerAdapter p0, final AdapterView.OnItemSelectedListener p1);
    
    void setDropdownSelectedPosition(final int p0);
    
    int getDropdownSelectedPosition();
    
    int getDropdownItemCount();
    
    void setCustomView(final View p0);
    
    View getCustomView();
    
    void animateToVisibility(final int p0);
    
    ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int p0, final long p1);
    
    void setNavigationIcon(final Drawable p0);
    
    void setNavigationIcon(final int p0);
    
    void setNavigationContentDescription(final CharSequence p0);
    
    void setNavigationContentDescription(final int p0);
    
    void setDefaultNavigationContentDescription(final int p0);
    
    void setDefaultNavigationIcon(final Drawable p0);
    
    void saveHierarchyState(final SparseArray<Parcelable> p0);
    
    void restoreHierarchyState(final SparseArray<Parcelable> p0);
    
    void setBackgroundDrawable(final Drawable p0);
    
    int getHeight();
    
    void setVisibility(final int p0);
    
    int getVisibility();
    
    void setMenuCallbacks(final MenuPresenter.Callback p0, final MenuBuilder.Callback p1);
    
    Menu getMenu();
}
