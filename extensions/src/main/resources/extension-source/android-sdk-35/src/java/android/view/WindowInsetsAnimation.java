package android.view;

import java.util.List;
import android.graphics.Insets;
import android.view.animation.Interpolator;

public final class WindowInsetsAnimation
{
    public WindowInsetsAnimation(final int typeMask, @Nullable final Interpolator interpolator, final long durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTypeMask() {
        throw new RuntimeException("Stub!");
    }
    
    public float getFraction() {
        throw new RuntimeException("Stub!");
    }
    
    public float getInterpolatedFraction() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Interpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFraction(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Bounds
    {
        public Bounds(@NonNull final Insets lowerBound, @NonNull final Insets upperBound) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Insets getLowerBound() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Insets getUpperBound() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bounds inset(@NonNull final Insets insets) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Callback
    {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        
        public Callback(final int dispatchMode) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getDispatchMode() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPrepare(@NonNull final WindowInsetsAnimation animation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bounds onStart(@NonNull final WindowInsetsAnimation animation, @NonNull final Bounds bounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract WindowInsets onProgress(@NonNull final WindowInsets p0, @NonNull final List<WindowInsetsAnimation> p1);
        
        public void onEnd(@NonNull final WindowInsetsAnimation animation) {
            throw new RuntimeException("Stub!");
        }
    }
}
