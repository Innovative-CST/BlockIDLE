package androidx.appcompat.widget;

import androidx.annotation.RestrictTo;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.annotation.MenuRes;
import androidx.appcompat.view.SupportMenuInflater;
import android.view.MenuInflater;
import android.view.Menu;
import androidx.appcompat.view.menu.ShowableListMenu;
import android.widget.PopupWindow;
import android.view.MenuItem;
import androidx.annotation.StyleRes;
import androidx.annotation.AttrRes;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuPopupHelper;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import android.content.Context;

public class PopupMenu
{
    private final Context mContext;
    private final MenuBuilder mMenu;
    private final View mAnchor;
    final MenuPopupHelper mPopup;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    private View.OnTouchListener mDragListener;
    
    public PopupMenu(@NonNull final Context context, @NonNull final View anchor) {
        this(context, anchor, 0);
    }
    
    public PopupMenu(@NonNull final Context context, @NonNull final View anchor, final int gravity) {
        this(context, anchor, gravity, R.attr.popupMenuStyle, 0);
    }
    
    public PopupMenu(@NonNull final Context context, @NonNull final View anchor, final int gravity, @AttrRes final int popupStyleAttr, @StyleRes final int popupStyleRes) {
        this.mContext = context;
        this.mAnchor = anchor;
        (this.mMenu = new MenuBuilder(context)).setCallback(new MenuBuilder.Callback() {
            @Override
            public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
                return PopupMenu.this.mMenuItemClickListener != null && PopupMenu.this.mMenuItemClickListener.onMenuItemClick(item);
            }
            
            @Override
            public void onMenuModeChange(@NonNull final MenuBuilder menu) {
            }
        });
        (this.mPopup = new MenuPopupHelper(context, this.mMenu, anchor, false, popupStyleAttr, popupStyleRes)).setGravity(gravity);
        this.mPopup.setOnDismissListener((PopupWindow.OnDismissListener)new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                if (PopupMenu.this.mOnDismissListener != null) {
                    PopupMenu.this.mOnDismissListener.onDismiss(PopupMenu.this);
                }
            }
        });
    }
    
    public void setGravity(final int gravity) {
        this.mPopup.setGravity(gravity);
    }
    
    public int getGravity() {
        return this.mPopup.getGravity();
    }
    
    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = (View.OnTouchListener)new ForwardingListener(this.mAnchor) {
                @Override
                protected boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }
                
                @Override
                protected boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
                
                @Override
                public ShowableListMenu getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }
            };
        }
        return this.mDragListener;
    }
    
    @NonNull
    public Menu getMenu() {
        return (Menu)this.mMenu;
    }
    
    @NonNull
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContext);
    }
    
    public void inflate(@MenuRes final int menuRes) {
        this.getMenuInflater().inflate(menuRes, (Menu)this.mMenu);
    }
    
    public void show() {
        this.mPopup.show();
    }
    
    public void dismiss() {
        this.mPopup.dismiss();
    }
    
    public void setOnMenuItemClickListener(@Nullable final OnMenuItemClickListener listener) {
        this.mMenuItemClickListener = listener;
    }
    
    public void setOnDismissListener(@Nullable final OnDismissListener listener) {
        this.mOnDismissListener = listener;
    }
    
    public void setForceShowIcon(final boolean forceShowIcon) {
        this.mPopup.setForceShowIcon(forceShowIcon);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    ListView getMenuListView() {
        if (!this.mPopup.isShowing()) {
            return null;
        }
        return this.mPopup.getListView();
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
    
    public interface OnDismissListener
    {
        void onDismiss(final PopupMenu p0);
    }
}
