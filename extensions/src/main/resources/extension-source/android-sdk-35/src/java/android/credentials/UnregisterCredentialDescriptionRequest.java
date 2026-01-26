package android.credentials;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class UnregisterCredentialDescriptionRequest implements Parcelable
{
    @NonNull
    public static final Creator<UnregisterCredentialDescriptionRequest> CREATOR;
    
    public UnregisterCredentialDescriptionRequest(@NonNull final CredentialDescription credentialDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public UnregisterCredentialDescriptionRequest(@NonNull final Set<CredentialDescription> credentialDescriptions) {
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
    public Set<CredentialDescription> getCredentialDescriptions() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
