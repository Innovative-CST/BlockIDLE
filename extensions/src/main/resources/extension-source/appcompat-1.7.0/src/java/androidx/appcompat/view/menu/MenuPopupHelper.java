package androidx.appcompat.view.menu;

import android.widget.ListView;
import android.graphics.Rect;
import androidx.core.view.GravityCompat;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.annotation.AttrRes;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.widget.PopupWindow;
import android.view.View;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuPopupHelper implements MenuHelper
{
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private final Context mContext;
    private final MenuBuilder mMenu;
    private final boolean mOverflowOnly;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private View mAnchorView;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private MenuPresenter.Callback mPresenterCallback;
    private MenuPopup mPopup;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    
    public MenuPopupHelper(@NonNull final Context context, @NonNull final MenuBuilder menu) {
        this(context, menu, null, false, R.attr.popupMenuStyle, 0);
    }
    
    public MenuPopupHelper(@NonNull final Context context, @NonNull final MenuBuilder menu, @NonNull final View anchorView) {
        this(context, menu, anchorView, false, R.attr.popupMenuStyle, 0);
    }
    
    public MenuPopupHelper(@NonNull final Context context, @NonNull final MenuBuilder menu, @NonNull final View anchorView, final boolean overflowOnly, @AttrRes final int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }
    
    public MenuPopupHelper(@NonNull final Context context, @NonNull final MenuBuilder menu, @NonNull final View anchorView, final boolean overflowOnly, @AttrRes final int popupStyleAttr, @StyleRes final int popupStyleRes) {
        this.mDropDownGravity = 8388611;
        this.mInternalOnDismissListener = (PopupWindow.OnDismissListener)new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                MenuPopupHelper.this.onDismiss();
            }
        };
        this.mContext = context;
        this.mMenu = menu;
        this.mAnchorView = anchorView;
        this.mOverflowOnly = overflowOnly;
        this.mPopupStyleAttr = popupStyleAttr;
        this.mPopupStyleRes = popupStyleRes;
    }
    
    public void setOnDismissListener(@Nullable final PopupWindow.OnDismissListener listener) {
        this.mOnDismissListener = listener;
    }
    
    public void setAnchorView(@NonNull final View anchor) {
        this.mAnchorView = anchor;
    }
    
    public void setForceShowIcon(final boolean forceShowIcon) {
        this.mForceShowIcon = forceShowIcon;
        if (this.mPopup != null) {
            this.mPopup.setForceShowIcon(forceShowIcon);
        }
    }
    
    public void setGravity(final int gravity) {
        this.mDropDownGravity = gravity;
    }
    
    public int getGravity() {
        return this.mDropDownGravity;
    }
    
    public void show() {
        if (!this.tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
    
    public void show(final int x, final int y) {
        if (!this.tryShow(x, y)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    @NonNull
    public MenuPopup getPopup() {
        if (this.mPopup == null) {
            this.mPopup = this.createPopup();
        }
        return this.mPopup;
    }
    
    public boolean tryShow() {
        if (this.isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        this.showPopup(0, 0, false, false);
        return true;
    }
    
    public boolean tryShow(final int x, final int y) {
        if (this.isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        this.showPopup(x, y, true, true);
        return true;
    }
    
    @NonNull
    private MenuPopup createPopup() {
        final WindowManager windowManager = (WindowManager)this.mContext.getSystemService("window");
        final Display display = windowManager.getDefaultDisplay();
        final Point displaySize = new Point();
        display.getRealSize(displaySize);
        final int smallestWidth = Math.min(displaySize.x, displaySize.y);
        final int minSmallestWidthCascading = this.mContext.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
        final boolean enableCascadingSubmenus = smallestWidth >= minSmallestWidthCascading;
        MenuPopup popup;
        if (enableCascadingSubmenus) {
            popup = new CascadingMenuPopup(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        else {
            popup = new StandardMenuPopup(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        popup.addMenu(this.mMenu);
        popup.setOnDismissListener(this.mInternalOnDismissListener);
        popup.setAnchorView(this.mAnchorView);
        popup.setCallback(this.mPresenterCallback);
        popup.setForceShowIcon(this.mForceShowIcon);
        popup.setGravity(this.mDropDownGravity);
        return popup;
    }
    
    private void showPopup(int xOffset, final int yOffset, final boolean useOffsets, final boolean showTitle) {
        final MenuPopup popup = this.getPopup();
        popup.setShowTitle(showTitle);
        if (useOffsets) {
            final int hgrav = GravityCompat.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 0x7;
            if (hgrav == 5) {
                xOffset -= this.mAnchorView.getWidth();
            }
            popup.setHorizontalOffset(xOffset);
            popup.setVerticalOffset(yOffset);
            final float density = this.mContext.getResources().getDisplayMetrics().density;
            final int halfSize = (int)(48.0f * density / 2.0f);
            final Rect epicenter = new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize);
            popup.setEpicenterBounds(epicenter);
        }
        popup.show();
    }
    
    @Override
    public void dismiss() {
        if (this.isShowing()) {
            this.mPopup.dismiss();
        }
    }
    
    protected void onDismiss() {
        this.mPopup = null;
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }
    
    public boolean isShowing() {
        return this.mPopup != null && this.mPopup.isShowing();
    }
    
    @Override
    public void setPresenterCallback(@Nullable final MenuPresenter.Callback cb) {
        this.mPresenterCallback = cb;
        if (this.mPopup != null) {
            this.mPopup.setCallback(cb);
        }
    }
    
    public ListView getListView() {
        return this.getPopup().getListView();
    }
}
