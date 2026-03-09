package android.animation;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public final class AnimatorSet extends Animator
{
    public AnimatorSet() {
        throw new RuntimeException("Stub!");
    }
    
    public void playTogether(final Animator... items) {
        throw new RuntimeException("Stub!");
    }
    
    public void playTogether(final Collection<Animator> items) {
        throw new RuntimeException("Stub!");
    }
    
    public void playSequentially(final Animator... items) {
        throw new RuntimeException("Stub!");
    }
    
    public void playSequentially(final List<Animator> items) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<Animator> getChildAnimations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTarget(final Object target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setInterpolator(final TimeInterpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeInterpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public Builder play(final Animator anim) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void end() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getStartDelay() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStartDelay(final long startDelay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AnimatorSet setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setupStartValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setupEndValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void pause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void resume() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrentPlayTime(final long playTime) {
        throw new RuntimeException("Stub!");
    }
    
    public long getCurrentPlayTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AnimatorSet clone() {
        throw new RuntimeException("Stub!");
    }
    
    public void reverse() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTotalDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder with(final Animator anim) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder before(final Animator anim) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder after(final Animator anim) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder after(final long delay) {
            throw new RuntimeException("Stub!");
        }
    }
}
