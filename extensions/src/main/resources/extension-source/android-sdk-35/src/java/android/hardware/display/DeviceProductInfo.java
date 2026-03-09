package android.hardware.display;

import android.os.Parcel;
import android.os.Parcelable;

public final class DeviceProductInfo implements Parcelable
{
    public static final int CONNECTION_TO_SINK_BUILT_IN = 1;
    public static final int CONNECTION_TO_SINK_DIRECT = 2;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = 3;
    public static final int CONNECTION_TO_SINK_UNKNOWN = 0;
    @NonNull
    public static final Creator<DeviceProductInfo> CREATOR;
    
    public DeviceProductInfo(@Nullable final String name, @NonNull final String manufacturerPnpId, @NonNull final String productId, final int modelYear, final int connectionToSinkType) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getManufacturerPnpId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getProductId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getModelYear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getManufactureYear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getManufactureWeek() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionToSinkType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
}
