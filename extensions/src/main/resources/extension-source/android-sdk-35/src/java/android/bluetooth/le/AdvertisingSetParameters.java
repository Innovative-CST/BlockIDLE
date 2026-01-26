package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public final class AdvertisingSetParameters implements Parcelable
{
    @NonNull
    public static final Creator<AdvertisingSetParameters> CREATOR;
    public static final int INTERVAL_HIGH = 1600;
    public static final int INTERVAL_LOW = 160;
    public static final int INTERVAL_MAX = 16777215;
    public static final int INTERVAL_MEDIUM = 400;
    public static final int INTERVAL_MIN = 160;
    public static final int TX_POWER_HIGH = 1;
    public static final int TX_POWER_LOW = -15;
    public static final int TX_POWER_MAX = 1;
    public static final int TX_POWER_MEDIUM = -7;
    public static final int TX_POWER_MIN = -127;
    public static final int TX_POWER_ULTRA_LOW = -21;
    
    AdvertisingSetParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnectable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDiscoverable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScannable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLegacy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAnonymous() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean includeTxPower() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrimaryPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSecondaryPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInterval() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxPowerLevel() {
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
        
        public Builder setConnectable(final boolean connectable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDiscoverable(final boolean discoverable) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setScannable(final boolean scannable) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLegacyMode(final boolean isLegacy) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setAnonymous(final boolean isAnonymous) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIncludeTxPower(final boolean includeTxPower) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPrimaryPhy(final int primaryPhy) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSecondaryPhy(final int secondaryPhy) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setInterval(final int interval) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTxPowerLevel(final int txPowerLevel) {
            throw new RuntimeException("Stub!");
        }
        
        public AdvertisingSetParameters build() {
            throw new RuntimeException("Stub!");
        }
    }
}
