package android.view.animation;

import android.graphics.Matrix;

public class Transformation
{
    public static final int TYPE_ALPHA = 1;
    public static final int TYPE_BOTH = 3;
    public static final int TYPE_IDENTITY = 0;
    public static final int TYPE_MATRIX = 2;
    protected float mAlpha;
    protected Matrix mMatrix;
    protected int mTransformationType;
    
    public Transformation() {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransformationType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransformationType(final int transformationType) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    public void compose(final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix getMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public String toShortString() {
        throw new RuntimeException("Stub!");
    }
}
