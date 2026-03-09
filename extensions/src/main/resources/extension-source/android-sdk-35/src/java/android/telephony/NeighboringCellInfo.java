package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class NeighboringCellInfo implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<NeighboringCellInfo> CREATOR;
    @Deprecated
    public static final int UNKNOWN_CID = -1;
    @Deprecated
    public static final int UNKNOWN_RSSI = 99;
    
    @Deprecated
    public NeighboringCellInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NeighboringCellInfo(final int rssi, final int cid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NeighboringCellInfo(final int rssi, final String location, final int radioType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NeighboringCellInfo(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRssi() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getLac() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCid() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPsc() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCid(final int cid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRssi(final int rssi) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
