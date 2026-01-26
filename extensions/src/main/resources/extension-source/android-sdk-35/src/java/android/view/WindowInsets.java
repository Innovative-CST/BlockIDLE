package android.view;

import android.util.Size;
import android.graphics.Rect;
import java.util.List;
import android.graphics.Insets;

public final class WindowInsets
{
    @NonNull
    public static final WindowInsets CONSUMED;
    
    public WindowInsets(final WindowInsets src) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Insets getSystemWindowInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Insets getInsets(final int typeMask) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Insets getInsetsIgnoringVisibility(final int typeMask) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVisible(final int typeMask) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSystemWindowInsetLeft() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSystemWindowInsetTop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSystemWindowInsetRight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSystemWindowInsetBottom() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasSystemWindowInsets() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Rect> getBoundingRects(final int typeMask) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Rect> getBoundingRectsIgnoringVisibility(final int typeMask) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public DisplayCutout getDisplayCutout() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RoundedCorner getRoundedCorner(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getPrivacyIndicatorBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public DisplayShape getDisplayShape() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public WindowInsets consumeDisplayCutout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConsumed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRound() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public WindowInsets consumeSystemWindowInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public WindowInsets replaceSystemWindowInsets(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public WindowInsets replaceSystemWindowInsets(final Rect systemWindowInsets) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Insets getStableInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStableInsetTop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStableInsetLeft() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStableInsetRight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStableInsetBottom() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasStableInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Insets getSystemGestureInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Insets getMandatorySystemGestureInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Insets getTappableElementInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public WindowInsets consumeStableInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WindowInsets inset(@NonNull final Insets insets) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WindowInsets inset(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Size getFrame() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CONSUMED = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final WindowInsets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setSystemWindowInsets(@NonNull final Insets systemWindowInsets) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setSystemGestureInsets(@NonNull final Insets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setMandatorySystemGestureInsets(@NonNull final Insets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setTappableElementInsets(@NonNull final Insets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInsets(final int typeMask, @NonNull final Insets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInsetsIgnoringVisibility(final int typeMask, @NonNull final Insets insets) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVisible(final int typeMask, final boolean visible) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setStableInsets(@NonNull final Insets stableInsets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayCutout(@Nullable final DisplayCutout displayCutout) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRoundedCorner(final int position, @Nullable final RoundedCorner roundedCorner) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPrivacyIndicatorBounds(@Nullable final Rect bounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayShape(@NonNull final DisplayShape displayShape) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRects(final int typeMask, @NonNull final List<Rect> rects) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRectsIgnoringVisibility(final int typeMask, @NonNull final List<Rect> rects) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFrame(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WindowInsets build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Side
    {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;
        
        Side() {
            throw new RuntimeException("Stub!");
        }
        
        public static int all() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Type
    {
        Type() {
            throw new RuntimeException("Stub!");
        }
        
        public static int statusBars() {
            throw new RuntimeException("Stub!");
        }
        
        public static int navigationBars() {
            throw new RuntimeException("Stub!");
        }
        
        public static int captionBar() {
            throw new RuntimeException("Stub!");
        }
        
        public static int ime() {
            throw new RuntimeException("Stub!");
        }
        
        public static int systemGestures() {
            throw new RuntimeException("Stub!");
        }
        
        public static int mandatorySystemGestures() {
            throw new RuntimeException("Stub!");
        }
        
        public static int tappableElement() {
            throw new RuntimeException("Stub!");
        }
        
        public static int displayCutout() {
            throw new RuntimeException("Stub!");
        }
        
        public static int systemOverlays() {
            throw new RuntimeException("Stub!");
        }
        
        public static int systemBars() {
            throw new RuntimeException("Stub!");
        }
    }
}
