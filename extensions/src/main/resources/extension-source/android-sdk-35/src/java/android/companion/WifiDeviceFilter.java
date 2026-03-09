package android.companion;

import android.net.MacAddress;
import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable;
import android.net.wifi.ScanResult;

public final class WifiDeviceFilter implements DeviceFilter<ScanResult>
{
    @NonNull
    public static final Parcelable.Creator<WifiDeviceFilter> CREATOR;
    
    WifiDeviceFilter() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
        public Builder setNamePattern(@Nullable final Pattern value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBssid(@NonNull final MacAddress value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBssidMask(@NonNull final MacAddress value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiDeviceFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
