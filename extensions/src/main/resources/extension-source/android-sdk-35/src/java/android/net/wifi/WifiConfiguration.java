package android.net.wifi;

import android.os.Parcel;
import android.net.ProxyInfo;
import android.net.IpConfiguration;
import android.net.MacAddress;
import java.util.BitSet;
import android.os.Parcelable;

@Deprecated
public class WifiConfiguration implements Parcelable
{
    @Deprecated
    public String BSSID;
    @Deprecated
    public String FQDN;
    @Deprecated
    public static final int RANDOMIZATION_AUTO = 3;
    @Deprecated
    public static final int RANDOMIZATION_NONE = 0;
    @Deprecated
    public static final int RANDOMIZATION_NON_PERSISTENT = 2;
    @Deprecated
    public static final int RANDOMIZATION_PERSISTENT = 1;
    @Deprecated
    public static final int SECURITY_TYPE_DPP = 13;
    @Deprecated
    public static final int SECURITY_TYPE_EAP = 3;
    @Deprecated
    public static final int SECURITY_TYPE_EAP_SUITE_B = 5;
    @Deprecated
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE = 9;
    @Deprecated
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE_192_BIT = 5;
    @Deprecated
    public static final int SECURITY_TYPE_OPEN = 0;
    @Deprecated
    public static final int SECURITY_TYPE_OWE = 6;
    @Deprecated
    public static final int SECURITY_TYPE_PSK = 2;
    @Deprecated
    public static final int SECURITY_TYPE_SAE = 4;
    @Deprecated
    public static final int SECURITY_TYPE_WAPI_CERT = 8;
    @Deprecated
    public static final int SECURITY_TYPE_WAPI_PSK = 7;
    @Deprecated
    public static final int SECURITY_TYPE_WEP = 1;
    @Deprecated
    public String SSID;
    @Deprecated
    @NonNull
    public BitSet allowedAuthAlgorithms;
    @Deprecated
    @NonNull
    public BitSet allowedGroupCiphers;
    @Deprecated
    @NonNull
    public BitSet allowedGroupManagementCiphers;
    @Deprecated
    @NonNull
    public BitSet allowedKeyManagement;
    @Deprecated
    @NonNull
    public BitSet allowedPairwiseCiphers;
    @Deprecated
    @NonNull
    public BitSet allowedProtocols;
    @Deprecated
    @NonNull
    public BitSet allowedSuiteBCiphers;
    @Deprecated
    public WifiEnterpriseConfig enterpriseConfig;
    @Deprecated
    public boolean hiddenSSID;
    @Deprecated
    public boolean isHomeProviderNetwork;
    @Deprecated
    public int networkId;
    @Deprecated
    public String preSharedKey;
    @Deprecated
    public int priority;
    @Deprecated
    public String providerFriendlyName;
    @Deprecated
    public long[] roamingConsortiumIds;
    @Deprecated
    public int status;
    @Deprecated
    public String[] wepKeys;
    @Deprecated
    public int wepTxKeyIndex;
    
    @Deprecated
    public WifiConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public WifiConfiguration(@NonNull final WifiConfiguration source) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSecurityParams(final int securityType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMacRandomizationSetting(final int macRandomizationSetting) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMacRandomizationSetting() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public MacAddress getRandomizedMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isDppConfigurator() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isPasspoint() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIpConfiguration(@Nullable final IpConfiguration ipConfiguration) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ProxyInfo getHttpProxy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHttpProxy(final ProxyInfo httpProxy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class AuthAlgorithm
    {
        @Deprecated
        public static final int LEAP = 2;
        @Deprecated
        public static final int OPEN = 0;
        @Deprecated
        public static final int SAE = 3;
        @Deprecated
        public static final int SHARED = 1;
        @Deprecated
        public static final String[] strings;
        @Deprecated
        public static final String varName = "auth_alg";
        
        AuthAlgorithm() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
    
    @Deprecated
    public static class GroupCipher
    {
        @Deprecated
        public static final int CCMP = 3;
        @Deprecated
        public static final int GCMP_128 = 7;
        @Deprecated
        public static final int GCMP_256 = 5;
        @Deprecated
        public static final int SMS4 = 6;
        @Deprecated
        public static final int TKIP = 2;
        @Deprecated
        public static final int WEP104 = 1;
        @Deprecated
        public static final int WEP40 = 0;
        @Deprecated
        public static final String[] strings;
        @Deprecated
        public static final String varName = "group";
        
        GroupCipher() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
    
    @Deprecated
    public static class GroupMgmtCipher
    {
        @Deprecated
        public static final int BIP_CMAC_256 = 0;
        @Deprecated
        public static final int BIP_GMAC_128 = 1;
        @Deprecated
        public static final int BIP_GMAC_256 = 2;
        
        GroupMgmtCipher() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class KeyMgmt
    {
        @Deprecated
        public static final int DPP = 17;
        @Deprecated
        public static final int FILS_SHA256 = 15;
        @Deprecated
        public static final int FILS_SHA384 = 16;
        @Deprecated
        public static final int FT_EAP = 7;
        @Deprecated
        public static final int FT_PSK = 6;
        @Deprecated
        public static final int IEEE8021X = 3;
        @Deprecated
        public static final int NONE = 0;
        @Deprecated
        public static final int OSEN = 5;
        @Deprecated
        public static final int OWE = 9;
        @Deprecated
        public static final int SAE = 8;
        @Deprecated
        public static final int SUITE_B_192 = 10;
        @Deprecated
        public static final int WAPI_CERT = 14;
        @Deprecated
        public static final int WAPI_PSK = 13;
        @Deprecated
        public static final int WPA2_PSK = 4;
        @Deprecated
        public static final int WPA_EAP = 2;
        @Deprecated
        public static final int WPA_EAP_SHA256 = 12;
        @Deprecated
        public static final int WPA_PSK = 1;
        @Deprecated
        public static final int WPA_PSK_SHA256 = 11;
        @Deprecated
        public static final String[] strings;
        @Deprecated
        public static final String varName = "key_mgmt";
        
        KeyMgmt() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
    
    @Deprecated
    public static class PairwiseCipher
    {
        @Deprecated
        public static final int CCMP = 2;
        @Deprecated
        public static final int GCMP_128 = 5;
        @Deprecated
        public static final int GCMP_256 = 3;
        @Deprecated
        public static final int NONE = 0;
        @Deprecated
        public static final int SMS4 = 4;
        @Deprecated
        public static final int TKIP = 1;
        @Deprecated
        public static final String[] strings;
        @Deprecated
        public static final String varName = "pairwise";
        
        PairwiseCipher() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
    
    @Deprecated
    public static class Protocol
    {
        @Deprecated
        public static final int RSN = 1;
        @Deprecated
        public static final int WAPI = 3;
        @Deprecated
        public static final int WPA = 0;
        @Deprecated
        public static final String[] strings;
        @Deprecated
        public static final String varName = "proto";
        
        Protocol() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
    
    @Deprecated
    public static class Status
    {
        @Deprecated
        public static final int CURRENT = 0;
        @Deprecated
        public static final int DISABLED = 1;
        @Deprecated
        public static final int ENABLED = 2;
        @Deprecated
        public static final String[] strings;
        
        Status() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            strings = null;
        }
    }
}
