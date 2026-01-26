package android.drm;

@Deprecated
public class DrmConvertedStatus
{
    @Deprecated
    public static final int STATUS_ERROR = 3;
    @Deprecated
    public static final int STATUS_INPUTDATA_ERROR = 2;
    @Deprecated
    public static final int STATUS_OK = 1;
    @Deprecated
    public final byte[] convertedData;
    @Deprecated
    public final int offset;
    @Deprecated
    public final int statusCode;
    
    @Deprecated
    public DrmConvertedStatus(final int statusCode, final byte[] convertedData, final int offset) {
        this.convertedData = null;
        this.offset = 0;
        this.statusCode = 0;
        throw new RuntimeException("Stub!");
    }
}
