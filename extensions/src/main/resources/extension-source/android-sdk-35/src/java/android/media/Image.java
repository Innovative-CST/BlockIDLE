package android.media;

import java.nio.ByteBuffer;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.io.IOException;
import android.hardware.SyncFence;

public abstract class Image implements AutoCloseable
{
    Image() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getFormat();
    
    public abstract int getWidth();
    
    public abstract int getHeight();
    
    public abstract long getTimestamp();
    
    @NonNull
    public SyncFence getFence() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public HardwareBuffer getHardwareBuffer() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimestamp(final long timestamp) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFence(@NonNull final SyncFence fence) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSpace(final int dataSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public Rect getCropRect() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCropRect(final Rect cropRect) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Plane[] getPlanes();
    
    @Override
    public abstract void close();
    
    public abstract static class Plane
    {
        Plane() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract int getRowStride();
        
        public abstract int getPixelStride();
        
        public abstract ByteBuffer getBuffer();
    }
}
