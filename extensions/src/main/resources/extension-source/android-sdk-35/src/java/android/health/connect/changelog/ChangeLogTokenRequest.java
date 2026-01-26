package android.health.connect.changelog;

import android.os.Parcel;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.DataOrigin;
import java.util.Set;
import android.os.Parcelable;

public final class ChangeLogTokenRequest implements Parcelable
{
    @NonNull
    public static final Creator<ChangeLogTokenRequest> CREATOR;
    
    ChangeLogTokenRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<DataOrigin> getDataOriginFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Class<? extends Record>> getRecordTypes() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRecordType(@NonNull final Class<? extends Record> recordType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDataOriginFilter(@NonNull final DataOrigin dataOriginFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ChangeLogTokenRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
