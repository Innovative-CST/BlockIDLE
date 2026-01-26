package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public class WpsInfo implements Parcelable
{
    public String BSSID;
    @NonNull
    public static final Creator<WpsInfo> CREATOR;
    public static final int DISPLAY = 1;
    public static final int INVALID = 4;
    public static final int KEYPAD = 2;
    public static final int LABEL = 3;
    public static final int PBC = 0;
    public String pin;
    public int setup;
    
    public WpsInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public WpsInfo(final WpsInfo source) {
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
