package android.app.appsearch;

import java.util.Set;

public class GenericDocument
{
    protected GenericDocument(@NonNull final GenericDocument document) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxIndexedProperties() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getSchemaType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCreationTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTtlMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScore() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getPropertyNames() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Object getProperty(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPropertyString(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public long getPropertyLong(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public double getPropertyDouble(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getPropertyBoolean(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getPropertyBytes(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public GenericDocument getPropertyDocument(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getPropertyStringArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public long[] getPropertyLongArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public double[] getPropertyDoubleArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public boolean[] getPropertyBooleanArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[][] getPropertyBytesArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public GenericDocument[] getPropertyDocumentArray(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder<BuilderType extends Builder>
    {
        public Builder(@NonNull final String namespace, @NonNull final String id, @NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final GenericDocument document) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setNamespace(@NonNull final String namespace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setId(@NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setSchemaType(@NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setScore(final int score) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setCreationTimestampMillis(final long creationTimestampMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setTtlMillis(final long ttlMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyString(@NonNull final String name, @NonNull final String... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyBoolean(@NonNull final String name, @NonNull final boolean... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyLong(@NonNull final String name, @NonNull final long... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyDouble(@NonNull final String name, @NonNull final double... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyBytes(@NonNull final String name, @NonNull final byte[]... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType setPropertyDocument(@NonNull final String name, @NonNull final GenericDocument... values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BuilderType clearProperty(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GenericDocument build() {
            throw new RuntimeException("Stub!");
        }
    }
}
