package android.media;

public final class MediaCryptoException extends Exception implements MediaDrmThrowable
{
    public MediaCryptoException(@Nullable final String detailMessage) {
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
