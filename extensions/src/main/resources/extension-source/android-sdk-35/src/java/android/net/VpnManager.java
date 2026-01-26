package android.net;

import android.content.Intent;

public class VpnManager
{
    public static final String ACTION_VPN_MANAGER_EVENT = "android.net.action.VPN_MANAGER_EVENT";
    public static final String CATEGORY_EVENT_ALWAYS_ON_STATE_CHANGED = "android.net.category.EVENT_ALWAYS_ON_STATE_CHANGED";
    public static final String CATEGORY_EVENT_DEACTIVATED_BY_USER = "android.net.category.EVENT_DEACTIVATED_BY_USER";
    public static final String CATEGORY_EVENT_IKE_ERROR = "android.net.category.EVENT_IKE_ERROR";
    public static final String CATEGORY_EVENT_NETWORK_ERROR = "android.net.category.EVENT_NETWORK_ERROR";
    public static final int ERROR_CLASS_NOT_RECOVERABLE = 1;
    public static final int ERROR_CLASS_RECOVERABLE = 2;
    public static final int ERROR_CODE_NETWORK_IO = 3;
    public static final int ERROR_CODE_NETWORK_LOST = 2;
    public static final int ERROR_CODE_NETWORK_PROTOCOL_TIMEOUT = 1;
    public static final int ERROR_CODE_NETWORK_UNKNOWN_HOST = 0;
    public static final String EXTRA_ERROR_CLASS = "android.net.extra.ERROR_CLASS";
    public static final String EXTRA_ERROR_CODE = "android.net.extra.ERROR_CODE";
    public static final String EXTRA_SESSION_KEY = "android.net.extra.SESSION_KEY";
    public static final String EXTRA_TIMESTAMP_MILLIS = "android.net.extra.TIMESTAMP_MILLIS";
    public static final String EXTRA_UNDERLYING_LINK_PROPERTIES = "android.net.extra.UNDERLYING_LINK_PROPERTIES";
    public static final String EXTRA_UNDERLYING_NETWORK = "android.net.extra.UNDERLYING_NETWORK";
    public static final String EXTRA_UNDERLYING_NETWORK_CAPABILITIES = "android.net.extra.UNDERLYING_NETWORK_CAPABILITIES";
    public static final String EXTRA_VPN_PROFILE_STATE = "android.net.extra.VPN_PROFILE_STATE";
    
    VpnManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent provisionVpnProfile(@NonNull final PlatformVpnProfile profile) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteProvisionedVpnProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String startProvisionedVpnProfileSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startProvisionedVpnProfile() {
        throw new RuntimeException("Stub!");
    }
    
    public void stopProvisionedVpnProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public VpnProfileState getProvisionedVpnProfileState() {
        throw new RuntimeException("Stub!");
    }
}
