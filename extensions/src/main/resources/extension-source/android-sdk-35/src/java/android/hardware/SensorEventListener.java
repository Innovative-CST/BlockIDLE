package android.hardware;

public interface SensorEventListener
{
    void onSensorChanged(final SensorEvent p0);
    
    void onAccuracyChanged(final Sensor p0, final int p1);
}
