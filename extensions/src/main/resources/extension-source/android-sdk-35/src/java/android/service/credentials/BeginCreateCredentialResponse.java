package android.service.credentials;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class BeginCreateCredentialResponse implements Parcelable
{
    @NonNull
    public static final Creator<BeginCreateCredentialResponse> CREATOR;
    
    public BeginCreateCredentialResponse() {
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
    
    @NonNull
    public List<CreateEntry> getCreateEntries() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteEntry getRemoteCreateEntry() {
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
        public Builder setCreateEntries(@NonNull final List<CreateEntry> createEntries) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCreateEntry(@NonNull final CreateEntry createEntry) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRemoteCreateEntry(@Nullable final RemoteEntry remoteCreateEntry) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BeginCreateCredentialResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
}
