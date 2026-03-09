package android.drm;

import java.util.HashMap;

@Deprecated
public class DrmEvent
{
    @Deprecated
    public static final String DRM_INFO_OBJECT = "drm_info_object";
    @Deprecated
    public static final String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
    @Deprecated
    public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
    @Deprecated
    public static final int TYPE_DRM_INFO_PROCESSED = 1002;
    
    @Deprecated
    protected DrmEvent(final int uniqueId, final int type, final String message, final HashMap<String, Object> attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected DrmEvent(final int uniqueId, final int type, final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getUniqueId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Object getAttribute(final String key) {
        throw new RuntimeException("Stub!");
    }
}
