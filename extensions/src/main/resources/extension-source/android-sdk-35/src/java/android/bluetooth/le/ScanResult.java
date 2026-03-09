package android.bluetooth.le;

import android.os.Parcel;
import android.bluetooth.BluetoothDevice;
import android.os.Parcelable;

public final class ScanResult implements Parcelable
{
    @NonNull
    public static final Creator<ScanResult> CREATOR;
    public static final int DATA_COMPLETE = 0;
    public static final int DATA_TRUNCATED = 2;
    public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
    public static final int PHY_UNUSED = 0;
    public static final int SID_NOT_PRESENT = 255;
    public static final int TX_POWER_NOT_PRESENT = 127;
    
    @Deprecated
    public ScanResult(final BluetoothDevice device, final ScanRecord scanRecord, final int rssi, final long timestampNanos) {
        throw new RuntimeException("Stub!");
    }
    
    public ScanResult(final BluetoothDevice device, final int eventType, final int primaryPhy, final int secondaryPhy, final int advertisingSid, final int txPower, final int rssi, final int periodicAdvertisingInterval, final ScanRecord scanRecord, final long timestampNanos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ScanRecord getScanRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssi() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLegacy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnectable() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrimaryPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSecondaryPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAdvertisingSid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxPower() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPeriodicAdvertisingInterval() {
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
    
    static {
        CREATOR = null;
    }
}
