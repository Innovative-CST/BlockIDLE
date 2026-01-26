package android.bluetooth;

import android.os.Handler;
import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import android.os.ParcelUuid;
import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothDevice implements Parcelable
{
    public static final String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
    public static final String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
    public static final String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
    public static final String ACTION_ALIAS_CHANGED = "android.bluetooth.device.action.ALIAS_CHANGED";
    public static final String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
    public static final String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
    public static final String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
    public static final String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
    public static final String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
    public static final String ACTION_UUID = "android.bluetooth.device.action.UUID";
    public static final int ADDRESS_TYPE_ANONYMOUS = 255;
    public static final int ADDRESS_TYPE_PUBLIC = 0;
    public static final int ADDRESS_TYPE_RANDOM = 1;
    public static final int ADDRESS_TYPE_UNKNOWN = 65535;
    public static final int BOND_BONDED = 12;
    public static final int BOND_BONDING = 11;
    public static final int BOND_NONE = 10;
    @NonNull
    public static final Creator<BluetoothDevice> CREATOR;
    public static final int DEVICE_TYPE_CLASSIC = 1;
    public static final int DEVICE_TYPE_DUAL = 3;
    public static final int DEVICE_TYPE_LE = 2;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int ERROR = Integer.MIN_VALUE;
    public static final String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
    public static final String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
    public static final String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
    public static final String EXTRA_IS_COORDINATED_SET_MEMBER = "android.bluetooth.extra.IS_COORDINATED_SET_MEMBER";
    public static final String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
    public static final String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";
    public static final String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";
    public static final String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
    public static final String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
    public static final String EXTRA_TRANSPORT = "android.bluetooth.device.extra.TRANSPORT";
    public static final String EXTRA_UUID = "android.bluetooth.device.extra.UUID";
    public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
    public static final int PAIRING_VARIANT_PIN = 0;
    public static final int PHY_LE_1M = 1;
    public static final int PHY_LE_1M_MASK = 1;
    public static final int PHY_LE_2M = 2;
    public static final int PHY_LE_2M_MASK = 2;
    public static final int PHY_LE_CODED = 3;
    public static final int PHY_LE_CODED_MASK = 4;
    public static final int PHY_OPTION_NO_PREFERRED = 0;
    public static final int PHY_OPTION_S2 = 1;
    public static final int PHY_OPTION_S8 = 2;
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_BREDR = 1;
    public static final int TRANSPORT_LE = 2;
    
    BluetoothDevice() {
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
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAddressType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAlias() {
        throw new RuntimeException("Stub!");
    }
    
    public int setAlias(@Nullable final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean createBond() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBondState() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothClass getBluetoothClass() {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelUuid[] getUuids() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean fetchUuidsWithSdp() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPin(final byte[] pin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPairingConfirmation(final boolean confirm) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothSocket createRfcommSocketToServiceRecord(final UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothSocket createInsecureRfcommSocketToServiceRecord(final UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGatt connectGatt(final Context context, final boolean autoConnect, final BluetoothGattCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGatt connectGatt(final Context context, final boolean autoConnect, final BluetoothGattCallback callback, final int transport) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGatt connectGatt(final Context context, final boolean autoConnect, final BluetoothGattCallback callback, final int transport, final int phy) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGatt connectGatt(final Context context, final boolean autoConnect, final BluetoothGattCallback callback, final int transport, final int phy, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BluetoothSocket createL2capChannel(final int psm) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BluetoothSocket createInsecureL2capChannel(final int psm) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
