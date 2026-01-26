package android.hardware.camera2.params;

import android.os.Parcel;
import java.util.List;
import java.util.Collection;
import android.hardware.camera2.MultiResolutionImageReader;
import android.util.Size;
import android.view.Surface;
import android.os.Parcelable;

public final class OutputConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<OutputConfiguration> CREATOR;
    public static final int MIRROR_MODE_AUTO = 0;
    public static final int MIRROR_MODE_H = 2;
    public static final int MIRROR_MODE_NONE = 1;
    public static final int MIRROR_MODE_V = 3;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    public static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = 4;
    public static final int TIMESTAMP_BASE_DEFAULT = 0;
    public static final int TIMESTAMP_BASE_MONOTONIC = 2;
    public static final int TIMESTAMP_BASE_REALTIME = 3;
    public static final int TIMESTAMP_BASE_SENSOR = 1;
    
    public OutputConfiguration(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputConfiguration(final int surfaceGroupId, @NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> OutputConfiguration(@NonNull final Size surfaceSize, @NonNull final Class<T> klass) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputConfiguration(final int format, @NonNull final Size surfaceSize) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputConfiguration(final int surfaceGroupId, final int format, @NonNull final Size surfaceSize) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputConfiguration(final int format, @NonNull final Size surfaceSize, final long usage) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputConfiguration(final int surfaceGroupId, final int format, @NonNull final Size surfaceSize, final long usage) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDynamicRangeProfile(final long profile) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDynamicRangeProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Collection<OutputConfiguration> createInstancesForMultiResolutionOutput(@NonNull final MultiResolutionImageReader multiResolutionImageReader) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static List<OutputConfiguration> createInstancesForMultiResolutionOutput(@NonNull final Collection<MultiResolutionStreamInfo> streams, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setSurfacesForMultiResolutionOutput(@NonNull final Collection<OutputConfiguration> outputConfigurations, @NonNull final MultiResolutionImageReader multiResolutionImageReader) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableSurfaceSharing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPhysicalCameraId(@Nullable final String physicalCameraId) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSensorPixelModeUsed(final int sensorPixelModeUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSensorPixelModeUsed(final int sensorPixelModeUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSurface(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSurface(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStreamUseCase(final long streamUseCase) {
        throw new RuntimeException("Stub!");
    }
    
    public long getStreamUseCase() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimestampBase(final int timestampBase) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimestampBase() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMirrorMode(final int mirrorMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMirrorMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReadoutTimestampEnabled(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadoutTimestampEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSharedSurfaceCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Surface> getSurfaces() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSurfaceGroupId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
