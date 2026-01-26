package android.net;

import android.os.ParcelFileDescriptor;
import android.content.pm.PackageManager;
import java.net.InetAddress;
import android.app.PendingIntent;
import android.os.IBinder;
import java.net.DatagramSocket;
import java.net.Socket;
import android.content.Intent;
import android.content.Context;
import android.app.Service;

public class VpnService extends Service
{
    public static final String SERVICE_INTERFACE = "android.net.VpnService";
    public static final String SERVICE_META_DATA_SUPPORTS_ALWAYS_ON = "android.net.VpnService.SUPPORTS_ALWAYS_ON";
    
    public VpnService() {
        throw new RuntimeException("Stub!");
    }
    
    public static Intent prepare(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean protect(final int socket) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean protect(final Socket socket) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean protect(final DatagramSocket socket) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setUnderlyingNetworks(final Network[] networks) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isAlwaysOn() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isLockdownEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRevoke() {
        throw new RuntimeException("Stub!");
    }
    
    public class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSession(@NonNull final String session) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfigureIntent(@NonNull final PendingIntent intent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMtu(final int mtu) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHttpProxy(@NonNull final ProxyInfo proxyInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAddress(@NonNull final InetAddress address, final int prefixLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAddress(@NonNull final String address, final int prefixLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRoute(@NonNull final InetAddress address, final int prefixLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRoute(@NonNull final IpPrefix prefix) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRoute(@NonNull final String address, final int prefixLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder excludeRoute(@NonNull final IpPrefix prefix) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDnsServer(@NonNull final InetAddress address) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDnsServer(@NonNull final String address) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSearchDomain(@NonNull final String domain) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowFamily(final int family) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAllowedApplication(@NonNull final String packageName) throws PackageManager.NameNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDisallowedApplication(@NonNull final String packageName) throws PackageManager.NameNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowBypass() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBlocking(final boolean blocking) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUnderlyingNetworks(@Nullable final Network[] networks) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetered(final boolean isMetered) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ParcelFileDescriptor establish() {
            throw new RuntimeException("Stub!");
        }
    }
}
