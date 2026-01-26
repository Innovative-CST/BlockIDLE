package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public class IccOpenLogicalChannelResponse implements Parcelable
{
    @NonNull
    public static final Creator<IccOpenLogicalChannelResponse> CREATOR;
    public static final int INVALID_CHANNEL = -1;
    public static final int STATUS_MISSING_RESOURCE = 2;
    public static final int STATUS_NO_ERROR = 1;
    public static final int STATUS_NO_SUCH_ELEMENT = 3;
    public static final int STATUS_UNKNOWN_ERROR = 4;
    
    IccOpenLogicalChannelResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getSelectResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
