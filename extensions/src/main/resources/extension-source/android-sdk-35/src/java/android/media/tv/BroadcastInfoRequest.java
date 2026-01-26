package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<BroadcastInfoRequest> CREATOR;
    public static final int REQUEST_OPTION_AUTO_UPDATE = 1;
    public static final int REQUEST_OPTION_REPEAT = 0;
    
    BroadcastInfoRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOption() {
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
