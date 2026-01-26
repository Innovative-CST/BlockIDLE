package android.telephony.ims;

import android.os.Parcel;
import android.os.Parcelable;

public final class SipDetails implements Parcelable
{
    @NonNull
    public static final Creator<SipDetails> CREATOR;
    public static final int METHOD_PUBLISH = 2;
    public static final int METHOD_REGISTER = 1;
    public static final int METHOD_SUBSCRIBE = 3;
    public static final int METHOD_UNKNOWN = 0;
    
    SipDetails() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCSeq() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResponseCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getResponsePhrase() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReasonHeaderCause() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getReasonHeaderText() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getCallId() {
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
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
