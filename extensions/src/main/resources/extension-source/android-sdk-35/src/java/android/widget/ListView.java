package android.widget;

import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.content.Intent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

@RemoteViews.RemoteView
public class ListView extends AbsListView
{
    public ListView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ListView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ListView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ListView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxScrollAmount() {
        throw new RuntimeException("Stub!");
    }
    
    public void addHeaderView(final View v, final Object data, final boolean isSelectable) {
        throw new RuntimeException("Stub!");
    }
    
    public void addHeaderView(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeaderViewsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeHeaderView(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFooterView(final View v, final Object data, final boolean isSelectable) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFooterView(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFooterViewsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeFooterView(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ListAdapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setRemoteViewsAdapter(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final ListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestChildRectangleOnScreen(final View child, final Rect rect, final boolean immediate) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void smoothScrollToPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollByOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void layoutChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean canAnimate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelection(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectionAfterHeaderView() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void setItemsCanFocus(final boolean itemsCanFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getItemsCanFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setCacheColorHint(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean drawChild(final Canvas canvas, final View child, final long drawingTime) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDivider() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDivider(@Nullable final Drawable divider) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDividerHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDividerHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHeaderDividersEnabled(final boolean headerDividersEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areHeaderDividersEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFooterDividersEnabled(final boolean footerDividersEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areFooterDividersEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverscrollHeader(final Drawable header) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getOverscrollHeader() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverscrollFooter(final Drawable footer) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getOverscrollFooter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFocusChanged(final boolean gainFocus, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long[] getCheckItemIds() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfoForItem(final View view, final int position, final AccessibilityNodeInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public class FixedViewInfo
    {
        public Object data;
        public boolean isSelectable;
        public View view;
        
        public FixedViewInfo() {
            throw new RuntimeException("Stub!");
        }
    }
}
