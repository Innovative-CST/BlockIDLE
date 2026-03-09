package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public final class PeriodicAdvertisingParameters implements Parcelable
{
    public static final Creator<PeriodicAdvertisingParameters> CREATOR;
    
    PeriodicAdvertisingParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIncludeTxPower() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInterval() {
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
        
        public Builder setIncludeTxPower(final boolean includeTxPower) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setInterval(final int interval) {
            throw new RuntimeException("Stub!");
        }
        
        public PeriodicAdvertisingParameters build() {
            throw new RuntimeException("Stub!");
        }
    }
}
