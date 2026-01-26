package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.MenuAdapter;
import android.widget.HeaderViewListAdapter;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.PopupWindow;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import android.util.Log;
import android.transition.Transition;
import android.os.Build;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import java.lang.reflect.Method;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener
{
    private static final String TAG = "MenuPopupWindow";
    private static Method sSetTouchModalMethod;
    private MenuItemHoverListener mHoverListener;
    
    public MenuPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    
    @NonNull
    @Override
    DropDownListView createDropDownListView(final Context context, final boolean hijackFocus) {
        final MenuDropDownListView view = new MenuDropDownListView(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }
    
    public void setEnterTransition(final Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setEnterTransition(this.mPopup, (Transition)enterTransition);
        }
    }
    
    public void setExitTransition(final Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setExitTransition(this.mPopup, (Transition)exitTransition);
        }
    }
    
    public void setHoverListener(final MenuItemHoverListener hoverListener) {
        this.mHoverListener = hoverListener;
    }
    
    public void setTouchModal(final boolean touchModal) {
        if (Build.VERSION.SDK_INT <= 28) {
            if (MenuPopupWindow.sSetTouchModalMethod != null) {
                try {
                    MenuPopupWindow.sSetTouchModalMethod.invoke((Object)this.mPopup, new Object[] { touchModal });
                }
                catch (final Exception e) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            Api29Impl.setTouchModal(this.mPopup, touchModal);
        }
    }
    
    @Override
    public void onItemHoverEnter(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverEnter(menu, item);
        }
    }
    
    @Override
    public void onItemHoverExit(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverExit(menu, item);
        }
    }
    
    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                MenuPopupWindow.sSetTouchModalMethod = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (final NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public static class MenuDropDownListView extends DropDownListView
    {
        final int mAdvanceKey;
        final int mRetreatKey;
        private MenuItemHoverListener mHoverListener;
        private MenuItem mHoveredMenuItem;
        
        public MenuDropDownListView(final Context context, final boolean hijackFocus) {
            super(context, hijackFocus);
            final Resources res = context.getResources();
            final Configuration config = res.getConfiguration();
            if (1 == config.getLayoutDirection()) {
                this.mAdvanceKey = 21;
                this.mRetreatKey = 22;
            }
            else {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
            }
        }
        
        public void setHoverListener(final MenuItemHoverListener hoverListener) {
            this.mHoverListener = hoverListener;
        }
        
        public void clearSelection() {
            this.setSelection(-1);
        }
        
        public boolean onKeyDown(final int keyCode, final KeyEvent event) {
            final ListMenuItemView selectedItem = (ListMenuItemView)this.getSelectedView();
            if (selectedItem != null && keyCode == this.mAdvanceKey) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    this.performItemClick((View)selectedItem, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if (selectedItem != null && keyCode == this.mRetreatKey) {
                this.setSelection(-1);
                final ListAdapter adapter = this.getAdapter();
                MenuAdapter menuAdapter;
                if (adapter instanceof HeaderViewListAdapter) {
                    menuAdapter = (MenuAdapter)((HeaderViewListAdapter)adapter).getWrappedAdapter();
                }
                else {
                    menuAdapter = (MenuAdapter)adapter;
                }
                menuAdapter.getAdapterMenu().close(false);
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }
        
        @Override
        public boolean onHoverEvent(final MotionEvent ev) {
            if (this.mHoverListener != null) {
                final ListAdapter adapter = this.getAdapter();
                int headersCount;
                MenuAdapter menuAdapter;
                if (adapter instanceof HeaderViewListAdapter) {
                    final HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter)adapter;
                    headersCount = headerAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter)headerAdapter.getWrappedAdapter();
                }
                else {
                    headersCount = 0;
                    menuAdapter = (MenuAdapter)adapter;
                }
                MenuItem menuItem = null;
                if (ev.getAction() != 10) {
                    final int position = this.pointToPosition((int)ev.getX(), (int)ev.getY());
                    if (position != -1) {
                        final int itemPosition = position - headersCount;
                        if (itemPosition >= 0 && itemPosition < menuAdapter.getCount()) {
                            menuItem = (MenuItem)menuAdapter.getItem(itemPosition);
                        }
                    }
                }
                final MenuItem oldMenuItem = this.mHoveredMenuItem;
                if (oldMenuItem != menuItem) {
                    final MenuBuilder menu = menuAdapter.getAdapterMenu();
                    if (oldMenuItem != null) {
                        this.mHoverListener.onItemHoverExit(menu, oldMenuItem);
                    }
                    if ((this.mHoveredMenuItem = menuItem) != null) {
                        this.mHoverListener.onItemHoverEnter(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
    
    @RequiresApi(23)
    static class Api23Impl
    {
        private Api23Impl() {
        }
        
        @DoNotInline
        static void setEnterTransition(final PopupWindow popupWindow, final Transition enterTransition) {
            popupWindow.setEnterTransition(enterTransition);
        }
        
        @DoNotInline
        static void setExitTransition(final PopupWindow popupWindow, final Transition exitTransition) {
            popupWindow.setExitTransition(exitTransition);
        }
    }
    
    @RequiresApi(29)
    static class Api29Impl
    {
        private Api29Impl() {
        }
        
        @DoNotInline
        static void setTouchModal(final PopupWindow popupWindow, final boolean touchModal) {
            popupWindow.setTouchModal(touchModal);
        }
    }
}
