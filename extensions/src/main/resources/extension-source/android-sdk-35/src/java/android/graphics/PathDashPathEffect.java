package android.graphics;

public class PathDashPathEffect extends PathEffect
{
    public PathDashPathEffect(final Path shape, final float advance, final float phase, final Style style) {
        throw new RuntimeException("Stub!");
    }
    
    public enum Style
    {
        TRANSLATE, 
        ROTATE, 
        MORPH;
    }
}
