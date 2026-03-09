package android.hardware.camera2.params;

import android.graphics.PointF;

public final class TonemapCurve
{
    public static final int CHANNEL_BLUE = 2;
    public static final int CHANNEL_GREEN = 1;
    public static final int CHANNEL_RED = 0;
    public static final float LEVEL_BLACK = 0.0f;
    public static final float LEVEL_WHITE = 1.0f;
    public static final int POINT_SIZE = 2;
    
    public TonemapCurve(final float[] red, final float[] green, final float[] blue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPointCount(final int colorChannel) {
        throw new RuntimeException("Stub!");
    }
    
    public PointF getPoint(final int colorChannel, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void copyColorCurve(final int colorChannel, final float[] destination, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
