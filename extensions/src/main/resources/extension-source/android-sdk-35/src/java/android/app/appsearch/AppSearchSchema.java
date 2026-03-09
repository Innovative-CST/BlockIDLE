package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class AppSearchSchema implements Parcelable
{
    @NonNull
    public static final Creator<AppSearchSchema> CREATOR;
    
    AppSearchSchema() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getSchemaType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PropertyConfig> getProperties() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getParentTypes() {
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
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class BooleanPropertyConfig extends PropertyConfig
    {
        BooleanPropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public BooleanPropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addProperty(@NonNull final PropertyConfig propertyConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addParentType(@NonNull final String parentSchemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AppSearchSchema build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class BytesPropertyConfig extends PropertyConfig
    {
        BytesPropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public BytesPropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class DocumentPropertyConfig extends PropertyConfig
    {
        DocumentPropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getSchemaType() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean shouldIndexNestedProperties() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<String> getIndexableNestedProperties() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName, @NonNull final String schemaType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setShouldIndexNestedProperties(final boolean indexNestedProperties) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addIndexableNestedProperties(@NonNull final String... indexableNestedProperties) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addIndexableNestedPropertyPaths(@NonNull final PropertyPath... indexableNestedPropertyPaths) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addIndexableNestedProperties(@NonNull final Collection<String> indexableNestedProperties) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addIndexableNestedPropertyPaths(@NonNull final Collection<PropertyPath> indexableNestedPropertyPaths) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public DocumentPropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class DoublePropertyConfig extends PropertyConfig
    {
        DoublePropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public DoublePropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class LongPropertyConfig extends PropertyConfig
    {
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_RANGE = 1;
        
        LongPropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIndexingType() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setIndexingType(final int indexingType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public LongPropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public abstract static class PropertyConfig
    {
        public static final int CARDINALITY_OPTIONAL = 2;
        public static final int CARDINALITY_REPEATED = 1;
        public static final int CARDINALITY_REQUIRED = 3;
        
        PropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCardinality() {
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
    }
    
    public static final class StringPropertyConfig extends PropertyConfig
    {
        public static final int INDEXING_TYPE_EXACT_TERMS = 1;
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_PREFIXES = 2;
        public static final int JOINABLE_VALUE_TYPE_NONE = 0;
        public static final int JOINABLE_VALUE_TYPE_QUALIFIED_ID = 1;
        public static final int TOKENIZER_TYPE_NONE = 0;
        public static final int TOKENIZER_TYPE_PLAIN = 1;
        public static final int TOKENIZER_TYPE_RFC822 = 3;
        public static final int TOKENIZER_TYPE_VERBATIM = 2;
        
        StringPropertyConfig() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIndexingType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTokenizerType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getJoinableValueType() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String propertyName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCardinality(final int cardinality) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setIndexingType(final int indexingType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setTokenizerType(final int tokenizerType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setJoinableValueType(final int joinableValueType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public StringPropertyConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
