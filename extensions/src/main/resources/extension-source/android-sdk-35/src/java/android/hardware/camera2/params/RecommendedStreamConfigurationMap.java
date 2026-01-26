package android.hardware.camera2.params;

import android.view.Surface;
import android.util.Range;
import android.util.Size;
import java.util.Set;

public final class RecommendedStreamConfigurationMap
{
    public static final int USECASE_10BIT_OUTPUT = 8;
    public static final int USECASE_LOW_LATENCY_SNAPSHOT = 6;
    public static final int USECASE_PREVIEW = 0;
    public static final int USECASE_RAW = 5;
    public static final int USECASE_RECORD = 1;
    public static final int USECASE_SNAPSHOT = 3;
    public static final int USECASE_VIDEO_SNAPSHOT = 2;
    public static final int USECASE_ZSL = 4;
    
    RecommendedStreamConfigurationMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecommendedUseCase() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getOutputFormats() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Integer> getValidOutputFormatsForInput(final int inputFormat) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Integer> getInputFormats() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Size> getInputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutputSupportedFor(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Size> getOutputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Size> getHighSpeedVideoSizes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Range<Integer>> getHighSpeedVideoFpsRangesFor(@NonNull final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Range<Integer>> getHighSpeedVideoFpsRanges() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Size> getHighSpeedVideoSizesFor(@NonNull final Range<Integer> fpsRange) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<Size> getHighResolutionOutputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public long getOutputMinFrameDuration(final int format, @NonNull final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public long getOutputStallDuration(final int format, @NonNull final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> Set<Size> getOutputSizes(@NonNull final Class<T> klass) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> long getOutputMinFrameDuration(@NonNull final Class<T> klass, @NonNull final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> long getOutputStallDuration(@NonNull final Class<T> klass, @NonNull final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutputSupportedFor(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
}
