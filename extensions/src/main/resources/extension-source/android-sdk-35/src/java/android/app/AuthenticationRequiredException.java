package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class AuthenticationRequiredException extends SecurityException implements Parcelable
{
    @NonNull
    public static final Creator<AuthenticationRequiredException> CREATOR;
    
    public AuthenticationRequiredException(final Throwable cause, final PendingIntent userAction) {
        throw new RuntimeException("Stub!");
    }
    
    public PendingIntent getUserAction() {
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
