package android.app.appsearch;

import java.util.function.Consumer;
import java.util.concurrent.Executor;

public class AppSearchManager
{
    AppSearchManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void createSearchSession(@NonNull final SearchContext searchContext, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<AppSearchSession>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void createGlobalSearchSession(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<GlobalSearchSession>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void createEnterpriseGlobalSearchSession(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<EnterpriseGlobalSearchSession>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class SearchContext
    {
        SearchContext() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDatabaseName() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String databaseName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public SearchContext build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
