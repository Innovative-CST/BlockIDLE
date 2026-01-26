package android.view;

import android.content.Context;

public final class MotionPredictor
{
    public MotionPredictor(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void record(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MotionEvent predict(final long predictionTimeNanos) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPredictionAvailable(final int deviceId, final int source) {
        throw new RuntimeException("Stub!");
    }
}
