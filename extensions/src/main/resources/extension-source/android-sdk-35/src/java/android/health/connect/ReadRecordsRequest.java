package android.health.connect;

import android.health.connect.datatypes.Record;

public abstract class ReadRecordsRequest<T extends Record>
{
    ReadRecordsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Class<T> getRecordType() {
        throw new RuntimeException("Stub!");
    }
}
