package java.util.concurrent;

import java.util.Collection;
import java.util.List;

public abstract class AbstractExecutorService implements ExecutorService {
	public AbstractExecutorService() {
		throw new RuntimeException("Stub!");
	}

	protected <T> RunnableFuture<T> newTaskFor(final Runnable runnable, final T value) {
		throw new RuntimeException("Stub!");
	}

	protected <T> RunnableFuture<T> newTaskFor(final Callable<T> callable) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Future<?> submit(final Runnable task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> Future<T> submit(final Runnable task, final T result) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> Future<T> submit(final Callable<T> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T invokeAny(final Collection<? extends Callable<T>> tasks)
			throws ExecutionException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T invokeAny(final Collection<? extends Callable<T>> tasks, final long timeout, final TimeUnit unit)
			throws ExecutionException, InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> tasks) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> tasks, final long timeout,
			final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}
}
