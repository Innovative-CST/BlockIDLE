package android.hardware.camera2.params;

public final class LensShadingMap
{
    public static final float MINIMUM_GAIN_FACTOR = 1.0f;
    
    LensShadingMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRowCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGainFactorCount() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGainFactor(final int colorChannel, final int column, final int row) {
        throw new RuntimeException("Stub!");
    }
    
    public RggbChannelVector getGainFactorVector(final int column, final int row) {
        throw new RuntimeException("Stub!");
    }
    
    public void copyGainFactors(final float[] destination, final int offset) {
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
