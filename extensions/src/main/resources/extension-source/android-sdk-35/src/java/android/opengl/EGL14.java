package android.opengl;

public class EGL14
{
    public static final int EGL_ALPHA_MASK_SIZE = 12350;
    public static final int EGL_ALPHA_SIZE = 12321;
    public static final int EGL_BACK_BUFFER = 12420;
    public static final int EGL_BAD_ACCESS = 12290;
    public static final int EGL_BAD_ALLOC = 12291;
    public static final int EGL_BAD_ATTRIBUTE = 12292;
    public static final int EGL_BAD_CONFIG = 12293;
    public static final int EGL_BAD_CONTEXT = 12294;
    public static final int EGL_BAD_CURRENT_SURFACE = 12295;
    public static final int EGL_BAD_DISPLAY = 12296;
    public static final int EGL_BAD_MATCH = 12297;
    public static final int EGL_BAD_NATIVE_PIXMAP = 12298;
    public static final int EGL_BAD_NATIVE_WINDOW = 12299;
    public static final int EGL_BAD_PARAMETER = 12300;
    public static final int EGL_BAD_SURFACE = 12301;
    public static final int EGL_BIND_TO_TEXTURE_RGB = 12345;
    public static final int EGL_BIND_TO_TEXTURE_RGBA = 12346;
    public static final int EGL_BLUE_SIZE = 12322;
    public static final int EGL_BUFFER_DESTROYED = 12437;
    public static final int EGL_BUFFER_PRESERVED = 12436;
    public static final int EGL_BUFFER_SIZE = 12320;
    public static final int EGL_CLIENT_APIS = 12429;
    public static final int EGL_COLOR_BUFFER_TYPE = 12351;
    public static final int EGL_CONFIG_CAVEAT = 12327;
    public static final int EGL_CONFIG_ID = 12328;
    public static final int EGL_CONFORMANT = 12354;
    public static final int EGL_CONTEXT_CLIENT_TYPE = 12439;
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final int EGL_CONTEXT_LOST = 12302;
    public static final int EGL_CORE_NATIVE_ENGINE = 12379;
    public static final int EGL_DEFAULT_DISPLAY = 0;
    public static final int EGL_DEPTH_SIZE = 12325;
    public static final int EGL_DISPLAY_SCALING = 10000;
    public static final int EGL_DRAW = 12377;
    public static final int EGL_EXTENSIONS = 12373;
    public static final int EGL_FALSE = 0;
    public static final int EGL_GREEN_SIZE = 12323;
    public static final int EGL_HEIGHT = 12374;
    public static final int EGL_HORIZONTAL_RESOLUTION = 12432;
    public static final int EGL_LARGEST_PBUFFER = 12376;
    public static final int EGL_LEVEL = 12329;
    public static final int EGL_LUMINANCE_BUFFER = 12431;
    public static final int EGL_LUMINANCE_SIZE = 12349;
    public static final int EGL_MATCH_NATIVE_PIXMAP = 12353;
    public static final int EGL_MAX_PBUFFER_HEIGHT = 12330;
    public static final int EGL_MAX_PBUFFER_PIXELS = 12331;
    public static final int EGL_MAX_PBUFFER_WIDTH = 12332;
    public static final int EGL_MAX_SWAP_INTERVAL = 12348;
    public static final int EGL_MIN_SWAP_INTERVAL = 12347;
    public static final int EGL_MIPMAP_LEVEL = 12419;
    public static final int EGL_MIPMAP_TEXTURE = 12418;
    public static final int EGL_MULTISAMPLE_RESOLVE = 12441;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX = 12443;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX_BIT = 512;
    public static final int EGL_MULTISAMPLE_RESOLVE_DEFAULT = 12442;
    public static final int EGL_NATIVE_RENDERABLE = 12333;
    public static final int EGL_NATIVE_VISUAL_ID = 12334;
    public static final int EGL_NATIVE_VISUAL_TYPE = 12335;
    public static final int EGL_NONE = 12344;
    public static final int EGL_NON_CONFORMANT_CONFIG = 12369;
    public static final int EGL_NOT_INITIALIZED = 12289;
    public static EGLContext EGL_NO_CONTEXT;
    public static EGLDisplay EGL_NO_DISPLAY;
    public static EGLSurface EGL_NO_SURFACE;
    public static final int EGL_NO_TEXTURE = 12380;
    public static final int EGL_OPENGL_API = 12450;
    public static final int EGL_OPENGL_BIT = 8;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES_API = 12448;
    public static final int EGL_OPENGL_ES_BIT = 1;
    public static final int EGL_OPENVG_API = 12449;
    public static final int EGL_OPENVG_BIT = 2;
    public static final int EGL_OPENVG_IMAGE = 12438;
    public static final int EGL_PBUFFER_BIT = 1;
    public static final int EGL_PIXEL_ASPECT_RATIO = 12434;
    public static final int EGL_PIXMAP_BIT = 2;
    public static final int EGL_READ = 12378;
    public static final int EGL_RED_SIZE = 12324;
    public static final int EGL_RENDERABLE_TYPE = 12352;
    public static final int EGL_RENDER_BUFFER = 12422;
    public static final int EGL_RGB_BUFFER = 12430;
    public static final int EGL_SAMPLES = 12337;
    public static final int EGL_SAMPLE_BUFFERS = 12338;
    public static final int EGL_SINGLE_BUFFER = 12421;
    public static final int EGL_SLOW_CONFIG = 12368;
    public static final int EGL_STENCIL_SIZE = 12326;
    public static final int EGL_SUCCESS = 12288;
    public static final int EGL_SURFACE_TYPE = 12339;
    public static final int EGL_SWAP_BEHAVIOR = 12435;
    public static final int EGL_SWAP_BEHAVIOR_PRESERVED_BIT = 1024;
    public static final int EGL_TEXTURE_2D = 12383;
    public static final int EGL_TEXTURE_FORMAT = 12416;
    public static final int EGL_TEXTURE_RGB = 12381;
    public static final int EGL_TEXTURE_RGBA = 12382;
    public static final int EGL_TEXTURE_TARGET = 12417;
    public static final int EGL_TRANSPARENT_BLUE_VALUE = 12341;
    public static final int EGL_TRANSPARENT_GREEN_VALUE = 12342;
    public static final int EGL_TRANSPARENT_RED_VALUE = 12343;
    public static final int EGL_TRANSPARENT_RGB = 12370;
    public static final int EGL_TRANSPARENT_TYPE = 12340;
    public static final int EGL_TRUE = 1;
    public static final int EGL_VENDOR = 12371;
    public static final int EGL_VERSION = 12372;
    public static final int EGL_VERTICAL_RESOLUTION = 12433;
    public static final int EGL_VG_ALPHA_FORMAT = 12424;
    public static final int EGL_VG_ALPHA_FORMAT_NONPRE = 12427;
    public static final int EGL_VG_ALPHA_FORMAT_PRE = 12428;
    public static final int EGL_VG_ALPHA_FORMAT_PRE_BIT = 64;
    public static final int EGL_VG_COLORSPACE = 12423;
    public static final int EGL_VG_COLORSPACE_LINEAR = 12426;
    public static final int EGL_VG_COLORSPACE_LINEAR_BIT = 32;
    public static final int EGL_VG_COLORSPACE_sRGB = 12425;
    public static final int EGL_WIDTH = 12375;
    public static final int EGL_WINDOW_BIT = 4;
    
