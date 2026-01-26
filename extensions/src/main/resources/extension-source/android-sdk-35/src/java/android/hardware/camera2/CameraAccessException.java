package android.hardware.camera2;

import android.util.AndroidException;

public class CameraAccessException extends AndroidException
{
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;
    
    public CameraAccessException(final int problem) {
        throw new RuntimeException("Stub!");
    }
    
    public CameraAccessException(final int problem, final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public CameraAccessException(final int problem, final String message, final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public CameraAccessException(final int problem, final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getReason() {
        throw new RuntimeException("Stub!");
    }
}
