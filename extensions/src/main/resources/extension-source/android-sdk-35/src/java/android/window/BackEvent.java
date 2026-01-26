package android.window;

public final class BackEvent
{
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    
    public BackEvent(final float touchX, final float touchY, final float progress, final int swipeEdge) {
        throw new RuntimeException("Stub!");
    }
    
    public float getProgress() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchY() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSwipeEdge() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
