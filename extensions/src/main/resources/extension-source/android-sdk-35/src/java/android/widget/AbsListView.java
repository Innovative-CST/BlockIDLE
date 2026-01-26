package android.widget;

import android.view.ActionMode;
import android.view.ViewStructure;
import android.content.Intent;
import java.util.List;
import android.view.ViewGroup;
import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import android.view.PointerIcon;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.ContextMenu;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.ViewDebug;
import android.view.View;
import android.util.SparseBooleanArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.text.TextWatcher;

public abstract class AbsListView extends AdapterView<ListAdapter> implements TextWatcher, ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener, ViewTreeObserver.OnTouchModeChangeListener
{
    public static final int CHOICE_MODE_MULTIPLE = 2;
    public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
    public static final int CHOICE_MODE_NONE = 0;
    public static final int CHOICE_MODE_SINGLE = 1;
    public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
    public static final int TRANSCRIPT_MODE_DISABLED = 0;
    public static final int TRANSCRIPT_MODE_NORMAL = 1;
    
    public AbsListView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsListView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsListView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsListView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final ListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCheckedItemCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isItemChecked(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCheckedItemPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public SparseBooleanArray getCheckedItemPositions() {
        throw new RuntimeException("Stub!");
    }
    
    public long[] getCheckedItemIds() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearChoices() {
        throw new RuntimeException("Stub!");
    }
    
    public void setItemChecked(final int position, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performItemClick(final View view, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    public int getChoiceMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setChoiceMode(final int choiceMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMultiChoiceModeListener(final MultiChoiceModeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFastScrollEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFastScrollStyle(final int styleResId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFastScrollAlwaysVisible(final boolean alwaysShow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFastScrollAlwaysVisible() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getVerticalScrollbarWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isFastScrollEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setVerticalScrollbarPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setScrollBarStyle(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSmoothScrollbarEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isSmoothScrollbarEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnScrollListener(final OnScrollListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isScrollingCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollingCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextFilterEnabled(final boolean textFilterEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isTextFilterEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getFocusedRect(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isStackFromBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStackFromBottom(final boolean stackFromBottom) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterText(final String filterText) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getTextFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFocusChanged(final boolean gainFocus, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
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
    protected float getTopFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected float getBottomFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    protected void layoutChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    @Override
    public View getSelectedView() {
        throw new RuntimeException("Stub!");
    }
    
    public int getListPaddingTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getListPaddingBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getListPaddingLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public int getListPaddingRight() {
        throw new RuntimeException("Stub!");
    }
    
    public void onInitializeAccessibilityNodeInfoForItem(final View view, final int position, final AccessibilityNodeInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSelectedChildViewEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectedChildViewEnabled(final boolean selectedChildViewEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean isPaddingOffsetRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getLeftPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getTopPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getRightPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getBottomPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDrawSelectorOnTop(final boolean onTop) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDrawSelectorOnTop() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelector(final int resID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelector(final Drawable sel) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getSelector() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollIndicators(final View up, final View down) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean verifyDrawable(@NonNull final Drawable dr) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCancelPendingInputEvents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenu(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenuForChild(final View originalView) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenuForChild(final View originalView, final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchSetPressed(final boolean pressed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchDrawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public int pointToPosition(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public long pointToRowId(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTouchModeChanged(final boolean isInTouchMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onOverScrolled(final int scrollX, final int scrollY, final boolean clampedX, final boolean clampedY) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void fling(final int velocityY) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onStartNestedScroll(final View child, final View target, final int nestedScrollAxes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedScrollAccepted(final View child, final View target, final int axes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onNestedFling(final View target, final float velocityX, final float velocityY, final boolean consumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestDisallowInterceptTouchEvent(final boolean disallowIntercept) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onInterceptHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public PointerIcon onResolvePointerIcon(final MotionEvent event, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addTouchables(final ArrayList<View> views) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFriction(final float friction) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVelocityScale(final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollToPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollToPositionFromTop(final int position, final int offset, final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollToPositionFromTop(final int position, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollToPosition(final int position, final int boundPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public void smoothScrollBy(final int distance, final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    public void scrollListBy(final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canScrollList(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateViews() {
        throw new RuntimeException("Stub!");
    }
    
    protected void handleDataChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDisplayHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean isInFilterMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputConnection onCreateInputConnection(final EditorInfo outAttrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean checkInputConnectionProxy(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearTextFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasTextFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onGlobalLayout() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void beforeTextChanged(final CharSequence s, final int start, final int count, final int after) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTextChanged(final CharSequence s, final int start, final int before, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void afterTextChanged(final Editable s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFilterComplete(final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTranscriptMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTranscriptMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSolidColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCacheColorHint(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public int getCacheColorHint() {
        throw new RuntimeException("Stub!");
    }
    
    public void reclaimViews(final List<View> views) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRemoteViewsAdapter(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void deferNotifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onRemoteAdapterConnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRemoteAdapterDisconnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBottomEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTopEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTopEdgeEffectColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBottomEdgeEffectColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRecyclerListener(final RecyclerListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onProvideContentCaptureStructure(@NonNull final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectionFromTop(final int position, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends ViewGroup.LayoutParams
    {
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h, final int viewType) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface SelectionBoundsAdjuster
    {
        void adjustListItemSelectionBounds(final Rect p0);
    }
    
    public interface RecyclerListener
    {
        void onMovedToScrapHeap(final View p0);
    }
    
    public interface OnScrollListener
    {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        
        void onScrollStateChanged(final AbsListView p0, final int p1);
        
        void onScroll(final AbsListView p0, final int p1, final int p2, final int p3);
    }
    
    public interface MultiChoiceModeListener extends ActionMode.Callback
    {
        void onItemCheckedStateChanged(final ActionMode p0, final int p1, final long p2, final boolean p3);
    }
}
