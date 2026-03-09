package android.service.credentials;

import android.os.Parcel;
import android.credentials.CredentialOption;
import java.util.List;
import android.os.Parcelable;

public final class GetCredentialRequest implements Parcelable
{
    @NonNull
    public static final Creator<GetCredentialRequest> CREATOR;
    
    public GetCredentialRequest(@NonNull final CallingAppInfo callingAppInfo, @NonNull final List<CredentialOption> credentialOptions) {
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
    
    @NonNull
    public CallingAppInfo getCallingAppInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CredentialOption> getCredentialOptions() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
