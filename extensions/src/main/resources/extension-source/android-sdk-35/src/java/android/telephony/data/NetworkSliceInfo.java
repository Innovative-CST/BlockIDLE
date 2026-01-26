package android.telephony.data;

import android.os.Parcel;
import android.os.Parcelable;

public final class NetworkSliceInfo implements Parcelable
{
    @NonNull
    public static final Creator<NetworkSliceInfo> CREATOR;
    public static final int SLICE_DIFFERENTIATOR_NO_SLICE = -1;
    public static final int SLICE_SERVICE_TYPE_EMBB = 1;
    public static final int SLICE_SERVICE_TYPE_MIOT = 3;
    public static final int SLICE_SERVICE_TYPE_NONE = 0;
    public static final int SLICE_SERVICE_TYPE_URLLC = 2;
    public static final int SLICE_STATUS_ALLOWED = 2;
    public static final int SLICE_STATUS_CONFIGURED = 1;
    public static final int SLICE_STATUS_DEFAULT_CONFIGURED = 5;
    public static final int SLICE_STATUS_REJECTED_NOT_AVAILABLE_IN_PLMN = 3;
    public static final int SLICE_STATUS_REJECTED_NOT_AVAILABLE_IN_REGISTERED_AREA = 4;
    public static final int SLICE_STATUS_UNKNOWN = 0;
    
    NetworkSliceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSliceServiceType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSliceDifferentiator() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMappedHplmnSliceServiceType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMappedHplmnSliceDifferentiator() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
        public Builder setSliceServiceType(final int mSliceServiceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSliceDifferentiator(final int sliceDifferentiator) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMappedHplmnSliceServiceType(final int mappedHplmnSliceServiceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMappedHplmnSliceDifferentiator(final int mappedHplmnSliceDifferentiator) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStatus(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public NetworkSliceInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
