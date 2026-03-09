package android.health.connect.changelog;

import java.time.Instant;
import android.os.Parcel;
import android.health.connect.datatypes.Record;
import java.util.List;
import android.os.Parcelable;

public final class ChangeLogsResponse implements Parcelable
{
    @NonNull
    public static final Creator<ChangeLogsResponse> CREATOR;
    
    ChangeLogsResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Record> getUpsertedRecords() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<DeletedLog> getDeletedLogs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNextChangesToken() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMorePages() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class DeletedLog
    {
        public DeletedLog(@NonNull final String deletedRecordId, final long deletedTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDeletedRecordId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getDeletedTime() {
            throw new RuntimeException("Stub!");
        }
    }
}
