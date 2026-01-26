package android.hardware.camera2;

import java.util.List;

public abstract class CameraConstrainedHighSpeedCaptureSession extends CameraCaptureSession
{
    public CameraConstrainedHighSpeedCaptureSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<CaptureRequest> createHighSpeedRequestList(@NonNull final CaptureRequest p0) throws CameraAccessException;
}
