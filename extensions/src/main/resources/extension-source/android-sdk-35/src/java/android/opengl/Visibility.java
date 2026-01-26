package android.opengl;

public class Visibility
{
    public Visibility() {
        throw new RuntimeException("Stub!");
    }
    
    public static native int visibilityTest(final float[] p0, final int p1, final float[] p2, final int p3, final char[] p4, final int p5, final int p6);
    
    public static native int frustumCullSpheres(final float[] p0, final int p1, final float[] p2, final int p3, final int p4, final int[] p5, final int p6, final int p7);
    
    public static native void computeBoundingSphere(final float[] p0, final int p1, final int p2, final float[] p3, final int p4);
}
