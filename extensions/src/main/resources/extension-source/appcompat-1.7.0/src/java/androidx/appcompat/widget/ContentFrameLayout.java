package androidx.appcompat.widget;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import android.widget.FrameLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY })
public class ContentFrameLayout extends FrameLayout
{
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private final Rect mDecorPadding;
    private OnAttachListener mAttachListener;
    
    public ContentFrameLayout(@NonNull final Context context) {
        this(context, null);
    }
    
    public ContentFrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public ContentFrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mDecorPadding = new Rect();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public void dispatchFitSystemWindows(final Rect insets) {
        this.fitSystemWindows(insets);
    }
    
    public void setAttachListener(final OnAttachListener attachListener) {
        this.mAttachListener = attachListener;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public void setDecorPadding(final int left, final int top, final int right, final int bottom) {
        this.mDecorPadding.set(left, top, right, bottom);
        if (this.isLaidOut()) {
            this.requestLayout();
        }
    }
    
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final DisplayMetrics metrics = this.getContext().getResources().getDisplayMetrics();
        final boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            final TypedValue tvw = isPortrait ? this.mFixedWidthMinor : this.mFixedWidthMajor;
            if (tvw != null && tvw.type != 0) {
                int w = 0;
                if (tvw.type == 5) {
                    w = (int)tvw.getDimension(metrics);
                }
                else if (tvw.type == 6) {
                    w = (int)tvw.getFraction((float)metrics.widthPixels, (float)metrics.widthPixels);
                }
                if (w > 0) {
                    w -= this.mDecorPadding.left + this.mDecorPadding.right;
                    final int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w, widthSize), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            final TypedValue tvh = isPortrait ? this.mFixedHeightMajor : this.mFixedHeightMinor;
            if (tvh != null && tvh.type != 0) {
                int h = 0;
                if (tvh.type == 5) {
                    h = (int)tvh.getDimension(metrics);
                }
                else if (tvh.type == 6) {
                    h = (int)tvh.getFraction((float)metrics.heightPixels, (float)metrics.heightPixels);
                }
                if (h > 0) {
                    h -= this.mDecorPadding.top + this.mDecorPadding.bottom;
                    final int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h, heightSize), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int width = this.getMeasuredWidth();
        boolean measure = false;
        widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            final TypedValue tv = isPortrait ? this.mMinWidthMinor : this.mMinWidthMajor;
            if (tv != null && tv.type != 0) {
                int min = 0;
                if (tv.type == 5) {
                    min = (int)tv.getDimension(metrics);
                }
                else if (tv.type == 6) {
                    min = (int)tv.getFraction((float)metrics.widthPixels, (float)metrics.widthPixels);
                }
                if (min > 0) {
                    min -= this.mDecorPadding.left + this.mDecorPadding.right;
                }
                if (width < min) {
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
    
    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }
    
    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }
    
    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }
    
    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }
    
    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }
    
    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onAttachedFromWindow();
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onDetachedFromWindow();
        }
    }
    
    public interface OnAttachListener
    {
        void onDetachedFromWindow();
        
        void onAttachedFromWindow();
    }
}
