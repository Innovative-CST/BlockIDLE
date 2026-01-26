package android.adservices.ondevicepersonalization;

public class FederatedComputeScheduler
{
    FederatedComputeScheduler() {
        throw new RuntimeException("Stub!");
    }
    
    public void schedule(@NonNull final Params params, @NonNull final FederatedComputeInput input) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel(@NonNull final FederatedComputeInput input) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Params
    {
        public Params(@NonNull final TrainingInterval trainingInterval) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrainingInterval getTrainingInterval() {
            throw new RuntimeException("Stub!");
        }
    }
}
