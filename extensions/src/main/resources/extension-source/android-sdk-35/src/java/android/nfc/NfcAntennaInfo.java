package android.nfc;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class NfcAntennaInfo implements Parcelable
{
    @NonNull
    public static final Creator<NfcAntennaInfo> CREATOR;
    
    public NfcAntennaInfo(final int deviceWidth, final int deviceHeight, final boolean deviceFoldable, @NonNull final List<AvailableNfcAntenna> availableNfcAntennas) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceFoldable() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AvailableNfcAntenna> getAvailableNfcAntennas() {
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
