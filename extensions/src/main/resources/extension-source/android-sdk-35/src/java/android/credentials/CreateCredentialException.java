package android.credentials;

public class CreateCredentialException extends Exception
{
    @NonNull
    public static final String TYPE_INTERRUPTED = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED";
    @NonNull
    public static final String TYPE_NO_CREATE_OPTIONS = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS";
    @NonNull
    public static final String TYPE_UNKNOWN = "android.credentials.CreateCredentialException.TYPE_UNKNOWN";
    @NonNull
    public static final String TYPE_USER_CANCELED = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED";
    
    public CreateCredentialException(@NonNull final String type, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public CreateCredentialException(@NonNull final String type, @Nullable final String message, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public CreateCredentialException(@NonNull final String type, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public CreateCredentialException(@NonNull final String type) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
