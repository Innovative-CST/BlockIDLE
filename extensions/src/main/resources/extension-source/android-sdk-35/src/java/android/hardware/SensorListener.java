package android.hardware;

@Deprecated
public interface SensorListener
{
    @Deprecated
    void onSensorChanged(final int p0, final float[] p1);
    
    @Deprecated
    void onAccuracyChanged(final int p0, final int p1);
}
