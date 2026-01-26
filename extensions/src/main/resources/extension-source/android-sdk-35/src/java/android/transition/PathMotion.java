package android.transition;

import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;

public abstract class PathMotion
{
    public PathMotion() {
        throw new RuntimeException("Stub!");
    }
    
    public PathMotion(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Path getPath(final float p0, final float p1, final float p2, final float p3);
}
