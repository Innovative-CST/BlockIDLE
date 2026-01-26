package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class ParcelablePeerHandle extends PeerHandle implements Parcelable
{
    @NonNull
    public static final Creator<ParcelablePeerHandle> CREATOR;
    
    public ParcelablePeerHandle(@NonNull final PeerHandle peerHandle) {
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
