package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import java.util.Map;
import android.net.NetworkCapabilities;
import java.time.Duration;
import android.os.Parcelable;

public final class UserData implements Parcelable
{
    @NonNull
    public static final Creator<UserData> CREATOR;
    
    UserData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Duration getTimezoneUtcOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAvailableStorageBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBatteryPercentage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCarrier() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkCapabilities getNetworkCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, AppInfo> getAppInfos() {
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
}
