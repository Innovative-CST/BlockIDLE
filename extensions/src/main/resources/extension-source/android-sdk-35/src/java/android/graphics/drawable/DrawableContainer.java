package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Canvas;

public class DrawableContainer extends Drawable implements Callback
{
    public DrawableContainer() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getPadding(final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Insets getOpticalInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setColorFilter(final ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintList(final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintBlendMode(@NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnterFadeDuration(final int ms) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExitFadeDuration(final int ms) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
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
    
    @Override
    public void setAutoMirrored(final boolean mirrored) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isAutoMirrored() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setHotspot(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setHotspotBounds(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getHotspotBounds(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onStateChange(final int[] state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onLayoutDirectionChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIntrinsicWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIntrinsicHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getMinimumHeight() {
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
    
    @Override
    public boolean setVisible(final boolean visible, final boolean restart) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean selectDrawable(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable getCurrent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canApplyTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    protected void setConstantState(final DrawableContainerState state) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class DrawableContainerState extends ConstantState
    {
        DrawableContainerState() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getChangingConfigurations() {
            throw new RuntimeException("Stub!");
        }
        
        public final int addChild(final Drawable dr) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getChildCount() {
            throw new RuntimeException("Stub!");
        }
        
        public final Drawable[] getChildren() {
            throw new RuntimeException("Stub!");
        }
        
        public final Drawable getChild(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean canApplyTheme() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setVariablePadding(final boolean variable) {
            throw new RuntimeException("Stub!");
        }
        
        public final Rect getConstantPadding() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setConstantSize(final boolean constant) {
            throw new RuntimeException("Stub!");
        }
        
        public final boolean isConstantSize() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getConstantWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getConstantHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getConstantMinimumWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getConstantMinimumHeight() {
            throw new RuntimeException("Stub!");
        }
        
        protected void computeConstantSize() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setEnterFadeDuration(final int duration) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getEnterFadeDuration() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setExitFadeDuration(final int duration) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getExitFadeDuration() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getOpacity() {
            throw new RuntimeException("Stub!");
        }
        
        public final boolean isStateful() {
            throw new RuntimeException("Stub!");
        }
        
        public void growArray(final int oldSize, final int newSize) {
            throw new RuntimeException("Stub!");
        }
        
        public synchronized boolean canConstantState() {
            throw new RuntimeException("Stub!");
        }
    }
}
