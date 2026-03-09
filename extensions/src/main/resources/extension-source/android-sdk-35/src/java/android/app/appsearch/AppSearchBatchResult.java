package android.app.appsearch;

import java.util.Map;

public final class AppSearchBatchResult<KeyType, ValueType>
{
    AppSearchBatchResult() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSuccess() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<KeyType, ValueType> getSuccesses() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<KeyType, AppSearchResult<ValueType>> getFailures() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<KeyType, AppSearchResult<ValueType>> getAll() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder<KeyType, ValueType>
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<KeyType, ValueType> setSuccess(@NonNull final KeyType key, @Nullable final ValueType value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<KeyType, ValueType> setFailure(@NonNull final KeyType key, final int resultCode, @Nullable final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder<KeyType, ValueType> setResult(@NonNull final KeyType key, @NonNull final AppSearchResult<ValueType> result) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AppSearchBatchResult<KeyType, ValueType> build() {
            throw new RuntimeException("Stub!");
        }
    }
}
