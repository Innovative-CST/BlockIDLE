package android.health.connect.datatypes;

public final class Device
{
    public static final int DEVICE_TYPE_CHEST_STRAP = 7;
    public static final int DEVICE_TYPE_FITNESS_BAND = 6;
    public static final int DEVICE_TYPE_HEAD_MOUNTED = 5;
    public static final int DEVICE_TYPE_PHONE = 2;
    public static final int DEVICE_TYPE_RING = 4;
    public static final int DEVICE_TYPE_SCALE = 3;
    public static final int DEVICE_TYPE_SMART_DISPLAY = 8;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_WATCH = 1;
    
    Device() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getManufacturer() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getModel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
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
        public Builder setManufacturer(@Nullable final String manufacturer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setModel(@Nullable final String model) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setType(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Device build() {
            throw new RuntimeException("Stub!");
        }
    }
}
