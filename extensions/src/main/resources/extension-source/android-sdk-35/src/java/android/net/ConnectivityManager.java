package android.net;

import java.net.InetSocketAddress;
import android.app.PendingIntent;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.net.InetAddress;

public class ConnectivityManager
{
    @Deprecated
    public static final String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
    public static final String ACTION_CAPTIVE_PORTAL_SIGN_IN = "android.net.conn.CAPTIVE_PORTAL";
    public static final String ACTION_RESTRICT_BACKGROUND_CHANGED = "android.net.conn.RESTRICT_BACKGROUND_CHANGED";
    @Deprecated
    public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    @Deprecated
    public static final int DEFAULT_NETWORK_PREFERENCE = 1;
    public static final String EXTRA_CAPTIVE_PORTAL = "android.net.extra.CAPTIVE_PORTAL";
    public static final String EXTRA_CAPTIVE_PORTAL_URL = "android.net.extra.CAPTIVE_PORTAL_URL";
    @Deprecated
    public static final String EXTRA_EXTRA_INFO = "extraInfo";
    @Deprecated
    public static final String EXTRA_IS_FAILOVER = "isFailover";
    public static final String EXTRA_NETWORK = "android.net.extra.NETWORK";
    @Deprecated
    public static final String EXTRA_NETWORK_INFO = "networkInfo";
    public static final String EXTRA_NETWORK_REQUEST = "android.net.extra.NETWORK_REQUEST";
    @Deprecated
    public static final String EXTRA_NETWORK_TYPE = "networkType";
    public static final String EXTRA_NO_CONNECTIVITY = "noConnectivity";
    @Deprecated
    public static final String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
    public static final String EXTRA_REASON = "reason";
    public static final int MULTIPATH_PREFERENCE_HANDOVER = 1;
    public static final int MULTIPATH_PREFERENCE_PERFORMANCE = 4;
    public static final int MULTIPATH_PREFERENCE_RELIABILITY = 2;
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
    @Deprecated
    public static final int TYPE_BLUETOOTH = 7;
    @Deprecated
    public static final int TYPE_DUMMY = 8;
    @Deprecated
    public static final int TYPE_ETHERNET = 9;
    @Deprecated
    public static final int TYPE_MOBILE = 0;
    @Deprecated
    public static final int TYPE_MOBILE_DUN = 4;
    @Deprecated
    public static final int TYPE_MOBILE_HIPRI = 5;
    @Deprecated
    public static final int TYPE_MOBILE_MMS = 2;
    @Deprecated
    public static final int TYPE_MOBILE_SUPL = 3;
    @Deprecated
    public static final int TYPE_VPN = 17;
    @Deprecated
    public static final int TYPE_WIFI = 1;
    @Deprecated
    public static final int TYPE_WIMAX = 6;
    
    ConnectivityManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isNetworkTypeValid(final int networkType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setNetworkPreference(final int preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getNetworkPreference() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public NetworkInfo getActiveNetworkInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getActiveNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public NetworkInfo getNetworkInfo(final int networkType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public NetworkInfo getNetworkInfo(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public NetworkInfo[] getAllNetworkInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Network[] getAllNetworks() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LinkProperties getLinkProperties(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkCapabilities getNetworkCapabilities(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SocketKeepalive createSocketKeepalive(@NonNull final Network network, @NonNull final IpSecManager.UdpEncapsulationSocket socket, @NonNull final InetAddress source, @NonNull final InetAddress destination, @NonNull final Executor executor, @NonNull final SocketKeepalive.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getBackgroundDataSetting() {
        throw new RuntimeException("Stub!");
    }
    
    public void addDefaultNetworkActiveListener(final OnNetworkActiveListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeDefaultNetworkActiveListener(@NonNull final OnNetworkActiveListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDefaultNetworkActive() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void reportBadNetwork(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportNetworkConnectivity(@Nullable final Network network, final boolean hasConnectivity) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ProxyInfo getDefaultProxy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActiveNetworkMetered() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetwork(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetwork(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetwork(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback, final int timeoutMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetwork(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback, @NonNull final Handler handler, final int timeoutMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetwork(@NonNull final NetworkRequest request, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseNetworkRequest(@NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerNetworkCallback(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerNetworkCallback(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerNetworkCallback(@NonNull final NetworkRequest request, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDefaultNetworkCallback(@NonNull final NetworkCallback networkCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDefaultNetworkCallback(@NonNull final NetworkCallback networkCallback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerBestMatchingNetworkCallback(@NonNull final NetworkRequest request, @NonNull final NetworkCallback networkCallback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestBandwidthUpdate(@NonNull final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterNetworkCallback(@NonNull final NetworkCallback networkCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterNetworkCallback(@NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMultipathPreference(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindProcessToNetwork(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean setProcessDefaultNetwork(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getBoundNetworkForProcess() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static Network getProcessDefaultNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRestrictBackgroundStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getNetworkWatchlistConfigHash() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionOwnerUid(final int protocol, @NonNull final InetSocketAddress local, @NonNull final InetSocketAddress remote) {
        throw new RuntimeException("Stub!");
    }
    
    public static class NetworkCallback
    {
        public static final int FLAG_INCLUDE_LOCATION_INFO = 1;
        
        public NetworkCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public NetworkCallback(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAvailable(@NonNull final Network network) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLosing(@NonNull final Network network, final int maxMsToLive) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLost(@NonNull final Network network) {
            throw new RuntimeException("Stub!");
        }
        
        public void onUnavailable() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCapabilitiesChanged(@NonNull final Network network, @NonNull final NetworkCapabilities networkCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLinkPropertiesChanged(@NonNull final Network network, @NonNull final LinkProperties linkProperties) {
            throw new RuntimeException("Stub!");
        }
        
        public void onBlockedStatusChanged(@NonNull final Network network, final boolean blocked) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnNetworkActiveListener
    {
        void onNetworkActive();
    }
}
