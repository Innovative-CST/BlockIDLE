package android.app.sdksandbox;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class LoadSdkException extends Exception implements Parcelable
{
    @NonNull
    public static final Creator<LoadSdkException> CREATOR;
    
    public LoadSdkException(@NonNull final Throwable cause, @NonNull final Bundle extraInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLoadSdkErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtraInformation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
