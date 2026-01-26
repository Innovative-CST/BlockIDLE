package android.hardware.camera2.params;

import android.graphics.ColorSpace;
import java.util.Set;

public final class ColorSpaceProfiles
{
    public static final int UNSPECIFIED = -1;
    
    public ColorSpaceProfiles(@NonNull final long[] elements) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<ColorSpace.Named> getSupportedColorSpaces(final int imageFormat) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSupportedImageFormatsForColorSpace(@NonNull final ColorSpace.Named colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Long> getSupportedDynamicRangeProfiles(@NonNull final ColorSpace.Named colorSpace, final int imageFormat) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<ColorSpace.Named> getSupportedColorSpacesForDynamicRange(final int imageFormat, final long dynamicRangeProfile) {
        throw new RuntimeException("Stub!");
    }
}
