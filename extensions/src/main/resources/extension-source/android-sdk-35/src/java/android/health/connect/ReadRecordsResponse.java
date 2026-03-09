package android.health.connect;

import java.util.List;
import android.health.connect.datatypes.Record;

public class ReadRecordsResponse<T extends Record>
{
    ReadRecordsResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<T> getRecords() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNextPageToken() {
        throw new RuntimeException("Stub!");
    }
}
