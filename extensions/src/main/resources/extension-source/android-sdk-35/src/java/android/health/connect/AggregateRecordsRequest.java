package android.health.connect;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.AggregationType;
import java.util.Set;

public final class AggregateRecordsRequest<T>
{
    AggregateRecordsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TimeRangeFilter getTimeRangeFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<AggregationType<T>> getAggregationTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<DataOrigin> getDataOriginsFilters() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder<T>
    {
        public Builder(@NonNull final TimeRangeFilter timeRangeFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> addAggregationType(@NonNull final AggregationType<T> aggregationType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> addDataOriginsFilter(@NonNull final DataOrigin dataOriginsFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AggregateRecordsRequest<T> build() {
            throw new RuntimeException("Stub!");
        }
    }
}
