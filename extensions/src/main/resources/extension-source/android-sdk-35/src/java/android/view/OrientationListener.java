package android.view;

import android.content.Context;
import android.hardware.SensorListener;

@Deprecated
public abstract class OrientationListener implements SensorListener
{
    @Deprecated
    public static final int ORIENTATION_UNKNOWN = -1;
    
    @Deprecated
    public OrientationListener(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public OrientationListener(final Context context, final int rate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void enable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void disable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onAccuracyChanged(final int sensor, final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onSensorChanged(final int sensor, final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void onOrientationChanged(final int p0);
}
