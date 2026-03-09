package android.health.connect;

import java.util.List;
import android.health.connect.datatypes.Record;

public final class ReadRecordsRequestUsingIds<T extends Record> extends ReadRecordsRequest<T>
{
    ReadRecordsRequestUsingIds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RecordIdFilter> getRecordIdFilters() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder<T extends Record>
    {
        public Builder(@NonNull final Class<T> recordType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> addId(@NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<T> addClientRecordId(@NonNull final String clientRecordId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ReadRecordsRequestUsingIds<T> build() {
            throw new RuntimeException("Stub!");
        }
    }
}
