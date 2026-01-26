package java.util.concurrent;

import java.util.List;

public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor implements ScheduledExecutorService {
	public ScheduledThreadPoolExecutor(final int corePoolSize) {
		super(0, 0, 0L, null, null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(final int corePoolSize, final ThreadFactory threadFactory) {
		super(0, 0, 0L, null, null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(final int corePoolSize, final RejectedExecutionHandler handler) {
		super(0, 0, 0L, null, null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(final int corePoolSize, final ThreadFactory threadFactory,
			final RejectedExecutionHandler handler) {
		super(0, 0, 0L, null, null);
		throw new RuntimeException("Stub!");
	}

	protected <V> RunnableScheduledFuture<V> decorateTask(final Runnable runnable,
			final RunnableScheduledFuture<V> task) {
		throw new RuntimeException("Stub!");
	}

	protected <V> RunnableScheduledFuture<V> decorateTask(final Callable<V> callable,
			final RunnableScheduledFuture<V> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ScheduledFuture<?> schedule(final Runnable command, final long delay, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long delay, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ScheduledFuture<?> scheduleAtFixedRate(final Runnable command, final long initialDelay, final long period,
			final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable command, final long initialDelay, final long delay,
			final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void execute(final Runnable command) {
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

	public void setContinueExistingPeriodicTasksAfterShutdownPolicy(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {
		throw new RuntimeException("Stub!");
	}

	public void setExecuteExistingDelayedTasksAfterShutdownPolicy(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {
		throw new RuntimeException("Stub!");
	}

	public void setRemoveOnCancelPolicy(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public boolean getRemoveOnCancelPolicy() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void shutdown() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public List<Runnable> shutdownNow() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public BlockingQueue<Runnable> getQueue() {
		throw new RuntimeException("Stub!");
	}
}
