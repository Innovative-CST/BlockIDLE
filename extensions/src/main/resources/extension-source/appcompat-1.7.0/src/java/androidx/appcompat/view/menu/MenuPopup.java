package androidx.appcompat.view.menu;

import android.widget.HeaderViewListAdapter;
import android.widget.FrameLayout;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.PopupWindow;
import android.view.View;
import android.graphics.Rect;
import android.widget.AdapterView;

abstract class MenuPopup implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener
{
    private Rect mEpicenterBounds;
    
    public abstract void setForceShowIcon(final boolean p0);
    
    public abstract void addMenu(final MenuBuilder p0);
    
    public abstract void setGravity(final int p0);
    
    public abstract void setAnchorView(final View p0);
    
    public abstract void setHorizontalOffset(final int p0);
    
    public abstract void setVerticalOffset(final int p0);
    
    public void setEpicenterBounds(final Rect bounds) {
        this.mEpicenterBounds = bounds;
    }
    
    public Rect getEpicenterBounds() {
        return this.mEpicenterBounds;
    }
    
    public abstract void setShowTitle(final boolean p0);
    
    public abstract void setOnDismissListener(final PopupWindow.OnDismissListener p0);
    
    @Override
    public void initForMenu(@NonNull final Context context, @Nullable final MenuBuilder menu) {
    }
    
    @Override
    public MenuView getMenuView(final ViewGroup root) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }
    
    @Override
    public boolean expandItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
        return false;
    }
    
    @Override
    public boolean collapseItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
        return false;
    }
    
    @Override
    public int getId() {
        return 0;
    }
    
    public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {
        final ListAdapter outerAdapter = (ListAdapter)parent.getAdapter();
        final MenuAdapter wrappedAdapter = toMenuAdapter(outerAdapter);
        wrappedAdapter.mAdapterMenu.performItemAction((MenuItem)outerAdapter.getItem(position), this, this.closeMenuOnSubMenuOpened() ? 0 : 4);
    }
    
    protected static int measureIndividualMenuWidth(final ListAdapter adapter, ViewGroup parent, final Context context, final int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        final int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        final int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int count = adapter.getCount(), i = 0; i < count; ++i) {
            final int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = (ViewGroup)new FrameLayout(context);
            }
            itemView = adapter.getView(i, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            final int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }
    
    protected static MenuAdapter toMenuAdapter(final ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (MenuAdapter)((HeaderViewListAdapter)adapter).getWrappedAdapter();
        }
        return (MenuAdapter)adapter;
    }
    
    protected static boolean shouldPreserveIconSpacing(final MenuBuilder menu) {
        boolean preserveIconSpacing = false;
        for (int count = menu.size(), i = 0; i < count; ++i) {
            final MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                preserveIconSpacing = true;
                break;
            }
        }
        return preserveIconSpacing;
    }
    
    protected boolean closeMenuOnSubMenuOpened() {
        return true;
    }
}
