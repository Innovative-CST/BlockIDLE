package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class TsRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<TsRequest> CREATOR;
    
    public TsRequest(final int requestId, final int option, final int tsPid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTsPid() {
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
