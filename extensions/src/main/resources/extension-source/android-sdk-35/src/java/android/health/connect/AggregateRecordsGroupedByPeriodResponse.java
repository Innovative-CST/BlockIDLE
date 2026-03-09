package android.health.connect;

import android.health.connect.datatypes.DataOrigin;
import java.util.Set;
import java.time.ZoneOffset;
import android.health.connect.datatypes.AggregationType;
import java.time.LocalDateTime;

public final class AggregateRecordsGroupedByPeriodResponse<T>
{
    AggregateRecordsGroupedByPeriodResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocalDateTime getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocalDateTime getEndTime() {
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
