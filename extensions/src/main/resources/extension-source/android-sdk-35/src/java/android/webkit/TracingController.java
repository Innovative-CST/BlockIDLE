package android.webkit;

import java.util.concurrent.Executor;
import java.io.OutputStream;

public abstract class TracingController
{
    @Deprecated
    public TracingController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static TracingController getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void start(@NonNull final TracingConfig p0);
    
    public abstract boolean stop(@Nullable final OutputStream p0, @NonNull final Executor p1);
    
    public abstract boolean isTracing();
}
