package android.credentials;

import android.os.Parcel;
import android.service.credentials.CredentialEntry;
import java.util.List;
import java.util.Set;
import android.os.Parcelable;

public final class CredentialDescription implements Parcelable
{
    @NonNull
    public static final Creator<CredentialDescription> CREATOR;
    
    public CredentialDescription(@NonNull final String type, @NonNull final Set<String> supportedElementKeys, @NonNull final List<CredentialEntry> credentialEntries) {
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
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSupportedElementKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CredentialEntry> getCredentialEntries() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
