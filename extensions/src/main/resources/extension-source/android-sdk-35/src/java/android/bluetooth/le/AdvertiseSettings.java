package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public final class AdvertiseSettings implements Parcelable
{
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_TX_POWER_HIGH = 3;
    public static final int ADVERTISE_TX_POWER_LOW = 1;
    public static final int ADVERTISE_TX_POWER_MEDIUM = 2;
    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = 0;
    @NonNull
    public static final Creator<AdvertiseSettings> CREATOR;
    
    AdvertiseSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxPowerLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnectable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDiscoverable() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimeout() {
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
        
        public Builder setAdvertiseMode(final int advertiseMode) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTxPowerLevel(final int txPowerLevel) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setConnectable(final boolean connectable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDiscoverable(final boolean discoverable) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTimeout(final int timeoutMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public AdvertiseSettings build() {
            throw new RuntimeException("Stub!");
        }
    }
}
