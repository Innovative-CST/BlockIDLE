package android.media.tv.interactive;

import java.util.concurrent.Executor;
import android.os.Bundle;
import java.util.List;

public final class TvInteractiveAppManager
{
    public static final String ACTION_APP_LINK_COMMAND = "android.media.tv.interactive.action.APP_LINK_COMMAND";
    public static final String APP_LINK_KEY_BACK_URI = "back_uri";
    public static final String APP_LINK_KEY_CLASS_NAME = "class_name";
    public static final String APP_LINK_KEY_COMMAND_TYPE = "command_type";
    public static final String APP_LINK_KEY_PACKAGE_NAME = "package_name";
    public static final String APP_LINK_KEY_SERVICE_ID = "service_id";
    public static final int ERROR_BLOCKED = 5;
    public static final int ERROR_ENCRYPTED = 6;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = 2;
    public static final int ERROR_RESOURCE_UNAVAILABLE = 4;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_UNKNOWN_CHANNEL = 7;
    public static final int ERROR_WEAK_SIGNAL = 3;
    public static final String INTENT_KEY_BI_INTERACTIVE_APP_TYPE = "bi_interactive_app_type";
    public static final String INTENT_KEY_BI_INTERACTIVE_APP_URI = "bi_interactive_app_uri";
    public static final String INTENT_KEY_CHANNEL_URI = "channel_uri";
    public static final String INTENT_KEY_COMMAND_TYPE = "command_type";
    public static final String INTENT_KEY_INTERACTIVE_APP_SERVICE_ID = "interactive_app_id";
    public static final String INTENT_KEY_TV_INPUT_ID = "tv_input_id";
    public static final int INTERACTIVE_APP_STATE_ERROR = 3;
    public static final int INTERACTIVE_APP_STATE_RUNNING = 2;
    public static final int INTERACTIVE_APP_STATE_STOPPED = 1;
    public static final int SERVICE_STATE_ERROR = 4;
    public static final int SERVICE_STATE_PREPARING = 2;
    public static final int SERVICE_STATE_READY = 3;
    public static final int SERVICE_STATE_UNREALIZED = 1;
    public static final int TELETEXT_APP_STATE_ERROR = 3;
    public static final int TELETEXT_APP_STATE_HIDE = 2;
    public static final int TELETEXT_APP_STATE_SHOW = 1;
    
    TvInteractiveAppManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AppLinkInfo> getAppLinkInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAppLinkInfo(@NonNull final String tvIAppServiceId, @NonNull final AppLinkInfo appLinkInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAppLinkInfo(@NonNull final String tvIAppServiceId, @NonNull final AppLinkInfo appLinkInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAppLinkCommand(@NonNull final String tvIAppServiceId, @NonNull final Bundle command) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@NonNull final Executor executor, @NonNull final TvInteractiveAppCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(@NonNull final TvInteractiveAppCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class TvInteractiveAppCallback
    {
        public TvInteractiveAppCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onInteractiveAppServiceAdded(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInteractiveAppServiceRemoved(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInteractiveAppServiceUpdated(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvInteractiveAppServiceStateChanged(@NonNull final String iAppServiceId, final int type, final int state, final int err) {
            throw new RuntimeException("Stub!");
        }
    }
}
