package android.graphics;

import android.util.Size;
import java.io.IOException;
import android.graphics.drawable.Drawable;
import android.content.res.AssetFileDescriptor;
import java.util.concurrent.Callable;
import java.io.File;
import java.nio.ByteBuffer;
import android.content.res.AssetManager;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.res.Resources;

public final class ImageDecoder implements AutoCloseable
{
    public static final int ALLOCATOR_DEFAULT = 0;
    public static final int ALLOCATOR_HARDWARE = 3;
    public static final int ALLOCATOR_SHARED_MEMORY = 2;
    public static final int ALLOCATOR_SOFTWARE = 1;
    public static final int MEMORY_POLICY_DEFAULT = 1;
    public static final int MEMORY_POLICY_LOW_RAM = 0;
    
    ImageDecoder() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isMimeTypeSupported(@NonNull final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final Resources res, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final ContentResolver cr, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final AssetManager assets, @NonNull final String fileName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final byte[] data, final int offset, final int length) throws ArrayIndexOutOfBoundsException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final ByteBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final File file) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Source createSource(@NonNull final Callable<AssetFileDescriptor> callable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetSize(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetSampleSize(final int sampleSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllocator(final int allocator) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAllocator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUnpremultipliedRequired(final boolean unpremultipliedRequired) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUnpremultipliedRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostProcessor(@Nullable final PostProcessor postProcessor) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PostProcessor getPostProcessor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnPartialImageListener(@Nullable final OnPartialImageListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public OnPartialImageListener getOnPartialImageListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCrop(@Nullable final Rect subset) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getCrop() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMutableRequired(final boolean mutable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMutableRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMemorySizePolicy(final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMemorySizePolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecodeAsAlphaMaskEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDecodeAsAlphaMaskEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetColorSpace(final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable decodeDrawable(@NonNull final Source src, @NonNull final OnHeaderDecodedListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable decodeDrawable(@NonNull final Source src) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap decodeBitmap(@NonNull final Source src, @NonNull final OnHeaderDecodedListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap decodeBitmap(@NonNull final Source src) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static final class DecodeException extends IOException
    {
        public static final int SOURCE_EXCEPTION = 1;
        public static final int SOURCE_INCOMPLETE = 2;
        public static final int SOURCE_MALFORMED_DATA = 3;
        
        DecodeException() {
            throw new RuntimeException("Stub!");
        }
        
        public int getError() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Source getSource() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ImageInfo
    {
        ImageInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Size getSize() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getMimeType() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isAnimated() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ColorSpace getColorSpace() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Source
    {
        Source() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnPartialImageListener
    {
        boolean onPartialImage(@NonNull final DecodeException p0);
    }
    
    public interface OnHeaderDecodedListener
    {
        void onHeaderDecoded(@NonNull final ImageDecoder p0, @NonNull final ImageInfo p1, @NonNull final Source p2);
    }
}
