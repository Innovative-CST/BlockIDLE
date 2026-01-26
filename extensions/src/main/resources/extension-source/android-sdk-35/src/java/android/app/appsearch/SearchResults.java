package android.app.appsearch;

import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import java.io.Closeable;

public class SearchResults implements Closeable
{
    SearchResults() {
        throw new RuntimeException("Stub!");
    }
    
    public void getNextPage(@NonNull final Executor executor, @NonNull final Consumer<AppSearchResult<List<SearchResult>>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
