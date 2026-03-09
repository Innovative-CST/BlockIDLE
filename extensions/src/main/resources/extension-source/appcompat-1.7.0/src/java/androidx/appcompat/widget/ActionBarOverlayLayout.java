package androidx.appcompat.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.R;
import android.graphics.Canvas;
import androidx.core.graphics.Insets;
import androidx.annotation.RequiresApi;
import android.view.WindowInsets;
import android.os.Build;
import android.content.res.Configuration;
import androidx.core.view.ViewCompat;
import android.content.res.TypedArray;
import android.view.View;
import android.animation.Animator;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.view.NestedScrollingParentHelper;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent;
import android.view.ViewGroup;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
@SuppressLint({ "UnknownNullness" })
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3
{
    private static final String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    private int mWindowVisibility;
    private ContentFrameLayout mContent;
    ActionBarContainer mActionBarTop;
    private DecorToolbar mDecorToolbar;
    private Drawable mWindowContentOverlay;
    private boolean mOverlayMode;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    boolean mAnimatingForFling;
    private int mHideOnContentScrollReference;
    private int mLastSystemUiVisibility;
    private final Rect mBaseContentInsets;
    private final Rect mLastBaseContentInsets;
    private final Rect mContentInsets;
    private final Rect mTmpRect;
    private final Rect mBaseInnerInsetsRect;
    private final Rect mLastBaseInnerInsetsRect;
    private final Rect mInnerInsetsRect;
    private final Rect mLastInnerInsetsRect;
    @NonNull
    private WindowInsetsCompat mBaseInnerInsets;
    @NonNull
    private WindowInsetsCompat mLastBaseInnerInsets;
    @NonNull
    private WindowInsetsCompat mInnerInsets;
    @NonNull
    private WindowInsetsCompat mLastInnerInsets;
    private ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    private OverScroller mFlingEstimator;
    ViewPropertyAnimator mCurrentActionBarTopAnimator;
    final AnimatorListenerAdapter mTopAnimatorListener;
    private final Runnable mRemoveActionBarHideOffset;
    private final Runnable mAddActionBarHideOffset;
    static final int[] ATTRS;
    private final NestedScrollingParentHelper mParentHelper;
    private final NoSystemUiLayoutFlagView mNoSystemUiLayoutFlagView;
    private static final WindowInsetsCompat NON_EMPTY_SYSTEM_WINDOW_INSETS;
    private static final Rect ZERO_INSETS;
    
    public ActionBarOverlayLayout(@NonNull final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mTmpRect = new Rect();
        this.mBaseInnerInsetsRect = new Rect();
        this.mLastBaseInnerInsetsRect = new Rect();
        this.mInnerInsetsRect = new Rect();
        this.mLastInnerInsetsRect = new Rect();
        this.mBaseInnerInsets = WindowInsetsCompat.CONSUMED;
        this.mLastBaseInnerInsets = WindowInsetsCompat.CONSUMED;
        this.mInnerInsets = WindowInsetsCompat.CONSUMED;
        this.mLastInnerInsets = WindowInsetsCompat.CONSUMED;
        this.mTopAnimatorListener = new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = null;
                ActionBarOverlayLayout.this.mAnimatingForFling = false;
            }
            
            public void onAnimationCancel(final Animator animator) {
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = null;
                ActionBarOverlayLayout.this.mAnimatingForFling = false;
            }
        };
        this.mRemoveActionBarHideOffset = (Runnable)new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = ActionBarOverlayLayout.this.mActionBarTop.animate().translationY(0.0f).setListener((Animator.AnimatorListener)ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        this.mAddActionBarHideOffset = (Runnable)new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = ActionBarOverlayLayout.this.mActionBarTop.animate().translationY((float)(-ActionBarOverlayLayout.this.mActionBarTop.getHeight())).setListener((Animator.AnimatorListener)ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        this.init(context);
        this.mParentHelper = new NestedScrollingParentHelper((ViewGroup)this);
        this.addView((View)(this.mNoSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context)));
    }
    
    private void init(final Context context) {
        final TypedArray ta = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.ATTRS);
        this.mActionBarHeight = ta.getDimensionPixelSize(0, 0);
        this.mWindowContentOverlay = ta.getDrawable(1);
        this.setWillNotDraw(this.mWindowContentOverlay == null);
        ta.recycle();
        this.mFlingEstimator = new OverScroller(context);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.haltActionBarHideOffsetAnimations();
    }
    
    public void setActionBarVisibilityCallback(final ActionBarVisibilityCallback cb) {
        this.mActionBarVisibilityCallback = cb;
        if (this.getWindowToken() != null) {
            this.mActionBarVisibilityCallback.onWindowVisibilityChanged(this.mWindowVisibility);
            if (this.mLastSystemUiVisibility != 0) {
                final int newVis = this.mLastSystemUiVisibility;
                this.onWindowSystemUiVisibilityChanged(newVis);
                ViewCompat.requestApplyInsets((View)this);
            }
        }
    }
    
    public void setOverlayMode(final boolean overlayMode) {
        this.mOverlayMode = overlayMode;
    }
    
    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }
    
    public void setHasNonEmbeddedTabs(final boolean hasNonEmbeddedTabs) {
        this.mHasNonEmbeddedTabs = hasNonEmbeddedTabs;
    }
    
    public void setShowingForActionMode(final boolean showing) {
    }
    
    protected void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.init(this.getContext());
        ViewCompat.requestApplyInsets((View)this);
    }
    
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(final int visible) {
        super.onWindowSystemUiVisibilityChanged(visible);
        this.pullChildren();
        final int diff = this.mLastSystemUiVisibility ^ visible;
        this.mLastSystemUiVisibility = visible;
        final boolean barVisible = (visible & 0x4) == 0x0;
        final boolean stable = (visible & 0x100) != 0x0;
        if (this.mActionBarVisibilityCallback != null) {
            this.mActionBarVisibilityCallback.enableContentAnimations(!stable);
            if (barVisible || !stable) {
                this.mActionBarVisibilityCallback.showForSystem();
            }
            else {
                this.mActionBarVisibilityCallback.hideForSystem();
            }
        }
        if ((diff & 0x100) != 0x0 && this.mActionBarVisibilityCallback != null) {
            ViewCompat.requestApplyInsets((View)this);
        }
    }
    
    protected void onWindowVisibilityChanged(final int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.mWindowVisibility = visibility;
        if (this.mActionBarVisibilityCallback != null) {
            this.mActionBarVisibilityCallback.onWindowVisibilityChanged(visibility);
        }
    }
    
    private boolean applyInsets(@NonNull final View view, @NonNull final Rect insets, final boolean left, final boolean top, final boolean bottom, final boolean right) {
        boolean changed = false;
        final LayoutParams lp = (LayoutParams)view.getLayoutParams();
        if (left && lp.leftMargin != insets.left) {
            changed = true;
            lp.leftMargin = insets.left;
        }
        if (top && lp.topMargin != insets.top) {
            changed = true;
            lp.topMargin = insets.top;
        }
        if (right && lp.rightMargin != insets.right) {
            changed = true;
            lp.rightMargin = insets.right;
        }
        if (bottom && lp.bottomMargin != insets.bottom) {
            changed = true;
            lp.bottomMargin = insets.bottom;
        }
        return changed;
    }
    
    protected boolean fitSystemWindows(final Rect insets) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(insets);
        }
        this.pullChildren();
        boolean changed = this.applyInsets((View)this.mActionBarTop, insets, true, true, false, true);
        this.mBaseInnerInsetsRect.set(insets);
        ViewUtils.computeFitSystemWindows((View)this, this.mBaseInnerInsetsRect, this.mBaseContentInsets);
        if (!this.mLastBaseInnerInsetsRect.equals((Object)this.mBaseInnerInsetsRect)) {
            changed = true;
            this.mLastBaseInnerInsetsRect.set(this.mBaseInnerInsetsRect);
        }
        if (!this.mLastBaseContentInsets.equals((Object)this.mBaseContentInsets)) {
            changed = true;
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        }
        if (changed) {
            this.requestLayout();
        }
        return true;
    }
    
    private boolean decorFitsSystemWindows() {
        ViewCompat.computeSystemWindowInsets((View)this.mNoSystemUiLayoutFlagView, ActionBarOverlayLayout.NON_EMPTY_SYSTEM_WINDOW_INSETS, this.mTmpRect);
        return !this.mTmpRect.equals((Object)ActionBarOverlayLayout.ZERO_INSETS);
    }
    
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull final WindowInsets in) {
        this.pullChildren();
        final WindowInsetsCompat insets = WindowInsetsCompat.toWindowInsetsCompat(in, (View)this);
        final Rect systemInsets = new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        boolean changed = this.applyInsets((View)this.mActionBarTop, systemInsets, true, true, false, true);
        ViewCompat.computeSystemWindowInsets((View)this, insets, this.mBaseContentInsets);
        this.mBaseInnerInsets = insets.inset(this.mBaseContentInsets.left, this.mBaseContentInsets.top, this.mBaseContentInsets.right, this.mBaseContentInsets.bottom);
        if (!this.mLastBaseInnerInsets.equals((Object)this.mBaseInnerInsets)) {
            changed = true;
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
        }
        if (!this.mLastBaseContentInsets.equals((Object)this.mBaseContentInsets)) {
            changed = true;
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        }
        if (changed) {
            this.requestLayout();
        }
        return insets.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }
    
    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }
    
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        return new LayoutParams(this.getContext(), attrs);
    }
    
    protected ViewGroup.LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        return (ViewGroup.LayoutParams)new LayoutParams(p);
    }
    
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        this.pullChildren();
        int maxHeight = 0;
        int maxWidth = 0;
        int childState = 0;
        int topInset = 0;
        final int bottomInset = 0;
        this.measureChildWithMargins((View)this.mActionBarTop, widthMeasureSpec, 0, heightMeasureSpec, 0);
        LayoutParams lp = (LayoutParams)this.mActionBarTop.getLayoutParams();
        maxWidth = Math.max(maxWidth, this.mActionBarTop.getMeasuredWidth() + lp.leftMargin + lp.rightMargin);
        maxHeight = Math.max(maxHeight, this.mActionBarTop.getMeasuredHeight() + lp.topMargin + lp.bottomMargin);
        childState = View.combineMeasuredStates(childState, this.mActionBarTop.getMeasuredState());
        final int vis = ViewCompat.getWindowSystemUiVisibility((View)this);
        final boolean stable = (vis & 0x100) != 0x0;
        if (stable) {
            topInset = this.mActionBarHeight;
            if (this.mHasNonEmbeddedTabs) {
                final View tabs = this.mActionBarTop.getTabContainer();
                if (tabs != null) {
                    topInset += this.mActionBarHeight;
                }
            }
        }
        else if (this.mActionBarTop.getVisibility() != 8) {
            topInset = this.mActionBarTop.getMeasuredHeight();
        }
        this.mContentInsets.set(this.mBaseContentInsets);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mInnerInsets = this.mBaseInnerInsets;
        }
        else {
            this.mInnerInsetsRect.set(this.mBaseInnerInsetsRect);
        }
        if (!this.mOverlayMode && !stable && this.decorFitsSystemWindows()) {
            final Rect mContentInsets = this.mContentInsets;
            mContentInsets.top += topInset;
            final Rect mContentInsets2 = this.mContentInsets;
            mContentInsets2.bottom += bottomInset;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mInnerInsets = this.mInnerInsets.inset(0, topInset, 0, bottomInset);
            }
        }
        else if (Build.VERSION.SDK_INT >= 21) {
            final Insets sysWindow = Insets.of(this.mInnerInsets.getSystemWindowInsetLeft(), this.mInnerInsets.getSystemWindowInsetTop() + topInset, this.mInnerInsets.getSystemWindowInsetRight(), this.mInnerInsets.getSystemWindowInsetBottom() + bottomInset);
            this.mInnerInsets = new WindowInsetsCompat.Builder(this.mInnerInsets).setSystemWindowInsets(sysWindow).build();
        }
        else {
            final Rect mInnerInsetsRect = this.mInnerInsetsRect;
            mInnerInsetsRect.top += topInset;
            final Rect mInnerInsetsRect2 = this.mInnerInsetsRect;
            mInnerInsetsRect2.bottom += bottomInset;
        }
        this.applyInsets((View)this.mContent, this.mContentInsets, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.mLastInnerInsets.equals((Object)this.mInnerInsets)) {
            this.mLastInnerInsets = this.mInnerInsets;
            ViewCompat.dispatchApplyWindowInsets((View)this.mContent, this.mInnerInsets);
        }
        else if (Build.VERSION.SDK_INT < 21 && !this.mLastInnerInsetsRect.equals((Object)this.mInnerInsetsRect)) {
            this.mLastInnerInsetsRect.set(this.mInnerInsetsRect);
            this.mContent.dispatchFitSystemWindows(this.mInnerInsetsRect);
        }
        this.measureChildWithMargins((View)this.mContent, widthMeasureSpec, 0, heightMeasureSpec, 0);
        lp = (LayoutParams)this.mContent.getLayoutParams();
        maxWidth = Math.max(maxWidth, this.mContent.getMeasuredWidth() + lp.leftMargin + lp.rightMargin);
        maxHeight = Math.max(maxHeight, this.mContent.getMeasuredHeight() + lp.topMargin + lp.bottomMargin);
        childState = View.combineMeasuredStates(childState, this.mContent.getMeasuredState());
        maxWidth += this.getPaddingLeft() + this.getPaddingRight();
        maxHeight += this.getPaddingTop() + this.getPaddingBottom();
        maxHeight = Math.max(maxHeight, this.getSuggestedMinimumHeight());
        maxWidth = Math.max(maxWidth, this.getSuggestedMinimumWidth());
        this.setMeasuredDimension(View.resolveSizeAndState(maxWidth, widthMeasureSpec, childState), View.resolveSizeAndState(maxHeight, heightMeasureSpec, childState << 16));
    }
    
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        final int count = this.getChildCount();
        final int parentLeft = this.getPaddingLeft();
        final int parentTop = this.getPaddingTop();
        for (int i = 0; i < count; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                final int width = child.getMeasuredWidth();
                final int height = child.getMeasuredHeight();
                final int childLeft = parentLeft + lp.leftMargin;
                final int childTop = parentTop + lp.topMargin;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }
    
    public void draw(@NonNull final Canvas c) {
        super.draw(c);
        if (this.mWindowContentOverlay != null) {
            final int top = (this.mActionBarTop.getVisibility() == 0) ? ((int)(this.mActionBarTop.getBottom() + this.mActionBarTop.getTranslationY() + 0.5f)) : 0;
            this.mWindowContentOverlay.setBounds(0, top, this.getWidth(), top + this.mWindowContentOverlay.getIntrinsicHeight());
            this.mWindowContentOverlay.draw(c);
        }
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed, final int type, final int[] consumed) {
        this.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }
    
    public boolean onStartNestedScroll(final View child, final View target, final int axes, final int type) {
        return type == 0 && this.onStartNestedScroll(child, target, axes);
    }
    
    public void onNestedScrollAccepted(final View child, final View target, final int axes, final int type) {
        if (type == 0) {
            this.onNestedScrollAccepted(child, target, axes);
        }
    }
    
    public void onStopNestedScroll(final View target, final int type) {
        if (type == 0) {
            this.onStopNestedScroll(target);
        }
    }
    
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed, final int type) {
        if (type == 0) {
            this.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        }
    }
    
    public void onNestedPreScroll(final View target, final int dx, final int dy, final int[] consumed, final int type) {
        if (type == 0) {
            this.onNestedPreScroll(target, dx, dy, consumed);
        }
    }
    
    public boolean onStartNestedScroll(final View child, final View target, final int axes) {
        return (axes & 0x2) != 0x0 && this.mActionBarTop.getVisibility() == 0 && this.mHideOnContentScroll;
    }
    
    public void onNestedScrollAccepted(final View child, final View target, final int axes) {
        this.mParentHelper.onNestedScrollAccepted(child, target, axes);
        this.mHideOnContentScrollReference = this.getActionBarHideOffset();
        this.haltActionBarHideOffsetAnimations();
        if (this.mActionBarVisibilityCallback != null) {
            this.mActionBarVisibilityCallback.onContentScrollStarted();
        }
    }
    
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed) {
        this.setActionBarHideOffset(this.mHideOnContentScrollReference += dyConsumed);
    }
    
    public void onStopNestedScroll(final View target) {
        if (this.mHideOnContentScroll && !this.mAnimatingForFling) {
            if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
                this.postRemoveActionBarHideOffset();
            }
            else {
                this.postAddActionBarHideOffset();
            }
        }
        if (this.mActionBarVisibilityCallback != null) {
            this.mActionBarVisibilityCallback.onContentScrollStopped();
        }
    }
    
    public boolean onNestedFling(final View target, final float velocityX, final float velocityY, final boolean consumed) {
        if (!this.mHideOnContentScroll || !consumed) {
            return false;
        }
        if (this.shouldHideActionBarOnFling(velocityY)) {
            this.addActionBarHideOffset();
        }
        else {
            this.removeActionBarHideOffset();
        }
        return this.mAnimatingForFling = true;
    }
    
    public void onNestedPreScroll(final View target, final int dx, final int dy, final int[] consumed) {
    }
    
    public boolean onNestedPreFling(final View target, final float velocityX, final float velocityY) {
        return false;
    }
    
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }
    
    void pullChildren() {
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout)this.findViewById(R.id.action_bar_activity_content);
            this.mActionBarTop = (ActionBarContainer)this.findViewById(R.id.action_bar_container);
            this.mDecorToolbar = this.getDecorToolbar(this.findViewById(R.id.action_bar));
        }
    }
    
    private DecorToolbar getDecorToolbar(final View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }
    
    public void setHideOnContentScrollEnabled(final boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.mHideOnContentScroll && !(this.mHideOnContentScroll = hideOnContentScroll)) {
            this.haltActionBarHideOffsetAnimations();
            this.setActionBarHideOffset(0);
        }
    }
    
    public boolean isHideOnContentScrollEnabled() {
        return this.mHideOnContentScroll;
    }
    
    public int getActionBarHideOffset() {
        return (this.mActionBarTop != null) ? (-(int)this.mActionBarTop.getTranslationY()) : 0;
    }
    
    public void setActionBarHideOffset(int offset) {
        this.haltActionBarHideOffsetAnimations();
        final int topHeight = this.mActionBarTop.getHeight();
        offset = Math.max(0, Math.min(offset, topHeight));
        this.mActionBarTop.setTranslationY((float)(-offset));
    }
    
    void haltActionBarHideOffsetAnimations() {
        this.removeCallbacks(this.mRemoveActionBarHideOffset);
        this.removeCallbacks(this.mAddActionBarHideOffset);
        if (this.mCurrentActionBarTopAnimator != null) {
            this.mCurrentActionBarTopAnimator.cancel();
        }
    }
    
    private void postRemoveActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.postDelayed(this.mRemoveActionBarHideOffset, 600L);
    }
    
    private void postAddActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.postDelayed(this.mAddActionBarHideOffset, 600L);
    }
    
    private void removeActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }
    
    private void addActionBarHideOffset() {
        this.haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }
    
    private boolean shouldHideActionBarOnFling(final float velocityY) {
        this.mFlingEstimator.fling(0, 0, 0, (int)velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        final int finalY = this.mFlingEstimator.getFinalY();
        return finalY > this.mActionBarTop.getHeight();
    }
    
    public void setWindowCallback(final Window.Callback cb) {
        this.pullChildren();
        this.mDecorToolbar.setWindowCallback(cb);
    }
    
    public void setWindowTitle(final CharSequence title) {
        this.pullChildren();
        this.mDecorToolbar.setWindowTitle(title);
    }
    
    public CharSequence getTitle() {
        this.pullChildren();
        return this.mDecorToolbar.getTitle();
    }
    
    public void initFeature(final int windowFeature) {
        this.pullChildren();
        switch (windowFeature) {
            case 2: {
                this.mDecorToolbar.initProgress();
                break;
            }
            case 5: {
                this.mDecorToolbar.initIndeterminateProgress();
                break;
            }
            case 109: {
                this.setOverlayMode(true);
                break;
            }
        }
    }
    
    public void setUiOptions(final int uiOptions) {
    }
    
    public boolean hasIcon() {
        this.pullChildren();
        return this.mDecorToolbar.hasIcon();
    }
    
    public boolean hasLogo() {
        this.pullChildren();
        return this.mDecorToolbar.hasLogo();
    }
    
    public void setIcon(final int resId) {
        this.pullChildren();
        this.mDecorToolbar.setIcon(resId);
    }
    
    public void setIcon(final Drawable d) {
        this.pullChildren();
        this.mDecorToolbar.setIcon(d);
    }
    
    public void setLogo(final int resId) {
        this.pullChildren();
        this.mDecorToolbar.setLogo(resId);
    }
    
    public boolean canShowOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }
    
    public boolean isOverflowMenuShowing() {
        this.pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }
    
    public boolean isOverflowMenuShowPending() {
        this.pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }
    
    public boolean showOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }
    
    public boolean hideOverflowMenu() {
        this.pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }
    
    public void setMenuPrepared() {
        this.pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }
    
    public void setMenu(final Menu menu, final MenuPresenter.Callback cb) {
        this.pullChildren();
        this.mDecorToolbar.setMenu(menu, cb);
    }
    
    public void saveToolbarHierarchyState(final SparseArray<Parcelable> toolbarStates) {
        this.pullChildren();
        this.mDecorToolbar.saveHierarchyState(toolbarStates);
    }
    
    public void restoreToolbarHierarchyState(final SparseArray<Parcelable> toolbarStates) {
        this.pullChildren();
        this.mDecorToolbar.restoreHierarchyState(toolbarStates);
    }
    
    public void dismissPopups() {
        this.pullChildren();
        this.mDecorToolbar.dismissPopupMenus();
    }
    
    static {
        ATTRS = new int[] { R.attr.actionBarSize, 16842841 };
        NON_EMPTY_SYSTEM_WINDOW_INSETS = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.of(0, 1, 0, 1)).build();
        ZERO_INSETS = new Rect();
    }
    
    private static final class NoSystemUiLayoutFlagView extends View
    {
        NoSystemUiLayoutFlagView(final Context context) {
            super(context);
            this.setWillNotDraw(true);
        }
        
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }
    
    public static class LayoutParams extends ViewGroup.MarginLayoutParams
    {
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(c, attrs);
        }
        
        public LayoutParams(final int width, final int height) {
            super(width, height);
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(source);
        }
        
        public LayoutParams(final ViewGroup.MarginLayoutParams source) {
            super(source);
        }
    }
    
    public interface ActionBarVisibilityCallback
    {
        void onWindowVisibilityChanged(final int p0);
        
        void showForSystem();
        
        void hideForSystem();
        
        void enableContentAnimations(final boolean p0);
        
        void onContentScrollStarted();
        
        void onContentScrollStopped();
    }
}
