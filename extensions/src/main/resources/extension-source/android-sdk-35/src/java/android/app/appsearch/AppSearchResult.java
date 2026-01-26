package android.app.appsearch;

public final class AppSearchResult<ValueType>
{
    public static final int RESULT_DENIED = 9;
    public static final int RESULT_INTERNAL_ERROR = 2;
    public static final int RESULT_INVALID_ARGUMENT = 3;
    public static final int RESULT_INVALID_SCHEMA = 7;
    public static final int RESULT_IO_ERROR = 4;
    public static final int RESULT_NOT_FOUND = 6;
    public static final int RESULT_OK = 0;
    public static final int RESULT_OUT_OF_SPACE = 5;
    public static final int RESULT_RATE_LIMITED = 10;
    public static final int RESULT_SECURITY_ERROR = 8;
    public static final int RESULT_UNKNOWN_ERROR = 1;
    
    AppSearchResult() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSuccess() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ValueType getResultValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getErrorMessage() {
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
    
    @NonNull
    public static <ValueType> AppSearchResult<ValueType> newSuccessfulResult(@Nullable final ValueType value) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static <ValueType> AppSearchResult<ValueType> newFailedResult(final int resultCode, @Nullable final String errorMessage) {
        throw new RuntimeException("Stub!");
    }
}
