package android.graphics;

public class PathMeasure
{
    public static final int POSITION_MATRIX_FLAG = 1;
    public static final int TANGENT_MATRIX_FLAG = 2;
    
    public PathMeasure() {
        throw new RuntimeException("Stub!");
    }
    
    public PathMeasure(final Path path, final boolean forceClosed) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPath(final Path path, final boolean forceClosed) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getPosTan(final float distance, final float[] pos, final float[] tan) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getMatrix(final float distance, final Matrix matrix, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getSegment(final float startD, final float stopD, final Path dst, final boolean startWithMoveTo) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean nextContour() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
