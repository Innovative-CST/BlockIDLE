package android.health.connect;

import android.health.connect.datatypes.DataOrigin;
import java.util.Set;
import java.time.ZoneOffset;
import android.health.connect.datatypes.AggregationType;
import java.time.Instant;

public final class AggregateRecordsGroupedByDurationResponse<T>
{
    AggregateRecordsGroupedByDurationResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getEndTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public T get(@NonNull final AggregationType<T> aggregationType) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ZoneOffset getZoneOffset(@NonNull final AggregationType<T> aggregationType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<DataOrigin> getDataOrigins(@NonNull final AggregationType<T> aggregationType) {
        throw new RuntimeException("Stub!");
    }
}
