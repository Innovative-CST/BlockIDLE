package android.gesture;

import android.graphics.Path;
import java.util.ArrayList;
import android.graphics.RectF;

public class GestureStroke
{
    public final RectF boundingBox;
    public final float length;
    public final float[] points;
    
    public GestureStroke(final ArrayList<GesturePoint> points) {
        this.boundingBox = null;
        this.length = 0.0f;
        this.points = null;
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public Path getPath() {
        throw new RuntimeException("Stub!");
    }
    
    public Path toPath(final float width, final float height, final int numSample) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPath() {
        throw new RuntimeException("Stub!");
    }
    
    public OrientedBoundingBox computeOrientedBoundingBox() {
        throw new RuntimeException("Stub!");
    }
}
