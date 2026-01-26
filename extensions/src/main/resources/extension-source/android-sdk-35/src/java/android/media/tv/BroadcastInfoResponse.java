package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<BroadcastInfoResponse> CREATOR;
    public static final int RESPONSE_RESULT_CANCEL = 3;
    public static final int RESPONSE_RESULT_ERROR = 1;
    public static final int RESPONSE_RESULT_OK = 2;
    
    BroadcastInfoResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSequence() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResponseResult() {
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
