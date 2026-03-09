package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public final class IpSecTransformState implements Parcelable
{
    @NonNull
    public static final Creator<IpSecTransformState> CREATOR;
    
    IpSecTransformState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTxHighestSequenceNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public long getRxHighestSequenceNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPacketCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long getByteCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getReplayBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimestampMillis(final long timestamp) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTxHighestSequenceNumber(final long seqNum) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRxHighestSequenceNumber(final long seqNum) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPacketCount(final long packetCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setByteCount(final long byteCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReplayBitmap(@NonNull final byte[] bitMap) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public IpSecTransformState build() {
            throw new RuntimeException("Stub!");
        }
    }
}
