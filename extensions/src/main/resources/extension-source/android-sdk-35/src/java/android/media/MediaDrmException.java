package android.media;

public class MediaDrmException extends Exception implements MediaDrmThrowable
{
    public MediaDrmException(final String detailMessage) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getVendorError() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOemError() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getErrorContext() {
        throw new RuntimeException("Stub!");
    }
}
