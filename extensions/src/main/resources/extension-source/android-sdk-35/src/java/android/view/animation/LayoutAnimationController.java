package android.view.animation;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Random;

public class LayoutAnimationController
{
    public static final int ORDER_NORMAL = 0;
    public static final int ORDER_RANDOM = 2;
    public static final int ORDER_REVERSE = 1;
    protected Animation mAnimation;
    protected Interpolator mInterpolator;
    protected Random mRandomizer;
    
    public LayoutAnimationController(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutAnimationController(final Animation animation) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutAnimationController(final Animation animation, final float delay) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrder() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrder(final int order) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimation(final Context context, final int resourceID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimation(final Animation animation) {
        throw new RuntimeException("Stub!");
    }
    
    public Animation getAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Context context, final int resourceID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Interpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public Interpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public float getDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDelay(final float delay) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean willOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public final Animation getAnimationForView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDone() {
        throw new RuntimeException("Stub!");
    }
    
    protected long getDelayForView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    protected int getTransformedIndex(final AnimationParameters params) {
        throw new RuntimeException("Stub!");
    }
    
    public static class AnimationParameters
    {
        public int count;
        public int index;
        
        public AnimationParameters() {
            throw new RuntimeException("Stub!");
        }
    }
}
