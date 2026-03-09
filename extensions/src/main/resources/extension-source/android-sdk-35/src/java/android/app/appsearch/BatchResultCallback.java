package android.app.appsearch;

public interface BatchResultCallback<KeyType, ValueType>
{
    void onResult(@NonNull final AppSearchBatchResult<KeyType, ValueType> p0);
    
    default void onSystemError(@Nullable final Throwable throwable) {
        throw new RuntimeException("Stub!");
    }
}
