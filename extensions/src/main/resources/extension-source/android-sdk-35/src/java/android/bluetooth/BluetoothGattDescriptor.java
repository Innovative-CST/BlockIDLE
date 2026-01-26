package android.bluetooth;

import android.os.Parcel;
import java.util.UUID;
import android.os.Parcelable;

public class BluetoothGattDescriptor implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothGattDescriptor> CREATOR;
    public static final byte[] DISABLE_NOTIFICATION_VALUE;
    public static final byte[] ENABLE_INDICATION_VALUE;
    public static final byte[] ENABLE_NOTIFICATION_VALUE;
    public static final int PERMISSION_READ = 1;
    public static final int PERMISSION_READ_ENCRYPTED = 2;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
    public static final int PERMISSION_WRITE = 16;
    public static final int PERMISSION_WRITE_ENCRYPTED = 32;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
    public static final int PERMISSION_WRITE_SIGNED = 128;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
    
    public BluetoothGattDescriptor(final UUID uuid, final int permissions) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattCharacteristic getCharacteristic() {
        throw new RuntimeException("Stub!");
    }
    
    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] getValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setValue(final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
        DISABLE_NOTIFICATION_VALUE = null;
        ENABLE_INDICATION_VALUE = null;
        ENABLE_NOTIFICATION_VALUE = null;
    }
}
