package android.view.animation;

import android.util.AttributeSet;
import android.content.Context;

public abstract class Animation implements Cloneable
{
    public static final int ABSOLUTE = 0;
    public static final int INFINITE = -1;
    public static final int RELATIVE_TO_PARENT = 2;
    public static final int RELATIVE_TO_SELF = 1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int START_ON_FIRST_FRAME = -1;
    public static final int ZORDER_BOTTOM = -1;
    public static final int ZORDER_NORMAL = 0;
    public static final int ZORDER_TOP = 1;
    
    public Animation() {
        throw new RuntimeException("Stub!");
    }
    
    public Animation(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Animation clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInitialized() {
        throw new RuntimeException("Stub!");
    }
    
    public void initialize(final int width, final int height, final int parentWidth, final int parentHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Context context, final int resID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final Interpolator i) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartOffset(final long startOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDuration(final long durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void restrictDuration(final long durationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void scaleCurrentDuration(final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartTime(final long startTimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void startNow() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatMode(final int repeatMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatCount(final int repeatCount) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFillEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillEnabled(final boolean fillEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillBefore(final boolean fillBefore) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillAfter(final boolean fillAfter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZAdjustment(final int zAdjustment) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setBackgroundColor(final int bg) {
        throw new RuntimeException("Stub!");
    }
    
    protected float getScaleFactor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDetachWallpaper(final boolean detachWallpaper) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShowBackdrop(final boolean showBackdrop) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackdropColor(final int backdropColor) {
        throw new RuntimeException("Stub!");
    }
    
    public Interpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFillBefore() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFillAfter() {
        throw new RuntimeException("Stub!");
    }
    
    public int getZAdjustment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getBackgroundColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getDetachWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getShowBackdrop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBackdropColor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean willChangeTransformationMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean willChangeBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimationListener(final AnimationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    protected void ensureInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public long computeDurationHint() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getTransformation(final long currentTime, final Transformation outTransformation) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getTransformation(final long currentTime, final Transformation outTransformation, final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasEnded() {
        throw new RuntimeException("Stub!");
    }
    
    protected void applyTransformation(final float interpolatedTime, final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    protected float resolveSize(final int type, final float value, final int size, final int parentSize) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    protected static class Description
    {
        public int type;
        public float value;
        
        protected Description() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface AnimationListener
    {
        void onAnimationStart(final Animation p0);
        
        void onAnimationEnd(final Animation p0);
        
        void onAnimationRepeat(final Animation p0);
    }
}
