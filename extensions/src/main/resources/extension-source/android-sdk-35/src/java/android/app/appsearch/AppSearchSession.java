package android.app.appsearch;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import java.io.Closeable;

public final class AppSearchSession implements Closeable
{
    AppSearchSession() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSchema(@NonNull final SetSchemaRequest request, @NonNull final Executor workExecutor, @NonNull final Executor callbackExecutor, @NonNull final Consumer<AppSearchResult<SetSchemaResponse>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getSchema(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<GetSchemaResponse>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getNamespaces(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<Set<String>>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(@NonNull final PutDocumentsRequest request, @NonNull final Executor executor, @NonNull final BatchResultCallback<String, Void> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getByDocumentId(@NonNull final GetByDocumentIdRequest request, @NonNull final Executor executor, @NonNull final BatchResultCallback<String, GenericDocument> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SearchResults search(@NonNull final String queryExpression, @NonNull final SearchSpec searchSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public void searchSuggestion(@NonNull final String suggestionQueryExpression, @NonNull final SearchSuggestionSpec searchSuggestionSpec, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<List<SearchSuggestionResult>>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportUsage(@NonNull final ReportUsageRequest request, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<Void>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void remove(@NonNull final RemoveByDocumentIdRequest request, @NonNull final Executor executor, @NonNull final BatchResultCallback<String, Void> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void remove(@NonNull final String queryExpression, @NonNull final SearchSpec searchSpec, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<Void>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getStorageInfo(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<StorageInfo>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
