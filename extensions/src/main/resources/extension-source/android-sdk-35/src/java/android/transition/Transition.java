package android.transition;

import android.graphics.Rect;
import java.util.List;
import android.view.View;
import android.animation.Animator;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import android.util.AttributeSet;
import android.content.Context;

public abstract class Transition implements Cloneable
{
    public static final int MATCH_ID = 3;
    public static final int MATCH_INSTANCE = 1;
    public static final int MATCH_ITEM_ID = 4;
    public static final int MATCH_NAME = 2;
    
    public Transition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition setStartDelay(final long startDelay) {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition setInterpolator(final TimeInterpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeInterpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getTransitionProperties() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Animator createAnimator(@NonNull final ViewGroup sceneRoot, @Nullable final TransitionValues startValues, @Nullable final TransitionValues endValues) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMatchOrder(final int... matches) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void captureStartValues(final TransitionValues p0);
    
    public abstract void captureEndValues(final TransitionValues p0);
    
    public Transition addTarget(final int targetId) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition addTarget(final String targetName) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition addTarget(final Class targetType) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition removeTarget(final int targetId) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition removeTarget(final String targetName) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeTarget(final int targetId, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeTarget(final String targetName, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeChildren(final int targetId, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeTarget(final View target, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeChildren(final View target, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeTarget(final Class type, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition excludeChildren(final Class type, final boolean exclude) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition addTarget(final View target) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition removeTarget(final View target) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition removeTarget(final Class target) {
        throw new RuntimeException("Stub!");
    }
    
    public List<Integer> getTargetIds() {
        throw new RuntimeException("Stub!");
    }
    
    public List<View> getTargets() {
        throw new RuntimeException("Stub!");
    }
    
    public List<String> getTargetNames() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Class> getTargetTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionValues getTransitionValues(final View view, final boolean start) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTransitionRequired(@Nullable final TransitionValues startValues, @Nullable final TransitionValues endValues) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition addListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition removeListener(final TransitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEpicenterCallback(final EpicenterCallback epicenterCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public EpicenterCallback getEpicenterCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public Rect getEpicenter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPathMotion(final PathMotion pathMotion) {
        throw new RuntimeException("Stub!");
    }
    
    public PathMotion getPathMotion() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPropagation(final TransitionPropagation transitionPropagation) {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionPropagation getPropagation() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canRemoveViews() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition clone() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class EpicenterCallback
    {
        public EpicenterCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract Rect onGetEpicenter(final Transition p0);
    }
    
    public interface TransitionListener
    {
        void onTransitionStart(final Transition p0);
        
        void onTransitionEnd(final Transition p0);
        
        void onTransitionCancel(final Transition p0);
        
        void onTransitionPause(final Transition p0);
        
        void onTransitionResume(final Transition p0);
    }
}
