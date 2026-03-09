package android.graphics;

public final class RenderEffect
{
    RenderEffect() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createOffsetEffect(final float offsetX, final float offsetY) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createOffsetEffect(final float offsetX, final float offsetY, @NonNull final RenderEffect input) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createBlurEffect(final float radiusX, final float radiusY, @NonNull final RenderEffect inputEffect, @NonNull final Shader.TileMode edgeTreatment) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createBlurEffect(final float radiusX, final float radiusY, @NonNull final Shader.TileMode edgeTreatment) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createBitmapEffect(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createBitmapEffect(@NonNull final Bitmap bitmap, @Nullable final Rect src, @NonNull final Rect dst) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createColorFilterEffect(@NonNull final ColorFilter colorFilter, @NonNull final RenderEffect renderEffect) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createColorFilterEffect(@NonNull final ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createBlendModeEffect(@NonNull final RenderEffect dst, @NonNull final RenderEffect src, @NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createChainEffect(@NonNull final RenderEffect outer, @NonNull final RenderEffect inner) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createShaderEffect(@NonNull final Shader shader) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static RenderEffect createRuntimeShaderEffect(@NonNull final RuntimeShader shader, @NonNull final String uniformShaderName) {
        throw new RuntimeException("Stub!");
    }
}
