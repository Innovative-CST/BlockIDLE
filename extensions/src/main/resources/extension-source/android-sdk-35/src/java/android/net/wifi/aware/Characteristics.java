package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class Characteristics implements Parcelable
{
    @NonNull
    public static final Creator<Characteristics> CREATOR;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_128 = 4;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_256 = 8;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_128 = 16;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_256 = 32;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_128 = 1;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_256 = 2;
    public static final int WIFI_AWARE_CIPHER_SUITE_NONE = 0;
    
    Characteristics() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxServiceNameLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxServiceSpecificInfoLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxMatchFilterLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumberOfSupportedDataInterfaces() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumberOfSupportedPublishSessions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumberOfSupportedSubscribeSessions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumberOfSupportedDataPaths() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInstantCommunicationModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAwarePairingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSuspensionSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSupportedCipherSuites() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSupportedPairingCipherSuites() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
