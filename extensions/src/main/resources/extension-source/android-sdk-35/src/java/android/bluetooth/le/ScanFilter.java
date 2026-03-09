package android.bluetooth.le;

import android.os.ParcelUuid;
import android.os.Parcel;
import android.os.Parcelable;

public final class ScanFilter implements Parcelable
{
    @NonNull
    public static final Creator<ScanFilter> CREATOR;
    
    ScanFilter() {
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
    
    @Nullable
    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getServiceUuid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getServiceUuidMask() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getServiceSolicitationUuid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getServiceSolicitationUuidMask() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeviceAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getServiceData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getServiceDataMask() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getServiceDataUuid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getManufacturerId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getManufacturerData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getManufacturerDataMask() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAdvertisingDataType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getAdvertisingData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getAdvertisingDataMask() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean matches(final ScanResult scanResult) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDeviceName(final String deviceName) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDeviceAddress(final String deviceAddress) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceUuid(final ParcelUuid serviceUuid) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceUuid(final ParcelUuid serviceUuid, final ParcelUuid uuidMask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable final ParcelUuid serviceSolicitationUuid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable final ParcelUuid serviceSolicitationUuid, @Nullable final ParcelUuid solicitationUuidMask) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceData(final ParcelUuid serviceDataUuid, final byte[] serviceData) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceData(final ParcelUuid serviceDataUuid, final byte[] serviceData, final byte[] serviceDataMask) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setManufacturerData(final int manufacturerId, final byte[] manufacturerData) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setManufacturerData(final int manufacturerId, final byte[] manufacturerData, final byte[] manufacturerDataMask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdvertisingDataTypeWithData(final int advertisingDataType, @NonNull final byte[] advertisingData, @NonNull final byte[] advertisingDataMask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdvertisingDataType(final int advertisingDataType) {
            throw new RuntimeException("Stub!");
        }
        
        public ScanFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
