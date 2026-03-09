package android.adservices.adselection;

import android.net.Uri;
import android.adservices.common.AdTechIdentifier;

public final class GetAdSelectionDataRequest
{
    GetAdSelectionDataRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AdTechIdentifier getSeller() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getCoordinatorOriginUri() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSeller(@Nullable final AdTechIdentifier seller) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCoordinatorOriginUri(@Nullable final Uri coordinatorOriginUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GetAdSelectionDataRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
