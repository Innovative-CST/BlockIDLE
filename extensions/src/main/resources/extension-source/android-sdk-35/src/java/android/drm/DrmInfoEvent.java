package android.drm;

import java.util.HashMap;

@Deprecated
public class DrmInfoEvent extends DrmEvent
{
    @Deprecated
    public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;
    @Deprecated
    public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;
    @Deprecated
    public static final int TYPE_REMOVE_RIGHTS = 2;
    @Deprecated
    public static final int TYPE_RIGHTS_INSTALLED = 3;
    @Deprecated
    public static final int TYPE_RIGHTS_REMOVED = 6;
    @Deprecated
    public static final int TYPE_WAIT_FOR_RIGHTS = 4;
    
    @Deprecated
    public DrmInfoEvent(final int uniqueId, final int type, final String message) {
        super(0, 0, null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DrmInfoEvent(final int uniqueId, final int type, final String message, final HashMap<String, Object> attributes) {
        super(0, 0, null);
        throw new RuntimeException("Stub!");
    }
}
