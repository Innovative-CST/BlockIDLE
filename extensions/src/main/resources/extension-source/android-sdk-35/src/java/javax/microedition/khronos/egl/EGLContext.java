package javax.microedition.khronos.egl;

import javax.microedition.khronos.opengles.GL;

public abstract class EGLContext
{
    public EGLContext() {
        throw new RuntimeException("Stub!");
    }
    
    public static EGL getEGL() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract GL getGL();
}
