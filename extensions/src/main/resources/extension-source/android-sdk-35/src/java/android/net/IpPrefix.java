package android.net;

import android.os.Parcel;
import java.net.InetAddress;
import android.os.Parcelable;

public final class IpPrefix implements Parcelable
{
    @NonNull
    public static final Creator<IpPrefix> CREATOR;
    
    public IpPrefix(@NonNull final InetAddress address, final int prefixLength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InetAddress getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getRawAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrefixLength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(@NonNull final InetAddress address) {
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
}
