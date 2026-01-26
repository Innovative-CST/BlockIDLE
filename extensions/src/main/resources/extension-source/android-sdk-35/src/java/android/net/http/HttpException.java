package android.net.http;

import java.io.IOException;

public class HttpException extends IOException
{
    public HttpException(@Nullable final String message, @Nullable final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
