package android.animation;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;

public class LayoutTransition
{
    public static final int APPEARING = 2;
    public static final int CHANGE_APPEARING = 0;
    public static final int CHANGE_DISAPPEARING = 1;
    public static final int CHANGING = 4;
    public static final int DISAPPEARING = 3;
    
    public LayoutTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableTransitionType(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableTransitionType(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTransitionTypeEnabled(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartDelay(final int transitionType, final long delay) {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartDelay(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDuration(final int transitionType, final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDuration(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStagger(final int transitionType, final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    public long getStagger(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final int transitionType, final TimeInterpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeInterpolator getInterpolator(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimator(final int transitionType, final Animator animator) {
        throw new RuntimeException("Stub!");
    }
    
    public Animator getAnimator(final int transitionType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimateParentHierarchy(final boolean animateParentHierarchy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChangingLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }
    
    public void addChild(final ViewGroup parent, final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showChild(final ViewGroup parent, final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public void showChild(final ViewGroup parent, final View child, final int oldVisibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeChild(final ViewGroup parent, final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void hideChild(final ViewGroup parent, final View child) {
        throw new RuntimeException("Stub!");
    }
    
    public void hideChild(final ViewGroup parent, final View child, final int newVisibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTransitionListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTransitionListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public List<TransitionListener> getTransitionListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public interface TransitionListener
    {
        void startTransition(final LayoutTransition p0, final ViewGroup p1, final View p2, final int p3);
        
        void endTransition(final LayoutTransition p0, final ViewGroup p1, final View p2, final int p3);
    }
}
