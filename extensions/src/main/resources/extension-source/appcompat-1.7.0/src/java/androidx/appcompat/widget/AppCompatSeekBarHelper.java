package androidx.appcompat.widget;

import android.graphics.Canvas;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.annotation.Nullable;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

class AppCompatSeekBarHelper extends AppCompatProgressBarHelper
{
    private final SeekBar mView;
    private Drawable mTickMark;
    private ColorStateList mTickMarkTintList;
    private PorterDuff.Mode mTickMarkTintMode;
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    
    AppCompatSeekBarHelper(final SeekBar view) {
        super((ProgressBar)view);
        this.mTickMarkTintList = null;
        this.mTickMarkTintMode = null;
        this.mHasTickMarkTint = false;
        this.mHasTickMarkTintMode = false;
        this.mView = view;
    }
    
    @Override
    void loadFromAttributes(final AttributeSet attrs, final int defStyleAttr) {
        super.loadFromAttributes(attrs, defStyleAttr);
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, R.styleable.AppCompatSeekBar, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mView, this.mView.getContext(), R.styleable.AppCompatSeekBar, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        final Drawable drawable = a.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.mView.setThumb(drawable);
        }
        final Drawable tickMark = a.getDrawable(R.styleable.AppCompatSeekBar_tickMark);
        this.setTickMark(tickMark);
        if (a.hasValue(R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.mTickMarkTintMode = DrawableUtils.parseTintMode(a.getInt(R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.mTickMarkTintMode);
            this.mHasTickMarkTintMode = true;
        }
        if (a.hasValue(R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.mTickMarkTintList = a.getColorStateList(R.styleable.AppCompatSeekBar_tickMarkTint);
            this.mHasTickMarkTint = true;
        }
        a.recycle();
        this.applyTickMarkTint();
    }
    
    void setTickMark(@Nullable final Drawable tickMark) {
        if (this.mTickMark != null) {
            this.mTickMark.setCallback((Drawable.Callback)null);
        }
        if ((this.mTickMark = tickMark) != null) {
            tickMark.setCallback((Drawable.Callback)this.mView);
            DrawableCompat.setLayoutDirection(tickMark, this.mView.getLayoutDirection());
            if (tickMark.isStateful()) {
                tickMark.setState(this.mView.getDrawableState());
            }
            this.applyTickMarkTint();
        }
        this.mView.invalidate();
    }
    
    @Nullable
    Drawable getTickMark() {
        return this.mTickMark;
    }
    
    void setTickMarkTintList(@Nullable final ColorStateList tint) {
        this.mTickMarkTintList = tint;
        this.mHasTickMarkTint = true;
        this.applyTickMarkTint();
    }
    
    @Nullable
    ColorStateList getTickMarkTintList() {
        return this.mTickMarkTintList;
    }
    
    void setTickMarkTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mTickMarkTintMode = tintMode;
        this.mHasTickMarkTintMode = true;
        this.applyTickMarkTint();
    }
    
    @Nullable
    PorterDuff.Mode getTickMarkTintMode() {
        return this.mTickMarkTintMode;
    }
    
    private void applyTickMarkTint() {
        if (this.mTickMark != null && (this.mHasTickMarkTint || this.mHasTickMarkTintMode)) {
            this.mTickMark = DrawableCompat.wrap(this.mTickMark.mutate());
            if (this.mHasTickMarkTint) {
                DrawableCompat.setTintList(this.mTickMark, this.mTickMarkTintList);
            }
            if (this.mHasTickMarkTintMode) {
                DrawableCompat.setTintMode(this.mTickMark, this.mTickMarkTintMode);
            }
            if (this.mTickMark.isStateful()) {
                this.mTickMark.setState(this.mView.getDrawableState());
            }
        }
    }
    
    void jumpDrawablesToCurrentState() {
        if (this.mTickMark != null) {
            this.mTickMark.jumpToCurrentState();
        }
    }
    
    void drawableStateChanged() {
        final Drawable tickMark = this.mTickMark;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.mView.getDrawableState())) {
            this.mView.invalidateDrawable(tickMark);
        }
    }
    
    void drawTickMarks(final Canvas canvas) {
        if (this.mTickMark != null) {
            final int count = this.mView.getMax();
            if (count > 1) {
                final int w = this.mTickMark.getIntrinsicWidth();
                final int h = this.mTickMark.getIntrinsicHeight();
                final int halfW = (w >= 0) ? (w / 2) : 1;
                final int halfH = (h >= 0) ? (h / 2) : 1;
                this.mTickMark.setBounds(-halfW, -halfH, halfW, halfH);
                final float spacing = (this.mView.getWidth() - this.mView.getPaddingLeft() - this.mView.getPaddingRight()) / (float)count;
                final int saveCount = canvas.save();
                canvas.translate((float)this.mView.getPaddingLeft(), (float)(this.mView.getHeight() / 2));
                for (int i = 0; i <= count; ++i) {
                    this.mTickMark.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
