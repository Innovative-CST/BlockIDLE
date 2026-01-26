package android.transition;

import android.animation.Animator;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public class ChangeBounds extends Transition
{
    public ChangeBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public ChangeBounds(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getTransitionProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public void setResizeClip(final boolean resizeClip) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getResizeClip() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setReparent(final boolean reparent) {
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
    
    @Nullable
    @Override
    public Animator createAnimator(@NonNull final ViewGroup sceneRoot, @Nullable final TransitionValues startValues, @Nullable final TransitionValues endValues) {
        throw new RuntimeException("Stub!");
    }
}
