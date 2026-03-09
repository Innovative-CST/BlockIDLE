package android.telephony.mbms;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamingServiceInfo extends ServiceInfo implements Parcelable
{
    @NonNull
    public static final Creator<StreamingServiceInfo> CREATOR;
    
    StreamingServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
