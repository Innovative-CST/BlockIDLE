package android.hardware.camera2;

public abstract class CameraOfflineSession extends CameraCaptureSession
{
    public CameraOfflineSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public abstract void close();
    
    public abstract static class CameraOfflineSessionCallback
    {
        public static final int STATUS_INTERNAL_ERROR = 0;
        
        public CameraOfflineSessionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onReady(@NonNull final CameraOfflineSession p0);
        
        public abstract void onSwitchFailed(@NonNull final CameraOfflineSession p0);
        
        public abstract void onIdle(@NonNull final CameraOfflineSession p0);
        
        public abstract void onError(@NonNull final CameraOfflineSession p0, final int p1);
        
        public abstract void onClosed(@NonNull final CameraOfflineSession p0);
    }
}
