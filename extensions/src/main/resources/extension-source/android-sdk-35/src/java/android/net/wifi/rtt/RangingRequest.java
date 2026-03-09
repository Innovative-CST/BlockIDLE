package android.net.wifi.rtt;

import android.net.wifi.aware.PeerHandle;
import android.net.MacAddress;
import java.util.List;
import android.net.wifi.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;

public final class RangingRequest implements Parcelable
{
    @NonNull
    public static final Creator<RangingRequest> CREATOR;
    
    RangingRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxPeers() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultRttBurstSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMinRttBurstSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxRttBurstSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRttBurstSize() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRttBurstSize(final int rttBurstSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAccessPoint(@NonNull final ScanResult apInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAccessPoints(@NonNull final List<ScanResult> apInfos) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addResponder(@NonNull final ResponderConfig responder) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addResponders(@NonNull final List<ResponderConfig> responders) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addNon80211mcCapableAccessPoint(@NonNull final ScanResult apInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addNon80211mcCapableAccessPoints(@NonNull final List<ScanResult> apInfos) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addWifiAwarePeer(@NonNull final MacAddress peerMacAddress) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addWifiAwarePeer(@NonNull final PeerHandle peerHandle) {
            throw new RuntimeException("Stub!");
        }
        
        public RangingRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
