package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import androidx.core.view.GravityCompat;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import android.view.View;
import androidx.appcompat.R;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class AlertDialogLayout extends LinearLayoutCompat
{
    public AlertDialogLayout(@Nullable final Context context) {
        super(context);
    }
    
    public AlertDialogLayout(@Nullable final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        if (!this.tryOnMeasure(widthMeasureSpec, heightMeasureSpec)) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
    
    private boolean tryOnMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        View topPanel = null;
        View buttonPanel = null;
        View middlePanel = null;
        final int count = this.getChildCount();
        for (int i = 0; i < count; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final int id = child.getId();
                if (id == R.id.topPanel) {
                    topPanel = child;
                }
                else if (id == R.id.buttonPanel) {
                    buttonPanel = child;
                }
                else {
                    if (id != R.id.contentPanel && id != R.id.customPanel) {
                        return false;
                    }
                    if (middlePanel != null) {
                        return false;
                    }
                    middlePanel = child;
                }
            }
        }
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        final int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int childState = 0;
        int usedHeight = this.getPaddingTop() + this.getPaddingBottom();
        if (topPanel != null) {
            topPanel.measure(widthMeasureSpec, 0);
            usedHeight += topPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, topPanel.getMeasuredState());
        }
        int buttonHeight = 0;
        int buttonWantsHeight = 0;
        if (buttonPanel != null) {
            buttonPanel.measure(widthMeasureSpec, 0);
            buttonHeight = resolveMinimumHeight(buttonPanel);
            buttonWantsHeight = buttonPanel.getMeasuredHeight() - buttonHeight;
            usedHeight += buttonHeight;
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
        }
        int middleHeight = 0;
        if (middlePanel != null) {
            int childHeightSpec;
            if (heightMode == 0) {
                childHeightSpec = 0;
            }
            else {
                childHeightSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, heightSize - usedHeight), heightMode);
            }
            middlePanel.measure(widthMeasureSpec, childHeightSpec);
            middleHeight = middlePanel.getMeasuredHeight();
            usedHeight += middleHeight;
            childState = View.combineMeasuredStates(childState, middlePanel.getMeasuredState());
        }
        int remainingHeight = heightSize - usedHeight;
        if (buttonPanel != null) {
            usedHeight -= buttonHeight;
            final int heightToGive = Math.min(remainingHeight, buttonWantsHeight);
            if (heightToGive > 0) {
                remainingHeight -= heightToGive;
                buttonHeight += heightToGive;
            }
            final int childHeightSpec2 = View.MeasureSpec.makeMeasureSpec(buttonHeight, 1073741824);
            buttonPanel.measure(widthMeasureSpec, childHeightSpec2);
            usedHeight += buttonPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
        }
        if (middlePanel != null && remainingHeight > 0) {
            usedHeight -= middleHeight;
            final int heightToGive = remainingHeight;
            remainingHeight -= heightToGive;
            middleHeight += heightToGive;
            final int childHeightSpec2 = View.MeasureSpec.makeMeasureSpec(middleHeight, heightMode);
            middlePanel.measure(widthMeasureSpec, childHeightSpec2);
            usedHeight += middlePanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, middlePanel.getMeasuredState());
        }
        int maxWidth = 0;
        for (int j = 0; j < count; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                maxWidth = Math.max(maxWidth, child2.getMeasuredWidth());
            }
        }
        maxWidth += this.getPaddingLeft() + this.getPaddingRight();
        final int widthSizeAndState = View.resolveSizeAndState(maxWidth, widthMeasureSpec, childState);
        final int heightSizeAndState = View.resolveSizeAndState(usedHeight, heightMeasureSpec, 0);
        this.setMeasuredDimension(widthSizeAndState, heightSizeAndState);
        if (widthMode != 1073741824) {
            this.forceUniformWidth(count, heightMeasureSpec);
        }
        return true;
    }
    
    private void forceUniformWidth(final int count, final int heightMeasureSpec) {
        final int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                if (lp.width == -1) {
                    final int oldHeight = lp.height;
                    lp.height = child.getMeasuredHeight();
                    this.measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    lp.height = oldHeight;
                }
            }
        }
    }
    
    private static int resolveMinimumHeight(final View v) {
        final int minHeight = ViewCompat.getMinimumHeight(v);
        if (minHeight > 0) {
            return minHeight;
        }
        if (v instanceof ViewGroup) {
            final ViewGroup vg = (ViewGroup)v;
            if (vg.getChildCount() == 1) {
                return resolveMinimumHeight(vg.getChildAt(0));
            }
        }
        return 0;
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        final int paddingLeft = this.getPaddingLeft();
        final int width = right - left;
        final int childRight = width - this.getPaddingRight();
        final int childSpace = width - paddingLeft - this.getPaddingRight();
        final int totalLength = this.getMeasuredHeight();
        final int count = this.getChildCount();
        final int gravity = this.getGravity();
        final int majorGravity = gravity & 0x70;
        final int minorGravity = gravity & 0x800007;
        int childTop = 0;
        switch (majorGravity) {
            case 80: {
                childTop = this.getPaddingTop() + bottom - top - totalLength;
                break;
            }
            case 16: {
                childTop = this.getPaddingTop() + (bottom - top - totalLength) / 2;
                break;
            }
            default: {
                childTop = this.getPaddingTop();
                break;
            }
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        final int dividerHeight = (dividerDrawable == null) ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i = 0; i < count; ++i) {
            final View child = this.getChildAt(i);
            if (child != null && child.getVisibility() != 8) {
                final int childWidth = child.getMeasuredWidth();
                final int childHeight = child.getMeasuredHeight();
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                int layoutGravity = lp.gravity;
                if (layoutGravity < 0) {
                    layoutGravity = minorGravity;
                }
                final int layoutDirection = this.getLayoutDirection();
                final int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutGravity, layoutDirection);
                int childLeft = 0;
                switch (absoluteGravity & 0x7) {
                    case 1: {
                        childLeft = paddingLeft + (childSpace - childWidth) / 2 + lp.leftMargin - lp.rightMargin;
                        break;
                    }
                    case 5: {
                        childLeft = childRight - childWidth - lp.rightMargin;
                        break;
                    }
                    default: {
                        childLeft = paddingLeft + lp.leftMargin;
                        break;
                    }
                }
                if (this.hasDividerBeforeChildAt(i)) {
                    childTop += dividerHeight;
                }
                childTop += lp.topMargin;
                this.setChildFrame(child, childLeft, childTop, childWidth, childHeight);
                childTop += childHeight + lp.bottomMargin;
            }
        }
    }
    
    private void setChildFrame(final View child, final int left, final int top, final int width, final int height) {
        child.layout(left, top, left + width, top + height);
    }
}
