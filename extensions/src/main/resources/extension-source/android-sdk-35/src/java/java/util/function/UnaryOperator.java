package java.util.function;

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
	default <T> UnaryOperator<T> identity() {
		throw new RuntimeException("Stub!");
	}
}
