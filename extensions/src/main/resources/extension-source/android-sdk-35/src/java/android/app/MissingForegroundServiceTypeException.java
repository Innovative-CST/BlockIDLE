package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class MissingForegroundServiceTypeException extends ForegroundServiceTypeException implements Parcelable
{
    @NonNull
    public static final Creator<MissingForegroundServiceTypeException> CREATOR;
    
    public MissingForegroundServiceTypeException(@NonNull final String message) {
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
