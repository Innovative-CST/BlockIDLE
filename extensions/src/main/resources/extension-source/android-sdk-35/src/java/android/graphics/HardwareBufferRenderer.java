package android.graphics;

import android.hardware.SyncFence;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.hardware.HardwareBuffer;

public class HardwareBufferRenderer implements AutoCloseable
{
    public HardwareBufferRenderer(@NonNull final HardwareBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentRoot(@Nullable final RenderNode content) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RenderRequest obtainRenderRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightSourceGeometry(final float lightX, final float lightY, final float lightZ, final float lightRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightSourceAlpha(final float ambientShadowAlpha, final float spotShadowAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    public final class RenderRequest
    {
        RenderRequest() {
            throw new RuntimeException("Stub!");
        }
        
        public void draw(@NonNull final Executor executor, @NonNull final Consumer<RenderResult> renderCallback) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RenderRequest setColorSpace(@Nullable final ColorSpace colorSpace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RenderRequest setBufferTransform(final int bufferTransform) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RenderResult
    {
        public static final int ERROR_UNKNOWN = 1;
        public static final int SUCCESS = 0;
        
        RenderResult() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SyncFence getFence() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStatus() {
            throw new RuntimeException("Stub!");
        }
    }
}
