package android.health.connect;

import android.health.connect.datatypes.Record;

public class RecordIdFilter
{
    RecordIdFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RecordIdFilter fromClientRecordId(@NonNull final Class<? extends Record> recordType, @NonNull final String clientRecordId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RecordIdFilter fromId(@NonNull final Class<? extends Record> recordType, @NonNull final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Class<? extends Record> getRecordType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getClientRecordId() {
        throw new RuntimeException("Stub!");
    }
}
