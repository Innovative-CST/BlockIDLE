package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class StartForegroundCalledOnStoppedServiceException extends IllegalStateException implements Parcelable
{
    @NonNull
    public static final Creator<StartForegroundCalledOnStoppedServiceException> CREATOR;
    
    public StartForegroundCalledOnStoppedServiceException(@NonNull final String message) {
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
