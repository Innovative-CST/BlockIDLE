package android.content.res.loader;

import android.content.res.AssetFileDescriptor;

public interface AssetsProvider
{
    @Nullable
    default AssetFileDescriptor loadAssetFd(@NonNull final String path, final int accessMode) {
        throw new RuntimeException("Stub!");
    }
}
