package android.transition;

import android.view.ViewGroup;

public abstract class TransitionPropagation
{
    public TransitionPropagation() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract long getStartDelay(final ViewGroup p0, final Transition p1, final TransitionValues p2, final TransitionValues p3);
    
    public abstract void captureValues(final TransitionValues p0);
    
    public abstract String[] getPropagationProperties();
}
