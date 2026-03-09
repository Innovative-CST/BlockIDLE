package android.net.wifi;

import android.os.Parcel;
import android.net.MacAddress;
import android.os.Parcelable;

public final class MloLink implements Parcelable
{
    @NonNull
    public static final Creator<MloLink> CREATOR;
    public static final int INVALID_MLO_LINK_ID = -1;
    public static final int MLO_LINK_STATE_ACTIVE = 3;
    public static final int MLO_LINK_STATE_IDLE = 2;
    public static final int MLO_LINK_STATE_INVALID = 0;
    public static final int MLO_LINK_STATE_UNASSOCIATED = 1;
    
    public MloLink() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBand() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLinkId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getApMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getStaMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssi() {
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
