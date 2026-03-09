package android.graphics;

public class Camera
{
    public Camera() {
        throw new RuntimeException("Stub!");
    }
    
    public native void save();
    
    public native void restore();
    
    public native void translate(final float p0, final float p1, final float p2);
    
    public native void rotateX(final float p0);
    
    public native void rotateY(final float p0);
    
    public native void rotateZ(final float p0);
    
    public native void rotate(final float p0, final float p1, final float p2);
    
    public native float getLocationX();
    
    public native float getLocationY();
    
    public native float getLocationZ();
    
    public native void setLocation(final float p0, final float p1, final float p2);
    
    public void getMatrix(final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyToCanvas(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public native float dotWithNormal(final float p0, final float p1, final float p2);
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
