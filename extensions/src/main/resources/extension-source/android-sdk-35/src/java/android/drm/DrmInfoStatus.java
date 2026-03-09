package android.drm;

@Deprecated
public class DrmInfoStatus
{
    @Deprecated
    public static final int STATUS_ERROR = 2;
    @Deprecated
    public static final int STATUS_OK = 1;
    @Deprecated
    public final ProcessedData data;
    @Deprecated
    public final int infoType;
    @Deprecated
    public final String mimeType;
    @Deprecated
    public final int statusCode;
    
    @Deprecated
    public DrmInfoStatus(final int statusCode, final int infoType, final ProcessedData data, final String mimeType) {
        this.data = null;
        this.infoType = 0;
        this.mimeType = null;
        this.statusCode = 0;
        throw new RuntimeException("Stub!");
    }
}
