package android.devicelock;

public final class DeviceId
{
    public static final int DEVICE_ID_TYPE_IMEI = 0;
    public static final int DEVICE_ID_TYPE_MEID = 1;
    
    DeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
}
