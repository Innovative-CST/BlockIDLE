package android.hardware.camera2;

import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import android.util.Size;
import java.io.OutputStream;
import android.location.Location;
import android.media.Image;
import android.graphics.Bitmap;

public final class DngCreator implements AutoCloseable
{
    public static final int MAX_THUMBNAIL_DIMENSION = 256;
    
    public DngCreator(@NonNull final CameraCharacteristics characteristics, @NonNull final CaptureResult metadata) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DngCreator setOrientation(final int orientation) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DngCreator setThumbnail(@NonNull final Bitmap pixels) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DngCreator setThumbnail(@NonNull final Image pixels) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DngCreator setLocation(@NonNull final Location location) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DngCreator setDescription(@NonNull final String description) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeInputStream(@NonNull final OutputStream dngOutput, @NonNull final Size size, @NonNull final InputStream pixels, final long offset) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writeByteBuffer(@NonNull final OutputStream dngOutput, @NonNull final Size size, @NonNull final ByteBuffer pixels, final long offset) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writeImage(@NonNull final OutputStream dngOutput, @NonNull final Image pixels) throws IOException {
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
