package android.security.identity;

import java.util.Collection;
import java.util.Map;

public class CredentialDataRequest
{
    CredentialDataRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Collection<String>> getDeviceSignedEntriesToRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Collection<String>> getIssuerSignedEntriesToRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllowUsingExhaustedKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllowUsingExpiredKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIncrementUseCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getRequestMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getReaderSignature() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeviceSignedEntriesToRequest(@NonNull final Map<String, Collection<String>> entriesToRequest) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIssuerSignedEntriesToRequest(@NonNull final Map<String, Collection<String>> entriesToRequest) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowUsingExhaustedKeys(final boolean allowUsingExhaustedKeys) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowUsingExpiredKeys(final boolean allowUsingExpiredKeys) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIncrementUseCount(final boolean incrementUseCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequestMessage(@NonNull final byte[] requestMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReaderSignature(@NonNull final byte[] readerSignature) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CredentialDataRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
