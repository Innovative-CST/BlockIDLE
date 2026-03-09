package android.content.om;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;

public class FabricatedOverlay
{
    public FabricatedOverlay(@NonNull final String overlayName, @NonNull final String targetPackage) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public OverlayIdentifier getIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetOverlayable(@Nullable final String targetOverlayable) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void setResourceValue(@NonNull final String resourceName, final int dataType, final int value, @Nullable final String configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void setResourceValue(@NonNull final String resourceName, final int dataType, @NonNull final String value, @Nullable final String configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void setResourceValue(@NonNull final String resourceName, @NonNull final ParcelFileDescriptor value, @Nullable final String configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void setNinePatchResourceValue(@NonNull final String resourceName, @NonNull final ParcelFileDescriptor value, @Nullable final String configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void setResourceValue(@NonNull final String resourceName, @NonNull final AssetFileDescriptor value, @Nullable final String configuration) {
        throw new RuntimeException("Stub!");
    }
}
