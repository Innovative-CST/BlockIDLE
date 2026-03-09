package android.widget;

import android.os.Parcelable;
import android.graphics.Canvas;
import android.view.animation.Interpolator;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewDebug;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

@RemoteViews.RemoteView
public class ProgressBar extends View
{
    public ProgressBar(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ProgressBar(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ProgressBar(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ProgressBar(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setMinWidth(final int minWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxWidth(final int maxWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinHeight(final int minHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxHeight(final int maxHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized boolean isIndeterminate() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setIndeterminate(final boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getIndeterminateDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndeterminateDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndeterminateTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndeterminateTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndeterminateTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getIndeterminateTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndeterminateDrawableTiled(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getProgressDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getProgressTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getProgressTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressBackgroundTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressBackgroundTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressBackgroundTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getProgressBackgroundTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecondaryProgressTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecondaryProgressTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecondaryProgressTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getSecondaryProgressTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressDrawableTiled(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getCurrentDrawable() {
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
    public void postInvalidate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStateDescription(@Nullable final CharSequence stateDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setProgress(final int progress) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgress(final int progress, final boolean animate) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setSecondaryProgress(final int secondaryProgress) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getProgress() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getSecondaryProgress() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getMin() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getMax() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMin(final int min) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMax(final int max) {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized void incrementProgressBy(final int diff) {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized void incrementSecondaryProgressBy(final int diff) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Context context, final int resID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Interpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public Interpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onVisibilityAggregated(final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable dr) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
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
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAnimating() {
        throw new RuntimeException("Stub!");
    }
}
