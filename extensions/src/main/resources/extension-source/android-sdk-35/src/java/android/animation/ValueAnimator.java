package android.animation;

public class ValueAnimator extends Animator
{
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    
    public ValueAnimator() {
        throw new RuntimeException("Stub!");
    }
    
    public static float getDurationScale() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean registerDurationScaleChangeListener(@NonNull final DurationScaleChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean unregisterDurationScaleChangeListener(@NonNull final DurationScaleChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean areAnimatorsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueAnimator ofInt(final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueAnimator ofArgb(final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueAnimator ofFloat(final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueAnimator ofPropertyValuesHolder(final PropertyValuesHolder... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueAnimator ofObject(final TypeEvaluator evaluator, final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntValues(final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatValues(final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setObjectValues(final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValues(final PropertyValuesHolder... values) {
        throw new RuntimeException("Stub!");
    }
    
    public PropertyValuesHolder[] getValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ValueAnimator setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTotalDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrentPlayTime(final long playTime) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrentFraction(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public long getCurrentPlayTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getStartDelay() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStartDelay(final long startDelay) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getFrameDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setFrameDelay(final long frameDelay) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getAnimatedValue() {
        throw new RuntimeException("Stub!");
    }
    
    public Object getAnimatedValue(final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatCount(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatMode(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void addUpdateListener(final AnimatorUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllUpdateListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeUpdateListener(final AnimatorUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setInterpolator(final TimeInterpolator value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeInterpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEvaluator(final TypeEvaluator value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void end() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void resume() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void pause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public void reverse() {
        throw new RuntimeException("Stub!");
    }
    
    public float getAnimatedFraction() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ValueAnimator clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public interface DurationScaleChangeListener
    {
        void onChanged(final float p0);
    }
    
    public interface AnimatorUpdateListener
    {
        void onAnimationUpdate(@NonNull final ValueAnimator p0);
    }
}
