package android.graphics.drawable;

public interface Animatable2 extends Animatable
{
    void registerAnimationCallback(@NonNull final AnimationCallback p0);
    
    boolean unregisterAnimationCallback(@NonNull final AnimationCallback p0);
    
    void clearAnimationCallbacks();
    
    public abstract static class AnimationCallback
    {
        public AnimationCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onAnimationStart(final Drawable drawable) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAnimationEnd(final Drawable drawable) {
            throw new RuntimeException("Stub!");
        }
    }
}
