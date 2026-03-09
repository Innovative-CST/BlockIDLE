package android.media.metrics;

import android.os.Bundle;

public abstract class Event
{
    Event() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getMetricsBundle() {
        throw new RuntimeException("Stub!");
    }
}
