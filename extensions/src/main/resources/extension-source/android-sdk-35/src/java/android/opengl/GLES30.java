package android.opengl;

import java.nio.LongBuffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.Buffer;

public class GLES30 extends GLES20
{
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
    public static final int GL_ALREADY_SIGNALED = 37146;
    public static final int GL_ANY_SAMPLES_PASSED = 35887;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 36202;
    public static final int GL_BLUE = 6405;
    public static final int GL_BUFFER_ACCESS_FLAGS = 37151;
    public static final int GL_BUFFER_MAPPED = 35004;
    public static final int GL_BUFFER_MAP_LENGTH = 37152;
    public static final int GL_BUFFER_MAP_OFFSET = 37153;
    public static final int GL_BUFFER_MAP_POINTER = 35005;
    public static final int GL_COLOR = 6144;
    public static final int GL_COLOR_ATTACHMENT1 = 36065;
    public static final int GL_COLOR_ATTACHMENT10 = 36074;
    public static final int GL_COLOR_ATTACHMENT11 = 36075;
    public static final int GL_COLOR_ATTACHMENT12 = 36076;
    public static final int GL_COLOR_ATTACHMENT13 = 36077;
    public static final int GL_COLOR_ATTACHMENT14 = 36078;
    public static final int GL_COLOR_ATTACHMENT15 = 36079;
    public static final int GL_COLOR_ATTACHMENT2 = 36066;
    public static final int GL_COLOR_ATTACHMENT3 = 36067;
    public static final int GL_COLOR_ATTACHMENT4 = 36068;
    public static final int GL_COLOR_ATTACHMENT5 = 36069;
    public static final int GL_COLOR_ATTACHMENT6 = 36070;
    public static final int GL_COLOR_ATTACHMENT7 = 36071;
    public static final int GL_COLOR_ATTACHMENT8 = 36072;
    public static final int GL_COLOR_ATTACHMENT9 = 36073;
    public static final int GL_COMPARE_REF_TO_TEXTURE = 34894;
    public static final int GL_COMPRESSED_R11_EAC = 37488;
    public static final int GL_COMPRESSED_RG11_EAC = 37490;
    public static final int GL_COMPRESSED_RGB8_ETC2 = 37492;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37494;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 37496;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC = 37489;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 37491;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 37497;
    public static final int GL_COMPRESSED_SRGB8_ETC2 = 37493;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37495;
    public static final int GL_CONDITION_SATISFIED = 37148;
    public static final int GL_COPY_READ_BUFFER = 36662;
    public static final int GL_COPY_READ_BUFFER_BINDING = 36662;
    public static final int GL_COPY_WRITE_BUFFER = 36663;
    public static final int GL_COPY_WRITE_BUFFER_BINDING = 36663;
    public static final int GL_CURRENT_QUERY = 34917;
    public static final int GL_DEPTH = 6145;
    public static final int GL_DEPTH24_STENCIL8 = 35056;
    public static final int GL_DEPTH32F_STENCIL8 = 36013;
    public static final int GL_DEPTH_COMPONENT24 = 33190;
    public static final int GL_DEPTH_COMPONENT32F = 36012;
    public static final int GL_DEPTH_STENCIL = 34041;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
    public static final int GL_DRAW_BUFFER0 = 34853;
    public static final int GL_DRAW_BUFFER1 = 34854;
    public static final int GL_DRAW_BUFFER10 = 34863;
    public static final int GL_DRAW_BUFFER11 = 34864;
    public static final int GL_DRAW_BUFFER12 = 34865;
    public static final int GL_DRAW_BUFFER13 = 34866;
    public static final int GL_DRAW_BUFFER14 = 34867;
    public static final int GL_DRAW_BUFFER15 = 34868;
    public static final int GL_DRAW_BUFFER2 = 34855;
    public static final int GL_DRAW_BUFFER3 = 34856;
    public static final int GL_DRAW_BUFFER4 = 34857;
    public static final int GL_DRAW_BUFFER5 = 34858;
    public static final int GL_DRAW_BUFFER6 = 34859;
    public static final int GL_DRAW_BUFFER7 = 34860;
    public static final int GL_DRAW_BUFFER8 = 34861;
    public static final int GL_DRAW_BUFFER9 = 34862;
    public static final int GL_DRAW_FRAMEBUFFER = 36009;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 36006;
    public static final int GL_DYNAMIC_COPY = 35050;
    public static final int GL_DYNAMIC_READ = 35049;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 36269;
    public static final int GL_FLOAT_MAT2x3 = 35685;
    public static final int GL_FLOAT_MAT2x4 = 35686;
    public static final int GL_FLOAT_MAT3x2 = 35687;
    public static final int GL_FLOAT_MAT3x4 = 35688;
    public static final int GL_FLOAT_MAT4x2 = 35689;
    public static final int GL_FLOAT_MAT4x3 = 35690;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
    public static final int GL_FRAMEBUFFER_DEFAULT = 33304;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 33305;
    public static final int GL_GREEN = 6404;
    public static final int GL_HALF_FLOAT = 5131;
    public static final int GL_INTERLEAVED_ATTRIBS = 35980;
    public static final int GL_INT_2_10_10_10_REV = 36255;
    public static final int GL_INT_SAMPLER_2D = 36298;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 36303;
    public static final int GL_INT_SAMPLER_3D = 36299;
    public static final int GL_INT_SAMPLER_CUBE = 36300;
    public static final int GL_INVALID_INDEX = -1;
    public static final int GL_MAJOR_VERSION = 33307;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
    public static final int GL_MAP_READ_BIT = 1;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;
    public static final int GL_MAP_WRITE_BIT = 2;
    public static final int GL_MAX = 32776;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 32883;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 35071;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 36063;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
    public static final int GL_MAX_DRAW_BUFFERS = 34852;
    public static final int GL_MAX_ELEMENTS_INDICES = 33001;
    public static final int GL_MAX_ELEMENTS_VERTICES = 33000;
    public static final int GL_MAX_ELEMENT_INDEX = 36203;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 37157;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 35077;
    public static final int GL_MAX_SAMPLES = 36183;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 34045;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 35978;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 35979;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 35968;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
    public static final int GL_MAX_VARYING_COMPONENTS = 35659;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 37154;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658;
    public static final int GL_MIN = 32775;
    public static final int GL_MINOR_VERSION = 33308;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 35076;
    public static final int GL_NUM_EXTENSIONS = 33309;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 34814;
    public static final int GL_NUM_SAMPLE_COUNTS = 37760;
    public static final int GL_OBJECT_TYPE = 37138;
    public static final int GL_PACK_ROW_LENGTH = 3330;
    public static final int GL_PACK_SKIP_PIXELS = 3332;
    public static final int GL_PACK_SKIP_ROWS = 3331;
    public static final int GL_PIXEL_PACK_BUFFER = 35051;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 35053;
    public static final int GL_PIXEL_UNPACK_BUFFER = 35052;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 35055;
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 36201;
    public static final int GL_PROGRAM_BINARY_FORMATS = 34815;
    public static final int GL_PROGRAM_BINARY_LENGTH = 34625;
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367;
    public static final int GL_QUERY_RESULT = 34918;
    public static final int GL_QUERY_RESULT_AVAILABLE = 34919;
    public static final int GL_R11F_G11F_B10F = 35898;
    public static final int GL_R16F = 33325;
    public static final int GL_R16I = 33331;
    public static final int GL_R16UI = 33332;
    public static final int GL_R32F = 33326;
    public static final int GL_R32I = 33333;
    public static final int GL_R32UI = 33334;
    public static final int GL_R8 = 33321;
    public static final int GL_R8I = 33329;
    public static final int GL_R8UI = 33330;
    public static final int GL_R8_SNORM = 36756;
    public static final int GL_RASTERIZER_DISCARD = 35977;
    public static final int GL_READ_BUFFER = 3074;
    public static final int GL_READ_FRAMEBUFFER = 36008;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 36010;
    public static final int GL_RED = 6403;
    public static final int GL_RED_INTEGER = 36244;
    public static final int GL_RENDERBUFFER_SAMPLES = 36011;
    public static final int GL_RG = 33319;
    public static final int GL_RG16F = 33327;
    public static final int GL_RG16I = 33337;
    public static final int GL_RG16UI = 33338;
    public static final int GL_RG32F = 33328;
    public static final int GL_RG32I = 33339;
    public static final int GL_RG32UI = 33340;
    public static final int GL_RG8 = 33323;
    public static final int GL_RG8I = 33335;
    public static final int GL_RG8UI = 33336;
    public static final int GL_RG8_SNORM = 36757;
    public static final int GL_RGB10_A2 = 32857;
    public static final int GL_RGB10_A2UI = 36975;
    public static final int GL_RGB16F = 34843;
    public static final int GL_RGB16I = 36233;
    public static final int GL_RGB16UI = 36215;
    public static final int GL_RGB32F = 34837;
    public static final int GL_RGB32I = 36227;
    public static final int GL_RGB32UI = 36209;
    public static final int GL_RGB8 = 32849;
    public static final int GL_RGB8I = 36239;
    public static final int GL_RGB8UI = 36221;
    public static final int GL_RGB8_SNORM = 36758;
    public static final int GL_RGB9_E5 = 35901;
    public static final int GL_RGBA16F = 34842;
    public static final int GL_RGBA16I = 36232;
    public static final int GL_RGBA16UI = 36214;
    public static final int GL_RGBA32F = 34836;
    public static final int GL_RGBA32I = 36226;
    public static final int GL_RGBA32UI = 36208;
    public static final int GL_RGBA8 = 32856;
    public static final int GL_RGBA8I = 36238;
    public static final int GL_RGBA8UI = 36220;
    public static final int GL_RGBA8_SNORM = 36759;
    public static final int GL_RGBA_INTEGER = 36249;
    public static final int GL_RGB_INTEGER = 36248;
    public static final int GL_RG_INTEGER = 33320;
    public static final int GL_SAMPLER_2D_ARRAY = 36289;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 36292;
    public static final int GL_SAMPLER_2D_SHADOW = 35682;
    public static final int GL_SAMPLER_3D = 35679;
    public static final int GL_SAMPLER_BINDING = 35097;
    public static final int GL_SAMPLER_CUBE_SHADOW = 36293;
    public static final int GL_SEPARATE_ATTRIBS = 35981;
    public static final int GL_SIGNALED = 37145;
    public static final int GL_SIGNED_NORMALIZED = 36764;
    public static final int GL_SRGB = 35904;
    public static final int GL_SRGB8 = 35905;
    public static final int GL_SRGB8_ALPHA8 = 35907;
    public static final int GL_STATIC_COPY = 35046;
    public static final int GL_STATIC_READ = 35045;
    public static final int GL_STENCIL = 6146;
    public static final int GL_STREAM_COPY = 35042;
    public static final int GL_STREAM_READ = 35041;
    public static final int GL_SYNC_CONDITION = 37139;
    public static final int GL_SYNC_FENCE = 37142;
    public static final int GL_SYNC_FLAGS = 37141;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 1;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
    public static final int GL_SYNC_STATUS = 37140;
    public static final int GL_TEXTURE_2D_ARRAY = 35866;
    public static final int GL_TEXTURE_3D = 32879;
    public static final int GL_TEXTURE_BASE_LEVEL = 33084;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 35869;
    public static final int GL_TEXTURE_BINDING_3D = 32874;
    public static final int GL_TEXTURE_COMPARE_FUNC = 34893;
    public static final int GL_TEXTURE_COMPARE_MODE = 34892;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 37167;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;
    public static final int GL_TEXTURE_MAX_LEVEL = 33085;
    public static final int GL_TEXTURE_MAX_LOD = 33083;
    public static final int GL_TEXTURE_MIN_LOD = 33082;
    public static final int GL_TEXTURE_SWIZZLE_A = 36421;
    public static final int GL_TEXTURE_SWIZZLE_B = 36420;
    public static final int GL_TEXTURE_SWIZZLE_G = 36419;
    public static final int GL_TEXTURE_SWIZZLE_R = 36418;
    public static final int GL_TEXTURE_WRAP_R = 32882;
    public static final int GL_TIMEOUT_EXPIRED = 37147;
    public static final long GL_TIMEOUT_IGNORED = -1L;
    public static final int GL_TRANSFORM_FEEDBACK = 36386;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 35982;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 35983;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 35967;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 35973;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 35972;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 36387;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 35976;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 35971;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 35958;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
    public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
    public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
    public static final int GL_UNIFORM_BUFFER = 35345;
    public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
    public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
    public static final int GL_UNIFORM_BUFFER_START = 35369;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
    public static final int GL_UNIFORM_NAME_LENGTH = 35385;
    public static final int GL_UNIFORM_OFFSET = 35387;
    public static final int GL_UNIFORM_SIZE = 35384;
    public static final int GL_UNIFORM_TYPE = 35383;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 32878;
    public static final int GL_UNPACK_ROW_LENGTH = 3314;
    public static final int GL_UNPACK_SKIP_IMAGES = 32877;
    public static final int GL_UNPACK_SKIP_PIXELS = 3316;
    public static final int GL_UNPACK_SKIP_ROWS = 3315;
    public static final int GL_UNSIGNALED = 37144;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 35899;
    public static final int GL_UNSIGNED_INT_24_8 = 34042;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 33640;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 35902;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 36306;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 36311;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 36307;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 36308;
    public static final int GL_UNSIGNED_INT_VEC2 = 36294;
    public static final int GL_UNSIGNED_INT_VEC3 = 36295;
    public static final int GL_UNSIGNED_INT_VEC4 = 36296;
    public static final int GL_UNSIGNED_NORMALIZED = 35863;
    public static final int GL_VERTEX_ARRAY_BINDING = 34229;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 35069;
    public static final int GL_WAIT_FAILED = 37149;
    
