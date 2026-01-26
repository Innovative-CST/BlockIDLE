package android.service.credentials;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class ClearCredentialStateRequest implements Parcelable
{
    @NonNull
    public static final Creator<ClearCredentialStateRequest> CREATOR;
    
    public ClearCredentialStateRequest(@NonNull final CallingAppInfo callingAppInfo, @NonNull final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CallingAppInfo getCallingAppInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
