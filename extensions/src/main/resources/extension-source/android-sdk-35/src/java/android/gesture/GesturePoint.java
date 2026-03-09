package android.gesture;

public class GesturePoint
{
    public final long timestamp;
    public final float x;
    public final float y;
    
    public GesturePoint(final float x, final float y, final long t) {
        this.timestamp = 0L;
        this.x = 0.0f;
        this.y = 0.0f;
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
}
