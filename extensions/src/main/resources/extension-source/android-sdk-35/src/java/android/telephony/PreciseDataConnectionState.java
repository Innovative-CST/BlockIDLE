package android.telephony;

import android.os.Parcel;
import android.telephony.data.ApnSetting;
import android.net.LinkProperties;
import android.os.Parcelable;

public final class PreciseDataConnectionState implements Parcelable
{
    @NonNull
    public static final Creator<PreciseDataConnectionState> CREATOR;
    public static final int NETWORK_VALIDATION_FAILURE = 4;
    public static final int NETWORK_VALIDATION_IN_PROGRESS = 2;
    public static final int NETWORK_VALIDATION_NOT_REQUESTED = 1;
    public static final int NETWORK_VALIDATION_SUCCESS = 3;
    public static final int NETWORK_VALIDATION_UNSUPPORTED = 0;
    
    PreciseDataConnectionState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LinkProperties getLinkProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLastCauseCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ApnSetting getApnSetting() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkValidationStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
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
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
