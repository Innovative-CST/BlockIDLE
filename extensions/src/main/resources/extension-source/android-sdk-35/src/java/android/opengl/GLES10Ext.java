package android.opengl;

import java.nio.IntBuffer;

public class GLES10Ext
{
    public GLES10Ext() {
        throw new RuntimeException("Stub!");
    }
    
    public static native int glQueryMatrixxOES(final int[] p0, final int p1, final int[] p2, final int p3);
    
    public static native int glQueryMatrixxOES(final IntBuffer p0, final IntBuffer p1);
}
