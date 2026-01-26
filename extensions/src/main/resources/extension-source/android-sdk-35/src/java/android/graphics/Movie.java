package android.graphics;

import java.io.InputStream;

@Deprecated
public class Movie
{
    Movie() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public native int width();
    
    @Deprecated
    public native int height();
    
    @Deprecated
    public native boolean isOpaque();
    
    @Deprecated
    public native int duration();
    
    @Deprecated
    public native boolean setTime(final int p0);
    
    @Deprecated
    public void draw(final Canvas canvas, final float x, final float y, final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void draw(final Canvas canvas, final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Movie decodeStream(final InputStream is) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static native Movie decodeByteArray(final byte[] p0, final int p1, final int p2);
    
    @Deprecated
    public static Movie decodeFile(final String pathName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
