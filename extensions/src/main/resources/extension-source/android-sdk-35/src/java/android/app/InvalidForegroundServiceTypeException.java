package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class InvalidForegroundServiceTypeException extends ForegroundServiceTypeException implements Parcelable
{
    @NonNull
    public static final Creator<InvalidForegroundServiceTypeException> CREATOR;
    
    public InvalidForegroundServiceTypeException(@NonNull final String message) {
        super((String)null);
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
