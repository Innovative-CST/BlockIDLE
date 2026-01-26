package android.hardware.camera2;

import java.util.Map;
import java.util.List;

public final class TotalCaptureResult extends CaptureResult
{
    TotalCaptureResult() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CaptureResult> getPartialResults() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Map<String, CaptureResult> getPhysicalCameraResults() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, TotalCaptureResult> getPhysicalCameraTotalResults() {
        throw new RuntimeException("Stub!");
    }
}
