package android.bluetooth.le;

import java.util.Map;
import android.util.SparseArray;
import android.os.ParcelUuid;
import java.util.List;

public final class ScanRecord
{
    public static final int DATA_TYPE_3D_INFORMATION_DATA = 61;
    public static final int DATA_TYPE_ADVERTISING_INTERVAL = 26;
    public static final int DATA_TYPE_ADVERTISING_INTERVAL_LONG = 47;
    public static final int DATA_TYPE_APPEARANCE = 25;
    public static final int DATA_TYPE_BIG_INFO = 44;
    public static final int DATA_TYPE_BROADCAST_CODE = 45;
    public static final int DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION = 40;
    public static final int DATA_TYPE_CLASS_OF_DEVICE = 13;
    public static final int DATA_TYPE_DEVICE_ID = 16;
    public static final int DATA_TYPE_FLAGS = 1;
    public static final int DATA_TYPE_INDOOR_POSITIONING = 37;
    public static final int DATA_TYPE_LE_BLUETOOTH_DEVICE_ADDRESS = 27;
    public static final int DATA_TYPE_LE_ROLE = 28;
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE = 34;
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_RANDOM_VALUE = 35;
    public static final int DATA_TYPE_LE_SUPPORTED_FEATURES = 39;
    public static final int DATA_TYPE_LOCAL_NAME_COMPLETE = 9;
    public static final int DATA_TYPE_LOCAL_NAME_SHORT = 8;
    public static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = 255;
    public static final int DATA_TYPE_MESH_BEACON = 43;
    public static final int DATA_TYPE_MESH_MESSAGE = 42;
    public static final int DATA_TYPE_NONE = -1;
    public static final int DATA_TYPE_PB_ADV = 41;
    public static final int DATA_TYPE_PUBLIC_TARGET_ADDRESS = 23;
    public static final int DATA_TYPE_RANDOM_TARGET_ADDRESS = 24;
    public static final int DATA_TYPE_RESOLVABLE_SET_IDENTIFIER = 46;
    public static final int DATA_TYPE_SECURITY_MANAGER_OUT_OF_BAND_FLAGS = 17;
    public static final int DATA_TYPE_SERVICE_DATA_128_BIT = 33;
    public static final int DATA_TYPE_SERVICE_DATA_16_BIT = 22;
    public static final int DATA_TYPE_SERVICE_DATA_32_BIT = 32;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_128_BIT = 21;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_16_BIT = 20;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_32_BIT = 31;
    public static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE = 7;
    public static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL = 6;
    public static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE = 3;
    public static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL = 2;
    public static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE = 5;
    public static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL = 4;
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C = 14;
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C_256 = 29;
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R = 15;
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R_256 = 30;
    public static final int DATA_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE = 18;
    public static final int DATA_TYPE_TRANSPORT_DISCOVERY_DATA = 38;
    public static final int DATA_TYPE_TX_POWER_LEVEL = 10;
    public static final int DATA_TYPE_URI = 36;
    
    ScanRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAdvertiseFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public List<ParcelUuid> getServiceUuids() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ParcelUuid> getServiceSolicitationUuids() {
        throw new RuntimeException("Stub!");
    }
    
    public SparseArray<byte[]> getManufacturerSpecificData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getManufacturerSpecificData(final int manufacturerId) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<ParcelUuid, byte[]> getServiceData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getServiceData(final ParcelUuid serviceDataUuid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxPowerLevel() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, byte[]> getAdvertisingDataMap() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getBytes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
