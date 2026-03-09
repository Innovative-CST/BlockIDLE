package android.graphics.pdf;

public final class RenderParams
{
    public static final int FLAG_RENDER_HIGHLIGHT_ANNOTATIONS = 4;
    public static final int FLAG_RENDER_TEXT_ANNOTATIONS = 2;
    public static final int RENDER_MODE_FOR_DISPLAY = 1;
    public static final int RENDER_MODE_FOR_PRINT = 2;
    
    RenderParams() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRenderMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRenderFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final int renderMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenderFlags(final int renderFlags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenderFlags(final int renderFlags, final int mask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RenderParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
