package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
	public ForkJoinTask() {
		throw new RuntimeException("Stub!");
	}

	public final ForkJoinTask<V> fork() {
		throw new RuntimeException("Stub!");
	}

	public final V join() {
		throw new RuntimeException("Stub!");
	}

	public final V invoke() {
		throw new RuntimeException("Stub!");
	}

	public static void invokeAll(final ForkJoinTask<?> t1, final ForkJoinTask<?> t2) {
		throw new RuntimeException("Stub!");
	}

	public static void invokeAll(final ForkJoinTask<?>... tasks) {
		throw new RuntimeException("Stub!");
	}

	public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(final Collection<T> tasks) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean cancel(final boolean mayInterruptIfRunning) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isDone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isCancelled() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isCompletedAbnormally() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isCompletedNormally() {
		throw new RuntimeException("Stub!");
	}

	public final Throwable getException() {
		throw new RuntimeException("Stub!");
	}

	public void completeExceptionally(final Throwable ex) {
		throw new RuntimeException("Stub!");
	}

	public void complete(final V value) {
		throw new RuntimeException("Stub!");
	}

	public final void quietlyComplete() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final V get() throws ExecutionException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final V get(final long timeout, final TimeUnit unit)
			throws ExecutionException, InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	public final void quietlyJoin() {
		throw new RuntimeException("Stub!");
	}

	public final void quietlyInvoke() {
		throw new RuntimeException("Stub!");
	}

	public static void helpQuiesce() {
		throw new RuntimeException("Stub!");
	}

	public void reinitialize() {
		throw new RuntimeException("Stub!");
	}

	public static ForkJoinPool getPool() {
		throw new RuntimeException("Stub!");
	}

	public static boolean inForkJoinPool() {
		throw new RuntimeException("Stub!");
	}

	public boolean tryUnfork() {
		throw new RuntimeException("Stub!");
	}

	public static int getQueuedTaskCount() {
		throw new RuntimeException("Stub!");
	}

	public static int getSurplusQueuedTaskCount() {
		throw new RuntimeException("Stub!");
	}

	public abstract V getRawResult();

	protected abstract void setRawResult(final V p0);

	protected abstract boolean exec();

	protected static ForkJoinTask<?> peekNextLocalTask() {
		throw new RuntimeException("Stub!");
	}

	protected static ForkJoinTask<?> pollNextLocalTask() {
		throw new RuntimeException("Stub!");
	}

	protected static ForkJoinTask<?> pollTask() {
		throw new RuntimeException("Stub!");
	}

	public final short getForkJoinTaskTag() {
		throw new RuntimeException("Stub!");
	}

	public final short setForkJoinTaskTag(final short newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSetForkJoinTaskTag(final short expect, final short update) {
		throw new RuntimeException("Stub!");
	}

	public static ForkJoinTask<?> adapt(final Runnable runnable) {
		throw new RuntimeException("Stub!");
	}

	public static <T> ForkJoinTask<T> adapt(final Runnable runnable, final T result) {
		throw new RuntimeException("Stub!");
	}

	public static <T> ForkJoinTask<T> adapt(final Callable<? extends T> callable) {
		throw new RuntimeException("Stub!");
	}
}
