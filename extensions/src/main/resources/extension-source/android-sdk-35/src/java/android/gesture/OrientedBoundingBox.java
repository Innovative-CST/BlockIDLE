package android.gesture;

public class OrientedBoundingBox
{
    public final float centerX;
    public final float centerY;
    public final float height;
    public final float orientation;
    public final float squareness;
    public final float width;
    
    OrientedBoundingBox() {
        this.centerX = 0.0f;
        this.centerY = 0.0f;
        this.height = 0.0f;
        this.orientation = 0.0f;
        this.squareness = 0.0f;
        this.width = 0.0f;
        throw new RuntimeException("Stub!");
    }
}
