package android.net;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class NetworkInfo implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<NetworkInfo> CREATOR;
    
    @Deprecated
    public NetworkInfo(final int type, final int subtype, @Nullable final String typeName, @Nullable final String subtypeName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSubtype() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getTypeName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSubtypeName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isConnectedOrConnecting() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isFailover() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public State getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public DetailedState getDetailedState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDetailedState(@NonNull final DetailedState detailedState, @Nullable final String reason, @Nullable final String extraInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getReason() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getExtraInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    @Deprecated
    public enum DetailedState
    {
        @Deprecated
        IDLE, 
        @Deprecated
        SCANNING, 
        @Deprecated
        CONNECTING, 
        @Deprecated
        AUTHENTICATING, 
        @Deprecated
        OBTAINING_IPADDR, 
        @Deprecated
        CONNECTED, 
        @Deprecated
        SUSPENDED, 
        @Deprecated
        DISCONNECTING, 
        @Deprecated
        DISCONNECTED, 
        @Deprecated
        FAILED, 
        @Deprecated
        BLOCKED, 
        @Deprecated
        VERIFYING_POOR_LINK, 
        @Deprecated
        CAPTIVE_PORTAL_CHECK;
    }
    
    @Deprecated
    public enum State
    {
        @Deprecated
        CONNECTING, 
        @Deprecated
        CONNECTED, 
        @Deprecated
        SUSPENDED, 
        @Deprecated
        DISCONNECTING, 
        @Deprecated
        DISCONNECTED, 
        @Deprecated
        UNKNOWN;
    }
}
