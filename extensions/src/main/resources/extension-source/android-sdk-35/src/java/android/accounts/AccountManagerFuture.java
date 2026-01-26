package android.accounts;

import java.util.concurrent.TimeUnit;
import java.io.IOException;

public interface AccountManagerFuture<V>
{
    boolean cancel(final boolean p0);
    
    boolean isCancelled();
    
    boolean isDone();
    
    V getResult() throws AuthenticatorException, IOException, OperationCanceledException;
    
    V getResult(final long p0, final TimeUnit p1) throws AuthenticatorException, IOException, OperationCanceledException;
}
