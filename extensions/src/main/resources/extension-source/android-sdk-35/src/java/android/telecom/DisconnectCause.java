package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public final class DisconnectCause implements Parcelable
{
    public static final int ANSWERED_ELSEWHERE = 11;
    public static final int BUSY = 7;
    public static final int CALL_PULLED = 12;
    public static final int CANCELED = 4;
    public static final int CONNECTION_MANAGER_NOT_SUPPORTED = 10;
    @NonNull
    public static final Creator<DisconnectCause> CREATOR;
    public static final int ERROR = 1;
    public static final int LOCAL = 2;
    public static final int MISSED = 5;
    public static final int OTHER = 9;
    public static final String REASON_EMERGENCY_CALL_PLACED = "REASON_EMERGENCY_CALL_PLACED";
    public static final String REASON_EMULATING_SINGLE_CALL = "EMULATING_SINGLE_CALL";
    public static final String REASON_IMS_ACCESS_BLOCKED = "REASON_IMS_ACCESS_BLOCKED";
    public static final String REASON_WIFI_ON_BUT_WFC_OFF = "REASON_WIFI_ON_BUT_WFC_OFF";
    public static final int REJECTED = 6;
    public static final int REMOTE = 3;
    public static final int RESTRICTED = 8;
    public static final int UNKNOWN = 0;
    
    public DisconnectCause(final int code) {
        throw new RuntimeException("Stub!");
    }
    
    public DisconnectCause(final int code, final String reason) {
        throw new RuntimeException("Stub!");
    }
    
    public DisconnectCause(final int code, final CharSequence label, final CharSequence description, final String reason) {
        throw new RuntimeException("Stub!");
    }
    
    public DisconnectCause(final int code, final CharSequence label, final CharSequence description, final String reason, final int toneToPlay) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCode() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public String getReason() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
