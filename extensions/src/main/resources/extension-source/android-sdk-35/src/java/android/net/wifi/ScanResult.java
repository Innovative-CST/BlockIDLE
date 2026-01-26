package android.net.wifi;

import java.nio.ByteBuffer;
import android.os.Parcel;
import java.util.List;
import android.net.MacAddress;
import android.os.Parcelable;

public final class ScanResult implements Parcelable
{
    public String BSSID;
    public static final int CHANNEL_WIDTH_160MHZ = 3;
    public static final int CHANNEL_WIDTH_20MHZ = 0;
    public static final int CHANNEL_WIDTH_320MHZ = 5;
    public static final int CHANNEL_WIDTH_40MHZ = 1;
    public static final int CHANNEL_WIDTH_80MHZ = 2;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
    @NonNull
    public static final Creator<ScanResult> CREATOR;
    public static final int PREAMBLE_EHT = 4;
    public static final int PREAMBLE_HE = 3;
    public static final int PREAMBLE_HT = 1;
    public static final int PREAMBLE_LEGACY = 0;
    public static final int PREAMBLE_VHT = 2;
    @Deprecated
    public String SSID;
    public static final int UNSPECIFIED = -1;
    public static final int WIFI_BAND_24_GHZ = 1;
    public static final int WIFI_BAND_5_GHZ = 2;
    public static final int WIFI_BAND_60_GHZ = 16;
    public static final int WIFI_BAND_6_GHZ = 8;
    public static final int WIFI_STANDARD_11AC = 5;
    public static final int WIFI_STANDARD_11AD = 7;
    public static final int WIFI_STANDARD_11AX = 6;
    public static final int WIFI_STANDARD_11BE = 8;
    public static final int WIFI_STANDARD_11N = 4;
    public static final int WIFI_STANDARD_LEGACY = 1;
    public static final int WIFI_STANDARD_UNKNOWN = 0;
    public String capabilities;
    public int centerFreq0;
    public int centerFreq1;
    public int channelWidth;
    public int frequency;
    public int level;
    @Deprecated
    public CharSequence operatorFriendlyName;
    public long timestamp;
    @Deprecated
    public CharSequence venueName;
    
    public ScanResult(@NonNull final ScanResult source) {
        throw new RuntimeException("Stub!");
    }
    
    public ScanResult() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiSsid getWifiSsid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getApMldMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getApMloLinkId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MloLink> getAffiliatedMloLinks() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWifiStandard() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211mcResponder() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211azNtbResponder() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPasspointNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTwtResponder() {
        throw new RuntimeException("Stub!");
    }
    
    public static int convertChannelToFrequencyMhzIfSupported(final int channel, final int band) {
        throw new RuntimeException("Stub!");
    }
    
    public static int convertFrequencyMhzToChannelIfSupported(final int freqMhz) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InformationElement> getInformationElements() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getSecurityTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public static class InformationElement implements Parcelable
    {
        @NonNull
        public static final Creator<InformationElement> CREATOR;
        
        public InformationElement(final int id, final int idExt, @NonNull final byte[] bytes) {
            throw new RuntimeException("Stub!");
        }
        
        public InformationElement(@NonNull final InformationElement rhs) {
            throw new RuntimeException("Stub!");
        }
        
        public int getId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIdExt() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ByteBuffer getBytes() {
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
        
        @Override
        public boolean equals(final Object that) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
