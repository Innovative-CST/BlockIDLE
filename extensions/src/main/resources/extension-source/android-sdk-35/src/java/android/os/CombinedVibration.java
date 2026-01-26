package android.os;

public abstract class CombinedVibration implements Parcelable
{
    @NonNull
    public static final Creator<CombinedVibration> CREATOR;
    
    CombinedVibration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static CombinedVibration createParallel(@NonNull final VibrationEffect effect) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ParallelCombination startParallel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class ParallelCombination
    {
        ParallelCombination() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ParallelCombination addVibrator(final int vibratorId, @NonNull final VibrationEffect effect) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CombinedVibration combine() {
            throw new RuntimeException("Stub!");
        }
    }
}
