package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.Map;
import java.util.List;
import android.os.Parcelable;

public final class SearchSuggestionSpec implements Parcelable
{
    @NonNull
    public static final Creator<SearchSuggestionSpec> CREATOR;
    public static final int SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT = 0;
    public static final int SUGGESTION_RANKING_STRATEGY_NONE = 2;
    public static final int SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY = 1;
    
    SearchSuggestionSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumResultCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getFilterNamespaces() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRankingStrategy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getFilterSchemas() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<String>> getFilterProperties() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<String>> getFilterDocumentIds() {
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
    
    public static final class Builder
    {
        public Builder(final int maximumResultCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterNamespaces(@NonNull final String... namespaces) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterNamespaces(@NonNull final Collection<String> namespaces) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRankingStrategy(final int rankingStrategy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterSchemas(@NonNull final String... schemaTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterSchemas(@NonNull final Collection<String> schemaTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterProperties(@NonNull final String schema, @NonNull final Collection<String> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterPropertyPaths(@NonNull final String schema, @NonNull final Collection<PropertyPath> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterDocumentIds(@NonNull final String namespace, @NonNull final String... documentIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterDocumentIds(@NonNull final String namespace, @NonNull final Collection<String> documentIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SearchSuggestionSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
