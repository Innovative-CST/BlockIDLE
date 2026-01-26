package java.util.concurrent;

public final class Flow {
	Flow() {
		throw new RuntimeException("Stub!");
	}

	public static int defaultBufferSize() {
		throw new RuntimeException("Stub!");
	}

	public interface Subscription {
		void request(final long p0);

		void cancel();
	}

	public interface Subscriber<T> {
		void onSubscribe(final Subscription p0);

		void onNext(final T p0);

		void onError(final Throwable p0);

		void onComplete();
	}

	@FunctionalInterface
	public interface Publisher<T> {
		void subscribe(final Subscriber<? super T> p0);
	}

	public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {
	}
}
