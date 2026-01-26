package android.hardware.camera2;

public class CaptureFailure
{
    public static final int REASON_ERROR = 0;
    public static final int REASON_FLUSHED = 1;
    
    CaptureFailure() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CaptureRequest getRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFrameNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReason() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean wasImageCaptured() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSequenceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPhysicalCameraId() {
        throw new RuntimeException("Stub!");
    }
}
