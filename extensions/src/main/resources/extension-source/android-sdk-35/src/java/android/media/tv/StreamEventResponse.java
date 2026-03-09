package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamEventResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<StreamEventResponse> CREATOR;
    
    public StreamEventResponse(final int requestId, final int sequence, final int responseResult, final int eventId, final long nptMillis, @Nullable final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNptMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getData() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
