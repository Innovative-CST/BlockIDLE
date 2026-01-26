package android.opengl;

import javax.microedition.khronos.opengles.GL10;

public class GLU
{
    public GLU() {
        throw new RuntimeException("Stub!");
    }
    
    public static String gluErrorString(final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public static void gluLookAt(final GL10 gl, final float eyeX, final float eyeY, final float eyeZ, final float centerX, final float centerY, final float centerZ, final float upX, final float upY, final float upZ) {
        throw new RuntimeException("Stub!");
    }
    
    public static void gluOrtho2D(final GL10 gl, final float left, final float right, final float bottom, final float top) {
        throw new RuntimeException("Stub!");
    }
    
    public static void gluPerspective(final GL10 gl, final float fovy, final float aspect, final float zNear, final float zFar) {
        throw new RuntimeException("Stub!");
    }
    
    public static int gluProject(final float objX, final float objY, final float objZ, final float[] model, final int modelOffset, final float[] project, final int projectOffset, final int[] view, final int viewOffset, final float[] win, final int winOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static int gluUnProject(final float winX, final float winY, final float winZ, final float[] model, final int modelOffset, final float[] project, final int projectOffset, final int[] view, final int viewOffset, final float[] obj, final int objOffset) {
        throw new RuntimeException("Stub!");
    }
}
