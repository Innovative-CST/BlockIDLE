package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public class CaptivePortal implements Parcelable
{
    @NonNull
    public static final Creator<CaptivePortal> CREATOR;
    
    CaptivePortal() {
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
    
    public void reportCaptivePortalDismissed() {
        throw new RuntimeException("Stub!");
    }
    
    public void ignoreNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
