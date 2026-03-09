package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class CellInfo implements Parcelable
{
    public static final int CONNECTION_NONE = 0;
    public static final int CONNECTION_PRIMARY_SERVING = 1;
    public static final int CONNECTION_SECONDARY_SERVING = 2;
    public static final int CONNECTION_UNKNOWN = Integer.MAX_VALUE;
    @NonNull
    public static final Creator<CellInfo> CREATOR;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;
    public static final long UNAVAILABLE_LONG = Long.MAX_VALUE;
    
    CellInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRegistered() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract CellIdentity getCellIdentity();
    
    @NonNull
    public abstract CellSignalStrength getCellSignalStrength();
    
    public int getCellConnectionStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
    public abstract void writeToParcel(final Parcel p0, final int p1);
    
    static {
        CREATOR = null;
    }
}
