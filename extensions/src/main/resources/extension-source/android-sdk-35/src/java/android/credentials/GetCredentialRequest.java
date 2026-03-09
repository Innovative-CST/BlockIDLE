package android.credentials;

import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

public final class GetCredentialRequest implements Parcelable
{
    @NonNull
    public static final Creator<GetCredentialRequest> CREATOR;
    
    GetCredentialRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CredentialOption> getCredentialOptions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOrigin() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean alwaysSendAppInfoToProvider() {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCredentialOption(@NonNull final CredentialOption credentialOption) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAlwaysSendAppInfoToProvider(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCredentialOptions(@NonNull final List<CredentialOption> credentialOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOrigin(@NonNull final String origin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GetCredentialRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
