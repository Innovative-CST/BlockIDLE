package android.os;

import android.media.AudioAttributes;

public abstract class Vibrator
{
    public static final int VIBRATION_EFFECT_SUPPORT_NO = 2;
    public static final int VIBRATION_EFFECT_SUPPORT_UNKNOWN = 0;
    public static final int VIBRATION_EFFECT_SUPPORT_YES = 1;
    
    Vibrator() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean hasVibrator();
    
    public abstract boolean hasAmplitudeControl();
    
    public float getResonantFrequency() {
        throw new RuntimeException("Stub!");
    }
    
    public float getQFactor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void vibrate(final long milliseconds) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void vibrate(final long milliseconds, final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void vibrate(final long[] pattern, final int repeat) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void vibrate(final long[] pattern, final int repeat, final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void vibrate(final VibrationEffect vibe) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void vibrate(final VibrationEffect vibe, final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void vibrate(@NonNull final VibrationEffect vibe, @NonNull final VibrationAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] areEffectsSupported(@NonNull final int... effectIds) {
        throw new RuntimeException("Stub!");
    }
    
    public final int areAllEffectsSupported(@NonNull final int... effectIds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean[] arePrimitivesSupported(@NonNull final int... primitiveIds) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean areAllPrimitivesSupported(@NonNull final int... primitiveIds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getPrimitiveDurations(@NonNull final int... primitiveIds) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void cancel();
}
