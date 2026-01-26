package android.net.wifi.p2p;

import java.util.Map;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import java.util.List;
import java.util.function.Consumer;
import android.net.MacAddress;
import android.net.wifi.p2p.nsd.WifiP2pServiceRequest;
import android.net.wifi.p2p.nsd.WifiP2pServiceInfo;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.Executor;

public class WifiP2pManager
{
    public static final String ACTION_WIFI_P2P_LISTEN_STATE_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_LISTEN_STATE_CHANGED";
    public static final String ACTION_WIFI_P2P_REQUEST_RESPONSE_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_REQUEST_RESPONSE_CHANGED";
    public static final int BUSY = 2;
    public static final int CONNECTION_REQUEST_ACCEPT = 0;
    public static final int CONNECTION_REQUEST_DEFER_SHOW_PIN_TO_SERVICE = 3;
    public static final int CONNECTION_REQUEST_DEFER_TO_SERVICE = 2;
    public static final int CONNECTION_REQUEST_REJECT = 1;
    public static final int ERROR = 0;
    public static final String EXTRA_DISCOVERY_STATE = "discoveryState";
    public static final String EXTRA_LISTEN_STATE = "android.net.wifi.p2p.extra.LISTEN_STATE";
    public static final String EXTRA_NETWORK_INFO = "networkInfo";
    public static final String EXTRA_P2P_DEVICE_LIST = "wifiP2pDeviceList";
    public static final String EXTRA_REQUEST_CONFIG = "android.net.wifi.p2p.extra.REQUEST_CONFIG";
    public static final String EXTRA_REQUEST_RESPONSE = "android.net.wifi.p2p.extra.REQUEST_RESPONSE";
    public static final String EXTRA_WIFI_P2P_DEVICE = "wifiP2pDevice";
    public static final String EXTRA_WIFI_P2P_GROUP = "p2pGroupInfo";
    public static final String EXTRA_WIFI_P2P_INFO = "wifiP2pInfo";
    public static final String EXTRA_WIFI_STATE = "wifi_p2p_state";
    public static final int GROUP_CREATION_FAILURE_REASON_CONNECTION_CANCELLED = 0;
    public static final int GROUP_CREATION_FAILURE_REASON_GROUP_REMOVED = 4;
    public static final int GROUP_CREATION_FAILURE_REASON_INVITATION_FAILED = 5;
    public static final int GROUP_CREATION_FAILURE_REASON_PROVISION_DISCOVERY_FAILED = 3;
    public static final int GROUP_CREATION_FAILURE_REASON_TIMED_OUT = 1;
    public static final int GROUP_CREATION_FAILURE_REASON_USER_REJECTED = 2;
    public static final int NO_SERVICE_REQUESTS = 3;
    public static final int P2P_UNSUPPORTED = 1;
    public static final String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
    public static final String WIFI_P2P_DISCOVERY_CHANGED_ACTION = "android.net.wifi.p2p.DISCOVERY_STATE_CHANGE";
    public static final int WIFI_P2P_DISCOVERY_STARTED = 2;
    public static final int WIFI_P2P_DISCOVERY_STOPPED = 1;
    public static final int WIFI_P2P_LISTEN_STARTED = 2;
    public static final int WIFI_P2P_LISTEN_STOPPED = 1;
    public static final String WIFI_P2P_PEERS_CHANGED_ACTION = "android.net.wifi.p2p.PEERS_CHANGED";
    public static final int WIFI_P2P_SCAN_FULL = 0;
    public static final int WIFI_P2P_SCAN_SINGLE_FREQ = 2;
    public static final int WIFI_P2P_SCAN_SOCIAL = 1;
    public static final String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";
    public static final int WIFI_P2P_STATE_DISABLED = 1;
    public static final int WIFI_P2P_STATE_ENABLED = 2;
    public static final String WIFI_P2P_THIS_DEVICE_CHANGED_ACTION = "android.net.wifi.p2p.THIS_DEVICE_CHANGED";
    
