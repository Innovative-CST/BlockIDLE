package android.view;

import android.content.Context;

public abstract class OrientationEventListener
{
    public static final int ORIENTATION_UNKNOWN = -1;
    
    public OrientationEventListener(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public OrientationEventListener(final Context context, final int rate) {
        throw new RuntimeException("Stub!");
    }
    
    public void enable() {
        throw new RuntimeException("Stub!");
    }
    
    public void disable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canDetectOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onOrientationChanged(final int p0);
}
