package java.util.function;

@FunctionalInterface
public interface DoubleConsumer {
	void accept(final double p0);

	default DoubleConsumer andThen(final DoubleConsumer after) {
		throw new RuntimeException("Stub!");
	}
}
