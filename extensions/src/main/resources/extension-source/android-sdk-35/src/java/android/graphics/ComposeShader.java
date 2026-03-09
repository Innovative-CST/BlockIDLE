package android.graphics;

public class ComposeShader extends Shader
{
    @Deprecated
    public ComposeShader(@NonNull final Shader shaderA, @NonNull final Shader shaderB, @NonNull final Xfermode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public ComposeShader(@NonNull final Shader shaderA, @NonNull final Shader shaderB, @NonNull final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public ComposeShader(@NonNull final Shader shaderA, @NonNull final Shader shaderB, @NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
}
