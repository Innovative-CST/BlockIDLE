package android.net.http;

import java.util.concurrent.RejectedExecutionException;

public final class InlineExecutionProhibitedException extends RejectedExecutionException
{
    public InlineExecutionProhibitedException() {
        throw new RuntimeException("Stub!");
    }
}
