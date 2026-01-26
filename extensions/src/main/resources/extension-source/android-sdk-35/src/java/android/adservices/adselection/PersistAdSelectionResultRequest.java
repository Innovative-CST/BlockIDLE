package android.adservices.adselection;

import android.adservices.common.AdTechIdentifier;

public final class PersistAdSelectionResultRequest
{
    PersistAdSelectionResultRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getAdSelectionId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAdSelectionDataId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AdTechIdentifier getSeller() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getAdSelectionResult() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setAdSelectionId(final long adSelectionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionDataId(final long adSelectionDataId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSeller(@Nullable final AdTechIdentifier seller) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionResult(@Nullable final byte[] adSelectionResult) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersistAdSelectionResultRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
