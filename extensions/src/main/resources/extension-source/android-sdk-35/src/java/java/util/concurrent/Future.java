package java.util.concurrent;

public interface Future<V> {
	boolean cancel(final boolean p0);

	boolean isCancelled();

	boolean isDone();

	V get() throws ExecutionException, InterruptedException;

	V get(final long p0, final TimeUnit p1) throws ExecutionException, InterruptedException, TimeoutException;
}
