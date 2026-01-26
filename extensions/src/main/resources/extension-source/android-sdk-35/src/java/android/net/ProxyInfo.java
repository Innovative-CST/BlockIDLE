package android.net;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public class ProxyInfo implements Parcelable
{
    @NonNull
    public static final Creator<ProxyInfo> CREATOR;
    
    public ProxyInfo(@Nullable final ProxyInfo source) {
        throw new RuntimeException("Stub!");
    }
    
    public static ProxyInfo buildDirectProxy(final String host, final int port) {
        throw new RuntimeException("Stub!");
    }
    
    public static ProxyInfo buildDirectProxy(final String host, final int port, final List<String> exclList) {
        throw new RuntimeException("Stub!");
    }
    
    public static ProxyInfo buildPacProxy(final Uri pacUri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ProxyInfo buildPacProxy(@NonNull final Uri pacUrl, final int port) {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getPacFileUrl() {
        throw new RuntimeException("Stub!");
    }
    
    public String getHost() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPort() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getExclusionList() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValid() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
