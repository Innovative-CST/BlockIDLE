package android.os;

public class HandlerThread extends Thread
{
    public HandlerThread(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public HandlerThread(final String name, final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onLooperPrepared() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void run() {
        throw new RuntimeException("Stub!");
    }
    
    public Looper getLooper() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean quit() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean quitSafely() {
        throw new RuntimeException("Stub!");
    }
    
    public int getThreadId() {
        throw new RuntimeException("Stub!");
    }
}
