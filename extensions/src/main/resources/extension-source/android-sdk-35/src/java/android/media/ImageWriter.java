package android.media;

import android.os.Handler;
import android.view.Surface;

public class ImageWriter implements AutoCloseable
{
    ImageWriter() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ImageWriter newInstance(@NonNull final Surface surface, final int maxImages) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ImageWriter newInstance(@NonNull final Surface surface, final int maxImages, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxImages() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public Image dequeueInputImage() {
        throw new RuntimeException("Stub!");
    }
    
    public void queueInputImage(final Image image) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHardwareBufferFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnImageReleasedListener(final OnImageReleasedListener listener, final Handler handler) {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final Surface surface) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWidthAndHeight(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxImages(final int maxImages) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setImageFormat(final int imageFormat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHardwareBufferFormat(final int hardwareBufferFormat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDataSpace(final int dataSpace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUsage(final long usage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ImageWriter build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnImageReleasedListener
    {
        void onImageReleased(final ImageWriter p0);
    }
}
