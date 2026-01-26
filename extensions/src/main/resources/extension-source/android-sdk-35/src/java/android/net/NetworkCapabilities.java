package android.net;

import java.util.Set;
import android.os.Parcel;
import android.os.Parcelable;

public final class NetworkCapabilities implements Parcelable
{
    @NonNull
    public static final Creator<NetworkCapabilities> CREATOR;
    public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
    public static final int NET_CAPABILITY_CBS = 5;
    public static final int NET_CAPABILITY_DUN = 2;
    public static final int NET_CAPABILITY_EIMS = 10;
    public static final int NET_CAPABILITY_ENTERPRISE = 29;
    public static final int NET_CAPABILITY_FOREGROUND = 19;
    public static final int NET_CAPABILITY_FOTA = 3;
    public static final int NET_CAPABILITY_HEAD_UNIT = 32;
    public static final int NET_CAPABILITY_IA = 7;
    public static final int NET_CAPABILITY_IMS = 4;
    public static final int NET_CAPABILITY_INTERNET = 12;
    public static final int NET_CAPABILITY_LOCAL_NETWORK = 36;
    public static final int NET_CAPABILITY_MCX = 23;
    public static final int NET_CAPABILITY_MMS = 0;
    public static final int NET_CAPABILITY_MMTEL = 33;
    public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
    public static final int NET_CAPABILITY_NOT_METERED = 11;
    public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
    public static final int NET_CAPABILITY_NOT_ROAMING = 18;
    public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
    public static final int NET_CAPABILITY_NOT_VPN = 15;
    public static final int NET_CAPABILITY_PRIORITIZE_BANDWIDTH = 35;
    public static final int NET_CAPABILITY_PRIORITIZE_LATENCY = 34;
    public static final int NET_CAPABILITY_RCS = 8;
    public static final int NET_CAPABILITY_SUPL = 1;
    public static final int NET_CAPABILITY_TEMPORARILY_NOT_METERED = 25;
    public static final int NET_CAPABILITY_TRUSTED = 14;
    public static final int NET_CAPABILITY_VALIDATED = 16;
    public static final int NET_CAPABILITY_WIFI_P2P = 6;
    public static final int NET_CAPABILITY_XCAP = 9;
    public static final int NET_ENTERPRISE_ID_1 = 1;
    public static final int NET_ENTERPRISE_ID_2 = 2;
    public static final int NET_ENTERPRISE_ID_3 = 3;
    public static final int NET_ENTERPRISE_ID_4 = 4;
    public static final int NET_ENTERPRISE_ID_5 = 5;
    public static final int SIGNAL_STRENGTH_UNSPECIFIED = Integer.MIN_VALUE;
    public static final int TRANSPORT_BLUETOOTH = 2;
    public static final int TRANSPORT_CELLULAR = 0;
    public static final int TRANSPORT_ETHERNET = 3;
    public static final int TRANSPORT_LOWPAN = 6;
    public static final int TRANSPORT_SATELLITE = 10;
    public static final int TRANSPORT_THREAD = 9;
    public static final int TRANSPORT_USB = 8;
    public static final int TRANSPORT_VPN = 4;
    public static final int TRANSPORT_WIFI = 1;
    public static final int TRANSPORT_WIFI_AWARE = 5;
    
    public NetworkCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkCapabilities(final NetworkCapabilities nc) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getEnterpriseIds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasEnterpriseId(final int enterpriseId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCapability(final int capability) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasTransport(final int transportType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOwnerUid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLinkUpstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLinkDownstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkSpecifier getNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TransportInfo getTransportInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSignalStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSubscriptionIds() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
