package android.health.connect.changelog;

import android.os.Parcel;
import android.os.Parcelable;

public final class ChangeLogsRequest implements Parcelable
{
    @NonNull
    public static final Creator<ChangeLogsRequest> CREATOR;
    
    ChangeLogsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getToken() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageSize() {
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
        public Builder(@NonNull final String token) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPageSize(final int pageSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ChangeLogsRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
