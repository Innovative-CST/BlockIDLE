package java.util.concurrent;

import java.util.List;

public class ThreadPoolExecutor extends AbstractExecutorService {
	public ThreadPoolExecutor(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
			final TimeUnit unit, final BlockingQueue<Runnable> workQueue) {
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
			final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
			final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final RejectedExecutionHandler handler) {
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
			final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final ThreadFactory threadFactory,
			final RejectedExecutionHandler handler) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void execute(final Runnable command) {
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
	public boolean isShutdown() {
		throw new RuntimeException("Stub!");
	}

	public boolean isTerminating() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isTerminated() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean awaitTermination(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	protected void finalize() {
		throw new RuntimeException("Stub!");
	}

	public void setThreadFactory(final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public ThreadFactory getThreadFactory() {
		throw new RuntimeException("Stub!");
	}

	public void setRejectedExecutionHandler(final RejectedExecutionHandler handler) {
		throw new RuntimeException("Stub!");
	}

	public RejectedExecutionHandler getRejectedExecutionHandler() {
		throw new RuntimeException("Stub!");
	}

	public void setCorePoolSize(final int corePoolSize) {
		throw new RuntimeException("Stub!");
	}

	public int getCorePoolSize() {
		throw new RuntimeException("Stub!");
	}

	public boolean prestartCoreThread() {
		throw new RuntimeException("Stub!");
	}

	public int prestartAllCoreThreads() {
		throw new RuntimeException("Stub!");
	}

	public boolean allowsCoreThreadTimeOut() {
		throw new RuntimeException("Stub!");
	}

	public void allowCoreThreadTimeOut(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public void setMaximumPoolSize(final int maximumPoolSize) {
		throw new RuntimeException("Stub!");
	}

	public int getMaximumPoolSize() {
		throw new RuntimeException("Stub!");
	}

	public void setKeepAliveTime(final long time, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public long getKeepAliveTime(final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public BlockingQueue<Runnable> getQueue() {
		throw new RuntimeException("Stub!");
	}

	public boolean remove(final Runnable task) {
		throw new RuntimeException("Stub!");
	}

	public void purge() {
		throw new RuntimeException("Stub!");
	}

	public int getPoolSize() {
		throw new RuntimeException("Stub!");
	}

	public int getActiveCount() {
		throw new RuntimeException("Stub!");
	}

	public int getLargestPoolSize() {
		throw new RuntimeException("Stub!");
	}

	public long getTaskCount() {
		throw new RuntimeException("Stub!");
	}

	public long getCompletedTaskCount() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	protected void beforeExecute(final Thread t, final Runnable r) {
		throw new RuntimeException("Stub!");
	}

	protected void afterExecute(final Runnable r, final Throwable t) {
		throw new RuntimeException("Stub!");
	}

	protected void terminated() {
		throw new RuntimeException("Stub!");
	}

	public static class AbortPolicy implements RejectedExecutionHandler {
		public AbortPolicy() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public void rejectedExecution(final Runnable r, final ThreadPoolExecutor e) {
			throw new RuntimeException("Stub!");
		}
	}

	public static class CallerRunsPolicy implements RejectedExecutionHandler {
		public CallerRunsPolicy() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public void rejectedExecution(final Runnable r, final ThreadPoolExecutor e) {
			throw new RuntimeException("Stub!");
		}
	}

	public static class DiscardOldestPolicy implements RejectedExecutionHandler {
		public DiscardOldestPolicy() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public void rejectedExecution(final Runnable r, final ThreadPoolExecutor e) {
			throw new RuntimeException("Stub!");
		}
	}

	public static class DiscardPolicy implements RejectedExecutionHandler {
		public DiscardPolicy() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public void rejectedExecution(final Runnable r, final ThreadPoolExecutor e) {
			throw new RuntimeException("Stub!");
		}
	}
}
