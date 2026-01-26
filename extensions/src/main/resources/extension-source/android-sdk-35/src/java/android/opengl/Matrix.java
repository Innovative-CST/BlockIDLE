package android.opengl;

public class Matrix
{
    @Deprecated
    public Matrix() {
        throw new RuntimeException("Stub!");
    }
    
    public static void multiplyMM(final float[] result, final int resultOffset, final float[] lhs, final int lhsOffset, final float[] rhs, final int rhsOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static void multiplyMV(final float[] resultVec, final int resultVecOffset, final float[] lhsMat, final int lhsMatOffset, final float[] rhsVec, final int rhsVecOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static void transposeM(final float[] mTrans, final int mTransOffset, final float[] m, final int mOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean invertM(final float[] mInv, final int mInvOffset, final float[] m, final int mOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static void orthoM(final float[] m, final int mOffset, final float left, final float right, final float bottom, final float top, final float near, final float far) {
        throw new RuntimeException("Stub!");
    }
    
    public static void frustumM(final float[] m, final int offset, final float left, final float right, final float bottom, final float top, final float near, final float far) {
        throw new RuntimeException("Stub!");
    }
    
    public static void perspectiveM(final float[] m, final int offset, final float fovy, final float aspect, final float zNear, final float zFar) {
        throw new RuntimeException("Stub!");
    }
    
    public static float length(final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setIdentityM(final float[] sm, final int smOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static void scaleM(final float[] sm, final int smOffset, final float[] m, final int mOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void scaleM(final float[] m, final int mOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void translateM(final float[] tm, final int tmOffset, final float[] m, final int mOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void translateM(final float[] m, final int mOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void rotateM(final float[] rm, final int rmOffset, final float[] m, final int mOffset, final float a, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void rotateM(final float[] m, final int mOffset, final float a, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setRotateM(final float[] rm, final int rmOffset, final float a, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setRotateEulerM(final float[] rm, final int rmOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setRotateEulerM2(@NonNull final float[] rm, final int rmOffset, final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setLookAtM(final float[] rm, final int rmOffset, final float eyeX, final float eyeY, final float eyeZ, final float centerX, final float centerY, final float centerZ, final float upX, final float upY, final float upZ) {
        throw new RuntimeException("Stub!");
    }
}
