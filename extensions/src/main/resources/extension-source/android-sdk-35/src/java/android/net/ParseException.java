package android.net;

public class ParseException extends RuntimeException
{
    public String response;
    
    public ParseException(@NonNull final String response) {
        throw new RuntimeException("Stub!");
    }
    
    public ParseException(@NonNull final String response, @NonNull final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
