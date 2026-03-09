package android.widget;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.List;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public abstract class AbsSeekBar extends ProgressBar
{
    public AbsSeekBar(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSeekBar(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSeekBar(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSeekBar(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setThumb(final Drawable thumb) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getThumb() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThumbTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getThumbTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThumbTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setThumbTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getThumbTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getThumbOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThumbOffset(final int thumbOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSplitTrack(final boolean splitTrack) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getSplitTrack() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTickMark(final Drawable tickMark) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getTickMark() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTickMarkTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getTickMarkTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTickMarkTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTickMarkTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getTickMarkTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getTickMarkTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyProgressIncrement(final int increment) {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeyProgressIncrement() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMin(final int min) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMax(final int max) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSystemGestureExclusionRects(@NonNull final List<Rect> rects) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected synchronized void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected synchronized void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
}
