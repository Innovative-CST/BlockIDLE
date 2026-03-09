package android.hardware;

public abstract class TriggerEventListener
{
    public TriggerEventListener() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onTrigger(final TriggerEvent p0);
}
