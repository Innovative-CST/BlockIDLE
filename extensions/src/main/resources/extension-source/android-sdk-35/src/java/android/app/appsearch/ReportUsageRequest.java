package android.app.appsearch;

import android.os.Parcel;
import android.os.Parcelable;

public final class ReportUsageRequest implements Parcelable
{
    @NonNull
    public static final Creator<ReportUsageRequest> CREATOR;
    
    ReportUsageRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDocumentId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUsageTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String namespace, @NonNull final String documentId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUsageTimestampMillis(final long usageTimestampMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ReportUsageRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
