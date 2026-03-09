package android.os;

import java.io.FileDescriptor;
import java.util.concurrent.Executor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public final class FileUtils
{
    FileUtils() {
        throw new RuntimeException("Stub!");
    }
    
    public static long copy(@NonNull final InputStream in, @NonNull final OutputStream out) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static long copy(@NonNull final InputStream in, @NonNull final OutputStream out, @Nullable final CancellationSignal signal, @Nullable final Executor executor, @Nullable final ProgressListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static long copy(@NonNull final FileDescriptor in, @NonNull final FileDescriptor out) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static long copy(@NonNull final FileDescriptor in, @NonNull final FileDescriptor out, @Nullable final CancellationSignal signal, @Nullable final Executor executor, @Nullable final ProgressListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void closeQuietly(@Nullable final AutoCloseable closeable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void closeQuietly(@Nullable final FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
    
    public interface ProgressListener
    {
        void onProgress(final long p0);
    }
}
