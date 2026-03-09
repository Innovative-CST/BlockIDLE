package android.widget;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class Magnifier
{
    public static final int SOURCE_BOUND_MAX_IN_SURFACE = 0;
    public static final int SOURCE_BOUND_MAX_VISIBLE = 1;
    
    @Deprecated
    public Magnifier(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void show(final float sourceCenterX, final float sourceCenterY) {
        throw new RuntimeException("Stub!");
    }
    
    public void show(final float sourceCenterX, final float sourceCenterY, final float magnifierCenterX, final float magnifierCenterY) {
        throw new RuntimeException("Stub!");
    }
    
    public void dismiss() {
        throw new RuntimeException("Stub!");
    }
    
    public void update() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setZoom(final float zoom) {
        throw new RuntimeException("Stub!");
    }
    
    public float getZoom() {
        throw new RuntimeException("Stub!");
    }
    
    public float getElevation() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCornerRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultHorizontalSourceToMagnifierOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultVerticalSourceToMagnifierOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getOverlay() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClippingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Point getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Point getSourcePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final View view) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInitialZoom(final float zoom) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setElevation(final float elevation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCornerRadius(final float cornerRadius) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOverlay(@Nullable final Drawable overlay) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDefaultSourceToMagnifierOffset(final int horizontalOffset, final int verticalOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClippingEnabled(final boolean clip) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSourceBounds(final int left, final int top, final int right, final int bottom) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Magnifier build() {
            throw new RuntimeException("Stub!");
        }
    }
}
