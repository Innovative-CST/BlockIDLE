package androidx.appcompat.widget;

import android.view.MotionEvent;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.ActionMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActionBarContextView extends AbsActionBarView
{
    private CharSequence mTitle;
    private CharSequence mSubtitle;
    private View mClose;
    private View mCloseButton;
    private View mCustomView;
    private LinearLayout mTitleLayout;
    private TextView mTitleView;
    private TextView mSubtitleView;
    private int mTitleStyleRes;
    private int mSubtitleStyleRes;
    private boolean mTitleOptional;
    private int mCloseItemLayout;
    
    public ActionBarContextView(@NonNull final Context context) {
        this(context, null);
    }
    
    public ActionBarContextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.actionModeStyle);
    }
    
    public ActionBarContextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.ActionMode, defStyle, 0);
        this.setBackground(a.getDrawable(R.styleable.ActionMode_background));
        this.mTitleStyleRes = a.getResourceId(R.styleable.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = a.getResourceId(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = a.getLayoutDimension(R.styleable.ActionMode_height, 0);
        this.mCloseItemLayout = a.getResourceId(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        a.recycle();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.hideOverflowMenu();
            this.mActionMenuPresenter.hideSubMenus();
        }
    }
    
    @Override
    public void setContentHeight(final int height) {
        this.mContentHeight = height;
    }
    
    public void setCustomView(final View view) {
        if (this.mCustomView != null) {
            this.removeView(this.mCustomView);
        }
        this.mCustomView = view;
        if (view != null && this.mTitleLayout != null) {
            this.removeView((View)this.mTitleLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }
    
    public void setTitle(final CharSequence title) {
        this.mTitle = title;
        this.initTitle();
        ViewCompat.setAccessibilityPaneTitle((View)this, title);
    }
    
    public void setSubtitle(final CharSequence subtitle) {
        this.mSubtitle = subtitle;
        this.initTitle();
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }
    
    private void initTitle() {
        if (this.mTitleLayout == null) {
            final LayoutInflater inflater = LayoutInflater.from(this.getContext());
            inflater.inflate(R.layout.abc_action_bar_title_item, (ViewGroup)this);
            this.mTitleLayout = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.mTitleView = (TextView)this.mTitleLayout.findViewById(R.id.action_bar_title);
            this.mSubtitleView = (TextView)this.mTitleLayout.findViewById(R.id.action_bar_subtitle);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(this.getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(this.getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        final boolean hasTitle = !TextUtils.isEmpty(this.mTitle);
        final boolean hasSubtitle = !TextUtils.isEmpty(this.mSubtitle);
        this.mSubtitleView.setVisibility(hasSubtitle ? 0 : 8);
        this.mTitleLayout.setVisibility((hasTitle || hasSubtitle) ? 0 : 8);
        if (this.mTitleLayout.getParent() == null) {
            this.addView((View)this.mTitleLayout);
        }
    }
    
    public void initForMode(final ActionMode mode) {
        if (this.mClose == null) {
            final LayoutInflater inflater = LayoutInflater.from(this.getContext());
            this.addView(this.mClose = inflater.inflate(this.mCloseItemLayout, (ViewGroup)this, false));
        }
        else if (this.mClose.getParent() == null) {
            this.addView(this.mClose);
        }
        (this.mCloseButton = this.mClose.findViewById(R.id.action_mode_close_button)).setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View v) {
                mode.finish();
            }
        });
        final MenuBuilder menu = (MenuBuilder)mode.getMenu();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
        (this.mActionMenuPresenter = new ActionMenuPresenter(this.getContext())).setReserveOverflow(true);
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        (this.mMenuView = (ActionMenuView)this.mActionMenuPresenter.getMenuView(this)).setBackground((Drawable)null);
        this.addView((View)this.mMenuView, layoutParams);
    }
    
    public void closeMode() {
        if (this.mClose == null) {
            this.killMode();
        }
    }
    
    public void killMode() {
        this.removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        if (this.mCloseButton != null) {
            this.mCloseButton.setOnClickListener((View.OnClickListener)null);
        }
    }
    
    @Override
    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.showOverflowMenu();
    }
    
    @Override
    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.hideOverflowMenu();
    }
    
    @Override
    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowMenuShowing();
    }
    
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup.LayoutParams generateLayoutParams(final AttributeSet attrs) {
        return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(this.getContext(), attrs);
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (widthMode != 1073741824) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        final int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        final int maxHeight = (this.mContentHeight > 0) ? this.mContentHeight : View.MeasureSpec.getSize(heightMeasureSpec);
        final int verticalPadding = this.getPaddingTop() + this.getPaddingBottom();
        int availableWidth = contentWidth - this.getPaddingLeft() - this.getPaddingRight();
        final int height = maxHeight - verticalPadding;
        final int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        if (this.mClose != null) {
            availableWidth = this.measureChildView(this.mClose, availableWidth, childSpecHeight, 0);
            final ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)this.mClose.getLayoutParams();
            availableWidth -= lp.leftMargin + lp.rightMargin;
        }
        if (this.mMenuView != null && this.mMenuView.getParent() == this) {
            availableWidth = this.measureChildView((View)this.mMenuView, availableWidth, childSpecHeight, 0);
        }
        if (this.mTitleLayout != null && this.mCustomView == null) {
            if (this.mTitleOptional) {
                final int titleWidthSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mTitleLayout.measure(titleWidthSpec, childSpecHeight);
                final int titleWidth = this.mTitleLayout.getMeasuredWidth();
                final boolean titleFits = titleWidth <= availableWidth;
                if (titleFits) {
                    availableWidth -= titleWidth;
                }
                this.mTitleLayout.setVisibility(titleFits ? 0 : 8);
            }
            else {
                availableWidth = this.measureChildView((View)this.mTitleLayout, availableWidth, childSpecHeight, 0);
            }
        }
        if (this.mCustomView != null) {
            final ViewGroup.LayoutParams lp2 = this.mCustomView.getLayoutParams();
            final int customWidthMode = (lp2.width != -2) ? 1073741824 : Integer.MIN_VALUE;
            final int customWidth = (lp2.width >= 0) ? Math.min(lp2.width, availableWidth) : availableWidth;
            final int customHeightMode = (lp2.height != -2) ? 1073741824 : Integer.MIN_VALUE;
            final int customHeight = (lp2.height >= 0) ? Math.min(lp2.height, height) : height;
            this.mCustomView.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(customHeight, customHeightMode));
        }
        if (this.mContentHeight <= 0) {
            int measuredHeight = 0;
            for (int count = this.getChildCount(), i = 0; i < count; ++i) {
                final View v = this.getChildAt(i);
                final int paddedViewHeight = v.getMeasuredHeight() + verticalPadding;
                if (paddedViewHeight > measuredHeight) {
                    measuredHeight = paddedViewHeight;
                }
            }
            this.setMeasuredDimension(contentWidth, measuredHeight);
        }
        else {
            this.setMeasuredDimension(contentWidth, maxHeight);
        }
    }
    
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        final boolean isLayoutRtl = ViewUtils.isLayoutRtl((View)this);
        int x = isLayoutRtl ? (r - l - this.getPaddingRight()) : this.getPaddingLeft();
        final int y = this.getPaddingTop();
        final int contentHeight = b - t - this.getPaddingTop() - this.getPaddingBottom();
        if (this.mClose != null && this.mClose.getVisibility() != 8) {
            final ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)this.mClose.getLayoutParams();
            final int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            final int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            x = AbsActionBarView.next(x, startMargin, isLayoutRtl);
            x += this.positionChild(this.mClose, x, y, contentHeight, isLayoutRtl);
            x = AbsActionBarView.next(x, endMargin, isLayoutRtl);
        }
        if (this.mTitleLayout != null && this.mCustomView == null && this.mTitleLayout.getVisibility() != 8) {
            x += this.positionChild((View)this.mTitleLayout, x, y, contentHeight, isLayoutRtl);
        }
        if (this.mCustomView != null) {
            x += this.positionChild(this.mCustomView, x, y, contentHeight, isLayoutRtl);
        }
        x = (isLayoutRtl ? this.getPaddingLeft() : (r - l - this.getPaddingRight()));
        if (this.mMenuView != null) {
            x += this.positionChild((View)this.mMenuView, x, y, contentHeight, !isLayoutRtl);
        }
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void setTitleOptional(final boolean titleOptional) {
        if (titleOptional != this.mTitleOptional) {
            this.requestLayout();
        }
        this.mTitleOptional = titleOptional;
    }
    
    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }
}
