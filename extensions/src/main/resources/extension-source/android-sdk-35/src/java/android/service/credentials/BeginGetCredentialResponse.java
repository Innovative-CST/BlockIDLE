package android.service.credentials;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class BeginGetCredentialResponse implements Parcelable
{
    @NonNull
    public static final Creator<BeginGetCredentialResponse> CREATOR;
    
    public BeginGetCredentialResponse() {
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
    public List<CredentialEntry> getCredentialEntries() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Action> getAuthenticationActions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Action> getActions() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteEntry getRemoteCredentialEntry() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRemoteCredentialEntry(@Nullable final RemoteEntry remoteCredentialEntry) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCredentialEntry(@NonNull final CredentialEntry credentialEntry) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAuthenticationAction(@NonNull final Action authenticationAction) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAction(@NonNull final Action action) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setActions(@NonNull final List<Action> actions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCredentialEntries(@NonNull final List<CredentialEntry> credentialEntries) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthenticationActions(@NonNull final List<Action> authenticationActions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BeginGetCredentialResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
}
