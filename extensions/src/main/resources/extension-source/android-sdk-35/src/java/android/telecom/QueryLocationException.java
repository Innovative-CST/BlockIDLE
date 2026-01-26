package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public final class QueryLocationException extends RuntimeException implements Parcelable
{
    @NonNull
    public static final Creator<QueryLocationException> CREATOR;
    public static final int ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS = 4;
    public static final int ERROR_NOT_PERMITTED = 3;
    public static final int ERROR_PREVIOUS_REQUEST_EXISTS = 2;
    public static final int ERROR_REQUEST_TIME_OUT = 1;
    public static final int ERROR_SERVICE_UNAVAILABLE = 5;
    public static final int ERROR_UNSPECIFIED = 6;
    
    public QueryLocationException(@Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public QueryLocationException(@Nullable final String message, final int code) {
        throw new RuntimeException("Stub!");
    }
    
    public QueryLocationException(@Nullable final String message, final int code, @Nullable final Throwable cause) {
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
