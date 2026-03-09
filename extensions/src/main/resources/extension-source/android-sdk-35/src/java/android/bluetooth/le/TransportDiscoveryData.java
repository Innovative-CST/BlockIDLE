package android.bluetooth.le;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class TransportDiscoveryData implements Parcelable
{
    @NonNull
    public static final Creator<TransportDiscoveryData> CREATOR;
    
    public TransportDiscoveryData(final int transportDataType, @NonNull final List<TransportBlock> transportBlocks) {
        throw new RuntimeException("Stub!");
    }
    
    public TransportDiscoveryData(@NonNull final byte[] transportDiscoveryData) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportDataType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TransportBlock> getTransportBlocks() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int totalBytes() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
