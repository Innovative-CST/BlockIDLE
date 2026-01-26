package android.os;

public abstract class VibrationEffect implements Parcelable
{
    @NonNull
    public static final Creator<VibrationEffect> CREATOR;
    public static final int DEFAULT_AMPLITUDE = -1;
    public static final int EFFECT_CLICK = 0;
    public static final int EFFECT_DOUBLE_CLICK = 1;
    public static final int EFFECT_HEAVY_CLICK = 5;
    public static final int EFFECT_TICK = 2;
    
    VibrationEffect() {
        throw new RuntimeException("Stub!");
    }
    
    public static VibrationEffect createOneShot(final long milliseconds, final int amplitude) {
        throw new RuntimeException("Stub!");
    }
    
    public static VibrationEffect createWaveform(final long[] timings, final int repeat) {
        throw new RuntimeException("Stub!");
    }
    
    public static VibrationEffect createWaveform(final long[] timings, final int[] amplitudes, final int repeat) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static VibrationEffect createPredefined(final int effectId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Composition startComposition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Composition
    {
        public static final int PRIMITIVE_CLICK = 1;
        public static final int PRIMITIVE_LOW_TICK = 8;
        public static final int PRIMITIVE_QUICK_FALL = 6;
        public static final int PRIMITIVE_QUICK_RISE = 4;
        public static final int PRIMITIVE_SLOW_RISE = 5;
        public static final int PRIMITIVE_SPIN = 3;
        public static final int PRIMITIVE_THUD = 2;
        public static final int PRIMITIVE_TICK = 7;
        
        Composition() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Composition addPrimitive(final int primitiveId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Composition addPrimitive(final int primitiveId, final float scale) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Composition addPrimitive(final int primitiveId, final float scale, final int delay) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VibrationEffect compose() {
            throw new RuntimeException("Stub!");
        }
    }
}
