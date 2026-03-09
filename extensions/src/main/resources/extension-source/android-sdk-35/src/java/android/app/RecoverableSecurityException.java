package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class RecoverableSecurityException extends SecurityException implements Parcelable
{
    @NonNull
    public static final Creator<RecoverableSecurityException> CREATOR;
    
    public RecoverableSecurityException(@NonNull final Throwable cause, @NonNull final CharSequence userMessage, @NonNull final RemoteAction userAction) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getUserMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RemoteAction getUserAction() {
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
