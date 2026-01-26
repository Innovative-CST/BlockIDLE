package android.hardware.camera2;

import android.view.Surface;
import java.util.concurrent.Executor;
import android.media.ImageReader;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import java.util.Collection;

public class MultiResolutionImageReader implements AutoCloseable
{
    public MultiResolutionImageReader(@NonNull final Collection<MultiResolutionStreamInfo> streams, final int format, final int maxImages) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnImageAvailableListener(@Nullable final ImageReader.OnImageAvailableListener listener, @Nullable final Executor executor) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void flush() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MultiResolutionStreamInfo getStreamInfoForImageReader(@NonNull final ImageReader reader) {
        throw new RuntimeException("Stub!");
    }
}
