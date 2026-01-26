package android.app.appsearch;

import java.util.function.Consumer;
import java.util.concurrent.Executor;

public class EnterpriseGlobalSearchSession
{
    EnterpriseGlobalSearchSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SearchResults search(@NonNull final String queryExpression, @NonNull final SearchSpec searchSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public void getByDocumentId(@NonNull final String packageName, @NonNull final String databaseName, @NonNull final GetByDocumentIdRequest request, @NonNull final Executor executor, @NonNull final BatchResultCallback<String, GenericDocument> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getSchema(@NonNull final String packageName, @NonNull final String databaseName, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<GetSchemaResponse>> callback) {
        throw new RuntimeException("Stub!");
    }
}
