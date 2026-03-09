package android.hardware.usb;

import android.os.Parcel;
import android.os.Parcelable;

public class UsbDevice implements Parcelable
{
    @NonNull
    public static final Creator<UsbDevice> CREATOR;
    
    UsbDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getManufacturerName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getProductName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSerialNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVendorId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProductId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceClass() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceSubclass() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConfigurationCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UsbConfiguration getConfiguration(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInterfaceCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UsbInterface getInterface(final int index) {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDeviceId(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDeviceName(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
