package android.app.appsearch;

public final class ReportSystemUsageRequest
{
    ReportSystemUsageRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDatabaseName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDocumentId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUsageTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String packageName, @NonNull final String databaseName, @NonNull final String namespace, @NonNull final String documentId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUsageTimestampMillis(final long usageTimestampMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ReportSystemUsageRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