    public GLES30() {
        throw new RuntimeException("Stub!");
    }
    
    public static native void glReadBuffer(final int p0);
    
    public static native void glDrawRangeElements(final int p0, final int p1, final int p2, final int p3, final int p4, final Buffer p5);
    
    public static native void glDrawRangeElements(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public static native void glTexImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final Buffer p9);
    
    public static native void glTexImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9);
    
    public static native void glTexSubImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final Buffer p10);
    
    public static native void glTexSubImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
    
    public static native void glCopyTexSubImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8);
    
    public static native void glCompressedTexImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final Buffer p8);
    
    public static native void glCompressedTexImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8);
    
    public static native void glCompressedTexSubImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final Buffer p10);
    
    public static native void glCompressedTexSubImage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
    
    public static native void glGenQueries(final int p0, final int[] p1, final int p2);
    
    public static native void glGenQueries(final int p0, final IntBuffer p1);
    
    public static native void glDeleteQueries(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteQueries(final int p0, final IntBuffer p1);
    
    public static native boolean glIsQuery(final int p0);
    
    public static native void glBeginQuery(final int p0, final int p1);
    
    public static native void glEndQuery(final int p0);
    
    public static native void glGetQueryiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetQueryiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetQueryObjectuiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetQueryObjectuiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native boolean glUnmapBuffer(final int p0);
    
    public static native Buffer glGetBufferPointerv(final int p0, final int p1);
    
    public static native void glDrawBuffers(final int p0, final int[] p1, final int p2);
    
    public static native void glDrawBuffers(final int p0, final IntBuffer p1);
    
    public static native void glUniformMatrix2x3fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix2x3fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glUniformMatrix3x2fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix3x2fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glUniformMatrix2x4fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix2x4fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glUniformMatrix4x2fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix4x2fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glUniformMatrix3x4fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix3x4fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glUniformMatrix4x3fv(final int p0, final int p1, final boolean p2, final float[] p3, final int p4);
    
    public static native void glUniformMatrix4x3fv(final int p0, final int p1, final boolean p2, final FloatBuffer p3);
    
    public static native void glBlitFramebuffer(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9);
    
    public static native void glRenderbufferStorageMultisample(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glFramebufferTextureLayer(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native Buffer glMapBufferRange(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glFlushMappedBufferRange(final int p0, final int p1, final int p2);
    
    public static native void glBindVertexArray(final int p0);
    
    public static native void glDeleteVertexArrays(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteVertexArrays(final int p0, final IntBuffer p1);
    
    public static native void glGenVertexArrays(final int p0, final int[] p1, final int p2);
    
    public static native void glGenVertexArrays(final int p0, final IntBuffer p1);
    
    public static native boolean glIsVertexArray(final int p0);
    
    public static native void glGetIntegeri_v(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetIntegeri_v(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glBeginTransformFeedback(final int p0);
    
    public static native void glEndTransformFeedback();
    
    public static native void glBindBufferRange(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glBindBufferBase(final int p0, final int p1, final int p2);
    
    public static native void glTransformFeedbackVaryings(final int p0, final String[] p1, final int p2);
    
    public static native void glGetTransformFeedbackVarying(final int p0, final int p1, final int p2, final int[] p3, final int p4, final int[] p5, final int p6, final int[] p7, final int p8, final byte[] p9, final int p10);
    
    @Deprecated
    public static native void glGetTransformFeedbackVarying(final int p0, final int p1, final int p2, final IntBuffer p3, final IntBuffer p4, final IntBuffer p5, final byte p6);
    
    public static native void glGetTransformFeedbackVarying(final int p0, final int p1, final int p2, final IntBuffer p3, final IntBuffer p4, final IntBuffer p5, final ByteBuffer p6);
    
    public static native String glGetTransformFeedbackVarying(final int p0, final int p1, final int[] p2, final int p3, final int[] p4, final int p5);
    
    public static native String glGetTransformFeedbackVarying(final int p0, final int p1, final IntBuffer p2, final IntBuffer p3);
    
    public static void glVertexAttribIPointer(final int index, final int size, final int type, final int stride, final Buffer pointer) {
        throw new RuntimeException("Stub!");
    }
    
    public static native void glVertexAttribIPointer(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glGetVertexAttribIiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetVertexAttribIiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetVertexAttribIuiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetVertexAttribIuiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glVertexAttribI4i(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glVertexAttribI4ui(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glVertexAttribI4iv(final int p0, final int[] p1, final int p2);
    
    public static native void glVertexAttribI4iv(final int p0, final IntBuffer p1);
    
    public static native void glVertexAttribI4uiv(final int p0, final int[] p1, final int p2);
    
    public static native void glVertexAttribI4uiv(final int p0, final IntBuffer p1);
    
    public static native void glGetUniformuiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetUniformuiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native int glGetFragDataLocation(final int p0, final String p1);
    
    public static native void glUniform1ui(final int p0, final int p1);
    
    public static native void glUniform2ui(final int p0, final int p1, final int p2);
    
    public static native void glUniform3ui(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glUniform4ui(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glUniform1uiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glUniform1uiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glUniform2uiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glUniform2uiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glUniform3uiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glUniform3uiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glUniform4uiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glUniform4uiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glClearBufferiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glClearBufferiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glClearBufferuiv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glClearBufferuiv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glClearBufferfv(final int p0, final int p1, final float[] p2, final int p3);
    
    public static native void glClearBufferfv(final int p0, final int p1, final FloatBuffer p2);
    
    public static native void glClearBufferfi(final int p0, final int p1, final float p2, final int p3);
    
    public static native String glGetStringi(final int p0, final int p1);
    
    public static native void glCopyBufferSubData(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glGetUniformIndices(final int p0, final String[] p1, final int[] p2, final int p3);
    
    public static native void glGetUniformIndices(final int p0, final String[] p1, final IntBuffer p2);
    
    public static native void glGetActiveUniformsiv(final int p0, final int p1, final int[] p2, final int p3, final int p4, final int[] p5, final int p6);
    
    public static native void glGetActiveUniformsiv(final int p0, final int p1, final IntBuffer p2, final int p3, final IntBuffer p4);
    
    public static native int glGetUniformBlockIndex(final int p0, final String p1);
    
    public static native void glGetActiveUniformBlockiv(final int p0, final int p1, final int p2, final int[] p3, final int p4);
    
    public static native void glGetActiveUniformBlockiv(final int p0, final int p1, final int p2, final IntBuffer p3);
    
    public static native void glGetActiveUniformBlockName(final int p0, final int p1, final int p2, final int[] p3, final int p4, final byte[] p5, final int p6);
    
    public static native void glGetActiveUniformBlockName(final int p0, final int p1, final Buffer p2, final Buffer p3);
    
    public static native String glGetActiveUniformBlockName(final int p0, final int p1);
    
    public static native void glUniformBlockBinding(final int p0, final int p1, final int p2);
    
    public static native void glDrawArraysInstanced(final int p0, final int p1, final int p2, final int p3);
    
    public static native void glDrawElementsInstanced(final int p0, final int p1, final int p2, final Buffer p3, final int p4);
    
    public static native void glDrawElementsInstanced(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native long glFenceSync(final int p0, final int p1);
    
    public static native boolean glIsSync(final long p0);
    
    public static native void glDeleteSync(final long p0);
    
    public static native int glClientWaitSync(final long p0, final int p1, final long p2);
    
    public static native void glWaitSync(final long p0, final int p1, final long p2);
    
    public static native void glGetInteger64v(final int p0, final long[] p1, final int p2);
    
    public static native void glGetInteger64v(final int p0, final LongBuffer p1);
    
    public static native void glGetSynciv(final long p0, final int p1, final int p2, final int[] p3, final int p4, final int[] p5, final int p6);
    
    public static native void glGetSynciv(final long p0, final int p1, final int p2, final IntBuffer p3, final IntBuffer p4);
    
    public static native void glGetInteger64i_v(final int p0, final int p1, final long[] p2, final int p3);
    
    public static native void glGetInteger64i_v(final int p0, final int p1, final LongBuffer p2);
    
    public static native void glGetBufferParameteri64v(final int p0, final int p1, final long[] p2, final int p3);
    
    public static native void glGetBufferParameteri64v(final int p0, final int p1, final LongBuffer p2);
    
    public static native void glGenSamplers(final int p0, final int[] p1, final int p2);
    
    public static native void glGenSamplers(final int p0, final IntBuffer p1);
    
    public static native void glDeleteSamplers(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteSamplers(final int p0, final IntBuffer p1);
    
    public static native boolean glIsSampler(final int p0);
    
    public static native void glBindSampler(final int p0, final int p1);
    
    public static native void glSamplerParameteri(final int p0, final int p1, final int p2);
    
    public static native void glSamplerParameteriv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glSamplerParameteriv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glSamplerParameterf(final int p0, final int p1, final float p2);
    
    public static native void glSamplerParameterfv(final int p0, final int p1, final float[] p2, final int p3);
    
    public static native void glSamplerParameterfv(final int p0, final int p1, final FloatBuffer p2);
    
    public static native void glGetSamplerParameteriv(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glGetSamplerParameteriv(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glGetSamplerParameterfv(final int p0, final int p1, final float[] p2, final int p3);
    
    public static native void glGetSamplerParameterfv(final int p0, final int p1, final FloatBuffer p2);
    
    public static native void glVertexAttribDivisor(final int p0, final int p1);
    
    public static native void glBindTransformFeedback(final int p0, final int p1);
    
    public static native void glDeleteTransformFeedbacks(final int p0, final int[] p1, final int p2);
    
    public static native void glDeleteTransformFeedbacks(final int p0, final IntBuffer p1);
    
    public static native void glGenTransformFeedbacks(final int p0, final int[] p1, final int p2);
    
    public static native void glGenTransformFeedbacks(final int p0, final IntBuffer p1);
    
    public static native boolean glIsTransformFeedback(final int p0);
    
    public static native void glPauseTransformFeedback();
    
    public static native void glResumeTransformFeedback();
    
    public static native void glGetProgramBinary(final int p0, final int p1, final int[] p2, final int p3, final int[] p4, final int p5, final Buffer p6);
    
    public static native void glGetProgramBinary(final int p0, final int p1, final IntBuffer p2, final IntBuffer p3, final Buffer p4);
    
    public static native void glProgramBinary(final int p0, final int p1, final Buffer p2, final int p3);
    
    public static native void glProgramParameteri(final int p0, final int p1, final int p2);
    
    public static native void glInvalidateFramebuffer(final int p0, final int p1, final int[] p2, final int p3);
    
    public static native void glInvalidateFramebuffer(final int p0, final int p1, final IntBuffer p2);
    
    public static native void glInvalidateSubFramebuffer(final int p0, final int p1, final int[] p2, final int p3, final int p4, final int p5, final int p6, final int p7);
    
    public static native void glInvalidateSubFramebuffer(final int p0, final int p1, final IntBuffer p2, final int p3, final int p4, final int p5, final int p6);
    
    public static native void glTexStorage2D(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native void glTexStorage3D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public static native void glGetInternalformativ(final int p0, final int p1, final int p2, final int p3, final int[] p4, final int p5);
    
    public static native void glGetInternalformativ(final int p0, final int p1, final int p2, final int p3, final IntBuffer p4);
    
    public static native void glReadPixels(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
}
