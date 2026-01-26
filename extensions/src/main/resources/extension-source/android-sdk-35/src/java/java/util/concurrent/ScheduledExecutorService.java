package java.util.concurrent;

public interface ScheduledExecutorService extends ExecutorService {
	ScheduledFuture<?> schedule(final Runnable p0, final long p1, final TimeUnit p2);

	<V> ScheduledFuture<V> schedule(final Callable<V> p0, final long p1, final TimeUnit p2);

	ScheduledFuture<?> scheduleAtFixedRate(final Runnable p0, final long p1, final long p2, final TimeUnit p3);

	ScheduledFuture<?> scheduleWithFixedDelay(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
}
