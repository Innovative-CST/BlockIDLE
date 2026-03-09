package androidx.appcompat.graphics.drawable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import androidx.annotation.FloatRange;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.annotation.NonNull;
import android.graphics.Canvas;
import androidx.annotation.ColorInt;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.R;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class DrawerArrowDrawable extends Drawable
{
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    public static final int ARROW_DIRECTION_END = 3;
    private final Paint mPaint;
    private static final float ARROW_HEAD_ANGLE;
    private float mArrowHeadLength;
    private float mBarLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private boolean mSpin;
    private final Path mPath;
    private final int mSize;
    private boolean mVerticalMirror;
    private float mProgress;
    private float mMaxCutForBarSize;
    private int mDirection;
    
    public DrawerArrowDrawable(final Context context) {
        this.mPaint = new Paint();
        this.mPath = new Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeJoin(Paint.Join.MITER);
        this.mPaint.setStrokeCap(Paint.Cap.BUTT);
        this.mPaint.setAntiAlias(true);
        final TypedArray a = context.getTheme().obtainStyledAttributes((AttributeSet)null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        this.setColor(a.getColor(R.styleable.DrawerArrowToggle_color, 0));
        this.setBarThickness(a.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        this.setSpinEnabled(a.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        this.setGapSize((float)Math.round(a.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = a.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = (float)Math.round(a.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = (float)Math.round(a.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = a.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        a.recycle();
    }
    
    public void setArrowHeadLength(final float length) {
        if (this.mArrowHeadLength != length) {
            this.mArrowHeadLength = length;
            this.invalidateSelf();
        }
    }
    
    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }
    
    public void setArrowShaftLength(final float length) {
        if (this.mArrowShaftLength != length) {
            this.mArrowShaftLength = length;
            this.invalidateSelf();
        }
    }
    
    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }
    
    public float getBarLength() {
        return this.mBarLength;
    }
    
    public void setBarLength(final float length) {
        if (this.mBarLength != length) {
            this.mBarLength = length;
            this.invalidateSelf();
        }
    }
    
    public void setColor(@ColorInt final int color) {
        if (color != this.mPaint.getColor()) {
            this.mPaint.setColor(color);
            this.invalidateSelf();
        }
    }
    
    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }
    
    public void setBarThickness(final float width) {
        if (this.mPaint.getStrokeWidth() != width) {
            this.mPaint.setStrokeWidth(width);
            this.mMaxCutForBarSize = (float)(width / 2.0f * Math.cos((double)DrawerArrowDrawable.ARROW_HEAD_ANGLE));
            this.invalidateSelf();
        }
    }
    
    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }
    
    public float getGapSize() {
        return this.mBarGap;
    }
    
    public void setGapSize(final float gap) {
        if (gap != this.mBarGap) {
            this.mBarGap = gap;
            this.invalidateSelf();
        }
    }
    
    public void setDirection(final int direction) {
        if (direction != this.mDirection) {
            this.mDirection = direction;
            this.invalidateSelf();
        }
    }
    
    public boolean isSpinEnabled() {
        return this.mSpin;
    }
    
    public void setSpinEnabled(final boolean enabled) {
        if (this.mSpin != enabled) {
            this.mSpin = enabled;
            this.invalidateSelf();
        }
    }
    
    public int getDirection() {
        return this.mDirection;
    }
    
    public void setVerticalMirror(final boolean verticalMirror) {
        if (this.mVerticalMirror != verticalMirror) {
            this.mVerticalMirror = verticalMirror;
            this.invalidateSelf();
        }
    }
    
    public void draw(@NonNull final Canvas canvas) {
        final Rect bounds = this.getBounds();
        boolean flipToPointRight = false;
        switch (this.mDirection) {
            case 0: {
                flipToPointRight = false;
                break;
            }
            case 1: {
                flipToPointRight = true;
                break;
            }
            case 3: {
                flipToPointRight = (DrawableCompat.getLayoutDirection((Drawable)this) == 0);
                break;
            }
            default: {
                flipToPointRight = (DrawableCompat.getLayoutDirection((Drawable)this) == 1);
                break;
            }
        }
        float arrowHeadBarLength = (float)Math.sqrt((double)(this.mArrowHeadLength * this.mArrowHeadLength * 2.0f));
        arrowHeadBarLength = lerp(this.mBarLength, arrowHeadBarLength, this.mProgress);
        final float arrowShaftLength = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        final float arrowShaftCut = (float)Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        final float rotation = lerp(0.0f, DrawerArrowDrawable.ARROW_HEAD_ANGLE, this.mProgress);
        final float canvasRotate = lerp(flipToPointRight ? 0.0f : -180.0f, flipToPointRight ? 180.0f : 0.0f, this.mProgress);
        final float arrowWidth = (float)Math.round(arrowHeadBarLength * Math.cos((double)rotation));
        final float arrowHeight = (float)Math.round(arrowHeadBarLength * Math.sin((double)rotation));
        this.mPath.rewind();
        final float topBottomBarOffset = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        final float arrowEdge = -arrowShaftLength / 2.0f;
        this.mPath.moveTo(arrowEdge + arrowShaftCut, 0.0f);
        this.mPath.rLineTo(arrowShaftLength - arrowShaftCut * 2.0f, 0.0f);
        this.mPath.moveTo(arrowEdge, topBottomBarOffset);
        this.mPath.rLineTo(arrowWidth, arrowHeight);
        this.mPath.moveTo(arrowEdge, -topBottomBarOffset);
        this.mPath.rLineTo(arrowWidth, -arrowHeight);
        this.mPath.close();
        canvas.save();
        final float barThickness = this.mPaint.getStrokeWidth();
        final int remainingSpace = (int)(bounds.height() - barThickness * 3.0f - this.mBarGap * 2.0f);
        float yOffset = (float)(remainingSpace / 4 * 2);
        yOffset += barThickness * 1.5f + this.mBarGap;
        canvas.translate((float)bounds.centerX(), yOffset);
        if (this.mSpin) {
            canvas.rotate(canvasRotate * ((this.mVerticalMirror ^ flipToPointRight) ? -1 : 1));
        }
        else if (flipToPointRight) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }
    
    public void setAlpha(final int alpha) {
        if (alpha != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public int getIntrinsicHeight() {
        return this.mSize;
    }
    
    public int getIntrinsicWidth() {
        return this.mSize;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    @FloatRange(from = 0.0, to = 1.0)
    public float getProgress() {
        return this.mProgress;
    }
    
    public void setProgress(@FloatRange(from = 0.0, to = 1.0) final float progress) {
        if (this.mProgress != progress) {
            this.mProgress = progress;
            this.invalidateSelf();
        }
    }
    
    public final Paint getPaint() {
        return this.mPaint;
    }
    
    private static float lerp(final float a, final float b, final float t) {
        return a + (b - a) * t;
    }
    
    static {
        ARROW_HEAD_ANGLE = (float)Math.toRadians(45.0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface ArrowDirection {
    }
}
