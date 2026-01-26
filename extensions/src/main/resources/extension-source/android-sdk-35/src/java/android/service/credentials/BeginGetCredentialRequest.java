package android.service.credentials;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class BeginGetCredentialRequest implements Parcelable
{
    @NonNull
    public static final Creator<BeginGetCredentialRequest> CREATOR;
    
    BeginGetCredentialRequest() {
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
    public List<BeginGetCredentialOption> getBeginGetCredentialOptions() {
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
        public Builder setCallingAppInfo(@Nullable final CallingAppInfo callingAppInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBeginGetCredentialOptions(@NonNull final List<BeginGetCredentialOption> getBeginCredentialOptions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addBeginGetCredentialOption(@NonNull final BeginGetCredentialOption beginGetCredentialOption) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BeginGetCredentialRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
