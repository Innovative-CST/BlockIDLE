package dalvik.system;

import java.util.zip.ZipException;

public final class ZipPathValidator
{
    ZipPathValidator() {
        throw new RuntimeException("Stub!");
    }
    
    public static void clearCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        default void onZipEntryAccess(@NonNull final String path) throws ZipException {
            throw new RuntimeException("Stub!");
        }
    }
}
