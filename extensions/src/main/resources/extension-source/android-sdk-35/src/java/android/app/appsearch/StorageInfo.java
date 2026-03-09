package android.app.appsearch;

import android.os.Parcel;
import android.os.Parcelable;

public final class StorageInfo implements Parcelable
{
    @NonNull
    public static final Creator<StorageInfo> CREATOR;
    
    StorageInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public long getSizeBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAliveDocumentsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAliveNamespacesCount() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSizeBytes(final long sizeBytes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAliveDocumentsCount(final int aliveDocumentsCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAliveNamespacesCount(final int aliveNamespacesCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StorageInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
