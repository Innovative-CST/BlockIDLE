package android.service.carrier;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class MessagePdu implements Parcelable
{
    @NonNull
    public static final Creator<MessagePdu> CREATOR;
    
    public MessagePdu(@NonNull final List<byte[]> pduList) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<byte[]> getPdus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
