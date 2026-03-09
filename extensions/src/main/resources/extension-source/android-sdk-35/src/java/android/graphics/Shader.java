package android.graphics;

public class Shader
{
    @Deprecated
    public Shader() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getLocalMatrix(@NonNull final Matrix localM) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocalMatrix(@Nullable final Matrix localM) {
        throw new RuntimeException("Stub!");
    }
    
    public enum TileMode
    {
        CLAMP, 
        REPEAT, 
        MIRROR, 
        DECAL;
    }
}
