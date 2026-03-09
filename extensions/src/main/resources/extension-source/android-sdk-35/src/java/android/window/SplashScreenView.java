package android.window;

import android.view.View;
import java.time.Instant;
import java.time.Duration;
import android.content.Context;
import android.widget.FrameLayout;

public final class SplashScreenView extends FrameLayout
{
    SplashScreenView() {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Duration getIconAnimationDuration() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getIconAnimationStart() {
        throw new RuntimeException("Stub!");
    }
    
    public void remove() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public View getIconView() {
        throw new RuntimeException("Stub!");
    }
}
