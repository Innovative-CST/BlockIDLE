package android.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public class Slide extends Visibility
{
    public Slide() {
        throw new RuntimeException("Stub!");
    }
    
    public Slide(final int slideEdge) {
        throw new RuntimeException("Stub!");
    }
    
    public Slide(final Context context, final AttributeSet attrs) {
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
    
    public void setSlideEdge(final int slideEdge) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSlideEdge() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Animator onAppear(final ViewGroup sceneRoot, final View view, final TransitionValues startValues, final TransitionValues endValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Animator onDisappear(final ViewGroup sceneRoot, final View view, final TransitionValues startValues, final TransitionValues endValues) {
        throw new RuntimeException("Stub!");
    }
}
