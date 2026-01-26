package android.bluetooth.le;

import android.os.Parcel;
import java.util.Map;
import android.util.SparseArray;
import android.os.ParcelUuid;
import java.util.List;
import android.os.Parcelable;

public final class AdvertiseData implements Parcelable
{
    @NonNull
    public static final Creator<AdvertiseData> CREATOR;
    
    AdvertiseData() {
        throw new RuntimeException("Stub!");
    }
    
    public List<ParcelUuid> getServiceUuids() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ParcelUuid> getServiceSolicitationUuids() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TransportDiscoveryData> getTransportDiscoveryData() {
        throw new RuntimeException("Stub!");
    }
    
    public SparseArray<byte[]> getManufacturerSpecificData() {
        throw new RuntimeException("Stub!");
    }
    
    public Map<ParcelUuid, byte[]> getServiceData() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIncludeTxPowerLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIncludeDeviceName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
    public void writeToParcel(final Parcel dest, final int flags) {
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
        
        public Builder addServiceUuid(final ParcelUuid serviceUuid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addServiceSolicitationUuid(@NonNull final ParcelUuid serviceSolicitationUuid) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addServiceData(final ParcelUuid serviceDataUuid, final byte[] serviceData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addTransportDiscoveryData(@NonNull final TransportDiscoveryData transportDiscoveryData) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addManufacturerData(final int manufacturerId, final byte[] manufacturerSpecificData) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIncludeTxPowerLevel(final boolean includeTxPowerLevel) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIncludeDeviceName(final boolean includeDeviceName) {
            throw new RuntimeException("Stub!");
        }
        
        public AdvertiseData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
