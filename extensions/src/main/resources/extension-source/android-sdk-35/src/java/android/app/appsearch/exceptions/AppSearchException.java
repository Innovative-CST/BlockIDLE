package android.app.appsearch.exceptions;

import android.app.appsearch.AppSearchResult;

public class AppSearchException extends Exception
{
    public AppSearchException(final int resultCode) {
        throw new RuntimeException("Stub!");
    }
    
    public AppSearchException(final int resultCode, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public AppSearchException(final int resultCode, @Nullable final String message, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T> AppSearchResult<T> toAppSearchResult() {
        throw new RuntimeException("Stub!");
    }
}
