package android.hardware.camera2;

import android.util.Range;
import android.util.Size;
import java.util.Set;
import java.util.List;

public final class CameraExtensionCharacteristics
{
    public static final int EXTENSION_AUTOMATIC = 0;
    @Deprecated
    public static final int EXTENSION_BEAUTY = 1;
    public static final int EXTENSION_BOKEH = 2;
    public static final int EXTENSION_FACE_RETOUCH = 1;
    public static final int EXTENSION_HDR = 3;
    public static final int EXTENSION_NIGHT = 4;
    
    CameraExtensionCharacteristics() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getSupportedExtensions() {
        throw new RuntimeException("Stub!");
    }
    
    public <T> T get(final int extension, @NonNull final CameraCharacteristics.Key<T> key) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<CameraCharacteristics.Key> getKeys(final int extension) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPostviewAvailable(final int extension) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Size> getPostviewSupportedSizes(final int extension, @NonNull final Size captureSize, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T> List<Size> getExtensionSupportedSizes(final int extension, @NonNull final Class<T> klass) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Size> getExtensionSupportedSizes(final int extension, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRangeMillis(final int extension, @NonNull final Size captureOutputSize, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCaptureProcessProgressAvailable(final int extension) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<CaptureRequest.Key> getAvailableCaptureRequestKeys(final int extension) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<CaptureResult.Key> getAvailableCaptureResultKeys(final int extension) {
        throw new RuntimeException("Stub!");
    }
}
