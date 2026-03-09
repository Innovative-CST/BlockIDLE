package java.util.concurrent;

public class FutureTask<V> implements RunnableFuture<V> {
	public FutureTask(final Callable<V> callable) {
		throw new RuntimeException("Stub!");
	}

	public FutureTask(final Runnable runnable, final V result) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isCancelled() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isDone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean cancel(final boolean mayInterruptIfRunning) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V get() throws ExecutionException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V get(final long timeout, final TimeUnit unit)
			throws ExecutionException, InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	protected void done() {
		throw new RuntimeException("Stub!");
	}

	protected void set(final V v) {
		throw new RuntimeException("Stub!");
	}

	protected void setException(final Throwable t) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void run() {
		throw new RuntimeException("Stub!");
	}

	protected boolean runAndReset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
