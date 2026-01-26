package android.adservices.ondevicepersonalization;

import java.util.List;

public final class ExecuteOutput
{
    ExecuteOutput() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RequestLogRecord getRequestLogRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RenderingConfig getRenderingConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<EventLogRecord> getEventLogRecords() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getOutputData() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequestLogRecord(@Nullable final RequestLogRecord value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenderingConfig(@Nullable final RenderingConfig value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEventLogRecords(@NonNull final List<EventLogRecord> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addEventLogRecord(@NonNull final EventLogRecord value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOutputData(@Nullable final byte... value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ExecuteOutput build() {
            throw new RuntimeException("Stub!");
        }
    }
}
