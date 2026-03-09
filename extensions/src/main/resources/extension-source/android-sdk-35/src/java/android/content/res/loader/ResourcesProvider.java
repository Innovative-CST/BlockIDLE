package android.content.res.loader;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import android.content.om.OverlayInfo;
import java.io.Closeable;

public class ResourcesProvider implements AutoCloseable, Closeable
{
    ResourcesProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider empty(@NonNull final AssetsProvider assetsProvider) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadOverlay(@NonNull final OverlayInfo overlayInfo) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadFromApk(@NonNull final ParcelFileDescriptor fileDescriptor) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadFromApk(@NonNull final ParcelFileDescriptor fileDescriptor, @Nullable final AssetsProvider assetsProvider) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadFromTable(@NonNull final ParcelFileDescriptor fileDescriptor, @Nullable final AssetsProvider assetsProvider) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadFromSplit(@NonNull final Context context, @NonNull final String splitName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ResourcesProvider loadFromDirectory(@NonNull final String path, @Nullable final AssetsProvider assetsProvider) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
