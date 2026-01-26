package androidx.appcompat.widget;

import androidx.core.view.ViewPropertyAnimatorListener;
import android.view.View;
import androidx.core.view.ViewCompat;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.appcompat.R;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.content.Context;
import android.view.ViewGroup;

abstract class AbsActionBarView extends ViewGroup
{
    private static final int FADE_DURATION = 200;
    protected final VisibilityAnimListener mVisAnimListener;
    protected final Context mPopupContext;
    protected ActionMenuView mMenuView;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;
    private boolean mEatingTouch;
    private boolean mEatingHover;
    
    AbsActionBarView(@NonNull final Context context) {
        this(context, null);
    }
    
    AbsActionBarView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    AbsActionBarView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.mVisAnimListener = new VisibilityAnimListener();
        final TypedValue tv = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, tv, true) && tv.resourceId != 0) {
            this.mPopupContext = (Context)new ContextThemeWrapper(context, tv.resourceId);
        }
        else {
            this.mPopupContext = context;
        }
    }
    
    protected void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        final TypedArray a = this.getContext().obtainStyledAttributes((AttributeSet)null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.setContentHeight(a.getLayoutDimension(R.styleable.ActionBar_height, 0));
        a.recycle();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.onConfigurationChanged(newConfig);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent ev) {
        final int action = ev.getActionMasked();
        if (action == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            final boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.mEatingTouch = true;
            }
        }
        if (action == 1 || action == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }
    
    public boolean onHoverEvent(final MotionEvent ev) {
        final int action = ev.getActionMasked();
        if (action == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            final boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.mEatingHover = true;
            }
        }
        if (action == 10 || action == 3) {
            this.mEatingHover = false;
        }
        return true;
    }
    
    public void setContentHeight(final int height) {
        this.mContentHeight = height;
        this.requestLayout();
    }
    
    public int getContentHeight() {
        return this.mContentHeight;
    }
    
    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return this.getVisibility();
    }
    
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int visibility, final long duration) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (visibility == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            final ViewPropertyAnimatorCompat anim = ViewCompat.animate((View)this).alpha(1.0f);
            anim.setDuration(duration);
            anim.setListener((ViewPropertyAnimatorListener)this.mVisAnimListener.withFinalVisibility(anim, visibility));
            return anim;
        }
        final ViewPropertyAnimatorCompat anim = ViewCompat.animate((View)this).alpha(0.0f);
        anim.setDuration(duration);
        anim.setListener((ViewPropertyAnimatorListener)this.mVisAnimListener.withFinalVisibility(anim, visibility));
        return anim;
    }
    
    public void animateToVisibility(final int visibility) {
        final ViewPropertyAnimatorCompat anim = this.setupAnimatorToVisibility(visibility, 200L);
        anim.start();
    }
    
    public void setVisibility(final int visibility) {
        if (visibility != this.getVisibility()) {
            if (this.mVisibilityAnim != null) {
                this.mVisibilityAnim.cancel();
            }
            super.setVisibility(visibility);
        }
    }
    
    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.showOverflowMenu();
    }
    
    public void postShowOverflowMenu() {
        this.post((Runnable)new Runnable() {
            public void run() {
                AbsActionBarView.this.showOverflowMenu();
            }
        });
    }
    
    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.hideOverflowMenu();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowMenuShowing();
    }
    
    public boolean isOverflowMenuShowPending() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowMenuShowPending();
    }
    
    public boolean isOverflowReserved() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowReserved();
    }
    
    public boolean canShowOverflowMenu() {
        return this.isOverflowReserved() && this.getVisibility() == 0;
    }
    
    public void dismissPopupMenus() {
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
    }
    
    protected int measureChildView(final View child, int availableWidth, final int childSpecHeight, final int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        availableWidth -= child.getMeasuredWidth();
        availableWidth -= spacing;
        return Math.max(0, availableWidth);
    }
    
    protected static int next(final int x, final int val, final boolean isRtl) {
        return isRtl ? (x - val) : (x + val);
    }
    
    protected int positionChild(final View child, final int x, final int y, final int contentHeight, final boolean reverse) {
        final int childWidth = child.getMeasuredWidth();
        final int childHeight = child.getMeasuredHeight();
        final int childTop = y + (contentHeight - childHeight) / 2;
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        }
        else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? (-childWidth) : childWidth;
    }
    
    static /* synthetic */ void access$001(final AbsActionBarView x0, final int x1) {
        x0.setVisibility(x1);
    }
    
    static /* synthetic */ void access$101(final AbsActionBarView x0, final int x1) {
        x0.setVisibility(x1);
    }
    
    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener
    {
        private boolean mCanceled;
        int mFinalVisibility;
        
        protected VisibilityAnimListener() {
            this.mCanceled = false;
        }
        
        public VisibilityAnimListener withFinalVisibility(final ViewPropertyAnimatorCompat animation, final int visibility) {
            AbsActionBarView.this.mVisibilityAnim = animation;
            this.mFinalVisibility = visibility;
            return this;
        }
        
        public void onAnimationStart(final View view) {
            AbsActionBarView.access$001(AbsActionBarView.this, 0);
            this.mCanceled = false;
        }
        
        public void onAnimationEnd(final View view) {
            if (this.mCanceled) {
                return;
            }
            AbsActionBarView.this.mVisibilityAnim = null;
            AbsActionBarView.access$101(AbsActionBarView.this, this.mFinalVisibility);
        }
        
        public void onAnimationCancel(final View view) {
            this.mCanceled = true;
        }
    }
}
