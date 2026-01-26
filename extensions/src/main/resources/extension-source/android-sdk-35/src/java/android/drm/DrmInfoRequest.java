package android.drm;

import java.util.Iterator;

@Deprecated
public class DrmInfoRequest
{
    @Deprecated
    public static final String ACCOUNT_ID = "account_id";
    @Deprecated
    public static final String SUBSCRIPTION_ID = "subscription_id";
    @Deprecated
    public static final int TYPE_REGISTRATION_INFO = 1;
    @Deprecated
    public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;
    @Deprecated
    public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;
    @Deprecated
    public static final int TYPE_UNREGISTRATION_INFO = 2;
    
    @Deprecated
    public DrmInfoRequest(final int infoType, final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getInfoType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void put(final String key, final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Object get(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Iterator<String> keyIterator() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Iterator<Object> iterator() {
        throw new RuntimeException("Stub!");
    }
}
