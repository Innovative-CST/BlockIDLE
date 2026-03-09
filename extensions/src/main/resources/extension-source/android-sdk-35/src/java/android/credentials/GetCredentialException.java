package android.credentials;

public class GetCredentialException extends Exception
{
    @NonNull
    public static final String TYPE_INTERRUPTED = "android.credentials.GetCredentialException.TYPE_INTERRUPTED";
    @NonNull
    public static final String TYPE_NO_CREDENTIAL = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL";
    @NonNull
    public static final String TYPE_UNKNOWN = "android.credentials.GetCredentialException.TYPE_UNKNOWN";
    @NonNull
    public static final String TYPE_USER_CANCELED = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";
    
    public GetCredentialException(@NonNull final String type, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public GetCredentialException(@NonNull final String type, @Nullable final String message, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public GetCredentialException(@NonNull final String type, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public GetCredentialException(@NonNull final String type) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
