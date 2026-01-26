package android.os;

public abstract class CountDownTimer
{
    public CountDownTimer(final long millisInFuture, final long countDownInterval) {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized CountDownTimer start() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onTick(final long p0);
    
    public abstract void onFinish();
}
