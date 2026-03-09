package android.bluetooth.le;

public abstract class AdvertisingSetCallback
{
    public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
    public static final int ADVERTISE_SUCCESS = 0;
    
    public AdvertisingSetCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdvertisingSetStarted(final AdvertisingSet advertisingSet, final int txPower, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdvertisingSetStopped(final AdvertisingSet advertisingSet) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdvertisingEnabled(final AdvertisingSet advertisingSet, final boolean enable, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdvertisingDataSet(final AdvertisingSet advertisingSet, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onScanResponseDataSet(final AdvertisingSet advertisingSet, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdvertisingParametersUpdated(final AdvertisingSet advertisingSet, final int txPower, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPeriodicAdvertisingParametersUpdated(final AdvertisingSet advertisingSet, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPeriodicAdvertisingDataSet(final AdvertisingSet advertisingSet, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPeriodicAdvertisingEnabled(final AdvertisingSet advertisingSet, final boolean enable, final int status) {
        throw new RuntimeException("Stub!");
    }
}
