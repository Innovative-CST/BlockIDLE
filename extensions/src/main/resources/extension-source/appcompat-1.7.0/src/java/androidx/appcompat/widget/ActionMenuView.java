package androidx.appcompat.widget;

import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuItemImpl;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View;
import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import android.view.ContextThemeWrapper;
import androidx.annotation.StyleRes;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuPresenter;
import android.content.Context;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.MenuBuilder;

public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView
{
    private static final String TAG = "ActionMenuView";
    static final int MIN_CELL_SIZE = 56;
    static final int GENERATED_ITEM_PADDING = 4;
    private MenuBuilder mMenu;
    private Context mPopupContext;
    private int mPopupTheme;
    private boolean mReserveOverflow;
    private ActionMenuPresenter mPresenter;
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    MenuBuilder.Callback mMenuBuilderCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mMinCellSize;
    private int mGeneratedItemPadding;
    OnMenuItemClickListener mOnMenuItemClickListener;
    
    public ActionMenuView(@NonNull final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
        this.setBaselineAligned(false);
        final float density = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int)(56.0f * density);
        this.mGeneratedItemPadding = (int)(4.0f * density);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }
    
    public void setPopupTheme(@StyleRes final int resId) {
        if (this.mPopupTheme != resId) {
            if ((this.mPopupTheme = resId) == 0) {
                this.mPopupContext = this.getContext();
            }
            else {
                this.mPopupContext = (Context)new ContextThemeWrapper(this.getContext(), resId);
            }
        }
    }
    
    public int getPopupTheme() {
        return this.mPopupTheme;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public void setPresenter(final ActionMenuPresenter presenter) {
        (this.mPresenter = presenter).setMenuView(this);
    }
    
    public void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.mPresenter != null) {
            this.mPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }
    
    public void setOnMenuItemClickListener(final OnMenuItemClickListener listener) {
        this.mOnMenuItemClickListener = listener;
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        final boolean wasFormatted = this.mFormatItems;
        this.mFormatItems = (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824);
        if (wasFormatted != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        final int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.mFormatItems && this.mMenu != null && widthSize != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = widthSize;
            this.mMenu.onItemsChanged(true);
        }
        final int childCount = this.getChildCount();
        if (this.mFormatItems && childCount > 0) {
            this.onMeasureExactFormat(widthMeasureSpec, heightMeasureSpec);
        }
        else {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final LayoutParams layoutParams = (LayoutParams)child.getLayoutParams();
                final int n = 0;
                layoutParams.rightMargin = n;
                layoutParams.leftMargin = n;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
    
    private void onMeasureExactFormat(final int widthMeasureSpec, final int heightMeasureSpec) {
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        final int widthPadding = this.getPaddingLeft() + this.getPaddingRight();
        final int heightPadding = this.getPaddingTop() + this.getPaddingBottom();
        final int itemHeightSpec = getChildMeasureSpec(heightMeasureSpec, heightPadding, -2);
        widthSize -= widthPadding;
        final int cellCount = widthSize / this.mMinCellSize;
        final int cellSizeRemaining = widthSize % this.mMinCellSize;
        if (cellCount == 0) {
            this.setMeasuredDimension(widthSize, 0);
            return;
        }
        final int cellSize = this.mMinCellSize + cellSizeRemaining / cellCount;
        int cellsRemaining = cellCount;
        int maxChildHeight = 0;
        int maxCellsUsed = 0;
        int expandableItemCount = 0;
        int visibleItemCount = 0;
        boolean hasOverflow = false;
        long smallestItemsAt = 0L;
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final boolean isGeneratedItem = child instanceof ActionMenuItemView;
                ++visibleItemCount;
                if (isGeneratedItem) {
                    child.setPadding(this.mGeneratedItemPadding, 0, this.mGeneratedItemPadding, 0);
                }
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                lp.expanded = false;
                lp.extraPixels = 0;
                lp.cellsUsed = 0;
                lp.expandable = false;
                lp.leftMargin = 0;
                lp.rightMargin = 0;
                lp.preventEdgeOffset = (isGeneratedItem && ((ActionMenuItemView)child).hasText());
                final int cellsAvailable = lp.isOverflowButton ? 1 : cellsRemaining;
                final int cellsUsed = measureChildForCells(child, cellSize, cellsAvailable, itemHeightSpec, heightPadding);
                maxCellsUsed = Math.max(maxCellsUsed, cellsUsed);
                if (lp.expandable) {
                    ++expandableItemCount;
                }
                if (lp.isOverflowButton) {
                    hasOverflow = true;
                }
                cellsRemaining -= cellsUsed;
                maxChildHeight = Math.max(maxChildHeight, child.getMeasuredHeight());
                if (cellsUsed == 1) {
                    smallestItemsAt |= 1 << i;
                }
            }
        }
        final boolean centerSingleExpandedItem = hasOverflow && visibleItemCount == 2;
        boolean needsExpansion = false;
        while (expandableItemCount > 0 && cellsRemaining > 0) {
            int minCells = Integer.MAX_VALUE;
            long minCellsAt = 0L;
            int minCellsItemCount = 0;
            for (int j = 0; j < childCount; ++j) {
                final View child2 = this.getChildAt(j);
                final LayoutParams lp2 = (LayoutParams)child2.getLayoutParams();
                if (lp2.expandable) {
                    if (lp2.cellsUsed < minCells) {
                        minCells = lp2.cellsUsed;
                        minCellsAt = 1L << j;
                        minCellsItemCount = 1;
                    }
                    else if (lp2.cellsUsed == minCells) {
                        minCellsAt |= 1L << j;
                        ++minCellsItemCount;
                    }
                }
            }
            smallestItemsAt |= minCellsAt;
            if (minCellsItemCount > cellsRemaining) {
                break;
            }
            ++minCells;
            for (int j = 0; j < childCount; ++j) {
                final View child2 = this.getChildAt(j);
                final LayoutParams lp2 = (LayoutParams)child2.getLayoutParams();
                if ((minCellsAt & (long)(1 << j)) == 0x0L) {
                    if (lp2.cellsUsed == minCells) {
                        smallestItemsAt |= 1 << j;
                    }
                }
                else {
                    if (centerSingleExpandedItem && lp2.preventEdgeOffset && cellsRemaining == 1) {
                        child2.setPadding(this.mGeneratedItemPadding + cellSize, 0, this.mGeneratedItemPadding, 0);
                    }
                    final LayoutParams layoutParams = lp2;
                    ++layoutParams.cellsUsed;
                    lp2.expanded = true;
                    --cellsRemaining;
                }
            }
            needsExpansion = true;
        }
        final boolean singleItem = !hasOverflow && visibleItemCount == 1;
        if (cellsRemaining > 0 && smallestItemsAt != 0L && (cellsRemaining < visibleItemCount - 1 || singleItem || maxCellsUsed > 1)) {
            float expandCount = (float)Long.bitCount(smallestItemsAt);
            if (!singleItem) {
                if ((smallestItemsAt & 0x1L) != 0x0L) {
                    final LayoutParams lp3 = (LayoutParams)this.getChildAt(0).getLayoutParams();
                    if (!lp3.preventEdgeOffset) {
                        expandCount -= 0.5f;
                    }
                }
                if ((smallestItemsAt & (long)(1 << childCount - 1)) != 0x0L) {
                    final LayoutParams lp3 = (LayoutParams)this.getChildAt(childCount - 1).getLayoutParams();
                    if (!lp3.preventEdgeOffset) {
                        expandCount -= 0.5f;
                    }
                }
            }
            final int extraPixels = (expandCount > 0.0f) ? ((int)(cellsRemaining * cellSize / expandCount)) : 0;
            for (int k = 0; k < childCount; ++k) {
                if ((smallestItemsAt & (long)(1 << k)) != 0x0L) {
                    final View child3 = this.getChildAt(k);
                    final LayoutParams lp4 = (LayoutParams)child3.getLayoutParams();
                    if (child3 instanceof ActionMenuItemView) {
                        lp4.extraPixels = extraPixels;
                        lp4.expanded = true;
                        if (k == 0 && !lp4.preventEdgeOffset) {
                            lp4.leftMargin = -extraPixels / 2;
                        }
                        needsExpansion = true;
                    }
                    else if (lp4.isOverflowButton) {
                        lp4.extraPixels = extraPixels;
                        lp4.expanded = true;
                        lp4.rightMargin = -extraPixels / 2;
                        needsExpansion = true;
                    }
                    else {
                        if (k != 0) {
                            lp4.leftMargin = extraPixels / 2;
                        }
                        if (k != childCount - 1) {
                            lp4.rightMargin = extraPixels / 2;
                        }
                    }
                }
            }
            cellsRemaining = 0;
        }
        if (needsExpansion) {
            for (int l = 0; l < childCount; ++l) {
                final View child4 = this.getChildAt(l);
                final LayoutParams lp5 = (LayoutParams)child4.getLayoutParams();
                if (lp5.expanded) {
                    final int width = lp5.cellsUsed * cellSize + lp5.extraPixels;
                    child4.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), itemHeightSpec);
                }
            }
        }
        if (heightMode != 1073741824) {
            heightSize = maxChildHeight;
        }
        this.setMeasuredDimension(widthSize, heightSize);
    }
    
    static int measureChildForCells(final View child, final int cellSize, final int cellsRemaining, final int parentHeightMeasureSpec, final int parentHeightPadding) {
        final LayoutParams lp = (LayoutParams)child.getLayoutParams();
        final int childHeightSize = View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding;
        final int childHeightMode = View.MeasureSpec.getMode(parentHeightMeasureSpec);
        final int childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightSize, childHeightMode);
        final ActionMenuItemView itemView = (child instanceof ActionMenuItemView) ? child : null;
        final boolean hasText = itemView != null && itemView.hasText();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            final int childWidthSpec = View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE);
            child.measure(childWidthSpec, childHeightSpec);
            final int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                ++cellsUsed;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        final boolean expandable = !lp.isOverflowButton && hasText;
        lp.expandable = expandable;
        lp.cellsUsed = cellsUsed;
        final int targetWidth = cellsUsed * cellSize;
        child.measure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), childHeightSpec);
        return cellsUsed;
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        if (!this.mFormatItems) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        final int childCount = this.getChildCount();
        final int midVertical = (bottom - top) / 2;
        final int dividerWidth = this.getDividerWidth();
        int overflowWidth = 0;
        int nonOverflowCount = 0;
        int widthRemaining = right - left - this.getPaddingRight() - this.getPaddingLeft();
        boolean hasOverflow = false;
        final boolean isLayoutRtl = ViewUtils.isLayoutRtl((View)this);
        for (int i = 0; i < childCount; ++i) {
            final View v = this.getChildAt(i);
            if (v.getVisibility() != 8) {
                final LayoutParams p = (LayoutParams)v.getLayoutParams();
                if (p.isOverflowButton) {
                    overflowWidth = v.getMeasuredWidth();
                    if (this.hasSupportDividerBeforeChildAt(i)) {
                        overflowWidth += dividerWidth;
                    }
                    final int height = v.getMeasuredHeight();
                    int l;
                    int r;
                    if (isLayoutRtl) {
                        l = this.getPaddingLeft() + p.leftMargin;
                        r = l + overflowWidth;
                    }
                    else {
                        r = this.getWidth() - this.getPaddingRight() - p.rightMargin;
                        l = r - overflowWidth;
                    }
                    final int t = midVertical - height / 2;
                    final int b = t + height;
                    v.layout(l, t, r, b);
                    widthRemaining -= overflowWidth;
                    hasOverflow = true;
                }
                else {
                    final int size = v.getMeasuredWidth() + p.leftMargin + p.rightMargin;
                    widthRemaining -= size;
                    if (this.hasSupportDividerBeforeChildAt(i)) {}
                    ++nonOverflowCount;
                }
            }
        }
        if (childCount == 1 && !hasOverflow) {
            final View v2 = this.getChildAt(0);
            final int width = v2.getMeasuredWidth();
            final int height2 = v2.getMeasuredHeight();
            final int midHorizontal = (right - left) / 2;
            final int j = midHorizontal - width / 2;
            final int t2 = midVertical - height2 / 2;
            v2.layout(j, t2, j + width, t2 + height2);
            return;
        }
        final int spacerCount = nonOverflowCount - (hasOverflow ? 0 : 1);
        final int spacerSize = Math.max(0, (spacerCount > 0) ? (widthRemaining / spacerCount) : 0);
        if (isLayoutRtl) {
            int startRight = this.getWidth() - this.getPaddingRight();
            for (int k = 0; k < childCount; ++k) {
                final View v3 = this.getChildAt(k);
                final LayoutParams lp = (LayoutParams)v3.getLayoutParams();
                if (v3.getVisibility() != 8) {
                    if (!lp.isOverflowButton) {
                        startRight -= lp.rightMargin;
                        final int width2 = v3.getMeasuredWidth();
                        final int height3 = v3.getMeasuredHeight();
                        final int t3 = midVertical - height3 / 2;
                        v3.layout(startRight - width2, t3, startRight, t3 + height3);
                        startRight -= width2 + lp.leftMargin + spacerSize;
                    }
                }
            }
        }
        else {
            int startLeft = this.getPaddingLeft();
            for (int k = 0; k < childCount; ++k) {
                final View v3 = this.getChildAt(k);
                final LayoutParams lp = (LayoutParams)v3.getLayoutParams();
                if (v3.getVisibility() != 8) {
                    if (!lp.isOverflowButton) {
                        startLeft += lp.leftMargin;
                        final int width2 = v3.getMeasuredWidth();
                        final int height3 = v3.getMeasuredHeight();
                        final int t3 = midVertical - height3 / 2;
                        v3.layout(startLeft, t3, startLeft + width2, t3 + height3);
                        startLeft += width2 + lp.rightMargin + spacerSize;
                    }
                }
            }
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dismissPopupMenus();
    }
    
    public void setOverflowIcon(@Nullable final Drawable icon) {
        this.getMenu();
        this.mPresenter.setOverflowIcon(icon);
    }
    
    @Nullable
    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.mPresenter.getOverflowIcon();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setOverflowReserved(final boolean reserveOverflow) {
        this.mReserveOverflow = reserveOverflow;
    }
    
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        final LayoutParams params = new LayoutParams(-2, -2);
        params.gravity = 16;
        return params;
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        return new LayoutParams(this.getContext(), attrs);
    }
    
    @Override
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        if (p != null) {
            final LayoutParams result = (p instanceof LayoutParams) ? new LayoutParams((LayoutParams)p) : new LayoutParams(p);
            if (result.gravity <= 0) {
                result.gravity = 16;
            }
            return result;
        }
        return this.generateDefaultLayoutParams();
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public LayoutParams generateOverflowButtonLayoutParams() {
        final LayoutParams result = this.generateDefaultLayoutParams();
        result.isOverflowButton = true;
        return result;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Override
    public boolean invokeItem(final MenuItemImpl item) {
        return this.mMenu.performItemAction((MenuItem)item, 0);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Override
    public int getWindowAnimations() {
        return 0;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Override
    public void initialize(final MenuBuilder menu) {
        this.mMenu = menu;
    }
    
    public Menu getMenu() {
        if (this.mMenu == null) {
            final Context context = this.getContext();
            (this.mMenu = new MenuBuilder(context)).setCallback(new MenuBuilderCallback());
            (this.mPresenter = new ActionMenuPresenter(context)).setReserveOverflow(true);
            this.mPresenter.setCallback((this.mActionMenuPresenterCallback != null) ? this.mActionMenuPresenterCallback : new ActionMenuPresenterCallback());
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return (Menu)this.mMenu;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setMenuCallbacks(final MenuPresenter.Callback pcb, final MenuBuilder.Callback mcb) {
        this.mActionMenuPresenterCallback = pcb;
        this.mMenuBuilderCallback = mcb;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }
    
    public boolean showOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.showOverflowMenu();
    }
    
    public boolean hideOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.hideOverflowMenu();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowing();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isOverflowMenuShowPending() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowPending();
    }
    
    public void dismissPopupMenus() {
        if (this.mPresenter != null) {
            this.mPresenter.dismissPopupMenus();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    protected boolean hasSupportDividerBeforeChildAt(final int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        final View childBefore = this.getChildAt(childIndex - 1);
        final View child = this.getChildAt(childIndex);
        boolean result = false;
        if (childIndex < this.getChildCount() && childBefore instanceof ActionMenuChildView) {
            result |= ((ActionMenuChildView)childBefore).needsDividerAfter();
        }
        if (childIndex > 0 && child instanceof ActionMenuChildView) {
            result |= ((ActionMenuChildView)child).needsDividerBefore();
        }
        return result;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setExpandedActionViewsExclusive(final boolean exclusive) {
        this.mPresenter.setExpandedActionViewsExclusive(exclusive);
    }
    
    private class MenuBuilderCallback implements MenuBuilder.Callback
    {
        MenuBuilderCallback() {
        }
        
        @Override
        public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
            return ActionMenuView.this.mOnMenuItemClickListener != null && ActionMenuView.this.mOnMenuItemClickListener.onMenuItemClick(item);
        }
        
        @Override
        public void onMenuModeChange(@NonNull final MenuBuilder menu) {
            if (ActionMenuView.this.mMenuBuilderCallback != null) {
                ActionMenuView.this.mMenuBuilderCallback.onMenuModeChange(menu);
            }
        }
    }
    
    private static class ActionMenuPresenterCallback implements MenuPresenter.Callback
    {
        ActionMenuPresenterCallback() {
        }
        
        @Override
        public void onCloseMenu(@NonNull final MenuBuilder menu, final boolean allMenusAreClosing) {
        }
        
        @Override
        public boolean onOpenSubMenu(@NonNull final MenuBuilder subMenu) {
            return false;
        }
    }
    
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams
    {
        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;
        @ViewDebug.ExportedProperty
        public int cellsUsed;
        @ViewDebug.ExportedProperty
        public int extraPixels;
        @ViewDebug.ExportedProperty
        public boolean expandable;
        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;
        boolean expanded;
        
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(c, attrs);
        }
        
        public LayoutParams(final ViewGroup.LayoutParams other) {
            super(other);
        }
        
        public LayoutParams(final LayoutParams other) {
            super((ViewGroup.LayoutParams)other);
            this.isOverflowButton = other.isOverflowButton;
        }
        
        public LayoutParams(final int width, final int height) {
            super(width, height);
            this.isOverflowButton = false;
        }
        
        LayoutParams(final int width, final int height, final boolean isOverflowButton) {
            super(width, height);
            this.isOverflowButton = isOverflowButton;
        }
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public interface ActionMenuChildView
    {
        boolean needsDividerBefore();
        
        boolean needsDividerAfter();
    }
}
