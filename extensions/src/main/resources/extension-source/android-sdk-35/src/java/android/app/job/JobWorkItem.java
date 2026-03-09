package android.app.job;

import android.os.Parcel;
import android.os.PersistableBundle;
import android.content.Intent;
import android.os.Parcelable;

public final class JobWorkItem implements Parcelable
{
    @NonNull
    public static final Creator<JobWorkItem> CREATOR;
    
    public JobWorkItem(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public JobWorkItem(final Intent intent, final long downloadBytes, final long uploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public JobWorkItem(@Nullable final Intent intent, final long downloadBytes, final long uploadBytes, final long minimumChunkBytes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEstimatedNetworkDownloadBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEstimatedNetworkUploadBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinimumNetworkChunkBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeliveryCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
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
        public Builder setExtras(@NonNull final PersistableBundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIntent(@NonNull final Intent intent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEstimatedNetworkBytes(final long downloadBytes, final long uploadBytes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinimumNetworkChunkBytes(final long chunkSizeBytes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public JobWorkItem build() {
            throw new RuntimeException("Stub!");
        }
    }
}
