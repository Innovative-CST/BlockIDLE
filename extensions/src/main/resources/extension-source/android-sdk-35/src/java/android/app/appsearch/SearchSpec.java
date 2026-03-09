package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.Map;
import java.util.List;
import android.os.Parcelable;

public final class SearchSpec implements Parcelable
{
    @NonNull
    public static final Creator<SearchSpec> CREATOR;
    public static final int GROUPING_TYPE_PER_NAMESPACE = 2;
    public static final int GROUPING_TYPE_PER_PACKAGE = 1;
    public static final int GROUPING_TYPE_PER_SCHEMA = 4;
    public static final int ORDER_ASCENDING = 1;
    public static final int ORDER_DESCENDING = 0;
    @Deprecated
    public static final String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    public static final int RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION = 9;
    public static final int RANKING_STRATEGY_CREATION_TIMESTAMP = 2;
    public static final int RANKING_STRATEGY_DOCUMENT_SCORE = 1;
    public static final int RANKING_STRATEGY_JOIN_AGGREGATE_SCORE = 8;
    public static final int RANKING_STRATEGY_NONE = 0;
    public static final int RANKING_STRATEGY_RELEVANCE_SCORE = 3;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_COUNT = 6;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_LAST_USED_TIMESTAMP = 7;
    public static final int RANKING_STRATEGY_USAGE_COUNT = 4;
    public static final int RANKING_STRATEGY_USAGE_LAST_USED_TIMESTAMP = 5;
    public static final String SCHEMA_TYPE_WILDCARD = "*";
    public static final int TERM_MATCH_EXACT_ONLY = 1;
    public static final int TERM_MATCH_PREFIX = 2;
    
    SearchSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTermMatch() {
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
    public List<String> getFilterNamespaces() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getFilterPackageNames() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultCountPerPage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRankingStrategy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrder() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSnippetCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSnippetCountPerProperty() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSnippetSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<String>> getProjections() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<PropertyPath>> getProjectionPaths() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Map<String, Double>> getPropertyWeights() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Map<PropertyPath, Double>> getPropertyWeightPaths() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultGroupingTypeFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultGroupingLimit() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public JoinSpec getJoinSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getAdvancedRankingExpression() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSearchSourceLogTag() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNumericSearchEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVerbatimSearchEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isListFilterQueryLanguageEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isListFilterHasPropertyFunctionEnabled() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTermMatch(final int termMatchType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterSchemas(@NonNull final String... schemas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterSchemas(@NonNull final Collection<String> schemas) {
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
        public Builder addFilterNamespaces(@NonNull final String... namespaces) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterNamespaces(@NonNull final Collection<String> namespaces) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterPackageNames(@NonNull final String... packageNames) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterPackageNames(@NonNull final Collection<String> packageNames) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setResultCountPerPage(final int resultCountPerPage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRankingStrategy(final int rankingStrategy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRankingStrategy(@NonNull final String advancedRankingExpression) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSearchSourceLogTag(@NonNull final String searchSourceLogTag) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOrder(final int order) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSnippetCount(final int snippetCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSnippetCountPerProperty(final int snippetCountPerProperty) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxSnippetSize(final int maxSnippetSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addProjection(@NonNull final String schema, @NonNull final Collection<String> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addProjectionPaths(@NonNull final String schema, @NonNull final Collection<PropertyPath> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setResultGrouping(final int groupingTypeFlags, final int limit) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPropertyWeights(@NonNull final String schemaType, @NonNull final Map<String, Double> propertyPathWeights) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setJoinSpec(@NonNull final JoinSpec joinSpec) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPropertyWeightPaths(@NonNull final String schemaType, @NonNull final Map<PropertyPath, Double> propertyPathWeights) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNumericSearchEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVerbatimSearchEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setListFilterQueryLanguageEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setListFilterHasPropertyFunctionEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SearchSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
