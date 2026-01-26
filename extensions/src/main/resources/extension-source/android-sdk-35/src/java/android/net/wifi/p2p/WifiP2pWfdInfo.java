package android.net.wifi.p2p;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiP2pWfdInfo implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pWfdInfo> CREATOR;
    public static final int DEVICE_INFO_AUDIO_ONLY_SUPPORT_AT_SOURCE = 2048;
    public static final int DEVICE_INFO_AUDIO_UNSUPPORTED_AT_PRIMARY_SINK = 1024;
    public static final int DEVICE_INFO_CONTENT_PROTECTION_SUPPORT = 256;
    public static final int DEVICE_INFO_COUPLED_SINK_SUPPORT_AT_SINK = 8;
    public static final int DEVICE_INFO_COUPLED_SINK_SUPPORT_AT_SOURCE = 4;
    public static final int DEVICE_INFO_DEVICE_TYPE_MASK = 3;
    public static final int DEVICE_INFO_PREFERRED_CONNECTIVITY_MASK = 128;
    public static final int DEVICE_INFO_SESSION_AVAILABLE_MASK = 48;
    public static final int DEVICE_INFO_TDLS_PERSISTENT_GROUP = 4096;
    public static final int DEVICE_INFO_TDLS_PERSISTENT_GROUP_REINVOKE = 8192;
    public static final int DEVICE_INFO_TIME_SYNCHRONIZATION_SUPPORT = 512;
    public static final int DEVICE_INFO_WFD_SERVICE_DISCOVERY_SUPPORT = 64;
    public static final int DEVICE_TYPE_PRIMARY_SINK = 1;
    public static final int DEVICE_TYPE_SECONDARY_SINK = 2;
    public static final int DEVICE_TYPE_SOURCE_OR_PRIMARY_SINK = 3;
    public static final int DEVICE_TYPE_WFD_SOURCE = 0;
    public static final int PREFERRED_CONNECTIVITY_P2P = 0;
    public static final int PREFERRED_CONNECTIVITY_TDLS = 1;
    
    public WifiP2pWfdInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pWfdInfo(@Nullable final WifiP2pWfdInfo source) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getR2DeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isR2Supported() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setR2DeviceType(final int deviceType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getR2DeviceType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setDeviceType(final int deviceType) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSessionAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSessionAvailable(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isContentProtectionSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentProtectionSupported(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCoupledSinkSupportedAtSource() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCoupledSinkSupportAtSource(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCoupledSinkSupportedAtSink() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCoupledSinkSupportAtSink(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public int getControlPort() {
        throw new RuntimeException("Stub!");
    }
    
    public void setControlPort(final int port) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxThroughput(final int maxThroughput) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxThroughput() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
