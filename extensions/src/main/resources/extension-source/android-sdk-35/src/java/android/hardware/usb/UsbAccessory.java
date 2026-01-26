package android.hardware.usb;

import android.os.Parcel;
import android.os.Parcelable;

public class UsbAccessory implements Parcelable
{
    @NonNull
    public static final Creator<UsbAccessory> CREATOR;
    
    UsbAccessory() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getManufacturer() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getModel() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSerial() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
    
    static {
        CREATOR = null;
    }
}
