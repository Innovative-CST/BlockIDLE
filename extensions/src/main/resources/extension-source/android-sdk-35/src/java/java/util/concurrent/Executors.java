package java.util.concurrent;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

public class Executors {
	Executors() {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newFixedThreadPool(final int nThreads) {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newWorkStealingPool(final int parallelism) {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newWorkStealingPool() {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newFixedThreadPool(final int nThreads, final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newSingleThreadExecutor() {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newSingleThreadExecutor(final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newCachedThreadPool() {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newCachedThreadPool(final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newSingleThreadScheduledExecutor(final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newScheduledThreadPool(final int corePoolSize) {
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newScheduledThreadPool(final int corePoolSize,
			final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService unconfigurableExecutorService(final ExecutorService executor) {
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService unconfigurableScheduledExecutorService(
			final ScheduledExecutorService executor) {
		throw new RuntimeException("Stub!");
	}

	public static ThreadFactory defaultThreadFactory() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static ThreadFactory privilegedThreadFactory() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Callable<T> callable(final Runnable task, final T result) {
		throw new RuntimeException("Stub!");
	}

	public static Callable<Object> callable(final Runnable task) {
		throw new RuntimeException("Stub!");
	}

	public static Callable<Object> callable(final PrivilegedAction<?> action) {
		throw new RuntimeException("Stub!");
	}

	public static Callable<Object> callable(final PrivilegedExceptionAction<?> action) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static <T> Callable<T> privilegedCallable(final Callable<T> callable) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(final Callable<T> callable) {
		throw new RuntimeException("Stub!");
	}
}
