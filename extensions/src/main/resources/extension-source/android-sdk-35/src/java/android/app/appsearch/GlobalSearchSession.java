package android.app.appsearch;

import android.app.appsearch.exceptions.AppSearchException;
import android.app.appsearch.observer.ObserverCallback;
import android.app.appsearch.observer.ObserverSpec;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import java.io.Closeable;

public class GlobalSearchSession implements Closeable
{
    GlobalSearchSession() {
        throw new RuntimeException("Stub!");
    }
    
    public void getByDocumentId(@NonNull final String packageName, @NonNull final String databaseName, @NonNull final GetByDocumentIdRequest request, @NonNull final Executor executor, @NonNull final BatchResultCallback<String, GenericDocument> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SearchResults search(@NonNull final String queryExpression, @NonNull final SearchSpec searchSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public void getSchema(@NonNull final String packageName, @NonNull final String databaseName, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<GetSchemaResponse>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportSystemUsage(@NonNull final ReportSystemUsageRequest request, @NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<Void>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerObserverCallback(@NonNull final String targetPackageName, @NonNull final ObserverSpec spec, @NonNull final Executor executor, @NonNull final ObserverCallback observer) throws AppSearchException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterObserverCallback(@NonNull final String targetPackageName, @NonNull final ObserverCallback observer) throws AppSearchException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
