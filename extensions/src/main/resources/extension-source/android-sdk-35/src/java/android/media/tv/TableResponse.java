package android.media.tv;

import android.os.Parcel;
import android.os.SharedMemory;
import android.net.Uri;
import android.os.Parcelable;

public final class TableResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<TableResponse> CREATOR;
    
    @Deprecated
    public TableResponse(final int requestId, final int sequence, final int responseResult, @Nullable final Uri tableUri, final int version, final int size) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getTableUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getTableByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SharedMemory getTableSharedMemory() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSize() {
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
        public Builder(final int requestId, final int sequence, final int responseResult, final int version, final int size) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTableUri(@NonNull final Uri uri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTableByteArray(@NonNull final byte[] bytes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTableSharedMemory(@NonNull final SharedMemory sharedMemory) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TableResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
}
