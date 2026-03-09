package android.app;

import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.graphics.drawable.Icon;
import android.content.ComponentName;

public class StatusBarManager
{
    public static final int TILE_ADD_REQUEST_ERROR_APP_NOT_IN_FOREGROUND = 1004;
    public static final int TILE_ADD_REQUEST_ERROR_BAD_COMPONENT = 1002;
    public static final int TILE_ADD_REQUEST_ERROR_MISMATCHED_PACKAGE = 1000;
    public static final int TILE_ADD_REQUEST_ERROR_NOT_CURRENT_USER = 1003;
    public static final int TILE_ADD_REQUEST_ERROR_NO_STATUS_BAR_SERVICE = 1005;
    public static final int TILE_ADD_REQUEST_ERROR_REQUEST_IN_PROGRESS = 1001;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ADDED = 2;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ALREADY_ADDED = 1;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_NOT_ADDED = 0;
    
    StatusBarManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestAddTileService(@NonNull final ComponentName tileServiceComponentName, @NonNull final CharSequence tileLabel, @NonNull final Icon icon, @NonNull final Executor resultExecutor, @NonNull final Consumer<Integer> resultCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canLaunchCaptureContentActivityForNote(@NonNull final Activity activity) {
        throw new RuntimeException("Stub!");
    }
}
