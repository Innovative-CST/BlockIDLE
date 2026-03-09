package java.util.concurrent;

public interface CompletionService<V> {
	Future<V> submit(final Callable<V> p0);

	Future<V> submit(final Runnable p0, final V p1);

	Future<V> take() throws InterruptedException;

	Future<V> poll();

	Future<V> poll(final long p0, final TimeUnit p1) throws InterruptedException;
}
