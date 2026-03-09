package android.net.ipsec.ike;

import java.io.PrintWriter;
import java.util.concurrent.Executor;
import android.content.Context;

public final class IkeSession implements AutoCloseable
{
    public IkeSession(@NonNull final Context context, @NonNull final IkeSessionParams ikeSessionParams, @NonNull final ChildSessionParams firstChildSessionParams, @NonNull final Executor userCbExecutor, @NonNull final IkeSessionCallback ikeSessionCallback, @NonNull final ChildSessionCallback firstChildSessionCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void openChildSession(@NonNull final ChildSessionParams childSessionParams, @NonNull final ChildSessionCallback childSessionCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void closeChildSession(@NonNull final ChildSessionCallback childSessionCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void kill() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(@NonNull final PrintWriter pw) {
        throw new RuntimeException("Stub!");
    }
}
