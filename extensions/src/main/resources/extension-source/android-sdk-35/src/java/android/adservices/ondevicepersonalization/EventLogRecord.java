package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import android.content.ContentValues;
import java.time.Instant;
import android.os.Parcelable;

public final class EventLogRecord implements Parcelable
{
    @NonNull
    public static final Creator<EventLogRecord> CREATOR;
    
    EventLogRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getTime() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRowIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContentValues getData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RequestLogRecord getRequestLogRecord() {
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
        public Builder setRowIndex(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setData(@Nullable final ContentValues value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequestLogRecord(@Nullable final RequestLogRecord value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EventLogRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
