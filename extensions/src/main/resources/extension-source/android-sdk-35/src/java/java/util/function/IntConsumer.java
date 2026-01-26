package java.util.function;

@FunctionalInterface
public interface IntConsumer {
	void accept(final int p0);

	default IntConsumer andThen(final IntConsumer after) {
		throw new RuntimeException("Stub!");
	}
}
