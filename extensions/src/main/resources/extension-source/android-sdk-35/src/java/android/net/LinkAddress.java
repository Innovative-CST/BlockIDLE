package android.net;

import android.os.Parcel;
import java.net.InetAddress;
import android.os.Parcelable;

public class LinkAddress implements Parcelable
{
    @NonNull
    public static final Creator<LinkAddress> CREATOR;
    
    LinkAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    public InetAddress getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrefixLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScope() {
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
