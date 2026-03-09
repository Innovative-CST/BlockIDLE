package androidx.appcompat.widget;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.widget.LinearLayout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.GravityInt;
import androidx.core.view.GravityCompat;
import android.graphics.Canvas;
import androidx.annotation.RestrictTo;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_END = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private int mOrientation;
    private int mGravity;
    private int mTotalLength;
    private float mWeightSum;
    private boolean mUseLargestChild;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_TOP = 1;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_FILL = 3;
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    private Drawable mDivider;
    private int mDividerWidth;
    private int mDividerHeight;
    private int mShowDividers;
    private int mDividerPadding;
    
    public LinearLayoutCompat(@NonNull final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public LinearLayoutCompat(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.LinearLayoutCompat, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.LinearLayoutCompat, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        int index = a.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            this.setOrientation(index);
        }
        index = a.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (index >= 0) {
            this.setGravity(index);
        }
        final boolean baselineAligned = a.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            this.setBaselineAligned(baselineAligned);
        }
        this.mWeightSum = a.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = a.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = a.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(a.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = a.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = a.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        a.recycle();
    }
    
    public void setShowDividers(final int showDividers) {
        if (showDividers != this.mShowDividers) {
            this.requestLayout();
        }
        this.mShowDividers = showDividers;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public int getShowDividers() {
        return this.mShowDividers;
    }
    
    public Drawable getDividerDrawable() {
        return this.mDivider;
    }
    
    public void setDividerDrawable(final Drawable divider) {
        if (divider == this.mDivider) {
            return;
        }
        if ((this.mDivider = divider) != null) {
            this.mDividerWidth = divider.getIntrinsicWidth();
            this.mDividerHeight = divider.getIntrinsicHeight();
        }
        else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        this.setWillNotDraw(divider == null);
        this.requestLayout();
    }
    
    public void setDividerPadding(final int padding) {
        this.mDividerPadding = padding;
    }
    
    public int getDividerPadding() {
        return this.mDividerPadding;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public int getDividerWidth() {
        return this.mDividerWidth;
    }
    
    protected void onDraw(@NonNull final Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            this.drawDividersVertical(canvas);
        }
        else {
            this.drawDividersHorizontal(canvas);
        }
    }
    
    void drawDividersVertical(final Canvas canvas) {
        final int count = this.getVirtualChildCount();
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child != null && child.getVisibility() != 8 && this.hasDividerBeforeChildAt(i)) {
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                final int top = child.getTop() - lp.topMargin - this.mDividerHeight;
                this.drawHorizontalDivider(canvas, top);
            }
        }
        if (this.hasDividerBeforeChildAt(count)) {
            final View child2 = this.getVirtualChildAt(count - 1);
            int bottom = 0;
            if (child2 == null) {
                bottom = this.getHeight() - this.getPaddingBottom() - this.mDividerHeight;
            }
            else {
                final LayoutParams lp = (LayoutParams)child2.getLayoutParams();
                bottom = child2.getBottom() + lp.bottomMargin;
            }
            this.drawHorizontalDivider(canvas, bottom);
        }
    }
    
    void drawDividersHorizontal(final Canvas canvas) {
        final int count = this.getVirtualChildCount();
        final boolean isLayoutRtl = ViewUtils.isLayoutRtl((View)this);
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child != null && child.getVisibility() != 8 && this.hasDividerBeforeChildAt(i)) {
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                int position;
                if (isLayoutRtl) {
                    position = child.getRight() + lp.rightMargin;
                }
                else {
                    position = child.getLeft() - lp.leftMargin - this.mDividerWidth;
                }
                this.drawVerticalDivider(canvas, position);
            }
        }
        if (this.hasDividerBeforeChildAt(count)) {
            final View child2 = this.getVirtualChildAt(count - 1);
            int position2;
            if (child2 == null) {
                if (isLayoutRtl) {
                    position2 = this.getPaddingLeft();
                }
                else {
                    position2 = this.getWidth() - this.getPaddingRight() - this.mDividerWidth;
                }
            }
            else {
                final LayoutParams lp = (LayoutParams)child2.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child2.getLeft() - lp.leftMargin - this.mDividerWidth;
                }
                else {
                    position2 = child2.getRight() + lp.rightMargin;
                }
            }
            this.drawVerticalDivider(canvas, position2);
        }
    }
    
    void drawHorizontalDivider(final Canvas canvas, final int top) {
        this.mDivider.setBounds(this.getPaddingLeft() + this.mDividerPadding, top, this.getWidth() - this.getPaddingRight() - this.mDividerPadding, top + this.mDividerHeight);
        this.mDivider.draw(canvas);
    }
    
    void drawVerticalDivider(final Canvas canvas, final int left) {
        this.mDivider.setBounds(left, this.getPaddingTop() + this.mDividerPadding, left + this.mDividerWidth, this.getHeight() - this.getPaddingBottom() - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }
    
    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }
    
    public void setBaselineAligned(final boolean baselineAligned) {
        this.mBaselineAligned = baselineAligned;
    }
    
    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean enabled) {
        this.mUseLargestChild = enabled;
    }
    
    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (this.getChildCount() <= this.mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(this.mBaselineAlignedChildIndex);
        final int childBaseline = child.getBaseline();
        if (childBaseline != -1) {
            int childTop = this.mBaselineChildTop;
            if (this.mOrientation == 1) {
                final int majorGravity = this.mGravity & 0x70;
                if (majorGravity != 48) {
                    switch (majorGravity) {
                        case 80: {
                            childTop = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.mTotalLength;
                            break;
                        }
                        case 16: {
                            childTop += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.mTotalLength) / 2;
                            break;
                        }
                    }
                }
            }
            final LayoutParams lp = (LayoutParams)child.getLayoutParams();
            return childTop + lp.topMargin + childBaseline;
        }
        if (this.mBaselineAlignedChildIndex == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    
    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }
    
    public void setBaselineAlignedChildIndex(final int i) {
        if (i < 0 || i >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }
    
    View getVirtualChildAt(final int index) {
        return this.getChildAt(index);
    }
    
    int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    public float getWeightSum() {
        return this.mWeightSum;
    }
    
    public void setWeightSum(final float weightSum) {
        this.mWeightSum = Math.max(0.0f, weightSum);
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        if (this.mOrientation == 1) {
            this.measureVertical(widthMeasureSpec, heightMeasureSpec);
        }
        else {
            this.measureHorizontal(widthMeasureSpec, heightMeasureSpec);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    protected boolean hasDividerBeforeChildAt(final int childIndex) {
        if (childIndex == 0) {
            return (this.mShowDividers & 0x1) != 0x0;
        }
        if (childIndex == this.getChildCount()) {
            return (this.mShowDividers & 0x4) != 0x0;
        }
        if ((this.mShowDividers & 0x2) != 0x0) {
            boolean hasVisibleViewBefore = false;
            for (int i = childIndex - 1; i >= 0; --i) {
                if (this.getChildAt(i).getVisibility() != 8) {
                    hasVisibleViewBefore = true;
                    break;
                }
            }
            return hasVisibleViewBefore;
        }
        return false;
    }
    
    void measureVertical(final int widthMeasureSpec, final int heightMeasureSpec) {
        this.mTotalLength = 0;
        int maxWidth = 0;
        int childState = 0;
        int alternativeMaxWidth = 0;
        int weightedMaxWidth = 0;
        boolean allFillParent = true;
        float totalWeight = 0.0f;
        final int count = this.getVirtualChildCount();
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean matchWidth = false;
        boolean skippedMeasure = false;
        final int baselineChildIndex = this.mBaselineAlignedChildIndex;
        final boolean useLargestChild = this.mUseLargestChild;
        int largestChildHeight = 0;
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child == null) {
                this.mTotalLength += this.measureNullChild(i);
            }
            else if (child.getVisibility() == 8) {
                i += this.getChildrenSkipCount(child, i);
            }
            else {
                if (this.hasDividerBeforeChildAt(i)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                totalWeight += lp.weight;
                if (heightMode == 1073741824 && lp.height == 0 && lp.weight > 0.0f) {
                    final int totalLength = this.mTotalLength;
                    this.mTotalLength = Math.max(totalLength, totalLength + lp.topMargin + lp.bottomMargin);
                    skippedMeasure = true;
                }
                else {
                    int oldHeight = Integer.MIN_VALUE;
                    if (lp.height == 0 && lp.weight > 0.0f) {
                        oldHeight = 0;
                        lp.height = -2;
                    }
                    this.measureChildBeforeLayout(child, i, widthMeasureSpec, 0, heightMeasureSpec, (totalWeight == 0.0f) ? this.mTotalLength : 0);
                    if (oldHeight != Integer.MIN_VALUE) {
                        lp.height = oldHeight;
                    }
                    final int childHeight = child.getMeasuredHeight();
                    final int totalLength2 = this.mTotalLength;
                    this.mTotalLength = Math.max(totalLength2, totalLength2 + childHeight + lp.topMargin + lp.bottomMargin + this.getNextLocationOffset(child));
                    if (useLargestChild) {
                        largestChildHeight = Math.max(childHeight, largestChildHeight);
                    }
                }
                if (baselineChildIndex >= 0 && baselineChildIndex == i + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i < baselineChildIndex && lp.weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                boolean matchWidthLocally = false;
                if (widthMode != 1073741824 && lp.width == -1) {
                    matchWidth = true;
                    matchWidthLocally = true;
                }
                final int margin = lp.leftMargin + lp.rightMargin;
                final int measuredWidth = child.getMeasuredWidth() + margin;
                maxWidth = Math.max(maxWidth, measuredWidth);
                childState = View.combineMeasuredStates(childState, child.getMeasuredState());
                allFillParent = (allFillParent && lp.width == -1);
                if (lp.weight > 0.0f) {
                    weightedMaxWidth = Math.max(weightedMaxWidth, matchWidthLocally ? margin : measuredWidth);
                }
                else {
                    alternativeMaxWidth = Math.max(alternativeMaxWidth, matchWidthLocally ? margin : measuredWidth);
                }
                i += this.getChildrenSkipCount(child, i);
            }
        }
        if (this.mTotalLength > 0 && this.hasDividerBeforeChildAt(count)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (useLargestChild && (heightMode == Integer.MIN_VALUE || heightMode == 0)) {
            this.mTotalLength = 0;
            for (int i = 0; i < count; ++i) {
                final View child = this.getVirtualChildAt(i);
                if (child == null) {
                    this.mTotalLength += this.measureNullChild(i);
                }
                else if (child.getVisibility() == 8) {
                    i += this.getChildrenSkipCount(child, i);
                }
                else {
                    final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                    final int totalLength = this.mTotalLength;
                    this.mTotalLength = Math.max(totalLength, totalLength + largestChildHeight + lp.topMargin + lp.bottomMargin + this.getNextLocationOffset(child));
                }
            }
        }
        this.mTotalLength += this.getPaddingTop() + this.getPaddingBottom();
        int heightSize = this.mTotalLength;
        heightSize = Math.max(heightSize, this.getSuggestedMinimumHeight());
        final int heightSizeAndState = View.resolveSizeAndState(heightSize, heightMeasureSpec, 0);
        heightSize = (heightSizeAndState & 0xFFFFFF);
        int delta = heightSize - this.mTotalLength;
        if (skippedMeasure || (delta != 0 && totalWeight > 0.0f)) {
            float weightSum = (this.mWeightSum > 0.0f) ? this.mWeightSum : totalWeight;
            this.mTotalLength = 0;
            for (int j = 0; j < count; ++j) {
                final View child2 = this.getVirtualChildAt(j);
                if (child2.getVisibility() != 8) {
                    final LayoutParams lp2 = (LayoutParams)child2.getLayoutParams();
                    final float childExtra = lp2.weight;
                    if (childExtra > 0.0f) {
                        final int share = (int)(childExtra * delta / weightSum);
                        weightSum -= childExtra;
                        delta -= share;
                        final int childWidthMeasureSpec = getChildMeasureSpec(widthMeasureSpec, this.getPaddingLeft() + this.getPaddingRight() + lp2.leftMargin + lp2.rightMargin, lp2.width);
                        if (lp2.height != 0 || heightMode != 1073741824) {
                            int childHeight2 = child2.getMeasuredHeight() + share;
                            if (childHeight2 < 0) {
                                childHeight2 = 0;
                            }
                            child2.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(childHeight2, 1073741824));
                        }
                        else {
                            child2.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec((share > 0) ? share : 0, 1073741824));
                        }
                        childState = View.combineMeasuredStates(childState, child2.getMeasuredState() & 0xFFFFFF00);
                    }
                    final int margin2 = lp2.leftMargin + lp2.rightMargin;
                    final int measuredWidth2 = child2.getMeasuredWidth() + margin2;
                    maxWidth = Math.max(maxWidth, measuredWidth2);
                    final boolean matchWidthLocally2 = widthMode != 1073741824 && lp2.width == -1;
                    alternativeMaxWidth = Math.max(alternativeMaxWidth, matchWidthLocally2 ? margin2 : measuredWidth2);
                    allFillParent = (allFillParent && lp2.width == -1);
                    final int totalLength3 = this.mTotalLength;
                    this.mTotalLength = Math.max(totalLength3, totalLength3 + child2.getMeasuredHeight() + lp2.topMargin + lp2.bottomMargin + this.getNextLocationOffset(child2));
                }
            }
            this.mTotalLength += this.getPaddingTop() + this.getPaddingBottom();
        }
        else {
            alternativeMaxWidth = Math.max(alternativeMaxWidth, weightedMaxWidth);
            if (useLargestChild && heightMode != 1073741824) {
                for (int k = 0; k < count; ++k) {
                    final View child3 = this.getVirtualChildAt(k);
                    if (child3 != null) {
                        if (child3.getVisibility() != 8) {
                            final LayoutParams lp3 = (LayoutParams)child3.getLayoutParams();
                            final float childExtra2 = lp3.weight;
                            if (childExtra2 > 0.0f) {
                                child3.measure(View.MeasureSpec.makeMeasureSpec(child3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(largestChildHeight, 1073741824));
                            }
                        }
                    }
                }
            }
        }
        if (!allFillParent && widthMode != 1073741824) {
            maxWidth = alternativeMaxWidth;
        }
        maxWidth += this.getPaddingLeft() + this.getPaddingRight();
        maxWidth = Math.max(maxWidth, this.getSuggestedMinimumWidth());
        this.setMeasuredDimension(View.resolveSizeAndState(maxWidth, widthMeasureSpec, childState), heightSizeAndState);
        if (matchWidth) {
            this.forceUniformWidth(count, heightMeasureSpec);
        }
    }
    
    private void forceUniformWidth(final int count, final int heightMeasureSpec) {
        final int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
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
    
    void measureHorizontal(final int widthMeasureSpec, final int heightMeasureSpec) {
        this.mTotalLength = 0;
        int maxHeight = 0;
        int childState = 0;
        int alternativeMaxHeight = 0;
        int weightedMaxHeight = 0;
        boolean allFillParent = true;
        float totalWeight = 0.0f;
        final int count = this.getVirtualChildCount();
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean matchHeight = false;
        boolean skippedMeasure = false;
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        final int[] maxAscent = this.mMaxAscent;
        final int[] maxDescent = this.mMaxDescent;
        final int[] array = maxAscent;
        final int n = 0;
        final int[] array2 = maxAscent;
        final int n2 = 1;
        final int[] array3 = maxAscent;
        final int n3 = 2;
        final int[] array4 = maxAscent;
        final int n4 = 3;
        final int n5 = -1;
        array3[n3] = (array4[n4] = n5);
        array[n] = (array2[n2] = n5);
        final int[] array5 = maxDescent;
        final int n6 = 0;
        final int[] array6 = maxDescent;
        final int n7 = 1;
        final int[] array7 = maxDescent;
        final int n8 = 2;
        final int[] array8 = maxDescent;
        final int n9 = 3;
        final int n10 = -1;
        array7[n8] = (array8[n9] = n10);
        array5[n6] = (array6[n7] = n10);
        final boolean baselineAligned = this.mBaselineAligned;
        final boolean useLargestChild = this.mUseLargestChild;
        final boolean isExactly = widthMode == 1073741824;
        int largestChildWidth = 0;
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child == null) {
                this.mTotalLength += this.measureNullChild(i);
            }
            else if (child.getVisibility() == 8) {
                i += this.getChildrenSkipCount(child, i);
            }
            else {
                if (this.hasDividerBeforeChildAt(i)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                totalWeight += lp.weight;
                if (widthMode == 1073741824 && lp.width == 0 && lp.weight > 0.0f) {
                    if (isExactly) {
                        this.mTotalLength += lp.leftMargin + lp.rightMargin;
                    }
                    else {
                        final int totalLength = this.mTotalLength;
                        this.mTotalLength = Math.max(totalLength, totalLength + lp.leftMargin + lp.rightMargin);
                    }
                    if (baselineAligned) {
                        final int freeSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        child.measure(freeSpec, freeSpec);
                    }
                    else {
                        skippedMeasure = true;
                    }
                }
                else {
                    int oldWidth = Integer.MIN_VALUE;
                    if (lp.width == 0 && lp.weight > 0.0f) {
                        oldWidth = 0;
                        lp.width = -2;
                    }
                    this.measureChildBeforeLayout(child, i, widthMeasureSpec, (totalWeight == 0.0f) ? this.mTotalLength : 0, heightMeasureSpec, 0);
                    if (oldWidth != Integer.MIN_VALUE) {
                        lp.width = oldWidth;
                    }
                    final int childWidth = child.getMeasuredWidth();
                    if (isExactly) {
                        this.mTotalLength += childWidth + lp.leftMargin + lp.rightMargin + this.getNextLocationOffset(child);
                    }
                    else {
                        final int totalLength2 = this.mTotalLength;
                        this.mTotalLength = Math.max(totalLength2, totalLength2 + childWidth + lp.leftMargin + lp.rightMargin + this.getNextLocationOffset(child));
                    }
                    if (useLargestChild) {
                        largestChildWidth = Math.max(childWidth, largestChildWidth);
                    }
                }
                boolean matchHeightLocally = false;
                if (heightMode != 1073741824 && lp.height == -1) {
                    matchHeight = true;
                    matchHeightLocally = true;
                }
                final int margin = lp.topMargin + lp.bottomMargin;
                final int childHeight = child.getMeasuredHeight() + margin;
                childState = View.combineMeasuredStates(childState, child.getMeasuredState());
                if (baselineAligned) {
                    final int childBaseline = child.getBaseline();
                    if (childBaseline != -1) {
                        final int gravity = ((lp.gravity < 0) ? this.mGravity : lp.gravity) & 0x70;
                        final int index = (gravity >> 4 & 0xFFFFFFFE) >> 1;
                        maxAscent[index] = Math.max(maxAscent[index], childBaseline);
                        maxDescent[index] = Math.max(maxDescent[index], childHeight - childBaseline);
                    }
                }
                maxHeight = Math.max(maxHeight, childHeight);
                allFillParent = (allFillParent && lp.height == -1);
                if (lp.weight > 0.0f) {
                    weightedMaxHeight = Math.max(weightedMaxHeight, matchHeightLocally ? margin : childHeight);
                }
                else {
                    alternativeMaxHeight = Math.max(alternativeMaxHeight, matchHeightLocally ? margin : childHeight);
                }
                i += this.getChildrenSkipCount(child, i);
            }
        }
        if (this.mTotalLength > 0 && this.hasDividerBeforeChildAt(count)) {
            this.mTotalLength += this.mDividerWidth;
        }
        if (maxAscent[1] != -1 || maxAscent[0] != -1 || maxAscent[2] != -1 || maxAscent[3] != -1) {
            final int ascent = Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2])));
            final int descent = Math.max(maxDescent[3], Math.max(maxDescent[0], Math.max(maxDescent[1], maxDescent[2])));
            maxHeight = Math.max(maxHeight, ascent + descent);
        }
        if (useLargestChild && (widthMode == Integer.MIN_VALUE || widthMode == 0)) {
            this.mTotalLength = 0;
            for (int i = 0; i < count; ++i) {
                final View child = this.getVirtualChildAt(i);
                if (child == null) {
                    this.mTotalLength += this.measureNullChild(i);
                }
                else if (child.getVisibility() == 8) {
                    i += this.getChildrenSkipCount(child, i);
                }
                else {
                    final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                    if (isExactly) {
                        this.mTotalLength += largestChildWidth + lp.leftMargin + lp.rightMargin + this.getNextLocationOffset(child);
                    }
                    else {
                        final int totalLength = this.mTotalLength;
                        this.mTotalLength = Math.max(totalLength, totalLength + largestChildWidth + lp.leftMargin + lp.rightMargin + this.getNextLocationOffset(child));
                    }
                }
            }
        }
        this.mTotalLength += this.getPaddingLeft() + this.getPaddingRight();
        int widthSize = this.mTotalLength;
        widthSize = Math.max(widthSize, this.getSuggestedMinimumWidth());
        final int widthSizeAndState = View.resolveSizeAndState(widthSize, widthMeasureSpec, 0);
        widthSize = (widthSizeAndState & 0xFFFFFF);
        int delta = widthSize - this.mTotalLength;
        if (skippedMeasure || (delta != 0 && totalWeight > 0.0f)) {
            float weightSum = (this.mWeightSum > 0.0f) ? this.mWeightSum : totalWeight;
            final int[] array9 = maxAscent;
            final int n11 = 0;
            final int[] array10 = maxAscent;
            final int n12 = 1;
            final int[] array11 = maxAscent;
            final int n13 = 2;
            final int[] array12 = maxAscent;
            final int n14 = 3;
            final int n15 = -1;
            array11[n13] = (array12[n14] = n15);
            array9[n11] = (array10[n12] = n15);
            final int[] array13 = maxDescent;
            final int n16 = 0;
            final int[] array14 = maxDescent;
            final int n17 = 1;
            final int[] array15 = maxDescent;
            final int n18 = 2;
            final int[] array16 = maxDescent;
            final int n19 = 3;
            final int n20 = -1;
            array15[n18] = (array16[n19] = n20);
            array13[n16] = (array14[n17] = n20);
            maxHeight = -1;
            this.mTotalLength = 0;
            for (int j = 0; j < count; ++j) {
                final View child2 = this.getVirtualChildAt(j);
                if (child2 != null) {
                    if (child2.getVisibility() != 8) {
                        final LayoutParams lp2 = (LayoutParams)child2.getLayoutParams();
                        final float childExtra = lp2.weight;
                        if (childExtra > 0.0f) {
                            final int share = (int)(childExtra * delta / weightSum);
                            weightSum -= childExtra;
                            delta -= share;
                            final int childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec, this.getPaddingTop() + this.getPaddingBottom() + lp2.topMargin + lp2.bottomMargin, lp2.height);
                            if (lp2.width != 0 || widthMode != 1073741824) {
                                int childWidth2 = child2.getMeasuredWidth() + share;
                                if (childWidth2 < 0) {
                                    childWidth2 = 0;
                                }
                                child2.measure(View.MeasureSpec.makeMeasureSpec(childWidth2, 1073741824), childHeightMeasureSpec);
                            }
                            else {
                                child2.measure(View.MeasureSpec.makeMeasureSpec((share > 0) ? share : 0, 1073741824), childHeightMeasureSpec);
                            }
                            childState = View.combineMeasuredStates(childState, child2.getMeasuredState() & 0xFF000000);
                        }
                        if (isExactly) {
                            this.mTotalLength += child2.getMeasuredWidth() + lp2.leftMargin + lp2.rightMargin + this.getNextLocationOffset(child2);
                        }
                        else {
                            final int totalLength3 = this.mTotalLength;
                            this.mTotalLength = Math.max(totalLength3, totalLength3 + child2.getMeasuredWidth() + lp2.leftMargin + lp2.rightMargin + this.getNextLocationOffset(child2));
                        }
                        final boolean matchHeightLocally2 = heightMode != 1073741824 && lp2.height == -1;
                        final int margin2 = lp2.topMargin + lp2.bottomMargin;
                        final int childHeight2 = child2.getMeasuredHeight() + margin2;
                        maxHeight = Math.max(maxHeight, childHeight2);
                        alternativeMaxHeight = Math.max(alternativeMaxHeight, matchHeightLocally2 ? margin2 : childHeight2);
                        allFillParent = (allFillParent && lp2.height == -1);
                        if (baselineAligned) {
                            final int childBaseline2 = child2.getBaseline();
                            if (childBaseline2 != -1) {
                                final int gravity2 = ((lp2.gravity < 0) ? this.mGravity : lp2.gravity) & 0x70;
                                final int index2 = (gravity2 >> 4 & 0xFFFFFFFE) >> 1;
                                maxAscent[index2] = Math.max(maxAscent[index2], childBaseline2);
                                maxDescent[index2] = Math.max(maxDescent[index2], childHeight2 - childBaseline2);
                            }
                        }
                    }
                }
            }
            this.mTotalLength += this.getPaddingLeft() + this.getPaddingRight();
            if (maxAscent[1] != -1 || maxAscent[0] != -1 || maxAscent[2] != -1 || maxAscent[3] != -1) {
                final int ascent2 = Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2])));
                final int descent2 = Math.max(maxDescent[3], Math.max(maxDescent[0], Math.max(maxDescent[1], maxDescent[2])));
                maxHeight = Math.max(maxHeight, ascent2 + descent2);
            }
        }
        else {
            alternativeMaxHeight = Math.max(alternativeMaxHeight, weightedMaxHeight);
            if (useLargestChild && widthMode != 1073741824) {
                for (int k = 0; k < count; ++k) {
                    final View child3 = this.getVirtualChildAt(k);
                    if (child3 != null) {
                        if (child3.getVisibility() != 8) {
                            final LayoutParams lp3 = (LayoutParams)child3.getLayoutParams();
                            final float childExtra2 = lp3.weight;
                            if (childExtra2 > 0.0f) {
                                child3.measure(View.MeasureSpec.makeMeasureSpec(largestChildWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(child3.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                }
            }
        }
        if (!allFillParent && heightMode != 1073741824) {
            maxHeight = alternativeMaxHeight;
        }
        maxHeight += this.getPaddingTop() + this.getPaddingBottom();
        maxHeight = Math.max(maxHeight, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(widthSizeAndState | (childState & 0xFF000000), View.resolveSizeAndState(maxHeight, heightMeasureSpec, childState << 16));
        if (matchHeight) {
            this.forceUniformHeight(count, widthMeasureSpec);
        }
    }
    
    private void forceUniformHeight(final int count, final int widthMeasureSpec) {
        final int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child.getVisibility() != 8) {
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                if (lp.height == -1) {
                    final int oldWidth = lp.width;
                    lp.width = child.getMeasuredWidth();
                    this.measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    lp.width = oldWidth;
                }
            }
        }
    }
    
    int getChildrenSkipCount(final View child, final int index) {
        return 0;
    }
    
    int measureNullChild(final int childIndex) {
        return 0;
    }
    
    void measureChildBeforeLayout(final View child, final int childIndex, final int widthMeasureSpec, final int totalWidth, final int heightMeasureSpec, final int totalHeight) {
        this.measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }
    
    int getLocationOffset(final View child) {
        return 0;
    }
    
    int getNextLocationOffset(final View child) {
        return 0;
    }
    
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        if (this.mOrientation == 1) {
            this.layoutVertical(l, t, r, b);
        }
        else {
            this.layoutHorizontal(l, t, r, b);
        }
    }
    
    void layoutVertical(final int left, final int top, final int right, final int bottom) {
        final int paddingLeft = this.getPaddingLeft();
        final int width = right - left;
        final int childRight = width - this.getPaddingRight();
        final int childSpace = width - paddingLeft - this.getPaddingRight();
        final int count = this.getVirtualChildCount();
        final int majorGravity = this.mGravity & 0x70;
        final int minorGravity = this.mGravity & 0x800007;
        int childTop = 0;
        switch (majorGravity) {
            case 80: {
                childTop = this.getPaddingTop() + bottom - top - this.mTotalLength;
                break;
            }
            case 16: {
                childTop = this.getPaddingTop() + (bottom - top - this.mTotalLength) / 2;
                break;
            }
            default: {
                childTop = this.getPaddingTop();
                break;
            }
        }
        for (int i = 0; i < count; ++i) {
            final View child = this.getVirtualChildAt(i);
            if (child == null) {
                childTop += this.measureNullChild(i);
            }
            else if (child.getVisibility() != 8) {
                final int childWidth = child.getMeasuredWidth();
                final int childHeight = child.getMeasuredHeight();
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                int gravity = lp.gravity;
                if (gravity < 0) {
                    gravity = minorGravity;
                }
                final int layoutDirection = this.getLayoutDirection();
                final int absoluteGravity = GravityCompat.getAbsoluteGravity(gravity, layoutDirection);
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
                    childTop += this.mDividerHeight;
                }
                childTop += lp.topMargin;
                this.setChildFrame(child, childLeft, childTop + this.getLocationOffset(child), childWidth, childHeight);
                childTop += childHeight + lp.bottomMargin + this.getNextLocationOffset(child);
                i += this.getChildrenSkipCount(child, i);
            }
        }
    }
    
    void layoutHorizontal(final int left, final int top, final int right, final int bottom) {
        final boolean isLayoutRtl = ViewUtils.isLayoutRtl((View)this);
        final int paddingTop = this.getPaddingTop();
        final int height = bottom - top;
        final int childBottom = height - this.getPaddingBottom();
        final int childSpace = height - paddingTop - this.getPaddingBottom();
        final int count = this.getVirtualChildCount();
        final int majorGravity = this.mGravity & 0x800007;
        final int minorGravity = this.mGravity & 0x70;
        final boolean baselineAligned = this.mBaselineAligned;
        final int[] maxAscent = this.mMaxAscent;
        final int[] maxDescent = this.mMaxDescent;
        final int layoutDirection = this.getLayoutDirection();
        int childLeft = 0;
        switch (GravityCompat.getAbsoluteGravity(majorGravity, layoutDirection)) {
            case 5: {
                childLeft = this.getPaddingLeft() + right - left - this.mTotalLength;
                break;
            }
            case 1: {
                childLeft = this.getPaddingLeft() + (right - left - this.mTotalLength) / 2;
                break;
            }
            default: {
                childLeft = this.getPaddingLeft();
                break;
            }
        }
        int start = 0;
        int dir = 1;
        if (isLayoutRtl) {
            start = count - 1;
            dir = -1;
        }
        for (int i = 0; i < count; ++i) {
            final int childIndex = start + dir * i;
            final View child = this.getVirtualChildAt(childIndex);
            if (child == null) {
                childLeft += this.measureNullChild(childIndex);
            }
            else if (child.getVisibility() != 8) {
                final int childWidth = child.getMeasuredWidth();
                final int childHeight = child.getMeasuredHeight();
                int childBaseline = -1;
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                if (baselineAligned && lp.height != -1) {
                    childBaseline = child.getBaseline();
                }
                int gravity = lp.gravity;
                if (gravity < 0) {
                    gravity = minorGravity;
                }
                int childTop = 0;
                switch (gravity & 0x70) {
                    case 48: {
                        childTop = paddingTop + lp.topMargin;
                        if (childBaseline != -1) {
                            childTop += maxAscent[1] - childBaseline;
                            break;
                        }
                        break;
                    }
                    case 16: {
                        childTop = paddingTop + (childSpace - childHeight) / 2 + lp.topMargin - lp.bottomMargin;
                        break;
                    }
                    case 80: {
                        childTop = childBottom - childHeight - lp.bottomMargin;
                        if (childBaseline != -1) {
                            final int descent = child.getMeasuredHeight() - childBaseline;
                            childTop -= maxDescent[2] - descent;
                            break;
                        }
                        break;
                    }
                    default: {
                        childTop = paddingTop;
                        break;
                    }
                }
                if (this.hasDividerBeforeChildAt(childIndex)) {
                    childLeft += this.mDividerWidth;
                }
                childLeft += lp.leftMargin;
                this.setChildFrame(child, childLeft + this.getLocationOffset(child), childTop, childWidth, childHeight);
                childLeft += childWidth + lp.rightMargin + this.getNextLocationOffset(child);
                i += this.getChildrenSkipCount(child, childIndex);
            }
        }
    }
    
    private void setChildFrame(final View child, final int left, final int top, final int width, final int height) {
        child.layout(left, top, left + width, top + height);
    }
    
    public void setOrientation(final int orientation) {
        if (this.mOrientation != orientation) {
            this.mOrientation = orientation;
            this.requestLayout();
        }
    }
    
    public int getOrientation() {
        return this.mOrientation;
    }
    
    public void setGravity(@GravityInt int gravity) {
        if (this.mGravity != gravity) {
            if ((gravity & 0x800007) == 0x0) {
                gravity |= 0x800003;
            }
            if ((gravity & 0x70) == 0x0) {
                gravity |= 0x30;
            }
            this.mGravity = gravity;
            this.requestLayout();
        }
    }
    
    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }
    
    public void setHorizontalGravity(final int horizontalGravity) {
        final int gravity = horizontalGravity & 0x800007;
        if ((this.mGravity & 0x800007) != gravity) {
            this.mGravity = ((this.mGravity & 0xFF7FFFF8) | gravity);
            this.requestLayout();
        }
    }
    
    public void setVerticalGravity(final int verticalGravity) {
        final int gravity = verticalGravity & 0x70;
        if ((this.mGravity & 0x70) != gravity) {
            this.mGravity = ((this.mGravity & 0xFFFFFF8F) | gravity);
            this.requestLayout();
        }
    }
    
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        return new LayoutParams(this.getContext(), attrs);
    }
    
    protected LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.mOrientation == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }
    
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        if (p instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams)p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams)p);
        }
        return new LayoutParams(p);
    }
    
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public static class LayoutParams extends LinearLayout.LayoutParams
    {
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(c, attrs);
        }
        
        public LayoutParams(final int width, final int height) {
            super(width, height);
        }
        
        public LayoutParams(final int width, final int height, final float weight) {
            super(width, height, weight);
        }
        
        public LayoutParams(final ViewGroup.LayoutParams p) {
            super(p);
        }
        
        public LayoutParams(final ViewGroup.MarginLayoutParams source) {
            super(source);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface DividerMode {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface OrientationMode {
    }
}
