package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.widget.LinearLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ButtonBarLayout extends LinearLayout
{
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private boolean mStacked;
    private int mLastWidthSize;
    
    public ButtonBarLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
        this.mLastWidthSize = -1;
        final TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ButtonBarLayout);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.ButtonBarLayout, attrs, ta, 0, 0);
        this.mAllowStacking = ta.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        ta.recycle();
        if (this.getOrientation() == 1) {
            this.setStacked(this.mAllowStacking);
        }
    }
    
    public void setAllowStacking(final boolean allowStacking) {
        if (this.mAllowStacking != allowStacking) {
            this.mAllowStacking = allowStacking;
            if (!this.mAllowStacking && this.isStacked()) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        final int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.mAllowStacking) {
            if (widthSize > this.mLastWidthSize && this.isStacked()) {
                this.setStacked(false);
            }
            this.mLastWidthSize = widthSize;
        }
        boolean needsRemeasure = false;
        int initialWidthMeasureSpec;
        if (!this.isStacked() && View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
            initialWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize, Integer.MIN_VALUE);
            needsRemeasure = true;
        }
        else {
            initialWidthMeasureSpec = widthMeasureSpec;
        }
        super.onMeasure(initialWidthMeasureSpec, heightMeasureSpec);
        if (this.mAllowStacking && !this.isStacked()) {
            final int measuredWidth = this.getMeasuredWidthAndState();
            final int measuredWidthState = measuredWidth & 0xFF000000;
            final boolean stack = measuredWidthState == 16777216;
            if (stack) {
                this.setStacked(true);
                needsRemeasure = true;
            }
        }
        if (needsRemeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int minHeight = 0;
        final int firstVisible = this.getNextVisibleChildIndex(0);
        if (firstVisible >= 0) {
            final View firstButton = this.getChildAt(firstVisible);
            final LinearLayout.LayoutParams firstParams = (LinearLayout.LayoutParams)firstButton.getLayoutParams();
            minHeight += this.getPaddingTop() + firstButton.getMeasuredHeight() + firstParams.topMargin + firstParams.bottomMargin;
            if (this.isStacked()) {
                final int secondVisible = this.getNextVisibleChildIndex(firstVisible + 1);
                if (secondVisible >= 0) {
                    minHeight += this.getChildAt(secondVisible).getPaddingTop() + (int)(16.0f * this.getResources().getDisplayMetrics().density);
                }
            }
            else {
                minHeight += this.getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight((View)this) != minHeight) {
            this.setMinimumHeight(minHeight);
            if (heightMeasureSpec == 0) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }
    
    private int getNextVisibleChildIndex(final int index) {
        for (int i = index, count = this.getChildCount(); i < count; ++i) {
            if (this.getChildAt(i).getVisibility() == 0) {
                return i;
            }
        }
        return -1;
    }
    
    private void setStacked(final boolean stacked) {
        if (this.mStacked != stacked && (!stacked || this.mAllowStacking)) {
            this.setOrientation((int)((this.mStacked = stacked) ? 1 : 0));
            this.setGravity(stacked ? 8388613 : 80);
            final View spacer = this.findViewById(R.id.spacer);
            if (spacer != null) {
                spacer.setVisibility(stacked ? 8 : 4);
            }
            final int childCount = this.getChildCount();
            for (int i = childCount - 2; i >= 0; --i) {
                this.bringChildToFront(this.getChildAt(i));
            }
        }
    }
    
    private boolean isStacked() {
        return this.mStacked;
    }
}
