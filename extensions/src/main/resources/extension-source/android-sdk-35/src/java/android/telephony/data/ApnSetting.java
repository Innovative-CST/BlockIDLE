package android.telephony.data;

import android.os.Parcel;
import android.net.Uri;
import java.net.InetAddress;
import android.os.Parcelable;

public class ApnSetting implements Parcelable
{
    public static final int AUTH_TYPE_CHAP = 2;
    public static final int AUTH_TYPE_NONE = 0;
    public static final int AUTH_TYPE_PAP = 1;
    public static final int AUTH_TYPE_PAP_OR_CHAP = 3;
    @NonNull
    public static final Creator<ApnSetting> CREATOR;
    public static final int MVNO_TYPE_GID = 2;
    public static final int MVNO_TYPE_ICCID = 3;
    public static final int MVNO_TYPE_IMSI = 1;
    public static final int MVNO_TYPE_SPN = 0;
    public static final int PROTOCOL_IP = 0;
    public static final int PROTOCOL_IPV4V6 = 2;
    public static final int PROTOCOL_IPV6 = 1;
    public static final int PROTOCOL_NON_IP = 4;
    public static final int PROTOCOL_PPP = 3;
    public static final int PROTOCOL_UNSTRUCTURED = 5;
    public static final int TYPE_BIP = 8192;
    public static final int TYPE_CBS = 128;
    public static final int TYPE_DEFAULT = 17;
    public static final int TYPE_DUN = 8;
    public static final int TYPE_EMERGENCY = 512;
    public static final int TYPE_ENTERPRISE = 16384;
    public static final int TYPE_FOTA = 32;
    public static final int TYPE_HIPRI = 16;
    public static final int TYPE_IA = 256;
    public static final int TYPE_IMS = 64;
    public static final int TYPE_MCX = 1024;
    public static final int TYPE_MMS = 2;
    public static final int TYPE_RCS = 32768;
    public static final int TYPE_SUPL = 4;
    public static final int TYPE_VSIM = 4096;
    public static final int TYPE_XCAP = 2048;
    
    ApnSetting() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMtuV4() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMtuV6() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProfileId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPersistent() {
        throw new RuntimeException("Stub!");
    }
    
    public String getEntryName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getApnName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public InetAddress getProxyAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public String getProxyAddressAsString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProxyPort() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getMmsc() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public InetAddress getMmsProxyAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMmsProxyAddressAsString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMmsProxyPort() {
        throw new RuntimeException("Stub!");
    }
    
    public String getUser() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAuthType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getApnTypeBitmask() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getOperatorNumeric() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRoamingProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkTypeBitmask() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMvnoType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlwaysOn() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMtuV4(final int mtuV4) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMtuV6(final int mtuV6) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProfileId(final int profileId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPersistent(final boolean isPersistent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEntryName(@Nullable final String entryName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setApnName(@Nullable final String apnName) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setProxyAddress(final InetAddress proxy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProxyAddress(@Nullable final String proxy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProxyPort(final int port) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMmsc(@Nullable final Uri mmsc) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setMmsProxyAddress(final InetAddress mmsProxy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMmsProxyAddress(@Nullable final String mmsProxy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMmsProxyPort(final int mmsPort) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUser(@Nullable final String user) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPassword(@Nullable final String password) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthType(final int authType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setApnTypeBitmask(final int apnTypeBitmask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOperatorNumeric(@Nullable final String operatorNumeric) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProtocol(final int protocol) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRoamingProtocol(final int roamingProtocol) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCarrierEnabled(final boolean carrierEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkTypeBitmask(final int networkTypeBitmask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMvnoType(final int mvnoType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCarrierId(final int carrierId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAlwaysOn(final boolean alwaysOn) {
            throw new RuntimeException("Stub!");
        }
        
        public ApnSetting build() {
            throw new RuntimeException("Stub!");
        }
    }
}
