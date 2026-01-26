package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class PesResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<PesResponse> CREATOR;
    
    public PesResponse(final int requestId, final int sequence, final int responseResult, @Nullable final String sharedFilterToken) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSharedFilterToken() {
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
