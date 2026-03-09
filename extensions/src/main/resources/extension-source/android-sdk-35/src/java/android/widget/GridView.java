package android.widget;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.ViewDebug;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.View;
import android.content.Intent;
import android.util.AttributeSet;
import android.content.Context;

@RemoteViews.RemoteView
public class GridView extends AbsListView
{
    public static final int AUTO_FIT = -1;
    public static final int NO_STRETCH = 0;
    public static final int STRETCH_COLUMN_WIDTH = 2;
    public static final int STRETCH_SPACING = 1;
    public static final int STRETCH_SPACING_UNIFORM = 3;
    
    public GridView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
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
    public void smoothScrollToPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollByOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void attachLayoutAnimationParameters(final View child, final ViewGroup.LayoutParams params, final int index, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void layoutChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelection(final int position) {
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
    
    @Override
    protected void onFocusChanged(final boolean gainFocus, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalSpacing(final int horizontalSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHorizontalSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestedHorizontalSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalSpacing(final int verticalSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVerticalSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStretchMode(final int stretchMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStretchMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnWidth(final int columnWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestedColumnWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumColumns(final int numColumns) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public int getNumColumns() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollRange() {
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
}
