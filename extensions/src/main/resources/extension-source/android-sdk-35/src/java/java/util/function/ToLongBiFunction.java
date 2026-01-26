package java.util.function;

@FunctionalInterface
public interface ToLongBiFunction<T, U> {
	long applyAsLong(final T p0, final U p1);
}
