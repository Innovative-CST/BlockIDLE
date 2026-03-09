package android.opengl;

import javax.microedition.khronos.egl.EGL;
import java.io.Writer;
import javax.microedition.khronos.opengles.GL;

public class GLDebugHelper
{
    public static final int CONFIG_CHECK_GL_ERROR = 1;
    public static final int CONFIG_CHECK_THREAD = 2;
    public static final int CONFIG_LOG_ARGUMENT_NAMES = 4;
    public static final int ERROR_WRONG_THREAD = 28672;
    
    public GLDebugHelper() {
        throw new RuntimeException("Stub!");
    }
    
    public static GL wrap(final GL gl, final int configFlags, final Writer log) {
        throw new RuntimeException("Stub!");
    }
    
    public static EGL wrap(final EGL egl, final int configFlags, final Writer log) {
        throw new RuntimeException("Stub!");
    }
}
