package android.view;

public final class InputQueue
{
    InputQueue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        void onInputQueueCreated(final InputQueue p0);
        
        void onInputQueueDestroyed(final InputQueue p0);
    }
}
