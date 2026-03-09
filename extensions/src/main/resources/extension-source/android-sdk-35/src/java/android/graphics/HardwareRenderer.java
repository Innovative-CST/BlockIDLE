package android.graphics;

import java.util.concurrent.Executor;
import android.view.Surface;

public class HardwareRenderer
{
    public static final int SYNC_CONTEXT_IS_STOPPED = 4;
    public static final int SYNC_FRAME_DROPPED = 8;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = 2;
    public static final int SYNC_OK = 0;
    public static final int SYNC_REDRAW_REQUESTED = 1;
    
    public HardwareRenderer() {
        throw new RuntimeException("Stub!");
    }
    
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setName(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightSourceGeometry(final float lightX, final float lightY, final float lightZ, final float lightRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightSourceAlpha(final float ambientShadowAlpha, final float spotShadowAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentRoot(@Nullable final RenderNode content) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurface(@Nullable final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public FrameRenderRequest createRenderRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearContent() {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyFramePending() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOpaque(final boolean opaque) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDrawingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setDrawingEnabled(final boolean drawingEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public final class FrameRenderRequest
    {
        FrameRenderRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrameRenderRequest setVsyncTime(final long vsyncTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrameRenderRequest setFrameCommitCallback(@NonNull final Executor executor, @NonNull final Runnable frameCommitCallback) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrameRenderRequest setWaitForPresent(final boolean shouldWait) {
            throw new RuntimeException("Stub!");
        }
        
        public int syncAndDraw() {
            throw new RuntimeException("Stub!");
        }
    }
}
