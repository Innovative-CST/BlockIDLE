package android.adservices.ondevicepersonalization;

public final class InferenceInput
{
    InferenceInput() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Params getParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Object[] getInputData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBatchSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InferenceOutput getExpectedOutputStructure() {
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
        public Builder(@NonNull final Params params, @NonNull final Object[] inputData, @NonNull final InferenceOutput expectedOutputStructure) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setParams(@NonNull final Params value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInputData(@NonNull final Object... value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBatchSize(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExpectedOutputStructure(@NonNull final InferenceOutput value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public InferenceInput build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Params
    {
        public static final int DELEGATE_CPU = 1;
        public static final int MODEL_TYPE_TENSORFLOW_LITE = 1;
        
        Params() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public KeyValueStore getKeyValueStore() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getModelKey() {
            throw new RuntimeException("Stub!");
        }
        
        public int getDelegateType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getModelType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRecommendedNumThreads() {
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
            public Builder(@NonNull final KeyValueStore keyValueStore, @NonNull final String modelKey) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setKeyValueStore(@NonNull final KeyValueStore value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setModelKey(@NonNull final String value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDelegateType(final int value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setModelType(final int value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setRecommendedNumThreads(final int value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Params build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
