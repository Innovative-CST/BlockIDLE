package java.util.concurrent;

public class ExecutorCompletionService<V> implements CompletionService<V> {
	public ExecutorCompletionService(final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public ExecutorCompletionService(final Executor executor, final BlockingQueue<Future<V>> completionQueue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<V> submit(final Callable<V> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<V> submit(final Runnable task, final V result) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<V> take() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<V> poll() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<V> poll(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}
}
