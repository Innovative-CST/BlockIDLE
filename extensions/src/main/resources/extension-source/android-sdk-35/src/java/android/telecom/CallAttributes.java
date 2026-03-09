package android.telecom;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class CallAttributes implements Parcelable
{
    public static final int AUDIO_CALL = 1;
    @NonNull
    public static final Creator<CallAttributes> CREATOR;
    public static final int DIRECTION_INCOMING = 1;
    public static final int DIRECTION_OUTGOING = 2;
    public static final int SUPPORTS_SET_INACTIVE = 2;
    public static final int SUPPORTS_STREAM = 4;
    public static final int SUPPORTS_TRANSFER = 8;
    public static final int SUPPORTS_VIDEO_CALLING = 16;
    public static final int VIDEO_CALL = 2;
    
    CallAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PhoneAccountHandle getPhoneAccountHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@Nullable final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final PhoneAccountHandle phoneAccountHandle, final int callDirection, @NonNull final CharSequence displayName, @NonNull final Uri address) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCallType(final int callType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCallCapabilities(final int callCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CallAttributes build() {
            throw new RuntimeException("Stub!");
        }
    }
}
