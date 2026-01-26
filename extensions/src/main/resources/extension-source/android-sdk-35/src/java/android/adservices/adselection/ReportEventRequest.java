package android.adservices.adselection;

import android.view.InputEvent;

public class ReportEventRequest
{
    public static final int FLAG_REPORTING_DESTINATION_BUYER = 2;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = 1;
    
    ReportEventRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAdSelectionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputEvent getInputEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReportingDestinations() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final long adSelectionId, @NonNull final String eventKey, @NonNull final String eventData, final int reportingDestinations) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionId(final long adSelectionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKey(@NonNull final String eventKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInputEvent(@Nullable final InputEvent inputEvent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setData(@NonNull final String eventData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReportingDestinations(final int reportingDestinations) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ReportEventRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
