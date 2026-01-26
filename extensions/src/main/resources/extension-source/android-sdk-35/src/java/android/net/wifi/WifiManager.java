package android.net.wifi;

import android.os.WorkSource;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.Set;
import java.util.function.BiConsumer;
import java.net.InetAddress;
import android.os.Handler;
import android.net.DhcpInfo;
import android.os.Bundle;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.net.wifi.hotspot2.PasspointConfiguration;
import java.util.List;

public class WifiManager
{
    public static final String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
    public static final int ACTION_REMOVE_SUGGESTION_DISCONNECT = 2;
    public static final int ACTION_REMOVE_SUGGESTION_LINGER = 1;
    public static final String ACTION_REQUEST_SCAN_ALWAYS_AVAILABLE = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE";
    public static final String ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION = "android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION";
    public static final String ACTION_WIFI_SCAN_AVAILABILITY_CHANGED = "android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED";
    public static final String CHANNEL_DATA_KEY_FREQUENCY_MHZ = "CHANNEL_DATA_KEY_FREQUENCY_MHZ";
    public static final String CHANNEL_DATA_KEY_NUM_AP = "CHANNEL_DATA_KEY_NUM_AP";
    @Deprecated
    public static final int ERROR_AUTHENTICATING = 1;
    @Deprecated
    public static final String EXTRA_BSSID = "bssid";
    public static final String EXTRA_NETWORK_INFO = "networkInfo";
    public static final String EXTRA_NETWORK_SUGGESTION = "android.net.wifi.extra.NETWORK_SUGGESTION";
    public static final String EXTRA_NEW_RSSI = "newRssi";
    @Deprecated
    public static final String EXTRA_NEW_STATE = "newState";
    public static final String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
    public static final String EXTRA_RESULTS_UPDATED = "resultsUpdated";
    public static final String EXTRA_SCAN_AVAILABLE = "android.net.wifi.extra.SCAN_AVAILABLE";
    @Deprecated
    public static final String EXTRA_SUPPLICANT_CONNECTED = "connected";
    @Deprecated
    public static final String EXTRA_SUPPLICANT_ERROR = "supplicantError";
    @Deprecated
    public static final String EXTRA_WIFI_INFO = "wifiInfo";
    public static final String EXTRA_WIFI_STATE = "wifi_state";
    public static final int FLAG_SEND_DHCP_HOSTNAME_RESTRICTION_OPEN = 1;
    public static final int FLAG_SEND_DHCP_HOSTNAME_RESTRICTION_SECURE = 2;
    public static final String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
    public static final String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
    public static final int ROAMING_MODE_AGGRESSIVE = 2;
    public static final int ROAMING_MODE_NONE = 0;
    public static final int ROAMING_MODE_NORMAL = 1;
    public static final String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
    public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_ASSOCIATION = 1;
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_AUTHENTICATION = 2;
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_IP_PROVISIONING = 3;
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_NOT_FOUND = 4;
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_NO_RESPONSE = 5;
    public static final int STATUS_LOCAL_ONLY_CONNECTION_FAILURE_UNKNOWN = 0;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_DUPLICATE = 3;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_EXCEEDS_MAX_PER_APP = 4;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_INVALID = 7;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_NOT_ALLOWED = 6;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_APP_DISALLOWED = 2;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_INTERNAL = 1;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_REMOVE_INVALID = 5;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_RESTRICTED_BY_ADMIN = 8;
    public static final int STATUS_NETWORK_SUGGESTIONS_SUCCESS = 0;
    public static final int STATUS_SUGGESTION_APPROVAL_APPROVED_BY_CARRIER_PRIVILEGE = 4;
    public static final int STATUS_SUGGESTION_APPROVAL_APPROVED_BY_USER = 2;
    public static final int STATUS_SUGGESTION_APPROVAL_PENDING = 1;
    public static final int STATUS_SUGGESTION_APPROVAL_REJECTED_BY_USER = 3;
    public static final int STATUS_SUGGESTION_APPROVAL_UNKNOWN = 0;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_ASSOCIATION = 1;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_AUTHENTICATION = 2;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_IP_PROVISIONING = 3;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_UNKNOWN = 0;
    @Deprecated
    public static final String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
    @Deprecated
    public static final String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
    public static final String UNKNOWN_SSID = "<unknown ssid>";
    public static final int WIFI_INTERFACE_TYPE_AP = 1;
    public static final int WIFI_INTERFACE_TYPE_AWARE = 2;
    public static final int WIFI_INTERFACE_TYPE_DIRECT = 3;
    public static final int WIFI_INTERFACE_TYPE_STA = 0;
    @Deprecated
    public static final int WIFI_MODE_FULL = 1;
    @Deprecated
    public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
    public static final int WIFI_MODE_FULL_LOW_LATENCY = 4;
    @Deprecated
    public static final int WIFI_MODE_SCAN_ONLY = 2;
    public static final int WIFI_MULTI_INTERNET_MODE_DBS_AP = 1;
    public static final int WIFI_MULTI_INTERNET_MODE_DISABLED = 0;
    public static final int WIFI_MULTI_INTERNET_MODE_MULTI_AP = 2;
    public static final String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
    public static final int WIFI_STATE_DISABLED = 1;
    public static final int WIFI_STATE_DISABLING = 0;
    public static final int WIFI_STATE_ENABLED = 3;
    public static final int WIFI_STATE_ENABLING = 2;
    public static final int WIFI_STATE_UNKNOWN = 4;
    @Deprecated
    public static final int WPS_AUTH_FAILURE = 6;
    @Deprecated
    public static final int WPS_OVERLAP_ERROR = 3;
    @Deprecated
    public static final int WPS_TIMED_OUT = 7;
    @Deprecated
    public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
    @Deprecated
    public static final int WPS_WEP_PROHIBITED = 4;
    
    WifiManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<WifiConfiguration> getConfiguredNetworks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<WifiConfiguration> getCallerConfiguredNetworks() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int addNetwork(final WifiConfiguration config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AddNetworkResult addNetworkPrivileged(@NonNull final WifiConfiguration config) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int updateNetwork(final WifiConfiguration config) {
        throw new RuntimeException("Stub!");
    }
    
    public int addNetworkSuggestions(@NonNull final List<WifiNetworkSuggestion> networkSuggestions) {
        throw new RuntimeException("Stub!");
    }
    
    public int removeNetworkSuggestions(@NonNull final List<WifiNetworkSuggestion> networkSuggestions) {
        throw new RuntimeException("Stub!");
    }
    
    public int removeNetworkSuggestions(@NonNull final List<WifiNetworkSuggestion> networkSuggestions, final int action) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<WifiNetworkSuggestion> getNetworkSuggestions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxNumberOfNetworkSuggestionsPerApp() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOrUpdatePasspointConfiguration(final PasspointConfiguration config) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removePasspointConfiguration(final String fqdn) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<PasspointConfiguration> getPasspointConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean removeNetwork(final int netId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeNonCallerConfiguredNetworks() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean enableNetwork(final int netId, final boolean attemptConnect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean disableNetwork(final int netId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean reconnect() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean reassociate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean pingSupplicant() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isP2pSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStaApConcurrencySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStaConcurrencyForLocalOnlyConnectionsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMakeBeforeBreakWifiSwitchingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStaConcurrencyForMultiInternetSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isDeviceToApRttSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPreferredNetworkOffloadSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTdlsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnhancedPowerReportingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is24GHzBandSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is5GHzBandSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is60GHzBandSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is6GHzBandSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWifiStandardSupported(final int standard) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStaBridgedApConcurrencySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBridgedApConcurrencySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isD2dSupportedWhenInfraStaDisabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean startScan() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public WifiInfo getConnectionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public List<ScanResult> getScanResults() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isScanAlwaysAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public void getChannelData(@NonNull final Executor executor, @NonNull final Consumer<List<Bundle>> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean saveConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DhcpInfo getDhcpInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setWifiEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSubsystemRestartTrackingCallback(@NonNull final Executor executor, @NonNull final SubsystemRestartTrackingCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterSubsystemRestartTrackingCallback(@NonNull final SubsystemRestartTrackingCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWifiState() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWifiEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int calculateSignalLevel(final int rssi, final int numLevels) {
        throw new RuntimeException("Stub!");
    }
    
    public int calculateSignalLevel(final int rssi) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSignalLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public static int compareSignalLevel(final int rssiA, final int rssiB) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean validateSoftApConfiguration(@NonNull final SoftApConfiguration config) {
        throw new RuntimeException("Stub!");
    }
    
    public void startLocalOnlyHotspot(final LocalOnlyHotspotCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTdlsEnabled(final InetAddress remoteIPAddress, final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTdlsEnabled(@NonNull final InetAddress remoteIPAddress, final boolean enable, @NonNull final Executor executor, @NonNull final Consumer<Boolean> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTdlsEnabledWithMacAddress(final String remoteMacAddress, final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTdlsEnabledWithMacAddress(@NonNull final String remoteMacAddress, final boolean enable, @NonNull final Executor executor, @NonNull final Consumer<Boolean> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void isTdlsOperationCurrentlyAvailable(@NonNull final Executor executor, @NonNull final Consumer<Boolean> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getMaxSupportedConcurrentTdlsSessions(@NonNull final Executor executor, @NonNull final Consumer<Integer> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getNumberOfEnabledTdlsSessions(@NonNull final Executor executor, @NonNull final Consumer<Integer> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void allowAutojoinGlobal(final boolean allowAutojoin) {
        throw new RuntimeException("Stub!");
    }
    
    public void queryAutojoinGlobal(@NonNull final Executor executor, @NonNull final Consumer<Boolean> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startWps(final WpsInfo config, final WpsCallback listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void cancelWps(final WpsCallback listener) {
        throw new RuntimeException("Stub!");
    }
    
    public WifiLock createWifiLock(final int lockType, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public WifiLock createWifiLock(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public MulticastLock createMulticastLock(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWpa3SaeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWpa3SuiteBSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnhancedOpenSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEasyConnectSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEasyConnectEnrolleeResponderModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWapiSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWpa3SaePublicKeySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPasspointTermsAndConditionsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWpa3SaeH2eSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWifiDisplayR2Supported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDecoratedIdentitySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTrustOnFirstUseSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEasyConnectDppAkmSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTlsMinimumVersionSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTlsV13Supported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDualBandSimultaneousSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTidToLinkMappingNegotiationSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWepSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWpaPersonalSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerScanResultsCallback(@NonNull final Executor executor, @NonNull final ScanResultsCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterScanResultsCallback(@NonNull final ScanResultsCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSuggestionConnectionStatusListener(@NonNull final Executor executor, @NonNull final SuggestionConnectionStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSuggestionConnectionStatusListener(@NonNull final SuggestionConnectionStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addLocalOnlyConnectionFailureListener(@NonNull final Executor executor, @NonNull final LocalOnlyConnectionFailureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeLocalOnlyConnectionFailureListener(@NonNull final LocalOnlyConnectionFailureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScanThrottleEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoWakeupEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCarrierNetworkOffloadEnabled(final int subscriptionId, final boolean merged) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSuggestionUserApprovalStatusListener(@NonNull final Executor executor, @NonNull final SuggestionUserApprovalStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSuggestionUserApprovalStatusListener(@NonNull final SuggestionUserApprovalStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void flushPasspointAnqpCache() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<WifiAvailableChannel> getAllowedChannels(final int band, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<WifiAvailableChannel> getUsableChannels(final int band, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWifiPasspointEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStaConcurrencyForMultiInternetMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void reportCreateInterfaceImpact(final int interfaceType, final boolean requireNewInterface, @NonNull final Executor executor, @NonNull final BiConsumer<Boolean, Set<InterfaceCreationImpact>> resultCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxNumberOfChannelsPerNetworkSpecifierRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSendDhcpHostnameRestriction(final int restriction) {
        throw new RuntimeException("Stub!");
    }
    
    public void querySendDhcpHostnameRestriction(@NonNull final Executor executor, @NonNull final IntConsumer resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAggressiveRoamingModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPerSsidRoamingMode(@NonNull final WifiSsid ssid, final int roamingMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void removePerSsidRoamingMode(@NonNull final WifiSsid ssid) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPerSsidRoamingModes(@NonNull final Executor executor, @NonNull final Consumer<Map<String, Integer>> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class AddNetworkResult implements Parcelable
    {
        @NonNull
        public static final Creator<AddNetworkResult> CREATOR;
        public static final int STATUS_ADD_PASSPOINT_FAILURE = 3;
        public static final int STATUS_ADD_WIFI_CONFIG_FAILURE = 4;
        public static final int STATUS_FAILURE_UNKNOWN = 1;
        public static final int STATUS_FAILURE_UPDATE_NETWORK_KEYS = 9;
        public static final int STATUS_INVALID_CONFIGURATION = 5;
        public static final int STATUS_INVALID_CONFIGURATION_ENTERPRISE = 10;
        public static final int STATUS_NO_PERMISSION = 2;
        public static final int STATUS_NO_PERMISSION_MODIFY_CONFIG = 6;
        public static final int STATUS_NO_PERMISSION_MODIFY_MAC_RANDOMIZATION = 8;
        public static final int STATUS_NO_PERMISSION_MODIFY_PROXY_SETTING = 7;
        public static final int STATUS_SUCCESS = 0;
        public final int networkId;
        public final int statusCode;
        
        public AddNetworkResult(final int statusCode, final int networkId) {
            this.networkId = 0;
            this.statusCode = 0;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class InterfaceCreationImpact
    {
        public InterfaceCreationImpact(final int interfaceType, @NonNull final Set<String> packages) {
            throw new RuntimeException("Stub!");
        }
        
        public int getInterfaceType() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Set<String> getPackages() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object that) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class LocalOnlyHotspotCallback
    {
        public static final int ERROR_GENERIC = 2;
        public static final int ERROR_INCOMPATIBLE_MODE = 3;
        public static final int ERROR_NO_CHANNEL = 1;
        public static final int ERROR_TETHERING_DISALLOWED = 4;
        
        public LocalOnlyHotspotCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStarted(final LocalOnlyHotspotReservation reservation) {
            throw new RuntimeException("Stub!");
        }
        
        public void onStopped() {
            throw new RuntimeException("Stub!");
        }
        
        public void onFailed(final int reason) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class LocalOnlyHotspotReservation implements AutoCloseable
    {
        LocalOnlyHotspotReservation() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public WifiConfiguration getWifiConfiguration() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SoftApConfiguration getSoftApConfiguration() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class MulticastLock
    {
        MulticastLock() {
            throw new RuntimeException("Stub!");
        }
        
        public void acquire() {
            throw new RuntimeException("Stub!");
        }
        
        public void release() {
            throw new RuntimeException("Stub!");
        }
        
        public void setReferenceCounted(final boolean refCounted) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isHeld() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class ScanResultsCallback
    {
        public ScanResultsCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onScanResultsAvailable();
    }
    
    public abstract static class SubsystemRestartTrackingCallback
    {
        public SubsystemRestartTrackingCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onSubsystemRestarting();
        
        public abstract void onSubsystemRestarted();
    }
    
    public class WifiLock
    {
        WifiLock() {
            throw new RuntimeException("Stub!");
        }
        
        public void acquire() {
            throw new RuntimeException("Stub!");
        }
        
        public void release() {
            throw new RuntimeException("Stub!");
        }
        
        public void setReferenceCounted(final boolean refCounted) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isHeld() {
            throw new RuntimeException("Stub!");
        }
        
        public void setWorkSource(final WorkSource ws) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public abstract static class WpsCallback
    {
        @Deprecated
        public WpsCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public abstract void onStarted(final String p0);
        
        @Deprecated
        public abstract void onSucceeded();
        
        @Deprecated
        public abstract void onFailed(final int p0);
    }
    
    public interface SuggestionUserApprovalStatusListener
    {
        void onUserApprovalStatusChange(final int p0);
    }
    
    public interface SuggestionConnectionStatusListener
    {
        void onConnectionStatus(@NonNull final WifiNetworkSuggestion p0, final int p1);
    }
    
    public interface LocalOnlyConnectionFailureListener
    {
        void onConnectionFailed(@NonNull final WifiNetworkSpecifier p0, final int p1);
    }
}
