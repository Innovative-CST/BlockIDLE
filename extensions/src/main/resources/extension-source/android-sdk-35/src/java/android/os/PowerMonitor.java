package android.os;

public final class PowerMonitor implements Parcelable
{
    @NonNull
    public static final Creator<PowerMonitor> CREATOR;
    public static final int POWER_MONITOR_TYPE_CONSUMER = 0;
    public static final int POWER_MONITOR_TYPE_MEASUREMENT = 1;
    
    PowerMonitor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
