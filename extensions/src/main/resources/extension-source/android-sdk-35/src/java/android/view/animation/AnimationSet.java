package android.view.animation;

import java.util.List;
import android.util.AttributeSet;
import android.content.Context;

public class AnimationSet extends Animation
{
    public AnimationSet(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public AnimationSet(final boolean shareInterpolator) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected AnimationSet clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFillAfter(final boolean fillAfter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFillBefore(final boolean fillBefore) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setRepeatMode(final int repeatMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStartOffset(final long startOffset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDuration(final long durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAnimation(final Animation a) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStartTime(final long startTimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void restrictDuration(final long durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long computeDurationHint() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getTransformation(final long currentTime, final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scaleCurrentDuration(final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void initialize(final int width, final int height, final int parentWidth, final int parentHeight) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Animation> getAnimations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean willChangeTransformationMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean willChangeBounds() {
        throw new RuntimeException("Stub!");
    }
}
