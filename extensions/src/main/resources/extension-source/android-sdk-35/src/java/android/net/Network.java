package android.net;

import android.os.Parcel;
import java.io.FileDescriptor;
import java.net.Socket;
import java.net.DatagramSocket;
import java.net.Proxy;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URL;
import javax.net.SocketFactory;
import java.net.UnknownHostException;
import java.net.InetAddress;
import android.os.Parcelable;

public class Network implements Parcelable
{
    @NonNull
    public static final Creator<Network> CREATOR;
    
    Network() {
        throw new RuntimeException("Stub!");
    }
    
    public InetAddress[] getAllByName(final String host) throws UnknownHostException {
        throw new RuntimeException("Stub!");
    }
    
    public InetAddress getByName(final String host) throws UnknownHostException {
        throw new RuntimeException("Stub!");
    }
    
    public SocketFactory getSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public URLConnection openConnection(final URL url) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public URLConnection openConnection(final URL url, final Proxy proxy) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void bindSocket(final DatagramSocket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void bindSocket(final Socket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void bindSocket(final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static Network fromNetworkHandle(final long networkHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public long getNetworkHandle() {
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
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
