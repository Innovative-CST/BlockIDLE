package android.hardware.camera2;

import java.util.Collection;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.List;
import android.view.Surface;

public abstract class CameraCaptureSession implements AutoCloseable
{
    public CameraCaptureSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract CameraDevice getDevice();
    
    public abstract void prepare(@NonNull final Surface p0) throws CameraAccessException;
    
    public abstract void finalizeOutputConfigurations(final List<OutputConfiguration> p0) throws CameraAccessException;
    
    public abstract int capture(@NonNull final CaptureRequest p0, @Nullable final CaptureCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    public int captureSingleRequest(@NonNull final CaptureRequest request, @NonNull final Executor executor, @NonNull final CaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int captureBurst(@NonNull final List<CaptureRequest> p0, @Nullable final CaptureCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    public int captureBurstRequests(@NonNull final List<CaptureRequest> requests, @NonNull final Executor executor, @NonNull final CaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int setRepeatingRequest(@NonNull final CaptureRequest p0, @Nullable final CaptureCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    public int setSingleRepeatingRequest(@NonNull final CaptureRequest request, @NonNull final Executor executor, @NonNull final CaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int setRepeatingBurst(@NonNull final List<CaptureRequest> p0, @Nullable final CaptureCallback p1, @Nullable final Handler p2) throws CameraAccessException;
    
    public int setRepeatingBurstRequests(@NonNull final List<CaptureRequest> requests, @NonNull final Executor executor, @NonNull final CaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void stopRepeating() throws CameraAccessException;
    
    public abstract void abortCaptures() throws CameraAccessException;
    
    public abstract boolean isReprocessable();
    
    @Nullable
    public abstract Surface getInputSurface();
    
    public void updateOutputConfiguration(final OutputConfiguration config) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CameraOfflineSession switchToOffline(@NonNull final Collection<Surface> offlineSurfaces, @NonNull final Executor executor, @NonNull final CameraOfflineSession.CameraOfflineSessionCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsOfflineProcessing(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public abstract void close();
    
    public abstract static class CaptureCallback
    {
        public CaptureCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureStarted(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, final long timestamp, final long frameNumber) {
            throw new RuntimeException("Stub!");
        }
        
        public void onReadoutStarted(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, final long timestamp, final long frameNumber) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureProgressed(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final CaptureResult partialResult) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureCompleted(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final TotalCaptureResult result) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureFailed(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final CaptureFailure failure) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession session, final int sequenceId, final long frameNumber) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureSequenceAborted(@NonNull final CameraCaptureSession session, final int sequenceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureBufferLost(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final Surface target, final long frameNumber) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class StateCallback
    {
        public StateCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onConfigured(@NonNull final CameraCaptureSession p0);
        
        public abstract void onConfigureFailed(@NonNull final CameraCaptureSession p0);
        
        public void onReady(@NonNull final CameraCaptureSession session) {
            throw new RuntimeException("Stub!");
        }
        
        public void onActive(@NonNull final CameraCaptureSession session) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureQueueEmpty(@NonNull final CameraCaptureSession session) {
            throw new RuntimeException("Stub!");
        }
        
        public void onClosed(@NonNull final CameraCaptureSession session) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSurfacePrepared(@NonNull final CameraCaptureSession session, @NonNull final Surface surface) {
            throw new RuntimeException("Stub!");
        }
    }
}
