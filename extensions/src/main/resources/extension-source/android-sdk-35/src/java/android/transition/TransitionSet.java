package android.transition;

import android.view.View;
import android.animation.TimeInterpolator;
import android.util.AttributeSet;
import android.content.Context;

public class TransitionSet extends Transition
{
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    
    public TransitionSet() {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionSet(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionSet setOrdering(final int ordering) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrdering() {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionSet addTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransitionCount() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getTransitionAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet setStartDelay(final long startDelay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet setInterpolator(final TimeInterpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet addTarget(final View target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet addTarget(final int targetId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet addTarget(final String targetName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet addTarget(final Class targetType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet addListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet removeTarget(final int targetId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet removeTarget(final View target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet removeTarget(final Class target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet removeTarget(final String target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Transition excludeTarget(final View target, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Transition excludeTarget(final String targetName, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Transition excludeTarget(final int targetId, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Transition excludeTarget(final Class type, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet removeListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setPathMotion(final PathMotion pathMotion) {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionSet removeTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void captureStartValues(final TransitionValues transitionValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void captureEndValues(final TransitionValues transitionValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setPropagation(final TransitionPropagation propagation) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEpicenterCallback(final EpicenterCallback epicenterCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TransitionSet clone() {
        throw new RuntimeException("Stub!");
    }
}
