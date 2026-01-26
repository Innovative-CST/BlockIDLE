package android.hardware.camera2.params;

public final class DeviceStateSensorOrientationMap
{
    public static final long FOLDED = 4L;
    public static final long NORMAL = 0L;
    
    DeviceStateSensorOrientationMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSensorOrientation(final long deviceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addOrientationForState(final long deviceState, final long angle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DeviceStateSensorOrientationMap build() {
            throw new RuntimeException("Stub!");
        }
    }
}
