package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public final class PhoneAccountSuggestion implements Parcelable
{
    @NonNull
    public static final Creator<PhoneAccountSuggestion> CREATOR;
    public static final int REASON_FREQUENT = 2;
    public static final int REASON_INTRA_CARRIER = 1;
    public static final int REASON_NONE = 0;
    public static final int REASON_OTHER = 4;
    public static final int REASON_USER_SET = 3;
    
    public PhoneAccountSuggestion(@NonNull final PhoneAccountHandle handle, final int reason, final boolean shouldAutoSelect) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PhoneAccountHandle getPhoneAccountHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReason() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldAutoSelect() {
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
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
