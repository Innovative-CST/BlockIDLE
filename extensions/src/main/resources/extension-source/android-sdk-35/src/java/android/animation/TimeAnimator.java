package android.animation;

public class TimeAnimator extends ValueAnimator
{
    public TimeAnimator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setCurrentPlayTime(final long playTime) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeListener(final TimeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface TimeListener
    {
        void onTimeUpdate(final TimeAnimator p0, final long p1, final long p2);
    }
}
