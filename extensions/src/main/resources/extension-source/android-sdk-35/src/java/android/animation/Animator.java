package android.animation;

import java.util.ArrayList;

public abstract class Animator implements Cloneable
{
    public static final long DURATION_INFINITE = -1L;
    
    public Animator() {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void end() {
        throw new RuntimeException("Stub!");
    }
    
    public void pause() {
        throw new RuntimeException("Stub!");
    }
    
    public void resume() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPaused() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract long getStartDelay();
    
    public abstract void setStartDelay(final long p0);
    
    public abstract Animator setDuration(final long p0);
    
    public abstract long getDuration();
    
    public long getTotalDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setInterpolator(final TimeInterpolator p0);
    
    public TimeInterpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isRunning();
    
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public void addListener(final AnimatorListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeListener(final AnimatorListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<AnimatorListener> getListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void addPauseListener(final AnimatorPauseListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removePauseListener(final AnimatorPauseListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public Animator clone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setupStartValues() {
        throw new RuntimeException("Stub!");
    }
    
    public void setupEndValues() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTarget(@Nullable final Object target) {
        throw new RuntimeException("Stub!");
    }
    
    public interface AnimatorListener
    {
        default void onAnimationStart(@NonNull final Animator animation, final boolean isReverse) {
            throw new RuntimeException("Stub!");
        }
        
        default void onAnimationEnd(@NonNull final Animator animation, final boolean isReverse) {
            throw new RuntimeException("Stub!");
        }
        
        void onAnimationStart(@NonNull final Animator p0);
        
        void onAnimationEnd(@NonNull final Animator p0);
        
        void onAnimationCancel(@NonNull final Animator p0);
        
        void onAnimationRepeat(@NonNull final Animator p0);
    }
    
    public interface AnimatorPauseListener
    {
        void onAnimationPause(@NonNull final Animator p0);
        
        void onAnimationResume(@NonNull final Animator p0);
    }
}
