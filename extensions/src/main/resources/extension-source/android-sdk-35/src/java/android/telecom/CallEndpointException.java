package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public final class CallEndpointException extends RuntimeException implements Parcelable
{
    @NonNull
    public static final Creator<CallEndpointException> CREATOR;
    public static final int ERROR_ANOTHER_REQUEST = 3;
    public static final int ERROR_ENDPOINT_DOES_NOT_EXIST = 1;
    public static final int ERROR_REQUEST_TIME_OUT = 2;
    public static final int ERROR_UNSPECIFIED = 4;
    
    public CallEndpointException(@Nullable final String message, final int code) {
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
    
    public int getCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
