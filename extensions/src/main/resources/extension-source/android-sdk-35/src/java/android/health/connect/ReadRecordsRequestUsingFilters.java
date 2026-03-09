package android.health.connect;

import android.health.connect.datatypes.DataOrigin;
import java.util.Set;
import android.health.connect.datatypes.Record;

public final class ReadRecordsRequestUsingFilters<T extends Record> extends ReadRecordsRequest<T>
{
    ReadRecordsRequestUsingFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TimeRangeFilter getTimeRangeFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<DataOrigin> getDataOrigins() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageSize() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPageToken() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAscending() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder<T extends Record>
    {
        public Builder(@NonNull final Class<T> recordType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> addDataOrigins(@NonNull final DataOrigin dataOrigin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> setTimeRangeFilter(@Nullable final TimeRangeFilter timeRangeFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> setPageSize(final int pageSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> setPageToken(final long pageToken) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> setAscending(final boolean ascending) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ReadRecordsRequestUsingFilters<T> build() {
            throw new RuntimeException("Stub!");
        }
    }
}
