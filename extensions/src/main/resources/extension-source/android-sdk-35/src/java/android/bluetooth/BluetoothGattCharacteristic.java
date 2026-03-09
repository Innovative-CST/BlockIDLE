package android.bluetooth;

import android.os.Parcel;
import java.util.UUID;
import java.util.List;
import android.os.Parcelable;

public class BluetoothGattCharacteristic implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothGattCharacteristic> CREATOR;
    public static final int FORMAT_FLOAT = 52;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_UINT8 = 17;
    public static final int PERMISSION_READ = 1;
    public static final int PERMISSION_READ_ENCRYPTED = 2;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
    public static final int PERMISSION_WRITE = 16;
    public static final int PERMISSION_WRITE_ENCRYPTED = 32;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
    public static final int PERMISSION_WRITE_SIGNED = 128;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
    public static final int PROPERTY_BROADCAST = 1;
    public static final int PROPERTY_EXTENDED_PROPS = 128;
    public static final int PROPERTY_INDICATE = 32;
    public static final int PROPERTY_NOTIFY = 16;
    public static final int PROPERTY_READ = 2;
    public static final int PROPERTY_SIGNED_WRITE = 64;
    public static final int PROPERTY_WRITE = 8;
    public static final int PROPERTY_WRITE_NO_RESPONSE = 4;
    public static final int WRITE_TYPE_DEFAULT = 2;
    public static final int WRITE_TYPE_NO_RESPONSE = 1;
    public static final int WRITE_TYPE_SIGNED = 4;
    protected List<BluetoothGattDescriptor> mDescriptors;
    
    public BluetoothGattCharacteristic(final UUID uuid, final int properties, final int permissions) {
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
    
    public boolean addDescriptor(final BluetoothGattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattService getService() {
        throw new RuntimeException("Stub!");
    }
    
    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInstanceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWriteType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWriteType(final int writeType) {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothGattDescriptor> getDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattDescriptor getDescriptor(final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] getValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Integer getIntValue(final int formatType, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Float getFloatValue(final int formatType, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getStringValue(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setValue(final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setValue(final int value, final int formatType, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setValue(final int mantissa, final int exponent, final int formatType, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setValue(final String value) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
