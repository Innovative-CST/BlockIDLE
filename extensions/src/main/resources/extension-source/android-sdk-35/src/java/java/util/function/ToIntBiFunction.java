package java.util.function;

@FunctionalInterface
public interface ToIntBiFunction<T, U> {
	int applyAsInt(final T p0, final U p1);
}
