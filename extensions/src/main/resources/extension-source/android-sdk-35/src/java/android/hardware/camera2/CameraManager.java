package android.hardware.camera2;

import java.util.concurrent.Executor;
import android.os.Handler;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.Map;
import java.util.Set;

public final class CameraManager
{
    CameraManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getCameraIdList() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConcurrentSessionConfigurationSupported(@NonNull final Map<String, SessionConfiguration> cameraIdAndSessionConfig) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAvailabilityCallback(@NonNull final AvailabilityCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAvailabilityCallback(@NonNull final Executor executor, @NonNull final AvailabilityCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAvailabilityCallback(@NonNull final AvailabilityCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTorchCallback(@NonNull final TorchCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTorchCallback(@NonNull final Executor executor, @NonNull final TorchCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterTorchCallback(@NonNull final TorchCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CameraCharacteristics getCameraCharacteristics(@NonNull final String cameraId) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CameraExtensionCharacteristics getCameraExtensionCharacteristics(@NonNull final String cameraId) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CameraDevice.CameraDeviceSetup getCameraDeviceSetup(@NonNull final String cameraId) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCameraDeviceSetupSupported(@NonNull final String cameraId) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void openCamera(@NonNull final String cameraId, @NonNull final CameraDevice.StateCallback callback, @Nullable final Handler handler) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void openCamera(@NonNull final String cameraId, @NonNull final Executor executor, @NonNull final CameraDevice.StateCallback callback) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void setTorchMode(@NonNull final String cameraId, final boolean enabled) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void turnOnTorchWithStrengthLevel(@NonNull final String cameraId, final int torchStrength) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public int getTorchStrengthLevel(@NonNull final String cameraId) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class AvailabilityCallback
    {
        public AvailabilityCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCameraAvailable(@NonNull final String cameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCameraUnavailable(@NonNull final String cameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCameraAccessPrioritiesChanged() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPhysicalCameraAvailable(@NonNull final String cameraId, @NonNull final String physicalCameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPhysicalCameraUnavailable(@NonNull final String cameraId, @NonNull final String physicalCameraId) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class TorchCallback
    {
        public TorchCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTorchModeUnavailable(@NonNull final String cameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTorchModeChanged(@NonNull final String cameraId, final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTorchStrengthLevelChanged(@NonNull final String cameraId, final int newStrengthLevel) {
            throw new RuntimeException("Stub!");
        }
    }
}
