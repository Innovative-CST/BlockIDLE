package android.hardware.usb;

import android.os.Parcel;
import android.os.Parcelable;

public class UsbEndpoint implements Parcelable
{
    @NonNull
    public static final Creator<UsbEndpoint> CREATOR;
    
    UsbEndpoint() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndpointNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxPacketSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInterval() {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
