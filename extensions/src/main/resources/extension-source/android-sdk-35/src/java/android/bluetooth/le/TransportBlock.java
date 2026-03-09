package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public final class TransportBlock implements Parcelable
{
    @NonNull
    public static final Creator<TransportBlock> CREATOR;
    
    public TransportBlock(final int orgId, final int tdsFlags, final int transportDataLength, @Nullable final byte[] transportData) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
    
    public int getOrgId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTdsFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportDataLength() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getTransportData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    public int totalBytes() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
