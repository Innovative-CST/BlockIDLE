package android.adservices.adselection;

import android.adservices.common.AdTechIdentifier;

public class UpdateAdCounterHistogramRequest
{
    UpdateAdCounterHistogramRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAdSelectionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAdEventType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdTechIdentifier getCallerAdTech() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final long adSelectionId, final int adEventType, @NonNull final AdTechIdentifier callerAdTech) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionId(final long adSelectionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdEventType(final int adEventType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCallerAdTech(@NonNull final AdTechIdentifier callerAdTech) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public UpdateAdCounterHistogramRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
