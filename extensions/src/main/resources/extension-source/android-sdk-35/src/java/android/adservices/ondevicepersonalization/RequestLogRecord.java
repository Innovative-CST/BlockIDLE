package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import android.content.ContentValues;
import java.util.List;
import java.time.Instant;
import android.os.Parcelable;

public final class RequestLogRecord implements Parcelable
{
    @NonNull
    public static final Creator<RequestLogRecord> CREATOR;
    
    RequestLogRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ContentValues> getRows() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
        public Builder setRows(@NonNull final List<ContentValues> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRow(@NonNull final ContentValues value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RequestLogRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
