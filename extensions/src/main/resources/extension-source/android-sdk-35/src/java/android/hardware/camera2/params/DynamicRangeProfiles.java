package android.hardware.camera2.params;

import java.util.Set;

public final class DynamicRangeProfiles
{
    public static final long DOLBY_VISION_10B_HDR_OEM = 64L;
    public static final long DOLBY_VISION_10B_HDR_OEM_PO = 128L;
    public static final long DOLBY_VISION_10B_HDR_REF = 16L;
    public static final long DOLBY_VISION_10B_HDR_REF_PO = 32L;
    public static final long DOLBY_VISION_8B_HDR_OEM = 1024L;
    public static final long DOLBY_VISION_8B_HDR_OEM_PO = 2048L;
    public static final long DOLBY_VISION_8B_HDR_REF = 256L;
    public static final long DOLBY_VISION_8B_HDR_REF_PO = 512L;
    public static final long HDR10 = 4L;
    public static final long HDR10_PLUS = 8L;
    public static final long HLG10 = 2L;
    public static final long PUBLIC_MAX = 4096L;
    public static final long STANDARD = 1L;
    
    public DynamicRangeProfiles(@NonNull final long[] elements) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Long> getSupportedProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Long> getProfileCaptureRequestConstraints(final long profile) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExtraLatencyPresent(final long profile) {
        throw new RuntimeException("Stub!");
    }
}
