package android.devicelock;

import java.util.Map;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class DeviceLockManager
{
    public static final int DEVICE_LOCK_ROLE_FINANCING = 0;
    
    DeviceLockManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void lockDevice(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unlockDevice(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void isDeviceLocked(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Boolean, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getDeviceId(@NonNull final Executor executor, @NonNull final OutcomeReceiver<DeviceId, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getKioskApps(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Map<Integer, String>, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
}
