package android.view;

import android.content.res.TypedArray;
import android.window.OnBackInvokedDispatcher;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.TranslationCapability;
import android.view.autofill.AutofillId;
import java.util.Map;
import android.view.animation.Animation;
import java.util.function.Consumer;
import java.util.List;
import android.graphics.Region;
import android.view.animation.LayoutAnimationController;
import android.graphics.Point;
import android.animation.LayoutTransition;
import android.view.animation.Transformation;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;

public abstract class ViewGroup extends View implements ViewParent, ViewManager
{
    protected static final int CLIP_TO_PADDING_MASK = 34;
    public static final int FOCUS_AFTER_DESCENDANTS = 262144;
    public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
    public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    @Deprecated
    public static final int PERSISTENT_ALL_CACHES = 3;
    @Deprecated
    public static final int PERSISTENT_ANIMATION_CACHE = 1;
    @Deprecated
    public static final int PERSISTENT_NO_CACHE = 0;
    @Deprecated
    public static final int PERSISTENT_SCROLLING_CACHE = 2;
    
    public ViewGroup(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewGroup(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewGroup(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewGroup(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus", mapping = { @ViewDebug.IntToString(from = 131072, to = "FOCUS_BEFORE_DESCENDANTS"), @ViewDebug.IntToString(from = 262144, to = "FOCUS_AFTER_DESCENDANTS"), @ViewDebug.IntToString(from = 393216, to = "FOCUS_BLOCK_DESCENDANTS") })
    public int getDescendantFocusability() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDescendantFocusability(final int focusability) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestChildFocus(final View child, final View focused) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void focusableViewAvailable(final View v) {
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
    public ActionMode startActionModeForChild(final View originalView, final ActionMode.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ActionMode startActionModeForChild(final View originalView, final ActionMode.Callback callback, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View focusSearch(final View focused, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestChildRectangleOnScreen(final View child, final Rect rectangle, final boolean immediate) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestSendAccessibilityEvent(final View child, final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onRequestSendAccessibilityEvent(final View child, final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void childHasTransientStateChanged(final View child, final boolean childHasTransientState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasTransientState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchUnhandledMove(final View focused, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clearChildFocus(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clearFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public View getFocusedChild() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View findFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addFocusables(final ArrayList<View> views, final int direction, final int focusableMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addKeyboardNavigationClusters(final Collection<View> views, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchscreenBlocksFocus(final boolean touchscreenBlocksFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public boolean getTouchscreenBlocksFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void findViewsWithText(final ArrayList<View> outViews, final CharSequence text, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addTouchables(final ArrayList<View> views) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchDisplayHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchVisibilityChanged(final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchWindowVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void recomputeViewAttributes(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void bringChildToFront(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchDragEvent(final DragEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dispatchWindowSystemUiVisiblityChanged(final int visible) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dispatchSystemUiVisibilityChanged(final int visible) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEventPreIme(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchCapturedPointerEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchPointerCaptureChanged(final boolean hasCapture) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public PointerIcon onResolvePointerIcon(final MotionEvent event, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean dispatchHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addChildrenForAccessibility(final ArrayList<View> outChildren) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onInterceptHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean dispatchGenericPointerEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean dispatchGenericFocusedEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMotionEventSplittingEnabled(final boolean split) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMotionEventSplittingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTransitionGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransitionGroup(final boolean isTransitionGroup) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestDisallowInterceptTouchEvent(final boolean disallowIntercept) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestFocus(final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onRequestFocusInDescendants(final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean restoreDefaultFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchStartTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchFinishTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchProvideStructure(final ViewStructure structure) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchProvideAutofillStructure(final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addExtraDataToAccessibilityNodeInfo(@NonNull final AccessibilityNodeInfo info, @NonNull final String extraDataKey, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void notifySubtreeAccessibilityStateChanged(final View child, final View source, final int changeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onNestedPrePerformAccessibilityAction(final View target, final int action, final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchFreezeSelfOnly(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchThawSelfOnly(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setChildrenDrawingCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ViewGroupOverlay getOverlay() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getChildDrawingOrder(final int childCount, final int drawingPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getChildDrawingOrder(final int drawingPosition) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean drawChild(@NonNull final Canvas canvas, final View child, final long drawingTime) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean getClipChildren() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClipChildren(final boolean clipChildren) {
        throw new RuntimeException("Stub!");
    }
    
    public void setClipToPadding(final boolean clipToPadding) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean getClipToPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchSetSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchSetActivated(final boolean activated) {
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
    
    protected void setStaticTransformationsEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean getChildStaticTransformation(final View child, final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    public void addView(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public void addView(final View child, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void addView(final View child, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void addView(final View child, final int index, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateViewLayout(final View view, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean checkLayoutParams(final LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnHierarchyChangeListener(final OnHierarchyChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void onViewAdded(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public void onViewRemoved(final View child) {
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
    
    protected boolean addViewInLayout(final View child, final int index, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean addViewInLayout(final View child, final int index, final LayoutParams params, final boolean preventRequestLayout) {
        throw new RuntimeException("Stub!");
    }
    
    protected void cleanupLayoutState(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    protected void attachLayoutAnimationParameters(final View child, final LayoutParams params, final int index, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeViewInLayout(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeViewsInLayout(final int start, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeViewAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeViews(final int start, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutTransition(final LayoutTransition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutTransition getLayoutTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllViews() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllViewsInLayout() {
        throw new RuntimeException("Stub!");
    }
    
    protected void removeDetachedView(final View child, final boolean animate) {
        throw new RuntimeException("Stub!");
    }
    
    protected void attachViewToParent(final View child, final int index, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    protected void detachViewFromParent(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    protected void detachViewFromParent(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    protected void detachViewsFromParent(final int start, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    protected void detachAllViewsFromParent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDescendantInvalidated(@NonNull final View child, @NonNull final View target) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void invalidateChild(final View child, final Rect dirty) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public ViewParent invalidateChildInParent(final int[] location, final Rect dirty) {
        throw new RuntimeException("Stub!");
    }
    
    public final void offsetDescendantRectToMyCoords(final View descendant, final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    public final void offsetRectIntoDescendantCoords(final View descendant, final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getChildVisibleRect(final View child, final Rect r, final Point offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void layout(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected abstract void onLayout(final boolean p0, final int p1, final int p2, final int p3, final int p4);
    
    protected boolean canAnimate() {
        throw new RuntimeException("Stub!");
    }
    
    public void startLayoutAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void scheduleLayoutAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutAnimation(final LayoutAnimationController controller) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutAnimationController getLayoutAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAnimationCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAnimationCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAlwaysDrawnWithCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAlwaysDrawnWithCacheEnabled(final boolean always) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean isChildrenDrawnWithCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setChildrenDrawnWithCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    protected boolean isChildrenDrawingOrderEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    protected void setChildrenDrawingOrderEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @ViewDebug.ExportedProperty(category = "drawing", mapping = { @ViewDebug.IntToString(from = 0, to = "NONE"), @ViewDebug.IntToString(from = 1, to = "ANIMATION"), @ViewDebug.IntToString(from = 2, to = "SCROLLING"), @ViewDebug.IntToString(from = 3, to = "ALL") })
    public int getPersistentDrawingCache() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPersistentDrawingCache(final int drawingCacheToKeep) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutMode(final int layoutMode) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    protected LayoutParams generateLayoutParams(final LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    protected LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    protected void debug(final int depth) {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOfChild(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public int getChildCount() {
        throw new RuntimeException("Stub!");
    }
    
    public View getChildAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    protected void measureChildren(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected void measureChild(final View child, final int parentWidthMeasureSpec, final int parentHeightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected void measureChildWithMargins(final View child, final int parentWidthMeasureSpec, final int widthUsed, final int parentHeightMeasureSpec, final int heightUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getChildMeasureSpec(final int spec, final int padding, final int childDimension) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearDisappearingChildren() {
        throw new RuntimeException("Stub!");
    }
    
    public void startViewTransition(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void endViewTransition(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void suppressLayout(final boolean suppress) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLayoutSuppressed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean gatherTransparentRegion(final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestTransparentRegion(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public WindowInsets dispatchApplyWindowInsets(final WindowInsets insets) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setWindowInsetsAnimationCallback(@Nullable final WindowInsetsAnimation.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchWindowInsetsAnimationPrepare(@NonNull final WindowInsetsAnimation animation) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(@NonNull final WindowInsetsAnimation animation, @NonNull final WindowInsetsAnimation.Bounds bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public WindowInsets dispatchWindowInsetsAnimationProgress(@NonNull final WindowInsets insets, @NonNull final List<WindowInsetsAnimation> runningAnimations) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchWindowInsetsAnimationEnd(@NonNull final WindowInsetsAnimation animation) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchScrollCaptureSearch(@NonNull final Rect localVisibleRect, @NonNull final Point windowOffset, @NonNull final Consumer<ScrollCaptureTarget> targets) {
        throw new RuntimeException("Stub!");
    }
    
    public Animation.AnimationListener getLayoutAnimationListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int[] onCreateDrawableState(final int extraSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAddStatesFromChildren(final boolean addsStates) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addStatesFromChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void childDrawableStateChanged(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutAnimationListener(final Animation.AnimationListener animationListener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldDelayChildPressedState() {
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
    public void onStopNestedScroll(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedPreScroll(final View target, final int dx, final int dy, final int[] consumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onNestedFling(final View target, final float velocityX, final float velocityY, final boolean consumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onNestedPreFling(final View target, final float velocityX, final float velocityY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNestedScrollAxes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchCreateViewTranslationRequest(@NonNull final Map<AutofillId, long[]> viewIds, @NonNull final int[] supportedFormats, @Nullable final TranslationCapability capability, @NonNull final List<ViewTranslationRequest> requests) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(@NonNull final View child, @NonNull final View requester) {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams
    {
        @Deprecated
        public static final int FILL_PARENT = -1;
        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;
        @ViewDebug.ExportedProperty(category = "layout", mapping = { @ViewDebug.IntToString(from = -1, to = "MATCH_PARENT"), @ViewDebug.IntToString(from = -2, to = "WRAP_CONTENT") })
        public int height;
        public LayoutAnimationController.AnimationParameters layoutAnimationParameters;
        @ViewDebug.ExportedProperty(category = "layout", mapping = { @ViewDebug.IntToString(from = -1, to = "MATCH_PARENT"), @ViewDebug.IntToString(from = -2, to = "WRAP_CONTENT") })
        public int width;
        
        public LayoutParams(final Context c, final AttributeSet attrs) {
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams source) {
            throw new RuntimeException("Stub!");
        }
        
        protected void setBaseAttributes(final TypedArray a, final int widthAttr, final int heightAttr) {
            throw new RuntimeException("Stub!");
        }
        
        public void resolveLayoutDirection(final int layoutDirection) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MarginLayoutParams extends LayoutParams
    {
        @ViewDebug.ExportedProperty(category = "layout")
        public int bottomMargin;
        @ViewDebug.ExportedProperty(category = "layout")
        public int leftMargin;
        @ViewDebug.ExportedProperty(category = "layout")
        public int rightMargin;
        @ViewDebug.ExportedProperty(category = "layout")
        public int topMargin;
        
        public MarginLayoutParams(final Context c, final AttributeSet attrs) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public MarginLayoutParams(final int width, final int height) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public MarginLayoutParams(final MarginLayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public MarginLayoutParams(final LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public void setMargins(final int left, final int top, final int right, final int bottom) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMarginStart(final int start) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMarginStart() {
            throw new RuntimeException("Stub!");
        }
        
        public void setMarginEnd(final int end) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMarginEnd() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMarginRelative() {
            throw new RuntimeException("Stub!");
        }
        
        public void setLayoutDirection(final int layoutDirection) {
            throw new RuntimeException("Stub!");
        }
        
        public int getLayoutDirection() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void resolveLayoutDirection(final int layoutDirection) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnHierarchyChangeListener
    {
        void onChildViewAdded(final View p0, final View p1);
        
        void onChildViewRemoved(final View p0, final View p1);
    }
}
