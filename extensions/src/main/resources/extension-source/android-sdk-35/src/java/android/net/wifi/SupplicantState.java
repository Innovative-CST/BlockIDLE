package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public enum SupplicantState implements Parcelable
{
    DISCONNECTED, 
    INTERFACE_DISABLED, 
    INACTIVE, 
    SCANNING, 
    AUTHENTICATING, 
    ASSOCIATING, 
    ASSOCIATED, 
    FOUR_WAY_HANDSHAKE, 
    GROUP_HANDSHAKE, 
    COMPLETED, 
    DORMANT, 
    UNINITIALIZED, 
    INVALID;
    
    public static boolean isValidState(final SupplicantState state) {
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
}
