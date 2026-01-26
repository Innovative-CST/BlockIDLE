package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import android.os.Parcelable;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.R;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.MenuPopupWindow;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener
{
    private static final int ITEM_LAYOUT;
    private final Context mContext;
    private final MenuBuilder mMenu;
    private final MenuAdapter mAdapter;
    private final boolean mOverflowOnly;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    final MenuPopupWindow mPopup;
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private final View.OnAttachStateChangeListener mAttachStateChangeListener;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private View mAnchorView;
    View mShownAnchorView;
    private Callback mPresenterCallback;
    ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;
    private boolean mHasContentWidth;
    private int mContentWidth;
    private int mDropDownGravity;
    private boolean mShowTitle;
    
    public StandardMenuPopup(final Context context, final MenuBuilder menu, final View anchorView, final int popupStyleAttr, final int popupStyleRes, final boolean overflowOnly) {
        this.mGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (StandardMenuPopup.this.isShowing() && !StandardMenuPopup.this.mPopup.isModal()) {
                    final View anchor = StandardMenuPopup.this.mShownAnchorView;
                    if (anchor == null || !anchor.isShown()) {
                        StandardMenuPopup.this.dismiss();
                    }
                    else {
                        StandardMenuPopup.this.mPopup.show();
                    }
                }
            }
        };
        this.mAttachStateChangeListener = (View.OnAttachStateChangeListener)new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View v) {
            }
            
            public void onViewDetachedFromWindow(final View v) {
                if (StandardMenuPopup.this.mTreeObserver != null) {
                    if (!StandardMenuPopup.this.mTreeObserver.isAlive()) {
                        StandardMenuPopup.this.mTreeObserver = v.getViewTreeObserver();
                    }
                    StandardMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(StandardMenuPopup.this.mGlobalLayoutListener);
                }
                v.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
        };
        this.mDropDownGravity = 0;
        this.mContext = context;
        this.mMenu = menu;
        this.mOverflowOnly = overflowOnly;
        final LayoutInflater inflater = LayoutInflater.from(context);
        this.mAdapter = new MenuAdapter(menu, inflater, this.mOverflowOnly, StandardMenuPopup.ITEM_LAYOUT);
        this.mPopupStyleAttr = popupStyleAttr;
        this.mPopupStyleRes = popupStyleRes;
        final Resources res = context.getResources();
        this.mPopupMaxWidth = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.mAnchorView = anchorView;
        this.mPopup = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        menu.addMenuPresenter(this, context);
    }
    
    @Override
    public void setForceShowIcon(final boolean forceShow) {
        this.mAdapter.setForceShowIcon(forceShow);
    }
    
    @Override
    public void setGravity(final int gravity) {
        this.mDropDownGravity = gravity;
    }
    
    private boolean tryShow() {
        if (this.isShowing()) {
            return true;
        }
        if (this.mWasDismissed || this.mAnchorView == null) {
            return false;
        }
        this.mShownAnchorView = this.mAnchorView;
        this.mPopup.setOnDismissListener((PopupWindow.OnDismissListener)this);
        this.mPopup.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        this.mPopup.setModal(true);
        final View anchor = this.mShownAnchorView;
        final boolean addGlobalListener = this.mTreeObserver == null;
        this.mTreeObserver = anchor.getViewTreeObserver();
        if (addGlobalListener) {
            this.mTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        anchor.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        this.mPopup.setAnchorView(anchor);
        this.mPopup.setDropDownGravity(this.mDropDownGravity);
        if (!this.mHasContentWidth) {
            this.mContentWidth = MenuPopup.measureIndividualMenuWidth((ListAdapter)this.mAdapter, null, this.mContext, this.mPopupMaxWidth);
            this.mHasContentWidth = true;
        }
        this.mPopup.setContentWidth(this.mContentWidth);
        this.mPopup.setInputMethodMode(2);
        this.mPopup.setEpicenterBounds(this.getEpicenterBounds());
        this.mPopup.show();
        final ListView listView = this.mPopup.getListView();
        listView.setOnKeyListener((View.OnKeyListener)this);
        if (this.mShowTitle && this.mMenu.getHeaderTitle() != null) {
            final FrameLayout titleItemView = (FrameLayout)LayoutInflater.from(this.mContext).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)listView, false);
            final TextView titleView = (TextView)titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.mMenu.getHeaderTitle());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView((View)titleItemView, (Object)null, false);
        }
        this.mPopup.setAdapter((ListAdapter)this.mAdapter);
        this.mPopup.show();
        return true;
    }
    
    public void show() {
        if (!this.tryShow()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
    
    public void dismiss() {
        if (this.isShowing()) {
            this.mPopup.dismiss();
        }
    }
    
    @Override
    public void addMenu(final MenuBuilder menu) {
    }
    
    public boolean isShowing() {
        return !this.mWasDismissed && this.mPopup.isShowing();
    }
    
    public void onDismiss() {
        this.mWasDismissed = true;
        this.mMenu.close();
        if (this.mTreeObserver != null) {
            if (!this.mTreeObserver.isAlive()) {
                this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            }
            this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }
    
    public void updateMenuView(final boolean cleared) {
        this.mHasContentWidth = false;
        if (this.mAdapter != null) {
            this.mAdapter.notifyDataSetChanged();
        }
    }
    
    public void setCallback(final Callback cb) {
        this.mPresenterCallback = cb;
    }
    
    public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
        if (subMenu.hasVisibleItems()) {
            final MenuPopupHelper subPopup = new MenuPopupHelper(this.mContext, subMenu, this.mShownAnchorView, this.mOverflowOnly, this.mPopupStyleAttr, this.mPopupStyleRes);
            subPopup.setPresenterCallback(this.mPresenterCallback);
            subPopup.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(subMenu));
            subPopup.setOnDismissListener(this.mOnDismissListener);
            this.mOnDismissListener = null;
            this.mMenu.close(false);
            int horizontalOffset = this.mPopup.getHorizontalOffset();
            final int verticalOffset = this.mPopup.getVerticalOffset();
            final int hgrav = Gravity.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 0x7;
            if (hgrav == 5) {
                horizontalOffset += this.mAnchorView.getWidth();
            }
            if (subPopup.tryShow(horizontalOffset, verticalOffset)) {
                if (this.mPresenterCallback != null) {
                    this.mPresenterCallback.onOpenSubMenu(subMenu);
                }
                return true;
            }
        }
        return false;
    }
    
    public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        if (menu != this.mMenu) {
            return;
        }
        this.dismiss();
        if (this.mPresenterCallback != null) {
            this.mPresenterCallback.onCloseMenu(menu, allMenusAreClosing);
        }
    }
    
    public boolean flagActionItems() {
        return false;
    }
    
    public Parcelable onSaveInstanceState() {
        return null;
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
    }
    
    @Override
    public void setAnchorView(final View anchor) {
        this.mAnchorView = anchor;
    }
    
    public boolean onKey(final View v, final int keyCode, final KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void setOnDismissListener(final PopupWindow.OnDismissListener listener) {
        this.mOnDismissListener = listener;
    }
    
    public ListView getListView() {
        return this.mPopup.getListView();
    }
    
    @Override
    public void setHorizontalOffset(final int x) {
        this.mPopup.setHorizontalOffset(x);
    }
    
    @Override
    public void setVerticalOffset(final int y) {
        this.mPopup.setVerticalOffset(y);
    }
    
    @Override
    public void setShowTitle(final boolean showTitle) {
        this.mShowTitle = showTitle;
    }
    
    static {
        ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
    }
}
