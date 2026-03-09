package android.credentials;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class CreateCredentialRequest implements Parcelable
{
    @NonNull
    public static final Creator<CreateCredentialRequest> CREATOR;
    
    CreateCredentialRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getCredentialData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getCandidateQueryData() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSystemProviderRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean alwaysSendAppInfoToProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOrigin() {
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
        public Builder(@NonNull final String type, @NonNull final Bundle credentialData, @NonNull final Bundle candidateQueryData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAlwaysSendAppInfoToProvider(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsSystemProviderRequired(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOrigin(@NonNull final String origin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CreateCredentialRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
