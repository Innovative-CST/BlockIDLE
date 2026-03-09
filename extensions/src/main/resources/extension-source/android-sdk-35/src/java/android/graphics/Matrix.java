package android.graphics;

import java.io.PrintWriter;

public class Matrix
{
    @NonNull
    public static final Matrix IDENTITY_MATRIX;
    public static final int MPERSP_0 = 6;
    public static final int MPERSP_1 = 7;
    public static final int MPERSP_2 = 8;
    public static final int MSCALE_X = 0;
    public static final int MSCALE_Y = 4;
    public static final int MSKEW_X = 1;
    public static final int MSKEW_Y = 3;
    public static final int MTRANS_X = 2;
    public static final int MTRANS_Y = 5;
    
    public Matrix() {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix(final Matrix src) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAffine() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean rectStaysRect() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final Matrix src) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTranslate(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScale(final float sx, final float sy, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScale(final float sx, final float sy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRotate(final float degrees, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRotate(final float degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSinCos(final float sinValue, final float cosValue, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSinCos(final float sinValue, final float cosValue) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSkew(final float kx, final float ky, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSkew(final float kx, final float ky) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setConcat(final Matrix a, final Matrix b) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preTranslate(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preScale(final float sx, final float sy, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preScale(final float sx, final float sy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preRotate(final float degrees, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preRotate(final float degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preSkew(final float kx, final float ky, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preSkew(final float kx, final float ky) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean preConcat(final Matrix other) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postTranslate(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postScale(final float sx, final float sy, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postScale(final float sx, final float sy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postRotate(final float degrees, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postRotate(final float degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postSkew(final float kx, final float ky, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postSkew(final float kx, final float ky) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postConcat(final Matrix other) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setRectToRect(final RectF src, final RectF dst, final ScaleToFit stf) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPolyToPoly(final float[] src, final int srcIndex, final float[] dst, final int dstIndex, final int pointCount) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean invert(final Matrix inverse) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapPoints(final float[] dst, final int dstIndex, final float[] src, final int srcIndex, final int pointCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapVectors(final float[] dst, final int dstIndex, final float[] src, final int srcIndex, final int vectorCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapPoints(final float[] dst, final float[] src) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapVectors(final float[] dst, final float[] src) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapPoints(final float[] pts) {
        throw new RuntimeException("Stub!");
    }
    
    public void mapVectors(final float[] vecs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean mapRect(final RectF dst, final RectF src) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean mapRect(final RectF rect) {
        throw new RuntimeException("Stub!");
    }
    
    public float mapRadius(final float radius) {
        throw new RuntimeException("Stub!");
    }
    
    public void getValues(final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValues(final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public String toShortString() {
        throw new RuntimeException("Stub!");
    }
    
    public final void dump(@NonNull final PrintWriter pw) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        IDENTITY_MATRIX = null;
    }
    
    public enum ScaleToFit
    {
        FILL, 
        START, 
        CENTER, 
        END;
    }
}
