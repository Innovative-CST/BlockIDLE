package android.telephony.data;

import android.os.Parcel;
import android.os.Parcelable;

public final class TrafficDescriptor implements Parcelable
{
    @NonNull
    public static final Creator<TrafficDescriptor> CREATOR;
    
    TrafficDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDataNetworkName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getOsAppId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDataNetworkName(@NonNull final String dnn) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOsAppId(@NonNull final byte[] osAppId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrafficDescriptor build() {
            throw new RuntimeException("Stub!");
        }
    }
}
