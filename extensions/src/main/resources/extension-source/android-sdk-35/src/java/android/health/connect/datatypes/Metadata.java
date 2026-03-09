package android.health.connect.datatypes;

import java.time.Instant;

public final class Metadata
{
    public static final int RECORDING_METHOD_ACTIVELY_RECORDED = 1;
    public static final int RECORDING_METHOD_AUTOMATICALLY_RECORDED = 2;
    public static final int RECORDING_METHOD_MANUAL_ENTRY = 3;
    public static final int RECORDING_METHOD_UNKNOWN = 0;
    
    Metadata() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getClientRecordId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getClientRecordVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DataOrigin getDataOrigin() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecordingMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getLastModifiedTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Device getDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
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
        public Builder setDevice(@NonNull final Device device) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDataOrigin(@NonNull final DataOrigin dataOrigin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLastModifiedTime(@NonNull final Instant lastModifiedTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClientRecordId(@Nullable final String clientRecordId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClientRecordVersion(final long clientRecordVersion) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRecordingMethod(final int recordingMethod) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Metadata build() {
            throw new RuntimeException("Stub!");
        }
    }
}
