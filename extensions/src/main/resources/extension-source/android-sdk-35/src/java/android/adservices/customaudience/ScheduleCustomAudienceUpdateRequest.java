package android.adservices.customaudience;

import java.util.List;
import java.time.Duration;
import android.net.Uri;

public final class ScheduleCustomAudienceUpdateRequest
{
    ScheduleCustomAudienceUpdateRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUpdateUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Duration getMinDelay() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PartialCustomAudience> getPartialCustomAudienceList() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Uri updateUri, @NonNull final Duration minDelay, @NonNull final List<PartialCustomAudience> partialCustomAudienceList) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUpdateUri(@NonNull final Uri updateUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinDelay(@NonNull final Duration minDelay) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPartialCustomAudienceList(@NonNull final List<PartialCustomAudience> partialCustomAudiences) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ScheduleCustomAudienceUpdateRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
