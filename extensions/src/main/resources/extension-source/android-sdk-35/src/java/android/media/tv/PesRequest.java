package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class PesRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<PesRequest> CREATOR;
    
    public PesRequest(final int requestId, final int option, final int tsPid, final int streamId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTsPid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamId() {
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
