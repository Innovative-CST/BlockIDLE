package java.util.concurrent;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class SubmissionPublisher<T> implements Flow.Publisher<T>, AutoCloseable {
	public SubmissionPublisher(final Executor executor, final int maxBufferCapacity,
			final BiConsumer<? super Flow.Subscriber<? super T>, ? super Throwable> handler) {
		throw new RuntimeException("Stub!");
	}

	public SubmissionPublisher(final Executor executor, final int maxBufferCapacity) {
		throw new RuntimeException("Stub!");
	}

	public SubmissionPublisher() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void subscribe(final Flow.Subscriber<? super T> subscriber) {
		throw new RuntimeException("Stub!");
	}

	public int submit(final T item) {
		throw new RuntimeException("Stub!");
	}

	public int offer(final T item, final BiPredicate<Flow.Subscriber<? super T>, ? super T> onDrop) {
		throw new RuntimeException("Stub!");
	}

	public int offer(final T item, final long timeout, final TimeUnit unit,
			final BiPredicate<Flow.Subscriber<? super T>, ? super T> onDrop) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() {
		throw new RuntimeException("Stub!");
	}

	public void closeExceptionally(final Throwable error) {
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed() {
		throw new RuntimeException("Stub!");
	}

	public Throwable getClosedException() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasSubscribers() {
		throw new RuntimeException("Stub!");
	}

	public int getNumberOfSubscribers() {
		throw new RuntimeException("Stub!");
	}

	public Executor getExecutor() {
		throw new RuntimeException("Stub!");
	}

	public int getMaxBufferCapacity() {
		throw new RuntimeException("Stub!");
	}

	public List<Flow.Subscriber<? super T>> getSubscribers() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSubscribed(final Flow.Subscriber<? super T> subscriber) {
		throw new RuntimeException("Stub!");
	}

	public long estimateMinimumDemand() {
		throw new RuntimeException("Stub!");
	}

	public int estimateMaximumLag() {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<Void> consume(final Consumer<? super T> consumer) {
		throw new RuntimeException("Stub!");
	}
}
