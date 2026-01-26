package android.service.credentials;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class BeginCreateCredentialRequest implements Parcelable
{
    @NonNull
    public static final Creator<BeginCreateCredentialRequest> CREATOR;
    
    public BeginCreateCredentialRequest(@NonNull final String type, @NonNull final Bundle data, @Nullable final CallingAppInfo callingAppInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public BeginCreateCredentialRequest(@NonNull final String type, @NonNull final Bundle data) {
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
    
    @Nullable
    public CallingAppInfo getCallingAppInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getData() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
