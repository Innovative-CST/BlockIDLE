package android.view.contentcapture;

import java.util.concurrent.Executor;
import java.util.Set;
import android.content.ComponentName;

public final class ContentCaptureManager
{
    public static final int DATA_SHARE_ERROR_CONCURRENT_REQUEST = 2;
    public static final int DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED = 3;
    public static final int DATA_SHARE_ERROR_UNKNOWN = 1;
    
    ContentCaptureManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getServiceComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isContentCaptureEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<ContentCaptureCondition> getContentCaptureConditions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentCaptureEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeData(@NonNull final DataRemovalRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void shareData(@NonNull final DataShareRequest request, @NonNull final Executor executor, @NonNull final DataShareWriteAdapter dataShareWriteAdapter) {
        throw new RuntimeException("Stub!");
    }
}
