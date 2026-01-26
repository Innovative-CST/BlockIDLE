package androidx.appcompat.view.menu;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import androidx.core.view.GravityCompat;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import android.widget.HeaderViewListAdapter;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.AdapterView;
import android.util.AttributeSet;
import androidx.appcompat.widget.MenuPopupWindow;
import android.content.res.Resources;
import androidx.appcompat.R;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.StyleRes;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.MenuItemHoverListener;
import android.view.ViewTreeObserver;
import java.util.List;
import android.os.Handler;
import android.content.Context;
import android.widget.PopupWindow;
import android.view.View;

final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener
{
    private static final int ITEM_LAYOUT;
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private final Context mContext;
    private final int mMenuMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private final boolean mOverflowOnly;
    final Handler mSubMenuHoverHandler;
    private final List<MenuBuilder> mPendingMenus;
    final List<CascadingMenuInfo> mShowingMenus;
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private final View.OnAttachStateChangeListener mAttachStateChangeListener;
    private final MenuItemHoverListener mMenuItemHoverListener;
    private int mRawDropDownGravity;
    private int mDropDownGravity;
    private View mAnchorView;
    View mShownAnchorView;
    private int mLastPosition;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private int mXOffset;
    private int mYOffset;
    private boolean mForceShowIcon;
    private boolean mShowTitle;
    private Callback mPresenterCallback;
    ViewTreeObserver mTreeObserver;
    private PopupWindow.OnDismissListener mOnDismissListener;
    boolean mShouldCloseImmediately;
    
    public CascadingMenuPopup(@NonNull final Context context, @NonNull final View anchor, @AttrRes final int popupStyleAttr, @StyleRes final int popupStyleRes, final boolean overflowOnly) {
        this.mPendingMenus = (List<MenuBuilder>)new ArrayList();
        this.mShowingMenus = (List<CascadingMenuInfo>)new ArrayList();
        this.mGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (CascadingMenuPopup.this.isShowing() && CascadingMenuPopup.this.mShowingMenus.size() > 0 && !((CascadingMenuInfo)CascadingMenuPopup.this.mShowingMenus.get(0)).window.isModal()) {
                    final View anchor = CascadingMenuPopup.this.mShownAnchorView;
                    if (anchor == null || !anchor.isShown()) {
                        CascadingMenuPopup.this.dismiss();
                    }
                    else {
                        for (final CascadingMenuInfo info : CascadingMenuPopup.this.mShowingMenus) {
                            info.window.show();
                        }
                    }
                }
            }
        };
        this.mAttachStateChangeListener = (View.OnAttachStateChangeListener)new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View v) {
            }
            
            public void onViewDetachedFromWindow(final View v) {
                if (CascadingMenuPopup.this.mTreeObserver != null) {
                    if (!CascadingMenuPopup.this.mTreeObserver.isAlive()) {
                        CascadingMenuPopup.this.mTreeObserver = v.getViewTreeObserver();
                    }
                    CascadingMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(CascadingMenuPopup.this.mGlobalLayoutListener);
                }
                v.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
        };
        this.mMenuItemHoverListener = new MenuItemHoverListener() {
            @Override
            public void onItemHoverExit(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
                CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages((Object)menu);
            }
            
            @Override
            public void onItemHoverEnter(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
                CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages((Object)null);
                int menuIndex = -1;
                for (int i = 0, count = CascadingMenuPopup.this.mShowingMenus.size(); i < count; ++i) {
                    if (menu == ((CascadingMenuInfo)CascadingMenuPopup.this.mShowingMenus.get(i)).menu) {
                        menuIndex = i;
                        break;
                    }
                }
                if (menuIndex == -1) {
                    return;
                }
                final int nextIndex = menuIndex + 1;
                CascadingMenuInfo nextInfo;
                if (nextIndex < CascadingMenuPopup.this.mShowingMenus.size()) {
                    nextInfo = (CascadingMenuInfo)CascadingMenuPopup.this.mShowingMenus.get(nextIndex);
                }
                else {
                    nextInfo = null;
                }
                final Runnable runnable = (Runnable)new Runnable() {
                    public void run() {
                        if (nextInfo != null) {
                            CascadingMenuPopup.this.mShouldCloseImmediately = true;
                            nextInfo.menu.close(false);
                            CascadingMenuPopup.this.mShouldCloseImmediately = false;
                        }
                        if (item.isEnabled() && item.hasSubMenu()) {
                            menu.performItemAction(item, 4);
                        }
                    }
                };
                final long uptimeMillis = SystemClock.uptimeMillis() + 200L;
                CascadingMenuPopup.this.mSubMenuHoverHandler.postAtTime(runnable, (Object)menu, uptimeMillis);
            }
        };
        this.mRawDropDownGravity = 0;
        this.mDropDownGravity = 0;
        this.mContext = context;
        this.mAnchorView = anchor;
        this.mPopupStyleAttr = popupStyleAttr;
        this.mPopupStyleRes = popupStyleRes;
        this.mOverflowOnly = overflowOnly;
        this.mForceShowIcon = false;
        this.mLastPosition = this.getInitialMenuPosition();
        final Resources res = context.getResources();
        this.mMenuMaxWidth = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.mSubMenuHoverHandler = new Handler();
    }
    
    @Override
    public void setForceShowIcon(final boolean forceShow) {
        this.mForceShowIcon = forceShow;
    }
    
    private MenuPopupWindow createPopupWindow() {
        final MenuPopupWindow popupWindow = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        popupWindow.setHoverListener(this.mMenuItemHoverListener);
        popupWindow.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        popupWindow.setOnDismissListener((PopupWindow.OnDismissListener)this);
        popupWindow.setAnchorView(this.mAnchorView);
        popupWindow.setDropDownGravity(this.mDropDownGravity);
        popupWindow.setModal(true);
        popupWindow.setInputMethodMode(2);
        return popupWindow;
    }
    
    public void show() {
        if (this.isShowing()) {
            return;
        }
        for (final MenuBuilder menu : this.mPendingMenus) {
            this.showMenu(menu);
        }
        this.mPendingMenus.clear();
        this.mShownAnchorView = this.mAnchorView;
        if (this.mShownAnchorView != null) {
            final boolean addGlobalListener = this.mTreeObserver == null;
            this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            if (addGlobalListener) {
                this.mTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
            }
            this.mShownAnchorView.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        }
    }
    
    public void dismiss() {
        final int length = this.mShowingMenus.size();
        if (length > 0) {
            final CascadingMenuInfo[] addedMenus = (CascadingMenuInfo[])this.mShowingMenus.toArray((Object[])new CascadingMenuInfo[length]);
            for (int i = length - 1; i >= 0; --i) {
                final CascadingMenuInfo info = addedMenus[i];
                if (info.window.isShowing()) {
                    info.window.dismiss();
                }
            }
        }
    }
    
    public boolean onKey(final View v, final int keyCode, final KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    private int getInitialMenuPosition() {
        final int layoutDirection = this.mAnchorView.getLayoutDirection();
        return (layoutDirection != 1) ? 1 : 0;
    }
    
    private int getNextMenuPosition(final int nextMenuWidth) {
        final ListView lastListView = ((CascadingMenuInfo)this.mShowingMenus.get(this.mShowingMenus.size() - 1)).getListView();
        final int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        final Rect displayFrame = new Rect();
        this.mShownAnchorView.getWindowVisibleDisplayFrame(displayFrame);
        if (this.mLastPosition == 1) {
            final int right = screenLocation[0] + lastListView.getWidth() + nextMenuWidth;
            if (right > displayFrame.right) {
                return 0;
            }
            return 1;
        }
        else {
            final int left = screenLocation[0] - nextMenuWidth;
            if (left < 0) {
                return 1;
            }
            return 0;
        }
    }
    
    @Override
    public void addMenu(final MenuBuilder menu) {
        menu.addMenuPresenter(this, this.mContext);
        if (this.isShowing()) {
            this.showMenu(menu);
        }
        else {
            this.mPendingMenus.add((Object)menu);
        }
    }
    
    private void showMenu(@NonNull final MenuBuilder menu) {
        final LayoutInflater inflater = LayoutInflater.from(this.mContext);
        final MenuAdapter adapter = new MenuAdapter(menu, inflater, this.mOverflowOnly, CascadingMenuPopup.ITEM_LAYOUT);
        if (!this.isShowing() && this.mForceShowIcon) {
            adapter.setForceShowIcon(true);
        }
        else if (this.isShowing()) {
            adapter.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menu));
        }
        final int menuWidth = MenuPopup.measureIndividualMenuWidth((ListAdapter)adapter, null, this.mContext, this.mMenuMaxWidth);
        final MenuPopupWindow popupWindow = this.createPopupWindow();
        popupWindow.setAdapter((ListAdapter)adapter);
        popupWindow.setContentWidth(menuWidth);
        popupWindow.setDropDownGravity(this.mDropDownGravity);
        CascadingMenuInfo parentInfo;
        View parentView;
        if (this.mShowingMenus.size() > 0) {
            parentInfo = (CascadingMenuInfo)this.mShowingMenus.get(this.mShowingMenus.size() - 1);
            parentView = this.findParentViewForSubmenu(parentInfo, menu);
        }
        else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.setTouchModal(false);
            popupWindow.setEnterTransition(null);
            final int nextMenuPosition = this.getNextMenuPosition(menuWidth);
            final boolean showOnRight = nextMenuPosition == 1;
            this.mLastPosition = nextMenuPosition;
            int parentOffsetX;
            int parentOffsetY;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.setAnchorView(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            }
            else {
                final int[] anchorScreenLocation = new int[2];
                this.mAnchorView.getLocationOnScreen(anchorScreenLocation);
                final int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.mDropDownGravity & 0x7) == 0x5) {
                    final int[] array = anchorScreenLocation;
                    final int n = 0;
                    array[n] += this.mAnchorView.getWidth();
                    final int[] array2 = parentViewScreenLocation;
                    final int n2 = 0;
                    array2[n2] += parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            int x;
            if ((this.mDropDownGravity & 0x5) == 0x5) {
                if (showOnRight) {
                    x = parentOffsetX + menuWidth;
                }
                else {
                    x = parentOffsetX - parentView.getWidth();
                }
            }
            else if (showOnRight) {
                x = parentOffsetX + parentView.getWidth();
            }
            else {
                x = parentOffsetX - menuWidth;
            }
            popupWindow.setHorizontalOffset(x);
            popupWindow.setOverlapAnchor(true);
            popupWindow.setVerticalOffset(parentOffsetY);
        }
        else {
            if (this.mHasXOffset) {
                popupWindow.setHorizontalOffset(this.mXOffset);
            }
            if (this.mHasYOffset) {
                popupWindow.setVerticalOffset(this.mYOffset);
            }
            final Rect epicenterBounds = this.getEpicenterBounds();
            popupWindow.setEpicenterBounds(epicenterBounds);
        }
        final CascadingMenuInfo menuInfo = new CascadingMenuInfo(popupWindow, menu, this.mLastPosition);
        this.mShowingMenus.add((Object)menuInfo);
        popupWindow.show();
        final ListView listView = popupWindow.getListView();
        listView.setOnKeyListener((View.OnKeyListener)this);
        if (parentInfo == null && this.mShowTitle && menu.getHeaderTitle() != null) {
            final FrameLayout titleItemView = (FrameLayout)inflater.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)listView, false);
            final TextView titleView = (TextView)titleItemView.findViewById(16908310);
            titleItemView.setEnabled(false);
            titleView.setText(menu.getHeaderTitle());
            listView.addHeaderView((View)titleItemView, (Object)null, false);
            popupWindow.show();
        }
    }
    
    private MenuItem findMenuItemForSubmenu(@NonNull final MenuBuilder parent, @NonNull final MenuBuilder submenu) {
        for (int i = 0, count = parent.size(); i < count; ++i) {
            final MenuItem item = parent.getItem(i);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }
    
    @Nullable
    private View findParentViewForSubmenu(@NonNull final CascadingMenuInfo parentInfo, @NonNull final MenuBuilder submenu) {
        final MenuItem owner = this.findMenuItemForSubmenu(parentInfo.menu, submenu);
        if (owner == null) {
            return null;
        }
        final ListView listView = parentInfo.getListView();
        final ListAdapter listAdapter = listView.getAdapter();
        int headersCount;
        MenuAdapter menuAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            final HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter)listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter)headerAdapter.getWrappedAdapter();
        }
        else {
            headersCount = 0;
            menuAdapter = (MenuAdapter)listAdapter;
        }
        int ownerPosition = -1;
        for (int i = 0, count = menuAdapter.getCount(); i < count; ++i) {
            if (owner == menuAdapter.getItem(i)) {
                ownerPosition = i;
                break;
            }
        }
        if (ownerPosition == -1) {
            return null;
        }
        ownerPosition += headersCount;
        final int ownerViewPosition = ownerPosition - listView.getFirstVisiblePosition();
        if (ownerViewPosition < 0 || ownerViewPosition >= listView.getChildCount()) {
            return null;
        }
        return listView.getChildAt(ownerViewPosition);
    }
    
    public boolean isShowing() {
        return this.mShowingMenus.size() > 0 && ((CascadingMenuInfo)this.mShowingMenus.get(0)).window.isShowing();
    }
    
    public void onDismiss() {
        CascadingMenuInfo dismissedInfo = null;
        for (int i = 0, count = this.mShowingMenus.size(); i < count; ++i) {
            final CascadingMenuInfo info = (CascadingMenuInfo)this.mShowingMenus.get(i);
            if (!info.window.isShowing()) {
                dismissedInfo = info;
                break;
            }
        }
        if (dismissedInfo != null) {
            dismissedInfo.menu.close(false);
        }
    }
    
    @Override
    public void updateMenuView(final boolean cleared) {
        for (final CascadingMenuInfo info : this.mShowingMenus) {
            MenuPopup.toMenuAdapter(info.getListView().getAdapter()).notifyDataSetChanged();
        }
    }
    
    @Override
    public void setCallback(final Callback cb) {
        this.mPresenterCallback = cb;
    }
    
    @Override
    public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
        for (final CascadingMenuInfo info : this.mShowingMenus) {
            if (subMenu == info.menu) {
                info.getListView().requestFocus();
                return true;
            }
        }
        if (subMenu.hasVisibleItems()) {
            this.addMenu(subMenu);
            if (this.mPresenterCallback != null) {
                this.mPresenterCallback.onOpenSubMenu(subMenu);
            }
            return true;
        }
        return false;
    }
    
    private int findIndexOfAddedMenu(@NonNull final MenuBuilder menu) {
        for (int i = 0, count = this.mShowingMenus.size(); i < count; ++i) {
            final CascadingMenuInfo info = (CascadingMenuInfo)this.mShowingMenus.get(i);
            if (menu == info.menu) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        final int menuIndex = this.findIndexOfAddedMenu(menu);
        if (menuIndex < 0) {
            return;
        }
        final int nextMenuIndex = menuIndex + 1;
        if (nextMenuIndex < this.mShowingMenus.size()) {
            final CascadingMenuInfo childInfo = (CascadingMenuInfo)this.mShowingMenus.get(nextMenuIndex);
            childInfo.menu.close(false);
        }
        final CascadingMenuInfo info = (CascadingMenuInfo)this.mShowingMenus.remove(menuIndex);
        info.menu.removeMenuPresenter(this);
        if (this.mShouldCloseImmediately) {
            info.window.setExitTransition(null);
            info.window.setAnimationStyle(0);
        }
        info.window.dismiss();
        final int count = this.mShowingMenus.size();
        if (count > 0) {
            this.mLastPosition = ((CascadingMenuInfo)this.mShowingMenus.get(count - 1)).position;
        }
        else {
            this.mLastPosition = this.getInitialMenuPosition();
        }
        if (count == 0) {
            this.dismiss();
            if (this.mPresenterCallback != null) {
                this.mPresenterCallback.onCloseMenu(menu, true);
            }
            if (this.mTreeObserver != null) {
                if (this.mTreeObserver.isAlive()) {
                    this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
                }
                this.mTreeObserver = null;
            }
            this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
            this.mOnDismissListener.onDismiss();
        }
        else if (allMenusAreClosing) {
            final CascadingMenuInfo rootInfo = (CascadingMenuInfo)this.mShowingMenus.get(0);
            rootInfo.menu.close(false);
        }
    }
    
    @Override
    public boolean flagActionItems() {
        return false;
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        return null;
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable state) {
    }
    
    @Override
    public void setGravity(final int dropDownGravity) {
        if (this.mRawDropDownGravity != dropDownGravity) {
            this.mRawDropDownGravity = dropDownGravity;
            this.mDropDownGravity = GravityCompat.getAbsoluteGravity(dropDownGravity, this.mAnchorView.getLayoutDirection());
        }
    }
    
    @Override
    public void setAnchorView(@NonNull final View anchor) {
        if (this.mAnchorView != anchor) {
            this.mAnchorView = anchor;
            this.mDropDownGravity = GravityCompat.getAbsoluteGravity(this.mRawDropDownGravity, this.mAnchorView.getLayoutDirection());
        }
    }
    
    @Override
    public void setOnDismissListener(final PopupWindow.OnDismissListener listener) {
        this.mOnDismissListener = listener;
    }
    
    public ListView getListView() {
        return this.mShowingMenus.isEmpty() ? null : ((CascadingMenuInfo)this.mShowingMenus.get(this.mShowingMenus.size() - 1)).getListView();
    }
    
    @Override
    public void setHorizontalOffset(final int x) {
        this.mHasXOffset = true;
        this.mXOffset = x;
    }
    
    @Override
    public void setVerticalOffset(final int y) {
        this.mHasYOffset = true;
        this.mYOffset = y;
    }
    
    @Override
    public void setShowTitle(final boolean showTitle) {
        this.mShowTitle = showTitle;
    }
    
    @Override
    protected boolean closeMenuOnSubMenuOpened() {
        return false;
    }
    
    static {
        ITEM_LAYOUT = R.layout.abc_cascading_menu_item_layout;
    }
    
    private static class CascadingMenuInfo
    {
        public final MenuPopupWindow window;
        public final MenuBuilder menu;
        public final int position;
        
        public CascadingMenuInfo(@NonNull final MenuPopupWindow window, @NonNull final MenuBuilder menu, final int position) {
            this.window = window;
            this.menu = menu;
            this.position = position;
        }
        
        public ListView getListView() {
            return this.window.getListView();
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }
}
