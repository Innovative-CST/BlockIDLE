package android.credentials;

import android.os.Parcel;
import android.os.Parcelable;

public final class GetCredentialResponse implements Parcelable
{
    @NonNull
    public static final Creator<GetCredentialResponse> CREATOR;
    
    public GetCredentialResponse(@NonNull final Credential credential) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Credential getCredential() {
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
