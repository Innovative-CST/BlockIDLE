package android.graphics;

public class BitmapShader extends Shader
{
    public static final int FILTER_MODE_DEFAULT = 0;
    public static final int FILTER_MODE_LINEAR = 2;
    public static final int FILTER_MODE_NEAREST = 1;
    
    public BitmapShader(@NonNull final Bitmap bitmap, @NonNull final TileMode tileX, @NonNull final TileMode tileY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFilterMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxAnisotropy(final int maxAnisotropy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverrideGainmap(@Nullable final Gainmap overrideGainmap) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxAnisotropy() {
        throw new RuntimeException("Stub!");
    }
}
