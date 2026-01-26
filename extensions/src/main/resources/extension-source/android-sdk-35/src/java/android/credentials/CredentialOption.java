package android.credentials;

import android.os.Parcel;
import android.content.ComponentName;
import java.util.Set;
import android.os.Bundle;
import android.os.Parcelable;

public final class CredentialOption implements Parcelable
{
    @NonNull
    public static final Creator<CredentialOption> CREATOR;
    public static final String SUPPORTED_ELEMENT_KEYS = "android.credentials.GetCredentialOption.SUPPORTED_ELEMENT_KEYS";
    
    CredentialOption() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getCredentialRetrievalData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getCandidateQueryData() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSystemProviderRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<ComponentName> getAllowedProviders() {
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
        public Builder(@NonNull final String type, @NonNull final Bundle credentialRetrievalData, @NonNull final Bundle candidateQueryData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsSystemProviderRequired(final boolean isSystemProviderRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAllowedProvider(@NonNull final ComponentName allowedProvider) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowedProviders(@NonNull final Set<ComponentName> allowedProviders) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CredentialOption build() {
            throw new RuntimeException("Stub!");
        }
    }
}
