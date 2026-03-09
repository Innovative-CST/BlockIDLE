package android.hardware;

public final class TriggerEvent
{
    public Sensor sensor;
    public long timestamp;
    public final float[] values;
    
    TriggerEvent() {
        this.values = null;
        throw new RuntimeException("Stub!");
    }
}
