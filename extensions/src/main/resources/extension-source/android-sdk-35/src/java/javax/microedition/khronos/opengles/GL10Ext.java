package javax.microedition.khronos.opengles;

import java.nio.IntBuffer;

public interface GL10Ext extends GL
{
    int glQueryMatrixxOES(final int[] p0, final int p1, final int[] p2, final int p3);
    
    int glQueryMatrixxOES(final IntBuffer p0, final IntBuffer p1);
}
