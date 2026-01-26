package android.adservices.measurement;

import java.time.Instant;
import android.net.Uri;
import java.util.List;

public class DeletionRequest
{
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    
    DeletionRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Uri> getOriginUris() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Uri> getDomainUris() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeletionMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMatchBehavior() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getStart() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOriginUris(@Nullable final List<Uri> originUris) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDomainUris(@Nullable final List<Uri> domainUris) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMatchBehavior(final int matchBehavior) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeletionMode(final int deletionMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStart(@NonNull final Instant start) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnd(@NonNull final Instant end) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DeletionRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
