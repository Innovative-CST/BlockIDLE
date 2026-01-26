package android.hardware.camera2;

import java.util.concurrent.Executor;
import java.util.Set;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

public abstract class CameraDevice implements AutoCloseable
{
    public static final int AUDIO_RESTRICTION_NONE = 0;
    public static final int AUDIO_RESTRICTION_VIBRATION = 1;
    public static final int AUDIO_RESTRICTION_VIBRATION_SOUND = 3;
    public static final int TEMPLATE_MANUAL = 6;
    public static final int TEMPLATE_PREVIEW = 1;
    public static final int TEMPLATE_RECORD = 3;
    public static final int TEMPLATE_STILL_CAPTURE = 2;
    public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
    public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
    
    CameraDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract String getId();
    
    @Deprecated
    public abstract void createCaptureSession(@NonNull final List<Surface> p0, @NonNull final CameraCaptureSession.StateCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    @Deprecated
    public abstract void createCaptureSessionByOutputConfigurations(final List<OutputConfiguration> p0, final CameraCaptureSession.StateCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    @Deprecated
    public abstract void createReprocessableCaptureSession(@NonNull final InputConfiguration p0, @NonNull final List<Surface> p1, @NonNull final CameraCaptureSession.StateCallback p2, @Nullable final Handler p3) throws CameraAccessException;
    
    @Deprecated
    public abstract void createReprocessableCaptureSessionByConfigurations(@NonNull final InputConfiguration p0, @NonNull final List<OutputConfiguration> p1, @NonNull final CameraCaptureSession.StateCallback p2, @Nullable final Handler p3) throws CameraAccessException;
    
    @Deprecated
    public abstract void createConstrainedHighSpeedCaptureSession(@NonNull final List<Surface> p0, @NonNull final CameraCaptureSession.StateCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    public void createExtensionSession(@NonNull final ExtensionSessionConfiguration extensionConfiguration) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void createCaptureSession(final SessionConfiguration config) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract CaptureRequest.Builder createCaptureRequest(final int p0) throws CameraAccessException;
    
    @NonNull
    public CaptureRequest.Builder createCaptureRequest(final int templateType, final Set<String> physicalCameraIdSet) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract CaptureRequest.Builder createReprocessCaptureRequest(@NonNull final TotalCaptureResult p0) throws CameraAccessException;
    
    @Override
    public abstract void close();
    
    public boolean isSessionConfigurationSupported(@NonNull final SessionConfiguration sessionConfig) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void setCameraAudioRestriction(final int mode) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public int getCameraAudioRestriction() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class CameraDeviceSetup
    {
        CameraDeviceSetup() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract CaptureRequest.Builder createCaptureRequest(final int p0) throws CameraAccessException;
        
        public abstract boolean isSessionConfigurationSupported(@NonNull final SessionConfiguration p0) throws CameraAccessException;
        
        @NonNull
        public abstract CameraCharacteristics getSessionCharacteristics(@NonNull final SessionConfiguration p0) throws CameraAccessException;
        
        public abstract void openCamera(@NonNull final Executor p0, @NonNull final StateCallback p1) throws CameraAccessException;
        
        @NonNull
        public abstract String getId();
    }
    
    public abstract static class StateCallback
    {
        public static final int ERROR_CAMERA_DEVICE = 4;
        public static final int ERROR_CAMERA_DISABLED = 3;
        public static final int ERROR_CAMERA_IN_USE = 1;
        public static final int ERROR_CAMERA_SERVICE = 5;
        public static final int ERROR_MAX_CAMERAS_IN_USE = 2;
        
        public StateCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onOpened(@NonNull final CameraDevice p0);
        
        public void onClosed(@NonNull final CameraDevice camera) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onDisconnected(@NonNull final CameraDevice p0);
        
        public abstract void onError(@NonNull final CameraDevice p0, final int p1);
    }
}
