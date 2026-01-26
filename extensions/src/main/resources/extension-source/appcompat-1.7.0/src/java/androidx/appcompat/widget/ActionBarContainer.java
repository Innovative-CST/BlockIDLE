package androidx.appcompat.widget;

import androidx.annotation.RequiresApi;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import android.os.Build;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import android.widget.FrameLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActionBarContainer extends FrameLayout
{
    private boolean mIsTransitioning;
    private View mTabContainer;
    private View mActionBarView;
    private View mContextView;
    Drawable mBackground;
    Drawable mStackedBackground;
    Drawable mSplitBackground;
    boolean mIsSplit;
    boolean mIsStacked;
    private int mHeight;
    
    public ActionBarContainer(final Context context) {
        this(context, null);
    }
    
    public ActionBarContainer(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        final Drawable bg = new ActionBarBackgroundDrawable(this);
        this.setBackground(bg);
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ActionBar);
        this.mBackground = a.getDrawable(R.styleable.ActionBar_background);
        this.mStackedBackground = a.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.mHeight = a.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        if (this.getId() == R.id.split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = a.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        a.recycle();
        this.setWillNotDraw(this.mIsSplit ? (this.mSplitBackground == null) : (this.mBackground == null && this.mStackedBackground == null));
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = this.findViewById(R.id.action_bar);
        this.mContextView = this.findViewById(R.id.action_context_bar);
    }
    
    public void setPrimaryBackground(final Drawable bg) {
        if (this.mBackground != null) {
            this.mBackground.setCallback((Drawable.Callback)null);
            this.unscheduleDrawable(this.mBackground);
        }
        if ((this.mBackground = bg) != null) {
            bg.setCallback((Drawable.Callback)this);
            if (this.mActionBarView != null) {
                this.mBackground.setBounds(this.mActionBarView.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
            }
        }
        this.setWillNotDraw(this.mIsSplit ? (this.mSplitBackground == null) : (this.mBackground == null && this.mStackedBackground == null));
        this.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.invalidateOutline(this);
        }
    }
    
    public void setStackedBackground(final Drawable bg) {
        if (this.mStackedBackground != null) {
            this.mStackedBackground.setCallback((Drawable.Callback)null);
            this.unscheduleDrawable(this.mStackedBackground);
        }
        if ((this.mStackedBackground = bg) != null) {
            bg.setCallback((Drawable.Callback)this);
            if (this.mIsStacked && this.mStackedBackground != null) {
                this.mStackedBackground.setBounds(this.mTabContainer.getLeft(), this.mTabContainer.getTop(), this.mTabContainer.getRight(), this.mTabContainer.getBottom());
            }
        }
        this.setWillNotDraw(this.mIsSplit ? (this.mSplitBackground == null) : (this.mBackground == null && this.mStackedBackground == null));
        this.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.invalidateOutline(this);
        }
    }
    
    public void setSplitBackground(final Drawable bg) {
        if (this.mSplitBackground != null) {
            this.mSplitBackground.setCallback((Drawable.Callback)null);
            this.unscheduleDrawable(this.mSplitBackground);
        }
        if ((this.mSplitBackground = bg) != null) {
            bg.setCallback((Drawable.Callback)this);
            if (this.mIsSplit && this.mSplitBackground != null) {
                this.mSplitBackground.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }
        this.setWillNotDraw(this.mIsSplit ? (this.mSplitBackground == null) : (this.mBackground == null && this.mStackedBackground == null));
        this.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.invalidateOutline(this);
        }
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean isVisible = visibility == 0;
        if (this.mBackground != null) {
            this.mBackground.setVisible(isVisible, false);
        }
        if (this.mStackedBackground != null) {
            this.mStackedBackground.setVisible(isVisible, false);
        }
        if (this.mSplitBackground != null) {
            this.mSplitBackground.setVisible(isVisible, false);
        }
    }
    
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        return (who == this.mBackground && !this.mIsSplit) || (who == this.mStackedBackground && this.mIsStacked) || (who == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(who);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackground != null && this.mBackground.isStateful()) {
            this.mBackground.setState(this.getDrawableState());
        }
        if (this.mStackedBackground != null && this.mStackedBackground.isStateful()) {
            this.mStackedBackground.setState(this.getDrawableState());
        }
        if (this.mSplitBackground != null && this.mSplitBackground.isStateful()) {
            this.mSplitBackground.setState(this.getDrawableState());
        }
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mBackground != null) {
            this.mBackground.jumpToCurrentState();
        }
        if (this.mStackedBackground != null) {
            this.mStackedBackground.jumpToCurrentState();
        }
        if (this.mSplitBackground != null) {
            this.mSplitBackground.jumpToCurrentState();
        }
    }
    
    public void setTransitioning(final boolean isTransitioning) {
        this.mIsTransitioning = isTransitioning;
        this.setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent ev) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(ev);
    }
    
    public boolean onTouchEvent(final MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }
    
    public boolean onHoverEvent(final MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }
    
    public void setTabContainer(final ScrollingTabContainerView tabView) {
        if (this.mTabContainer != null) {
            this.removeView(this.mTabContainer);
        }
        if ((this.mTabContainer = (View)tabView) != null) {
            this.addView((View)tabView);
            final ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }
    
    public View getTabContainer() {
        return this.mTabContainer;
    }
    
    public ActionMode startActionModeForChild(final View child, final ActionMode.Callback callback) {
        return null;
    }
    
    public ActionMode startActionModeForChild(final View child, final ActionMode.Callback callback, final int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }
    
    private boolean isCollapsed(final View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }
    
    private int getMeasuredHeightWithMargins(final View view) {
        final FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }
    
    public void onMeasure(final int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mActionBarView == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && this.mHeight >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(this.mHeight, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mActionBarView == null) {
            return;
        }
        final int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.mTabContainer != null && this.mTabContainer.getVisibility() != 8 && mode != 1073741824) {
            int topMarginForTabs;
            if (!this.isCollapsed(this.mActionBarView)) {
                topMarginForTabs = this.getMeasuredHeightWithMargins(this.mActionBarView);
            }
            else if (!this.isCollapsed(this.mContextView)) {
                topMarginForTabs = this.getMeasuredHeightWithMargins(this.mContextView);
            }
            else {
                topMarginForTabs = 0;
            }
            final int maxHeight = (mode == Integer.MIN_VALUE) ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE;
            this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(topMarginForTabs + this.getMeasuredHeightWithMargins(this.mTabContainer), maxHeight));
        }
    }
    
    public void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        super.onLayout(changed, l, t, r, b);
        final View tabContainer = this.mTabContainer;
        final boolean hasTabs = tabContainer != null && tabContainer.getVisibility() != 8;
        if (tabContainer != null && tabContainer.getVisibility() != 8) {
            final int containerHeight = this.getMeasuredHeight();
            final FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams)tabContainer.getLayoutParams();
            final int tabHeight = tabContainer.getMeasuredHeight();
            tabContainer.layout(l, containerHeight - tabHeight - lp.bottomMargin, r, containerHeight - lp.bottomMargin);
        }
        boolean needsInvalidate = false;
        if (this.mIsSplit) {
            if (this.mSplitBackground != null) {
                this.mSplitBackground.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                needsInvalidate = true;
            }
        }
        else {
            if (this.mBackground != null) {
                if (this.mActionBarView.getVisibility() == 0) {
                    this.mBackground.setBounds(this.mActionBarView.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
                }
                else if (this.mContextView != null && this.mContextView.getVisibility() == 0) {
                    this.mBackground.setBounds(this.mContextView.getLeft(), this.mContextView.getTop(), this.mContextView.getRight(), this.mContextView.getBottom());
                }
                else {
                    this.mBackground.setBounds(0, 0, 0, 0);
                }
                needsInvalidate = true;
            }
            this.mIsStacked = hasTabs;
            if (hasTabs && this.mStackedBackground != null) {
                this.mStackedBackground.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            this.invalidate();
        }
    }
    
    @RequiresApi(21)
    private static class Api21Impl
    {
        public static void invalidateOutline(final ActionBarContainer drawable) {
            drawable.invalidateOutline();
        }
    }
}
