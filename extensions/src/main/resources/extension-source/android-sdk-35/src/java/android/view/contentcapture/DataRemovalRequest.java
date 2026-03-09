package android.view.contentcapture;

import android.content.LocusId;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class DataRemovalRequest implements Parcelable
{
    @NonNull
    public static final Creator<DataRemovalRequest> CREATOR;
    public static final int FLAG_IS_PREFIX = 1;
    
    DataRemovalRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isForEverything() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<LocusIdRequest> getLocusIdRequests() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
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
        public Builder forEverything() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addLocusId(@NonNull final LocusId locusId, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DataRemovalRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class LocusIdRequest
    {
        LocusIdRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LocusId getLocusId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
    }
}
