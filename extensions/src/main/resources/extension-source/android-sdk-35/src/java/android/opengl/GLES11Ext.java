package android.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GLES11Ext
{
    public static final int GL_3DC_XY_AMD = 34810;
    public static final int GL_3DC_X_AMD = 34809;
    public static final int GL_ATC_RGBA_EXPLICIT_ALPHA_AMD = 35987;
    public static final int GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD = 34798;
    public static final int GL_ATC_RGB_AMD = 35986;
    public static final int GL_BGRA = 32993;
    public static final int GL_BLEND_DST_ALPHA_OES = 32970;
    public static final int GL_BLEND_DST_RGB_OES = 32968;
    public static final int GL_BLEND_EQUATION_ALPHA_OES = 34877;
    public static final int GL_BLEND_EQUATION_OES = 32777;
    public static final int GL_BLEND_EQUATION_RGB_OES = 32777;
    public static final int GL_BLEND_SRC_ALPHA_OES = 32971;
    public static final int GL_BLEND_SRC_RGB_OES = 32969;
    public static final int GL_BUFFER_ACCESS_OES = 35003;
    public static final int GL_BUFFER_MAPPED_OES = 35004;
    public static final int GL_BUFFER_MAP_POINTER_OES = 35005;
    public static final int GL_COLOR_ATTACHMENT0_OES = 36064;
    public static final int GL_CURRENT_PALETTE_MATRIX_OES = 34883;
    public static final int GL_DECR_WRAP_OES = 34056;
    public static final int GL_DEPTH24_STENCIL8_OES = 35056;
    public static final int GL_DEPTH_ATTACHMENT_OES = 36096;
    public static final int GL_DEPTH_COMPONENT16_OES = 33189;
    public static final int GL_DEPTH_COMPONENT24_OES = 33190;
    public static final int GL_DEPTH_COMPONENT32_OES = 33191;
    public static final int GL_DEPTH_STENCIL_OES = 34041;
    public static final int GL_ETC1_RGB8_OES = 36196;
    public static final int GL_FIXED_OES = 5132;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 36049;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 36048;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 36051;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 36050;
    public static final int GL_FRAMEBUFFER_BINDING_OES = 36006;
    public static final int GL_FRAMEBUFFER_COMPLETE_OES = 36053;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 36054;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 36057;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 36058;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 36055;
    public static final int GL_FRAMEBUFFER_OES = 36160;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED_OES = 36061;
    public static final int GL_FUNC_ADD_OES = 32774;
    public static final int GL_FUNC_REVERSE_SUBTRACT_OES = 32779;
    public static final int GL_FUNC_SUBTRACT_OES = 32778;
    public static final int GL_INCR_WRAP_OES = 34055;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION_OES = 1286;
    public static final int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 35742;
    public static final int GL_MATRIX_INDEX_ARRAY_OES = 34884;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_OES = 34889;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_OES = 34886;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 34888;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_OES = 34887;
    public static final int GL_MATRIX_PALETTE_OES = 34880;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE_OES = 34076;
    public static final int GL_MAX_PALETTE_MATRICES_OES = 34882;
    public static final int GL_MAX_RENDERBUFFER_SIZE_OES = 34024;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 34047;
    public static final int GL_MAX_VERTEX_UNITS_OES = 34468;
    public static final int GL_MIRRORED_REPEAT_OES = 33648;
    public static final int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES = 35213;
    public static final int GL_NONE_OES = 0;
    public static final int GL_NORMAL_MAP_OES = 34065;
    public static final int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES = 35214;
    public static final int GL_REFLECTION_MAP_OES = 34066;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE_OES = 36179;
    public static final int GL_RENDERBUFFER_BINDING_OES = 36007;
    public static final int GL_RENDERBUFFER_BLUE_SIZE_OES = 36178;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE_OES = 36180;
    public static final int GL_RENDERBUFFER_GREEN_SIZE_OES = 36177;
    public static final int GL_RENDERBUFFER_HEIGHT_OES = 36163;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 36164;
    public static final int GL_RENDERBUFFER_OES = 36161;
    public static final int GL_RENDERBUFFER_RED_SIZE_OES = 36176;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE_OES = 36181;
    public static final int GL_RENDERBUFFER_WIDTH_OES = 36162;
    public static final int GL_REQUIRED_TEXTURE_IMAGE_UNITS_OES = 36200;
    public static final int GL_RGB565_OES = 36194;
    public static final int GL_RGB5_A1_OES = 32855;
    public static final int GL_RGB8_OES = 32849;
    public static final int GL_RGBA4_OES = 32854;
    public static final int GL_RGBA8_OES = 32856;
    public static final int GL_SAMPLER_EXTERNAL_OES = 36198;
    public static final int GL_STENCIL_ATTACHMENT_OES = 36128;
    public static final int GL_STENCIL_INDEX1_OES = 36166;
    public static final int GL_STENCIL_INDEX4_OES = 36167;
    public static final int GL_STENCIL_INDEX8_OES = 36168;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_OES = 34068;
    public static final int GL_TEXTURE_BINDING_EXTERNAL_OES = 36199;
    public static final int GL_TEXTURE_CROP_RECT_OES = 35741;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_OES = 34070;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_OES = 34072;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_OES = 34074;
    public static final int GL_TEXTURE_CUBE_MAP_OES = 34067;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X_OES = 34069;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_OES = 34071;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_OES = 34073;
    public static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    public static final int GL_TEXTURE_GEN_MODE_OES = 9472;
    public static final int GL_TEXTURE_GEN_STR_OES = 36192;
    public static final int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES = 35215;
    public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 34046;
    public static final int GL_UNSIGNED_INT_24_8_OES = 34042;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 34974;
    public static final int GL_WEIGHT_ARRAY_OES = 34477;
    public static final int GL_WEIGHT_ARRAY_POINTER_OES = 34476;
    public static final int GL_WEIGHT_ARRAY_SIZE_OES = 34475;
    public static final int GL_WEIGHT_ARRAY_STRIDE_OES = 34474;
    public static final int GL_WEIGHT_ARRAY_TYPE_OES = 34473;
    public static final int GL_WRITE_ONLY_OES = 35001;
    
    public GLES11Ext() {
        throw new RuntimeException("Stub!");
    }
    
    public static native void glBlendEquationSeparateOES(final int p0, final int p1);
    
    public static native void glBlendFuncSeparateOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glBlendEquationOES(final int p0);
    
    public static native void glDrawTexsOES(final short p0, final short p1, final short p2, final short p3, final short p4);
    
    public static native void glDrawTexiOES(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glDrawTexxOES(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glDrawTexsvOES(final short[] p0, final int p1);
    
    public static native void glDrawTexsvOES(final ShortBuffer p0);
    
    public static native void glDrawTexivOES(final int[] p0, final int p1);
    
    public static native void glDrawTexivOES(final IntBuffer p0);
    
    public static native void glDrawTexxvOES(final int[] p0, final int p1);
    
    public static native void glDrawTexxvOES(final IntBuffer p0);
    
    public static native void glDrawTexfOES(final float p0, final float p1, final float p2, final float p3, final float p4);
    
    public static native void glDrawTexfvOES(final float[] p0, final int p1);
    
    public static native void glDrawTexfvOES(final FloatBuffer p0);
    
    public static native void glEGLImageTargetTexture2DOES(final int p0, final Buffer p1);
    
    public static native void glEGLImageTargetRenderbufferStorageOES(final int p0, final Buffer p1);
    
    public static native void glAlphaFuncxOES(final int p0, final int p1);
    
    public static native void glClearColorxOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glClearDepthxOES(final int p0);
    
    public static native void glClipPlanexOES(final int p0, final int[] p1, final int p2);
    
    public static native void glClipPlanexOES(final int p0, final IntBuffer p1);
    
    public static native void glColor4xOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glDepthRangexOES(final int p0, final int p1);
    
    public static native void glFogxOES(final int p0, final int p1);
    
    public static native void glFogxvOES(final int p0, final int[] p1, final int p2);
    
    public static native void glFogxvOES(final int p0, final IntBuffer p1);
    
    public static native void glFrustumxOES(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public static native void glGetClipPlanexOES(final int p0, final int[] p1, final int p2);
    
    public static native void glGetClipPlanexOES(final int p0, final IntBuffer p1);
    
    public static native void glGetFixedvOES(final int p0, final int[] p1, final int p2);
    
    public static native void glGetFixedvOES(final int p0, final IntBuffer p1);
    
    public static native void glGetLightxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetLightxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetMaterialxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetMaterialxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetTexEnvxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetTexEnvxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetTexParameterxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetTexParameterxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glLightModelxOES(final int p0, final int p1);
    
    public static native void glLightModelxvOES(final int p0, final int[] p1, final int p2);
    
    public static native void glLightModelxvOES(final int p0, final IntBuffer p1);
    
    public static native void glLightxOES(final int p0, final int p1, final int p2);
    
    public static native void glLightxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glLightxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glLineWidthxOES(final int p0);
    
    public static native void glLoadMatrixxOES(final int[] p0, final int p1);
    
    public static native void glLoadMatrixxOES(final IntBuffer p0);
    
    public static native void glMaterialxOES(final int p0, final int p1, final int p2);
    
    public static native void glMaterialxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glMaterialxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glMultMatrixxOES(final int[] p0, final int p1);
    
    public static native void glMultMatrixxOES(final IntBuffer p0);
    
    public static native void glMultiTexCoord4xOES(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glNormal3xOES(final int p0, final int p1, final int p2);
    
    public static native void glOrthoxOES(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public static native void glPointParameterxOES(final int p0, final int p1);
    
    public static native void glPointParameterxvOES(final int p0, final int[] p1, final int p2);
    
    public static native void glPointParameterxvOES(final int p0, final IntBuffer p1);
    
    public static native void glPointSizexOES(final int p0);
    
    public static native void glPolygonOffsetxOES(final int p0, final int p1);
    
    public static native void glRotatexOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glSampleCoveragexOES(final int p0, final boolean p1);
    
    public static native void glScalexOES(final int p0, final int p1, final int p2);
    
    public static native void glTexEnvxOES(final int p0, final int p1, final int p2);
    
    public static native void glTexEnvxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glTexEnvxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glTexParameterxOES(final int p0, final int p1, final int p2);
    
    public static native void glTexParameterxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glTexParameterxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glTranslatexOES(final int p0, final int p1, final int p2);
    
    public static native boolean glIsRenderbufferOES(final int p0);
    
    public static native void glBindRenderbufferOES(final int p0, final int p1);
    
    public static native void glDeleteRenderbuffersOES(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteRenderbuffersOES(final int p0, final IntBuffer p1);
    
    public static native void glGenRenderbuffersOES(final int p0, final int[] p1, final int p2);
    
    public static native void glGenRenderbuffersOES(final int p0, final IntBuffer p1);
    
    public static native void glRenderbufferStorageOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glGetRenderbufferParameterivOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetRenderbufferParameterivOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native boolean glIsFramebufferOES(final int p0);
    
    public static native void glBindFramebufferOES(final int p0, final int p1);
    
    public static native void glDeleteFramebuffersOES(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteFramebuffersOES(final int p0, final IntBuffer p1);
    
    public static native void glGenFramebuffersOES(final int p0, final int[] p1, final int p2);
    
    public static native void glGenFramebuffersOES(final int p0, final IntBuffer p1);
    
    public static native int glCheckFramebufferStatusOES(final int p0);
    
    public static native void glFramebufferRenderbufferOES(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glFramebufferTexture2DOES(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glGetFramebufferAttachmentParameterivOES(final int p0, final int p1, final int p2, final int[] p3, final int p4);
    
    public static native void glGetFramebufferAttachmentParameterivOES(final int p0, final int p1, final int p2, final IntBuffer p3);
    
    public static native void glGenerateMipmapOES(final int p0);
    
    public static native void glCurrentPaletteMatrixOES(final int p0);
    
    public static native void glLoadPaletteFromModelViewMatrixOES();
    
    public static void glMatrixIndexPointerOES(final int size, final int type, final int stride, final Buffer pointer) {
        throw new RuntimeException("Stub!");
    }
    
    public static void glWeightPointerOES(final int size, final int type, final int stride, final Buffer pointer) {
        throw new RuntimeException("Stub!");
    }
    
    public static native void glDepthRangefOES(final float p0, final float p1);
    
    public static native void glFrustumfOES(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5);
    
    public static native void glOrthofOES(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5);
    
    public static native void glClipPlanefOES(final int p0, final float[] p1, final int p2);
    
    public static native void glClipPlanefOES(final int p0, final FloatBuffer p1);
    
    public static native void glGetClipPlanefOES(final int p0, final float[] p1, final int p2);
    
    public static native void glGetClipPlanefOES(final int p0, final FloatBuffer p1);
    
    public static native void glClearDepthfOES(final float p0);
    
    public static native void glTexGenfOES(final int p0, final int p1, final float p2);
    
    public static native void glTexGenfvOES(final int p0, final int p1, final float[] p2, final int p3);
    
    public static native void glTexGenfvOES(final int p0, final int p1, final FloatBuffer p2);
    
    public static native void glTexGeniOES(final int p0, final int p1, final int p2);
    
    public static native void glTexGenivOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glTexGenivOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glTexGenxOES(final int p0, final int p1, final int p2);
    
    public static native void glTexGenxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glTexGenxvOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetTexGenfvOES(final int p0, final int p1, final float[] p2, final int p3);
    
    public static native void glGetTexGenfvOES(final int p0, final int p1, final FloatBuffer p2);
    
    public static native void glGetTexGenivOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetTexGenivOES(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetTexGenxvOES(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetTexGenxvOES(final int p0, final int p1, final IntBuffer p2);
}
