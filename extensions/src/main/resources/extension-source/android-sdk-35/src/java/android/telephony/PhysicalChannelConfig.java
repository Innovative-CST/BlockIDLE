package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class PhysicalChannelConfig implements Parcelable
{
    public static final int BAND_UNKNOWN = 0;
    public static final int CELL_BANDWIDTH_UNKNOWN = 0;
    public static final int CHANNEL_NUMBER_UNKNOWN = Integer.MAX_VALUE;
    @Deprecated
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    @Deprecated
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    @Deprecated
    public static final int CONNECTION_UNKNOWN = -1;
    @NonNull
    public static final Creator<PhysicalChannelConfig> CREATOR;
    public static final int FREQUENCY_UNKNOWN = -1;
    public static final int PHYSICAL_CELL_ID_MAXIMUM_VALUE = 1007;
    public static final int PHYSICAL_CELL_ID_UNKNOWN = -1;
    
    PhysicalChannelConfig() {
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
    
    public int getCellBandwidthDownlinkKhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCellBandwidthUplinkKhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDownlinkChannelNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUplinkChannelNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBand() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDownlinkFrequencyKhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUplinkFrequencyKhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPhysicalCellId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionStatus() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
