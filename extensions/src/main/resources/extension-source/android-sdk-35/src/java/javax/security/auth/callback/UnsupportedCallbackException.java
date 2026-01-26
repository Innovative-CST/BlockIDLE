package javax.security.auth.callback;

public class UnsupportedCallbackException extends Exception
{
    public UnsupportedCallbackException(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public UnsupportedCallbackException(final Callback callback, final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public Callback getCallback() {
        throw new RuntimeException("Stub!");
    }
}
