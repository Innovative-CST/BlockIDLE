package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssNavigationMessage implements Parcelable
{
    @NonNull
    public static final Creator<GnssNavigationMessage> CREATOR;
    public static final int STATUS_PARITY_PASSED = 1;
    public static final int STATUS_PARITY_REBUILT = 2;
    public static final int STATUS_UNKNOWN = 0;
    public static final int TYPE_BDS_CNAV1 = 1283;
    public static final int TYPE_BDS_CNAV2 = 1284;
    public static final int TYPE_BDS_D1 = 1281;
    public static final int TYPE_BDS_D2 = 1282;
    public static final int TYPE_GAL_F = 1538;
    public static final int TYPE_GAL_I = 1537;
    public static final int TYPE_GLO_L1CA = 769;
    public static final int TYPE_GPS_CNAV2 = 260;
    public static final int TYPE_GPS_L1CA = 257;
    public static final int TYPE_GPS_L2CNAV = 258;
    public static final int TYPE_GPS_L5CNAV = 259;
    public static final int TYPE_IRN_L1 = 1795;
    public static final int TYPE_IRN_L5 = 1794;
    public static final int TYPE_IRN_L5CA = 1793;
    public static final int TYPE_QZS_L1CA = 1025;
    public static final int TYPE_SBS = 513;
    public static final int TYPE_UNKNOWN = 0;
    
    GnssNavigationMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSvid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMessageId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubmessageId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public abstract static class Callback
    {
        @Deprecated
        public static final int STATUS_LOCATION_DISABLED = 2;
        @Deprecated
        public static final int STATUS_NOT_SUPPORTED = 0;
        @Deprecated
        public static final int STATUS_READY = 1;
        
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onGnssNavigationMessageReceived(final GnssNavigationMessage event) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onStatusChanged(final int status) {
            throw new RuntimeException("Stub!");
        }
    }
}
