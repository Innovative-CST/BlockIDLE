package android.app.admin;

import android.graphics.drawable.Icon;
import android.graphics.drawable.Drawable;
import java.util.function.Supplier;

public class DevicePolicyResourcesManager
{
    DevicePolicyResourcesManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawable(@NonNull final String drawableId, @NonNull final String drawableStyle, @NonNull final Supplier<Drawable> defaultDrawableLoader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawable(@NonNull final String drawableId, @NonNull final String drawableStyle, @NonNull final String drawableSource, @NonNull final Supplier<Drawable> defaultDrawableLoader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawableForDensity(@NonNull final String drawableId, @NonNull final String drawableStyle, final int density, @NonNull final Supplier<Drawable> defaultDrawableLoader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawableForDensity(@NonNull final String drawableId, @NonNull final String drawableStyle, @NonNull final String drawableSource, final int density, @NonNull final Supplier<Drawable> defaultDrawableLoader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getDrawableAsIcon(@NonNull final String drawableId, @NonNull final String drawableStyle, @NonNull final String drawableSource, @Nullable final Icon defaultIcon) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getDrawableAsIcon(@NonNull final String drawableId, @NonNull final String drawableStyle, @Nullable final Icon defaultIcon) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getString(@NonNull final String stringId, @NonNull final Supplier<String> defaultStringLoader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getString(@NonNull final String stringId, @NonNull final Supplier<String> defaultStringLoader, @NonNull final Object... formatArgs) {
        throw new RuntimeException("Stub!");
    }
}
