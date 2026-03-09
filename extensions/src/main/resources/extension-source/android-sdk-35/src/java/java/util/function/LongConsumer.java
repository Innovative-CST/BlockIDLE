package java.util.function;

@FunctionalInterface
public interface LongConsumer {
	void accept(final long p0);

	default LongConsumer andThen(final LongConsumer after) {
		throw new RuntimeException("Stub!");
	}
}
