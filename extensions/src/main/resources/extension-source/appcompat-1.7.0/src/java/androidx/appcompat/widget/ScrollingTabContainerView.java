package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.widget.BaseAdapter;
import android.view.ViewParent;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.res.Configuration;
import android.util.AttributeSet;
import androidx.appcompat.R;
import android.widget.SpinnerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.annotation.NonNull;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.ViewPropertyAnimator;
import android.widget.Spinner;
import androidx.annotation.RestrictTo;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener
{
    private static final String TAG = "ScrollingTabContainerView";
    Runnable mTabSelector;
    private TabClickListener mTabClickListener;
    LinearLayoutCompat mTabLayout;
    private Spinner mTabSpinner;
    private boolean mAllowCollapse;
    int mMaxTabWidth;
    int mStackedTabMaxWidth;
    private int mContentHeight;
    private int mSelectedTabIndex;
    protected ViewPropertyAnimator mVisibilityAnim;
    protected final VisibilityAnimListener mVisAnimListener;
    private static final Interpolator sAlphaInterpolator;
    private static final int FADE_DURATION = 200;
    
    public ScrollingTabContainerView(@NonNull final Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener();
        this.setHorizontalScrollBarEnabled(false);
        final ActionBarPolicy abp = ActionBarPolicy.get(context);
        this.setContentHeight(abp.getTabContainerHeight());
        this.mStackedTabMaxWidth = abp.getStackedTabMaxWidth();
        this.addView((View)(this.mTabLayout = this.createTabLayout()), new ViewGroup.LayoutParams(-2, -1));
    }
    
    public void onMeasure(final int widthMeasureSpec, int heightMeasureSpec) {
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        final boolean lockedExpanded = widthMode == 1073741824;
        this.setFillViewport(lockedExpanded);
        final int childCount = this.mTabLayout.getChildCount();
        if (childCount > 1 && (widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.mMaxTabWidth = (int)(View.MeasureSpec.getSize(widthMeasureSpec) * 0.4f);
            }
            else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        else {
            this.mMaxTabWidth = -1;
        }
        heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        final boolean canCollapse = !lockedExpanded && this.mAllowCollapse;
        if (canCollapse) {
            this.mTabLayout.measure(0, heightMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                this.performCollapse();
            }
            else {
                this.performExpand();
            }
        }
        else {
            this.performExpand();
        }
        final int oldWidth = this.getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int newWidth = this.getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            this.setTabSelected(this.mSelectedTabIndex);
        }
    }
    
    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }
    
    public void setAllowCollapse(final boolean allowCollapse) {
        this.mAllowCollapse = allowCollapse;
    }
    
    private void performCollapse() {
        if (this.isCollapsed()) {
            return;
        }
        if (this.mTabSpinner == null) {
            this.mTabSpinner = this.createSpinner();
        }
        this.removeView((View)this.mTabLayout);
        this.addView((View)this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
        if (this.mTabSpinner.getAdapter() == null) {
            this.mTabSpinner.setAdapter((SpinnerAdapter)new TabAdapter());
        }
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
            this.mTabSelector = null;
        }
        this.mTabSpinner.setSelection(this.mSelectedTabIndex);
    }
    
    private boolean performExpand() {
        if (!this.isCollapsed()) {
            return false;
        }
        this.removeView((View)this.mTabSpinner);
        this.addView((View)this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        this.setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }
    
    public void setTabSelected(final int position) {
        this.mSelectedTabIndex = position;
        for (int tabCount = this.mTabLayout.getChildCount(), i = 0; i < tabCount; ++i) {
            final View child = this.mTabLayout.getChildAt(i);
            final boolean isSelected = i == position;
            child.setSelected(isSelected);
            if (isSelected) {
                this.animateToTab(position);
            }
        }
        if (this.mTabSpinner != null && position >= 0) {
            this.mTabSpinner.setSelection(position);
        }
    }
    
    public void setContentHeight(final int contentHeight) {
        this.mContentHeight = contentHeight;
        this.requestLayout();
    }
    
    private LinearLayoutCompat createTabLayout() {
        final LinearLayoutCompat tabLayout = new LinearLayoutCompat(this.getContext(), null, R.attr.actionBarTabBarStyle);
        tabLayout.setMeasureWithLargestChildEnabled(true);
        tabLayout.setGravity(17);
        tabLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(-2, -1));
        return tabLayout;
    }
    
    private Spinner createSpinner() {
        final Spinner spinner = new AppCompatSpinner(this.getContext(), null, R.attr.actionDropDownStyle);
        spinner.setLayoutParams((ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(-2, -1));
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)this);
        return spinner;
    }
    
    protected void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        final ActionBarPolicy abp = ActionBarPolicy.get(this.getContext());
        this.setContentHeight(abp.getTabContainerHeight());
        this.mStackedTabMaxWidth = abp.getStackedTabMaxWidth();
    }
    
    public void animateToVisibility(final int visibility) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (visibility == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            final ViewPropertyAnimator anim = this.animate().alpha(1.0f);
            anim.setDuration(200L);
            anim.setInterpolator((TimeInterpolator)ScrollingTabContainerView.sAlphaInterpolator);
            anim.setListener((Animator.AnimatorListener)this.mVisAnimListener.withFinalVisibility(anim, visibility));
            anim.start();
        }
        else {
            final ViewPropertyAnimator anim = this.animate().alpha(0.0f);
            anim.setDuration(200L);
            anim.setInterpolator((TimeInterpolator)ScrollingTabContainerView.sAlphaInterpolator);
            anim.setListener((Animator.AnimatorListener)this.mVisAnimListener.withFinalVisibility(anim, visibility));
            anim.start();
        }
    }
    
    public void animateToTab(final int position) {
        final View tabView = this.mTabLayout.getChildAt(position);
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
        }
        this.post(this.mTabSelector = (Runnable)new Runnable() {
            public void run() {
                final int scrollPos = tabView.getLeft() - (ScrollingTabContainerView.this.getWidth() - tabView.getWidth()) / 2;
                ScrollingTabContainerView.this.smoothScrollTo(scrollPos, 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        });
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            this.post(this.mTabSelector);
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
        }
    }
    
    TabView createTabView(final ActionBar.Tab tab, final boolean forAdapter) {
        final TabView tabView = new TabView(this.getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable((Drawable)null);
            tabView.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, this.mContentHeight));
        }
        else {
            tabView.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new TabClickListener();
            }
            tabView.setOnClickListener((View.OnClickListener)this.mTabClickListener);
        }
        return tabView;
    }
    
    public void addTab(final ActionBar.Tab tab, final boolean setSelected) {
        final TabView tabView = this.createTabView(tab, false);
        this.mTabLayout.addView((View)tabView, (ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        if (this.mTabSpinner != null) {
            ((TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (setSelected) {
            tabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            this.requestLayout();
        }
    }
    
    public void addTab(final ActionBar.Tab tab, final int position, final boolean setSelected) {
        final TabView tabView = this.createTabView(tab, false);
        this.mTabLayout.addView((View)tabView, position, (ViewGroup.LayoutParams)new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        if (this.mTabSpinner != null) {
            ((TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (setSelected) {
            tabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            this.requestLayout();
        }
    }
    
    public void updateTab(final int position) {
        ((TabView)this.mTabLayout.getChildAt(position)).update();
        if (this.mTabSpinner != null) {
            ((TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            this.requestLayout();
        }
    }
    
    public void removeTabAt(final int position) {
        this.mTabLayout.removeViewAt(position);
        if (this.mTabSpinner != null) {
            ((TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            this.requestLayout();
        }
    }
    
    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        if (this.mTabSpinner != null) {
            ((TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            this.requestLayout();
        }
    }
    
    public void onItemSelected(final AdapterView<?> adapterView, final View view, final int position, final long id) {
        final TabView tabView = (TabView)view;
        tabView.getTab().select();
    }
    
    public void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    static {
        sAlphaInterpolator = (Interpolator)new DecelerateInterpolator();
    }
    
    private class TabView extends LinearLayout
    {
        private final int[] BG_ATTRS;
        private ActionBar.Tab mTab;
        private TextView mTextView;
        private ImageView mIconView;
        private View mCustomView;
        private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
        
        public TabView(final Context context, final ActionBar.Tab tab, final boolean forList) {
            super(context, (AttributeSet)null, R.attr.actionBarTabStyle);
            this.BG_ATTRS = new int[] { 16842964 };
            this.mTab = tab;
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, null, this.BG_ATTRS, R.attr.actionBarTabStyle, 0);
            if (a.hasValue(0)) {
                this.setBackgroundDrawable(a.getDrawable(0));
            }
            a.recycle();
            if (forList) {
                this.setGravity(8388627);
            }
            this.update();
        }
        
        public void bindTab(final ActionBar.Tab tab) {
            this.mTab = tab;
            this.update();
        }
        
        public void setSelected(final boolean selected) {
            final boolean changed = this.isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                this.sendAccessibilityEvent(4);
            }
        }
        
        public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
            super.onInitializeAccessibilityNodeInfo(info);
            info.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0 && this.getMeasuredWidth() > ScrollingTabContainerView.this.mMaxTabWidth) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.mMaxTabWidth, 1073741824), heightMeasureSpec);
            }
        }
        
        public void update() {
            final ActionBar.Tab tab = this.mTab;
            final View custom = tab.getCustomView();
            if (custom != null) {
                final ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup)customParent).removeView(custom);
                    }
                    this.addView(custom);
                }
                this.mCustomView = custom;
                if (this.mTextView != null) {
                    this.mTextView.setVisibility(8);
                }
                if (this.mIconView != null) {
                    this.mIconView.setVisibility(8);
                    this.mIconView.setImageDrawable((Drawable)null);
                }
            }
            else {
                if (this.mCustomView != null) {
                    this.removeView(this.mCustomView);
                    this.mCustomView = null;
                }
                final Drawable icon = tab.getIcon();
                final CharSequence text = tab.getText();
                if (icon != null) {
                    if (this.mIconView == null) {
                        final ImageView iconView = new AppCompatImageView(this.getContext());
                        final LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
                        lp.gravity = 16;
                        iconView.setLayoutParams((ViewGroup.LayoutParams)lp);
                        this.addView((View)iconView, 0);
                        this.mIconView = iconView;
                    }
                    this.mIconView.setImageDrawable(icon);
                    this.mIconView.setVisibility(0);
                }
                else if (this.mIconView != null) {
                    this.mIconView.setVisibility(8);
                    this.mIconView.setImageDrawable((Drawable)null);
                }
                final boolean hasText = !TextUtils.isEmpty(text);
                if (hasText) {
                    if (this.mTextView == null) {
                        final TextView textView = new AppCompatTextView(this.getContext(), null, R.attr.actionBarTabTextStyle);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        final LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-2, -2);
                        lp2.gravity = 16;
                        textView.setLayoutParams((ViewGroup.LayoutParams)lp2);
                        this.addView((View)textView);
                        this.mTextView = textView;
                    }
                    this.mTextView.setText(text);
                    this.mTextView.setVisibility(0);
                }
                else if (this.mTextView != null) {
                    this.mTextView.setVisibility(8);
                    this.mTextView.setText((CharSequence)null);
                }
                if (this.mIconView != null) {
                    this.mIconView.setContentDescription(tab.getContentDescription());
                }
                TooltipCompat.setTooltipText((View)this, hasText ? null : tab.getContentDescription());
            }
        }
        
        public ActionBar.Tab getTab() {
            return this.mTab;
        }
    }
    
    private class TabAdapter extends BaseAdapter
    {
        TabAdapter() {
        }
        
        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }
        
        public Object getItem(final int position) {
            return ((TabView)ScrollingTabContainerView.this.mTabLayout.getChildAt(position)).getTab();
        }
        
        public long getItemId(final int position) {
            return position;
        }
        
        public View getView(final int position, View convertView, final ViewGroup parent) {
            if (convertView == null) {
                convertView = (View)ScrollingTabContainerView.this.createTabView((ActionBar.Tab)this.getItem(position), true);
            }
            else {
                ((TabView)convertView).bindTab((ActionBar.Tab)this.getItem(position));
            }
            return convertView;
        }
    }
    
    private class TabClickListener implements View.OnClickListener
    {
        TabClickListener() {
        }
        
        public void onClick(final View view) {
            final TabView tabView = (TabView)view;
            tabView.getTab().select();
            for (int tabCount = ScrollingTabContainerView.this.mTabLayout.getChildCount(), i = 0; i < tabCount; ++i) {
                final View child = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
    
    protected class VisibilityAnimListener extends AnimatorListenerAdapter
    {
        private boolean mCanceled;
        private int mFinalVisibility;
        
        protected VisibilityAnimListener() {
            this.mCanceled = false;
        }
        
        public VisibilityAnimListener withFinalVisibility(final ViewPropertyAnimator animation, final int visibility) {
            this.mFinalVisibility = visibility;
            ScrollingTabContainerView.this.mVisibilityAnim = animation;
            return this;
        }
        
        public void onAnimationStart(final Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }
        
        public void onAnimationEnd(final Animator animator) {
            if (this.mCanceled) {
                return;
            }
            ScrollingTabContainerView.this.mVisibilityAnim = null;
            ScrollingTabContainerView.this.setVisibility(this.mFinalVisibility);
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.mCanceled = true;
        }
    }
}
