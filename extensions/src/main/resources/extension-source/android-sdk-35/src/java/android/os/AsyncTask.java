package android.os;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
public abstract class AsyncTask<Params, Progress, Result>
{
    @Deprecated
    public static final Executor SERIAL_EXECUTOR;
    @Deprecated
    public static final Executor THREAD_POOL_EXECUTOR;
    
    @Deprecated
    public AsyncTask() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Status getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected abstract Result doInBackground(final Params... p0);
    
    @Deprecated
    protected void onPreExecute() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onPostExecute(final Result result) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onProgressUpdate(final Progress... values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onCancelled(final Result result) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onCancelled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isCancelled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean cancel(final boolean mayInterruptIfRunning) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Result get() throws ExecutionException, InterruptedException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Result get(final long timeout, final TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final AsyncTask<Params, Progress, Result> execute(final Params... params) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final AsyncTask<Params, Progress, Result> executeOnExecutor(final Executor exec, final Params... params) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void execute(final Runnable runnable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected final void publishProgress(final Progress... values) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        SERIAL_EXECUTOR = null;
        THREAD_POOL_EXECUTOR = null;
    }
    
    @Deprecated
    public enum Status
    {
        @Deprecated
        PENDING, 
        @Deprecated
        RUNNING, 
        @Deprecated
        FINISHED;
    }
}