    public EGL14() {
        throw new RuntimeException("Stub!");
    }
    
    public static native int eglGetError();
    
    public static native EGLDisplay eglGetDisplay(final int p0);
    
    public static native boolean eglInitialize(final EGLDisplay p0, final int[] p1, final int p2, final int[] p3, final int p4);
    
    public static native boolean eglTerminate(final EGLDisplay p0);
    
    public static native String eglQueryString(final EGLDisplay p0, final int p1);
    
    public static native boolean eglGetConfigs(final EGLDisplay p0, final EGLConfig[] p1, final int p2, final int p3, final int[] p4, final int p5);
    
    public static native boolean eglChooseConfig(final EGLDisplay p0, final int[] p1, final int p2, final EGLConfig[] p3, final int p4, final int p5, final int[] p6, final int p7);
    
    public static native boolean eglGetConfigAttrib(final EGLDisplay p0, final EGLConfig p1, final int p2, final int[] p3, final int p4);
    
    public static EGLSurface eglCreateWindowSurface(final EGLDisplay dpy, final EGLConfig config, final Object win, final int[] attrib_list, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public static native EGLSurface eglCreatePbufferSurface(final EGLDisplay p0, final EGLConfig p1, final int[] p2, final int p3);
    
    @Deprecated
    public static native EGLSurface eglCreatePixmapSurface(final EGLDisplay p0, final EGLConfig p1, final int p2, final int[] p3, final int p4);
    
    public static native boolean eglDestroySurface(final EGLDisplay p0, final EGLSurface p1);
    
    public static native boolean eglQuerySurface(final EGLDisplay p0, final EGLSurface p1, final int p2, final int[] p3, final int p4);
    
    public static native boolean eglBindAPI(final int p0);
    
    public static native int eglQueryAPI();
    
    public static native boolean eglWaitClient();
    
    public static native boolean eglReleaseThread();
    
    public static native EGLSurface eglCreatePbufferFromClientBuffer(final EGLDisplay p0, final int p1, final int p2, final EGLConfig p3, final int[] p4, final int p5);
    
    public static native boolean eglSurfaceAttrib(final EGLDisplay p0, final EGLSurface p1, final int p2, final int p3);
    
    public static native boolean eglBindTexImage(final EGLDisplay p0, final EGLSurface p1, final int p2);
    
    public static native boolean eglReleaseTexImage(final EGLDisplay p0, final EGLSurface p1, final int p2);
    
    public static native boolean eglSwapInterval(final EGLDisplay p0, final int p1);
    
    public static native EGLContext eglCreateContext(final EGLDisplay p0, final EGLConfig p1, final EGLContext p2, final int[] p3, final int p4);
    
    public static native boolean eglDestroyContext(final EGLDisplay p0, final EGLContext p1);
    
    public static native boolean eglMakeCurrent(final EGLDisplay p0, final EGLSurface p1, final EGLSurface p2, final EGLContext p3);
    
    public static native EGLContext eglGetCurrentContext();
    
    public static native EGLSurface eglGetCurrentSurface(final int p0);
    
    public static native EGLDisplay eglGetCurrentDisplay();
    
    public static native boolean eglQueryContext(final EGLDisplay p0, final EGLContext p1, final int p2, final int[] p3, final int p4);
    
    public static native boolean eglWaitGL();
    
    public static native boolean eglWaitNative(final int p0);
    
    public static native boolean eglSwapBuffers(final EGLDisplay p0, final EGLSurface p1);
    
    public static native boolean eglCopyBuffers(final EGLDisplay p0, final EGLSurface p1, final int p2);
}
