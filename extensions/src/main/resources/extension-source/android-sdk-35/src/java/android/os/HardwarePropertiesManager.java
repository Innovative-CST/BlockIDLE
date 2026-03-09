package android.os;

public class HardwarePropertiesManager
{
    public static final int DEVICE_TEMPERATURE_BATTERY = 2;
    public static final int DEVICE_TEMPERATURE_CPU = 0;
    public static final int DEVICE_TEMPERATURE_GPU = 1;
    public static final int DEVICE_TEMPERATURE_SKIN = 3;
    public static final int TEMPERATURE_CURRENT = 0;
    public static final int TEMPERATURE_SHUTDOWN = 2;
    public static final int TEMPERATURE_THROTTLING = 1;
    public static final int TEMPERATURE_THROTTLING_BELOW_VR_MIN = 3;
    public static final float UNDEFINED_TEMPERATURE = -3.4028235E38f;
    
    HardwarePropertiesManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getDeviceTemperatures(final int type, final int source) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CpuUsageInfo[] getCpuUsages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getFanSpeeds() {
        throw new RuntimeException("Stub!");
    }
}
