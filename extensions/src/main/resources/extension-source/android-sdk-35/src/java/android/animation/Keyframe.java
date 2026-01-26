package android.animation;

public abstract class Keyframe implements Cloneable
{
    public Keyframe() {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofInt(final float fraction, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofInt(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofFloat(final float fraction, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofFloat(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofObject(final float fraction, final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    public static Keyframe ofObject(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasValue() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Object getValue();
    
    public abstract void setValue(final Object p0);
    
    public float getFraction() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFraction(final float fraction) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeInterpolator getInterpolator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterpolator(final TimeInterpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public Class getType() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Keyframe clone();
}
