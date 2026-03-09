package java.util.function;

@FunctionalInterface
public interface ToDoubleBiFunction<T, U> {
	double applyAsDouble(final T p0, final U p1);
}
