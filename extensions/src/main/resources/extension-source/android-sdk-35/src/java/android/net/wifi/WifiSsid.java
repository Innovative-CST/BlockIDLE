package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiSsid implements Parcelable
{
    @NonNull
    public static final Creator<WifiSsid> CREATOR;
    
    WifiSsid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static WifiSsid fromBytes(@Nullable final byte[] bytes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getBytes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object thatObject) {
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
