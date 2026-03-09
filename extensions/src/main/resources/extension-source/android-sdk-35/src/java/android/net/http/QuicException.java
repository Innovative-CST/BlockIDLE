package android.net.http;

public abstract class QuicException extends NetworkException
{
    protected QuicException(@Nullable final String message, @Nullable final Throwable cause) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
}
