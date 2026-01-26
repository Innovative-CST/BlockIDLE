package android.hardware;

public abstract class BatteryState
{
    public static final int STATUS_CHARGING = 2;
    public static final int STATUS_DISCHARGING = 3;
    public static final int STATUS_FULL = 5;
    public static final int STATUS_NOT_CHARGING = 4;
    public static final int STATUS_UNKNOWN = 1;
    
    public BatteryState() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isPresent();
    
    public abstract int getStatus();
    
    public abstract float getCapacity();
}
