package android.net.wifi.rtt;

import android.os.Parcel;
import android.net.MacAddress;
import android.net.wifi.ScanResult;
import android.os.Parcelable;

public final class ResponderConfig implements Parcelable
{
    @NonNull
    public static final Creator<ResponderConfig> CREATOR;
    public static final int RESPONDER_AP = 0;
    public static final int RESPONDER_STA = 1;
    
    ResponderConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResponderConfig fromScanResult(@NonNull final ScanResult scanResult) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211mcSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211azNtbSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrequencyMhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCenterFreq0Mhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCenterFreq1Mhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPreamble() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResponderType() {
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
    public boolean equals(@Nullable final Object o) {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMacAddress(@NonNull final MacAddress macAddress) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211mcSupported(final boolean supports80211mc) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azNtbSupported(final boolean supports80211azNtb) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChannelWidth(final int channelWidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFrequencyMhz(final int frequency) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCenterFreq0Mhz(final int centerFreq0) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCenterFreq1Mhz(final int centerFreq1) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPreamble(final int preamble) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setResponderType(final int responderType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ResponderConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
