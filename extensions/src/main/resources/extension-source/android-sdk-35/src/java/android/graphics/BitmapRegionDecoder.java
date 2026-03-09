package android.graphics;

import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

public final class BitmapRegionDecoder
{
    BitmapRegionDecoder() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final byte[] data, final int offset, final int length, final boolean isShareable) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final byte[] data, final int offset, final int length) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final FileDescriptor fd, final boolean isShareable) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final ParcelFileDescriptor pfd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static BitmapRegionDecoder newInstance(@NonNull final InputStream is, final boolean isShareable) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static BitmapRegionDecoder newInstance(@NonNull final InputStream is) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final String pathName, final boolean isShareable) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BitmapRegionDecoder newInstance(@NonNull final String pathName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap decodeRegion(final Rect rect, final BitmapFactory.Options options) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRecycled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
