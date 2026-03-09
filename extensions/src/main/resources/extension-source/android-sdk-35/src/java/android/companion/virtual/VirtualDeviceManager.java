package android.companion.virtual;

import java.util.concurrent.Executor;
import java.util.List;

public final class VirtualDeviceManager
{
    VirtualDeviceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<VirtualDevice> getVirtualDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public VirtualDevice getVirtualDevice(final int deviceId) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerVirtualDeviceListener(@NonNull final Executor executor, @NonNull final VirtualDeviceListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterVirtualDeviceListener(@NonNull final VirtualDeviceListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface VirtualDeviceListener
    {
        default void onVirtualDeviceCreated(final int deviceId) {
            throw new RuntimeException("Stub!");
        }
        
        default void onVirtualDeviceClosed(final int deviceId) {
            throw new RuntimeException("Stub!");
        }
    }
}
