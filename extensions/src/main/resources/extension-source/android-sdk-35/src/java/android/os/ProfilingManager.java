package android.os;

import java.util.function.Consumer;
import java.util.concurrent.Executor;

public final class ProfilingManager
{
    public static final int PROFILING_TYPE_HEAP_PROFILE = 2;
    public static final int PROFILING_TYPE_JAVA_HEAP_DUMP = 1;
    public static final int PROFILING_TYPE_STACK_SAMPLING = 3;
    public static final int PROFILING_TYPE_SYSTEM_TRACE = 4;
    
    ProfilingManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestProfiling(final int profilingType, @Nullable final Bundle parameters, @Nullable final String tag, @Nullable final CancellationSignal cancellationSignal, @Nullable final Executor executor, @Nullable final Consumer<ProfilingResult> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerForAllProfilingResults(@NonNull final Executor executor, @NonNull final Consumer<ProfilingResult> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterForAllProfilingResults(@Nullable final Consumer<ProfilingResult> listener) {
        throw new RuntimeException("Stub!");
    }
}
