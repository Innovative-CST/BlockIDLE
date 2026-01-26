package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class ForegroundServiceStartNotAllowedException extends ServiceStartNotAllowedException implements Parcelable
{
    @NonNull
    public static final Creator<ForegroundServiceStartNotAllowedException> CREATOR;
    
    public ForegroundServiceStartNotAllowedException(@NonNull final String message) {
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
