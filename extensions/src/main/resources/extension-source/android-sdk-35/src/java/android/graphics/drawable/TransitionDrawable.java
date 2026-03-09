package android.graphics.drawable;

import android.graphics.Canvas;

public class TransitionDrawable extends LayerDrawable implements Callback
{
    public TransitionDrawable(final Drawable[] layers) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void startTransition(final int durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void reverseTransition(final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCrossFadeEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCrossFadeEnabled() {
        throw new RuntimeException("Stub!");
    }
}
