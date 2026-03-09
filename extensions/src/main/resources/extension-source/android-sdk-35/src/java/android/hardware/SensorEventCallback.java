package android.hardware;

public abstract class SensorEventCallback implements SensorEventListener2
{
    public SensorEventCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onSensorChanged(final SensorEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onAccuracyChanged(final Sensor sensor, final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFlushCompleted(final Sensor sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSensorAdditionalInfo(final SensorAdditionalInfo info) {
        throw new RuntimeException("Stub!");
    }
}
