package android.net.http;

public abstract class CallbackException extends HttpException
{
    protected CallbackException(@Nullable final String message, @Nullable final Throwable cause) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
}
