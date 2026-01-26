package java.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class ForkJoinPool extends AbstractExecutorService {
	public static final ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory;

	public ForkJoinPool() {
		throw new RuntimeException("Stub!");
	}

	public ForkJoinPool(final int parallelism) {
		throw new RuntimeException("Stub!");
	}

	public ForkJoinPool(final int parallelism, final ForkJoinWorkerThreadFactory factory,
			final Thread.UncaughtExceptionHandler handler, final boolean asyncMode) {
		throw new RuntimeException("Stub!");
	}

	public ForkJoinPool(final int parallelism, final ForkJoinWorkerThreadFactory factory,
			final Thread.UncaughtExceptionHandler handler, final boolean asyncMode, final int corePoolSize,
			final int maximumPoolSize, final int minimumRunnable, final Predicate<? super ForkJoinPool> saturate,
			final long keepAliveTime, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static ForkJoinPool commonPool() {
		throw new RuntimeException("Stub!");
	}

	public <T> T invoke(final ForkJoinTask<T> task) {
		throw new RuntimeException("Stub!");
	}

	public void execute(final ForkJoinTask<?> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void execute(final Runnable task) {
		throw new RuntimeException("Stub!");
	}

	public <T> ForkJoinTask<T> submit(final ForkJoinTask<T> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> ForkJoinTask<T> submit(final Callable<T> task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> ForkJoinTask<T> submit(final Runnable task, final T result) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ForkJoinTask<?> submit(final Runnable task) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> tasks) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> tasks, final long timeout,
			final TimeUnit unit) throws InterruptedException {
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

	public ForkJoinWorkerThreadFactory getFactory() {
		throw new RuntimeException("Stub!");
	}

	public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
		throw new RuntimeException("Stub!");
	}

	public int getParallelism() {
		throw new RuntimeException("Stub!");
	}

	public static int getCommonPoolParallelism() {
		throw new RuntimeException("Stub!");
	}

	public int getPoolSize() {
		throw new RuntimeException("Stub!");
	}

	public boolean getAsyncMode() {
		throw new RuntimeException("Stub!");
	}

	public int getRunningThreadCount() {
		throw new RuntimeException("Stub!");
	}

	public int getActiveThreadCount() {
		throw new RuntimeException("Stub!");
	}

	public boolean isQuiescent() {
		throw new RuntimeException("Stub!");
	}

	public long getStealCount() {
		throw new RuntimeException("Stub!");
	}

	public long getQueuedTaskCount() {
		throw new RuntimeException("Stub!");
	}

	public int getQueuedSubmissionCount() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasQueuedSubmissions() {
		throw new RuntimeException("Stub!");
	}

	protected ForkJoinTask<?> pollSubmission() {
		throw new RuntimeException("Stub!");
	}

	protected int drainTasksTo(final Collection<? super ForkJoinTask<?>> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
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
	public boolean isTerminated() {
		throw new RuntimeException("Stub!");
	}

	public boolean isTerminating() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isShutdown() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean awaitTermination(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public boolean awaitQuiescence(final long timeout, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static void managedBlock(final ManagedBlocker blocker) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected <T> RunnableFuture<T> newTaskFor(final Runnable runnable, final T value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected <T> RunnableFuture<T> newTaskFor(final Callable<T> callable) {
		throw new RuntimeException("Stub!");
	}

	static {
		defaultForkJoinWorkerThreadFactory = null;
	}

	public interface ForkJoinWorkerThreadFactory {
		ForkJoinWorkerThread newThread(final ForkJoinPool p0);
	}

	public interface ManagedBlocker {
		boolean block() throws InterruptedException;

		boolean isReleasable();
	}
}
