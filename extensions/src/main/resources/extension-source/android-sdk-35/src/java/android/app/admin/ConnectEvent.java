package android.app.admin;

import android.os.Parcel;
import java.net.InetAddress;
import android.os.Parcelable;

public final class ConnectEvent extends NetworkEvent implements Parcelable
{
    @NonNull
    public static final Creator<ConnectEvent> CREATOR;
    
    ConnectEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public InetAddress getInetAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPort() {
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
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
