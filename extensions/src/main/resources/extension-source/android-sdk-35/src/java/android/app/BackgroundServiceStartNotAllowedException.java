package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class BackgroundServiceStartNotAllowedException extends ServiceStartNotAllowedException implements Parcelable
{
    @NonNull
    public static final Creator<BackgroundServiceStartNotAllowedException> CREATOR;
    
    public BackgroundServiceStartNotAllowedException(@NonNull final String message) {
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
