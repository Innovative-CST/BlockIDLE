package android.credentials;

public class ClearCredentialStateException extends Exception
{
    @NonNull
    public static final String TYPE_UNKNOWN = "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN";
    
    public ClearCredentialStateException(@NonNull final String type, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public ClearCredentialStateException(@NonNull final String type, @Nullable final String message, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public ClearCredentialStateException(@NonNull final String type, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public ClearCredentialStateException(@NonNull final String type) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
