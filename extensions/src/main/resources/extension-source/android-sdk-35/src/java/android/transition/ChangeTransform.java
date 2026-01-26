package android.transition;

import android.animation.Animator;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public class ChangeTransform extends Transition
{
    public ChangeTransform() {
        throw new RuntimeException("Stub!");
    }
    
    public ChangeTransform(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getReparentWithOverlay() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReparentWithOverlay(final boolean reparentWithOverlay) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getReparent() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReparent(final boolean reparent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getTransitionProperties() {
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
