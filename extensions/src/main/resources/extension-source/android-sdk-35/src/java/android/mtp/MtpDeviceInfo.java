package android.mtp;

public class MtpDeviceInfo
{
    MtpDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getManufacturer() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getModel() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getSerialNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final int[] getOperationsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final int[] getEventsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOperationSupported(final int code) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEventSupported(final int code) {
        throw new RuntimeException("Stub!");
    }
}
