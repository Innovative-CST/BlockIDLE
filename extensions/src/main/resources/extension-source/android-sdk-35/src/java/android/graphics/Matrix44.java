package android.graphics;

public class Matrix44
{
    public Matrix44() {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix44(@NonNull final Matrix mat) {
        throw new RuntimeException("Stub!");
    }
    
    public void getValues(@NonNull final float[] dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValues(@NonNull final float[] src) {
        throw new RuntimeException("Stub!");
    }
    
    public float get(final int row, final int col) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final int row, final int col, final float val) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean invert() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] map(final float x, final float y, final float z, final float w) {
        throw new RuntimeException("Stub!");
    }
    
    public void map(final float x, final float y, final float z, final float w, @NonNull final float[] dst) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Matrix44 concat(@NonNull final Matrix44 b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Matrix44 rotate(final float deg, final float xComp, final float yComp, final float zComp) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Matrix44 scale(final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Matrix44 translate(final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
}
