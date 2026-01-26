package android.bluetooth;

import android.os.Parcel;
import java.util.UUID;
import java.util.List;
import android.os.Parcelable;

public class BluetoothGattService implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothGattService> CREATOR;
    public static final int SERVICE_TYPE_PRIMARY = 0;
    public static final int SERVICE_TYPE_SECONDARY = 1;
    protected List<BluetoothGattCharacteristic> mCharacteristics;
    protected List<BluetoothGattService> mIncludedServices;
    
    public BluetoothGattService(final UUID uuid, final int serviceType) {
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
    
    public boolean addService(final BluetoothGattService service) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addCharacteristic(final BluetoothGattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }
    
    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInstanceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothGattService> getIncludedServices() {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothGattCharacteristic> getCharacteristics() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattCharacteristic getCharacteristic(final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
