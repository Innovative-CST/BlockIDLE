package android.hardware.camera2.params;

public final class RggbChannelVector
{
    public static final int BLUE = 3;
    public static final int COUNT = 4;
    public static final int GREEN_EVEN = 1;
    public static final int GREEN_ODD = 2;
    public static final int RED = 0;
    
    public RggbChannelVector(final float red, final float greenEven, final float greenOdd, final float blue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRed() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGreenEven() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGreenOdd() {
        throw new RuntimeException("Stub!");
    }
    
    public float getBlue() {
        throw new RuntimeException("Stub!");
    }
    
    public float getComponent(final int colorChannel) {
        throw new RuntimeException("Stub!");
    }
    
    public void copyTo(final float[] destination, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
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
