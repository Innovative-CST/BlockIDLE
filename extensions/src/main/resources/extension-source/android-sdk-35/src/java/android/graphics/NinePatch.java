package android.graphics;

public class NinePatch
{
    public NinePatch(final Bitmap bitmap, final byte[] chunk) {
        throw new RuntimeException("Stub!");
    }
    
    public NinePatch(final Bitmap bitmap, final byte[] chunk, final String srcName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public Paint getPaint() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPaint(final Paint p) {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap getBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(final Canvas canvas, final RectF location) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(final Canvas canvas, final Rect location) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(final Canvas canvas, final Rect location, final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDensity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public final Region getTransparentRegion(final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public static native boolean isNinePatchChunk(final byte[] p0);
}
