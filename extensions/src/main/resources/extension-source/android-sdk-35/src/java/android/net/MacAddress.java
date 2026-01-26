package android.net;

import java.net.Inet6Address;
import android.os.Parcel;
import android.os.Parcelable;

public final class MacAddress implements Parcelable
{
    public static final MacAddress BROADCAST_ADDRESS;
    @NonNull
    public static final Creator<MacAddress> CREATOR;
    public static final int TYPE_BROADCAST = 3;
    public static final int TYPE_MULTICAST = 2;
    public static final int TYPE_UNICAST = 1;
    
    MacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAddressType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLocallyAssigned() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String toOuiString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MacAddress fromString(@NonNull final String addr) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MacAddress fromBytes(@NonNull final byte[] addr) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean matches(@NonNull final MacAddress baseAddress, @NonNull final MacAddress mask) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Inet6Address getLinkLocalIpv6FromEui48Mac() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        BROADCAST_ADDRESS = null;
        CREATOR = null;
    }
}