    WifiP2pManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerWifiP2pListener(@NonNull final Executor executor, @NonNull final WifiP2pListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterWifiP2pListener(@NonNull final WifiP2pListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public Channel initialize(final Context srcContext, final Looper srcLooper, final ChannelListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void discoverPeers(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void discoverPeersOnSocialChannels(@NonNull final Channel channel, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void discoverPeersOnSpecificFrequency(@NonNull final Channel channel, final int frequencyMhz, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void startPeerDiscovery(@NonNull final Channel channel, @NonNull final WifiP2pDiscoveryConfig config, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopPeerDiscovery(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void connect(final Channel channel, final WifiP2pConfig config, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelConnect(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void createGroup(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void createGroup(@NonNull final Channel channel, @Nullable final WifiP2pConfig config, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeGroup(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void startListening(@NonNull final Channel channel, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopListening(@NonNull final Channel channel, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addLocalService(final Channel channel, final WifiP2pServiceInfo servInfo, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeLocalService(final Channel channel, final WifiP2pServiceInfo servInfo, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearLocalServices(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setServiceResponseListener(final Channel channel, final ServiceResponseListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDnsSdResponseListeners(final Channel channel, final DnsSdServiceResponseListener servListener, final DnsSdTxtRecordListener txtListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUpnpServiceResponseListener(final Channel channel, final UpnpServiceResponseListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void discoverServices(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addServiceRequest(final Channel channel, final WifiP2pServiceRequest req, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeServiceRequest(final Channel channel, final WifiP2pServiceRequest req, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearServiceRequests(final Channel channel, final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestPeers(final Channel channel, final PeerListListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestConnectionInfo(final Channel channel, final ConnectionInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestGroupInfo(final Channel channel, final GroupInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWfdInfo(@NonNull final Channel channel, @NonNull final WifiP2pWfdInfo wfdInfo, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeClient(@NonNull final Channel channel, @NonNull final MacAddress peerAddress, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSetVendorElementsSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChannelConstrainedDiscoverySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupClientRemovalSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupOwnerIPv6LinkLocalAddressProvided() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestP2pState(@NonNull final Channel c, @NonNull final P2pStateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDiscoveryState(@NonNull final Channel c, @NonNull final DiscoveryStateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void getListenState(@NonNull final Channel c, @NonNull final Executor executor, @NonNull final Consumer<Integer> resultsCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNetworkInfo(@NonNull final Channel c, @NonNull final NetworkInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDeviceInfo(@NonNull final Channel c, @NonNull final DeviceInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addExternalApprover(@NonNull final Channel c, @NonNull final MacAddress deviceAddress, @NonNull final ExternalApproverRequestListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeExternalApprover(@NonNull final Channel c, @NonNull final MacAddress deviceAddress, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConnectionRequestResult(@NonNull final Channel c, @NonNull final MacAddress deviceAddress, final int result, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConnectionRequestResult(@NonNull final Channel c, @NonNull final MacAddress deviceAddress, final int result, @Nullable final String pin, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVendorElements(@NonNull final Channel c, @NonNull final List<ScanResult.InformationElement> vendorElements, @Nullable final ActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getP2pMaxAllowedVendorElementsLengthBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Channel implements AutoCloseable
    {
        Channel() {
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
    
    public interface WifiP2pListener
    {
        default void onP2pStateChanged(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        default void onDiscoveryStateChanged(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        default void onListenStateChanged(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        default void onDeviceConfigurationChanged(@Nullable final WifiP2pDevice p2pDevice) {
            throw new RuntimeException("Stub!");
        }
        
        default void onPeerListChanged(@NonNull final WifiP2pDeviceList p2pDeviceList) {
            throw new RuntimeException("Stub!");
        }
        
        default void onGroupCreating() {
            throw new RuntimeException("Stub!");
        }
        
        default void onGroupNegotiationRejectedByUser() {
            throw new RuntimeException("Stub!");
        }
        
        default void onGroupCreationFailed(final int reason) {
            throw new RuntimeException("Stub!");
        }
        
        default void onGroupCreated(@NonNull final WifiP2pInfo p2pInfo, @NonNull final WifiP2pGroup p2pGroup) {
            throw new RuntimeException("Stub!");
        }
        
        default void onPeerClientJoined(@NonNull final WifiP2pInfo p2pInfo, @NonNull final WifiP2pGroup p2pGroup) {
            throw new RuntimeException("Stub!");
        }
        
        default void onPeerClientDisconnected(@NonNull final WifiP2pInfo p2pInfo, @NonNull final WifiP2pGroup p2pGroup) {
            throw new RuntimeException("Stub!");
        }
        
        default void onFrequencyChanged(@NonNull final WifiP2pInfo p2pInfo, @NonNull final WifiP2pGroup p2pGroup) {
            throw new RuntimeException("Stub!");
        }
        
        default void onGroupRemoved() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface UpnpServiceResponseListener
    {
        void onUpnpServiceAvailable(final List<String> p0, final WifiP2pDevice p1);
    }
    
    public interface ServiceResponseListener
    {
        void onServiceAvailable(final int p0, final byte[] p1, final WifiP2pDevice p2);
    }
    
    public interface PeerListListener
    {
        void onPeersAvailable(final WifiP2pDeviceList p0);
    }
    
    public interface P2pStateListener
    {
        void onP2pStateAvailable(final int p0);
    }
    
    public interface NetworkInfoListener
    {
        void onNetworkInfoAvailable(@NonNull final NetworkInfo p0);
    }
    
    public interface GroupInfoListener
    {
        void onGroupInfoAvailable(final WifiP2pGroup p0);
    }
    
    public interface ExternalApproverRequestListener
    {
        public static final int APPROVER_DETACH_REASON_CLOSE = 3;
        public static final int APPROVER_DETACH_REASON_FAILURE = 1;
        public static final int APPROVER_DETACH_REASON_REMOVE = 0;
        public static final int APPROVER_DETACH_REASON_REPLACE = 2;
        public static final int REQUEST_TYPE_INVITATION = 1;
        public static final int REQUEST_TYPE_JOIN = 2;
        public static final int REQUEST_TYPE_NEGOTIATION = 0;
        
        void onAttached(@NonNull final MacAddress p0);
        
        void onDetached(@NonNull final MacAddress p0, final int p1);
        
        void onConnectionRequested(final int p0, @NonNull final WifiP2pConfig p1, @NonNull final WifiP2pDevice p2);
        
        void onPinGenerated(@NonNull final MacAddress p0, @NonNull final String p1);
    }
    
    public interface DnsSdTxtRecordListener
    {
        void onDnsSdTxtRecordAvailable(final String p0, final Map<String, String> p1, final WifiP2pDevice p2);
    }
    
    public interface DnsSdServiceResponseListener
    {
        void onDnsSdServiceAvailable(final String p0, final String p1, final WifiP2pDevice p2);
    }
    
    public interface DiscoveryStateListener
    {
        void onDiscoveryStateAvailable(final int p0);
    }
    
    public interface DeviceInfoListener
    {
        void onDeviceInfoAvailable(@Nullable final WifiP2pDevice p0);
    }
    
    public interface ConnectionInfoListener
    {
        void onConnectionInfoAvailable(final WifiP2pInfo p0);
    }
    
    public interface ChannelListener
    {
        void onChannelDisconnected();
    }
    
    public interface ActionListener
    {
        void onSuccess();
        
        void onFailure(final int p0);
    }
}
