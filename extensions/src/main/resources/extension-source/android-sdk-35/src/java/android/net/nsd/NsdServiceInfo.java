package android.net.nsd;

import android.os.Parcel;
import java.util.Set;
import android.net.Network;
import java.util.Map;
import java.util.List;
import java.net.InetAddress;
import android.os.Parcelable;

public final class NsdServiceInfo implements Parcelable
{
    @NonNull
    public static final Creator<NsdServiceInfo> CREATOR;
    
    public NsdServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setServiceName(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    public String getServiceType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setServiceType(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public InetAddress getHost() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHost(final InetAddress s) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPort() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPort(final int p) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InetAddress> getHostAddresses() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHostAddresses(@NonNull final List<InetAddress> addresses) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAttribute(final String key, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAttribute(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, byte[]> getAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNetwork(@Nullable final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubtypes(@NonNull final Set<String> subtypes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSubtypes() {
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
}
