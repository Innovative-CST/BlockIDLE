package android.os;

public abstract class VibratorManager
{
    VibratorManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract int[] getVibratorIds();
    
    @NonNull
    public abstract Vibrator getVibrator(final int p0);
    
    @NonNull
    public abstract Vibrator getDefaultVibrator();
    
    public final void vibrate(@NonNull final CombinedVibration effect) {
        throw new RuntimeException("Stub!");
    }
    
    public final void vibrate(@NonNull final CombinedVibration effect, @Nullable final VibrationAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void cancel();
}
