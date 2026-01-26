package android.net.wifi.aware;

import android.net.MacAddress;

public class IdentityChangedListener
{
    public static final int CLUSTER_CHANGE_EVENT_JOINED = 1;
    public static final int CLUSTER_CHANGE_EVENT_STARTED = 0;
    
    public IdentityChangedListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void onIdentityChanged(final byte[] mac) {
        throw new RuntimeException("Stub!");
    }
    
    public void onClusterIdChanged(final int clusterEventType, @NonNull final MacAddress clusterId) {
        throw new RuntimeException("Stub!");
    }
}
