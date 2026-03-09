package android.telephony.euicc;

import android.os.Parcel;
import android.os.Parcelable;

public final class EuiccInfo implements Parcelable
{
    @NonNull
    public static final Creator<EuiccInfo> CREATOR;
    
    public EuiccInfo(@Nullable final String osVersion) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOsVersion() {
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
