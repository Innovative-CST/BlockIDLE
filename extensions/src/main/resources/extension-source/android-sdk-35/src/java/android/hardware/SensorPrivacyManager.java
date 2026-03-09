package android.hardware;

public final class SensorPrivacyManager
{
    public static final int TOGGLE_TYPE_HARDWARE = 2;
    public static final int TOGGLE_TYPE_SOFTWARE = 1;
    
    SensorPrivacyManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsSensorToggle(final int sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsSensorToggle(final int toggleType, final int sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Sensors
    {
        public static final int CAMERA = 2;
        public static final int MICROPHONE = 1;
        
        Sensors() {
            throw new RuntimeException("Stub!");
        }
    }
}
