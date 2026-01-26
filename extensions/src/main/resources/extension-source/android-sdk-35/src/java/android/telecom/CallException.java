package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public final class CallException extends RuntimeException implements Parcelable
{
    public static final int CODE_CALL_CANNOT_BE_SET_TO_ACTIVE = 4;
    public static final int CODE_CALL_IS_NOT_BEING_TRACKED = 3;
    public static final int CODE_CALL_NOT_PERMITTED_AT_PRESENT_TIME = 5;
    public static final int CODE_CANNOT_HOLD_CURRENT_ACTIVE_CALL = 2;
    public static final int CODE_ERROR_UNKNOWN = 1;
    public static final int CODE_OPERATION_TIMED_OUT = 6;
    @NonNull
    public static final Creator<CallException> CREATOR;
    
    public CallException(@Nullable final String message, final int code) {
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
