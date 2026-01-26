package android.graphics.drawable;

import android.graphics.Rect;
import android.graphics.ColorFilter;
import android.graphics.BlendMode;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.content.res.ColorStateList;

public class ColorStateListDrawable extends Drawable implements Callback
{
    public ColorStateListDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorStateListDrawable(@NonNull final ColorStateList colorStateList) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasFocusStateSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Drawable getCurrent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(@NonNull final Resources.Theme t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canApplyTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintBlendMode(@NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ColorFilter getColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setColorFilter(@Nullable final ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onStateChange(final int[] state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what, final long when) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unscheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorStateList getColorStateList() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorStateList(@NonNull final ColorStateList colorStateList) {
        throw new RuntimeException("Stub!");
    }
}
