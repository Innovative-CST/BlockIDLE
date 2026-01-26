package android.media;

import java.io.IOException;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.File;
import android.graphics.Bitmap;

public class ThumbnailUtils
{
    public static final int OPTIONS_RECYCLE_INPUT = 2;
    
    public ThumbnailUtils() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static Bitmap createAudioThumbnail(@NonNull final String filePath, final int kind) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createAudioThumbnail(@NonNull final File file, @NonNull final Size size, @Nullable final CancellationSignal signal) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static Bitmap createImageThumbnail(@NonNull final String filePath, final int kind) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createImageThumbnail(@NonNull final File file, @NonNull final Size size, @Nullable final CancellationSignal signal) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static Bitmap createVideoThumbnail(@NonNull final String filePath, final int kind) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createVideoThumbnail(@NonNull final File file, @NonNull final Size size, @Nullable final CancellationSignal signal) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static Bitmap extractThumbnail(final Bitmap source, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public static Bitmap extractThumbnail(final Bitmap source, final int width, final int height, final int options) {
        throw new RuntimeException("Stub!");
    }
}
