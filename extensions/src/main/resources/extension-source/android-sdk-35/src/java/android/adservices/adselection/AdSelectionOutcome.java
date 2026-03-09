package android.adservices.adselection;

import android.net.Uri;

public class AdSelectionOutcome
{
    @NonNull
    public static final AdSelectionOutcome NO_OUTCOME;
    
    AdSelectionOutcome() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getRenderUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public long getAdSelectionId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasOutcome() {
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
    
    static {
        NO_OUTCOME = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionId(final long adSelectionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenderUri(@NonNull final Uri renderUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AdSelectionOutcome build() {
            throw new RuntimeException("Stub!");
        }
    }
}
