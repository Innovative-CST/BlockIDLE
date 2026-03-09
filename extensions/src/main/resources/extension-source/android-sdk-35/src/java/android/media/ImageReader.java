package android.media;

import android.os.Handler;
import android.view.Surface;

public class ImageReader implements AutoCloseable
{
    ImageReader() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ImageReader newInstance(final int width, final int height, final int format, final int maxImages) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ImageReader newInstance(final int width, final int height, final int format, final int maxImages, final long usage) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getImageFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHardwareBufferFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxImages() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    public Image acquireLatestImage() {
        throw new RuntimeException("Stub!");
    }
    
    public Image acquireNextImage() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnImageAvailableListener(final OnImageAvailableListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void discardFreeBuffers() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxImages(final int maxImages) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUsage(final long usage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setImageFormat(final int imageFormat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDefaultHardwareBufferFormat(final int hardwareBufferFormat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDefaultDataSpace(final int dataSpace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ImageReader build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnImageAvailableListener
    {
        void onImageAvailable(final ImageReader p0);
    }
}
