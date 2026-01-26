package android.window;

import android.view.SurfaceControl;
import android.view.SurfaceControlViewHost;
import android.view.AttachedSurfaceControl;

public final class SurfaceSyncGroup
{
    public SurfaceSyncGroup(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void markSyncReady() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean add(@Nullable final AttachedSurfaceControl attachedSurfaceControl, @Nullable final Runnable runnable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean add(@NonNull final SurfaceControlViewHost.SurfacePackage surfacePackage, @Nullable final Runnable runnable) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTransaction(@NonNull final SurfaceControl.Transaction transaction) {
        throw new RuntimeException("Stub!");
    }
}
