package android.net.wifi.aware;

import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.os.Handler;

public class WifiAwareManager
{
    public static final String ACTION_WIFI_AWARE_RESOURCE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_RESOURCE_CHANGED";
    public static final String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
    public static final String EXTRA_AWARE_RESOURCES = "android.net.wifi.aware.extra.AWARE_RESOURCES";
    public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
    public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
    public static final int WIFI_AWARE_DISCOVERY_LOST_REASON_PEER_NOT_VISIBLE = 1;
    public static final int WIFI_AWARE_DISCOVERY_LOST_REASON_UNKNOWN = 0;
    
    WifiAwareManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceAttached() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSetChannelOnDataPathSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInstantCommunicationModeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Characteristics getCharacteristics() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AwareResources getAvailableAwareResources() {
        throw new RuntimeException("Stub!");
    }
    
    public void attach(@NonNull final AttachCallback attachCallback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void attach(@NonNull final AttachCallback attachCallback, @NonNull final IdentityChangedListener identityChangedListener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOpportunisticModeEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void isOpportunisticModeEnabled(@NonNull final Executor executor, @NonNull final Consumer<Boolean> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetPairedDevices() {
        throw new RuntimeException("Stub!");
    }
    
    public void removePairedDevice(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPairedDevices(@NonNull final Executor executor, @NonNull final Consumer<List<String>> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
}
