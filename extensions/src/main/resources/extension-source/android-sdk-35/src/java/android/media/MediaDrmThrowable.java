package android.media;

public interface MediaDrmThrowable
{
    default int getVendorError() {
        throw new RuntimeException("Stub!");
    }
    
    default int getOemError() {
        throw new RuntimeException("Stub!");
    }
    
    default int getErrorContext() {
        throw new RuntimeException("Stub!");
    }
}
