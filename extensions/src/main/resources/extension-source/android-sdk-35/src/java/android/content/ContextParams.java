package android.content;

public final class ContextParams
{
    ContextParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AttributionSource getNextAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean shouldRegisterAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ContextParams params) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAttributionTag(@Nullable final String attributionTag) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNextAttributionSource(@Nullable final AttributionSource next) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldRegisterAttributionSource(final boolean shouldRegister) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ContextParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
