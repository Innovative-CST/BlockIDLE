package java.nio.channels;

public interface CompletionHandler<V, A> {
	void completed(final V p0, final A p1);

	void failed(final Throwable p0, final A p1);
}
