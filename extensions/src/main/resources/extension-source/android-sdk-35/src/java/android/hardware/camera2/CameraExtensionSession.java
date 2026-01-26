package android.hardware.camera2;

import java.util.concurrent.Executor;

public abstract class CameraExtensionSession implements AutoCloseable
{
    CameraExtensionSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CameraDevice getDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public int capture(@NonNull final CaptureRequest request, @NonNull final Executor executor, @NonNull final ExtensionCaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public int setRepeatingRequest(@NonNull final CaptureRequest request, @NonNull final Executor executor, @NonNull final ExtensionCaptureCallback listener) throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public void stopRepeating() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public StillCaptureLatency getRealtimeStillCaptureLatency() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws CameraAccessException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class ExtensionCaptureCallback
    {
        public ExtensionCaptureCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureStarted(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request, final long timestamp) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureProcessStarted(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureFailed(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureFailed(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request, final int failure) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureSequenceCompleted(@NonNull final CameraExtensionSession session, final int sequenceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureSequenceAborted(@NonNull final CameraExtensionSession session, final int sequenceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureResultAvailable(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request, @NonNull final TotalCaptureResult result) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCaptureProcessProgressed(@NonNull final CameraExtensionSession session, @NonNull final CaptureRequest request, final int progress) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class StateCallback
    {
        public StateCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onConfigured(@NonNull final CameraExtensionSession p0);
        
        public abstract void onConfigureFailed(@NonNull final CameraExtensionSession p0);
        
        public void onClosed(@NonNull final CameraExtensionSession session) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class StillCaptureLatency
    {
        public StillCaptureLatency(final long captureLatency, final long processingLatency) {
            throw new RuntimeException("Stub!");
        }
        
        public long getCaptureLatency() {
            throw new RuntimeException("Stub!");
        }
        
        public long getProcessingLatency() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
