package java.lang.invoke;

import java.util.List;

public abstract class MethodHandle {
	MethodHandle() {
		throw new RuntimeException("Stub!");
	}

	public MethodType type() {
		throw new RuntimeException("Stub!");
	}

	public final native Object invokeExact(final Object... p0) throws Throwable;

	public final native Object invoke(final Object... p0) throws Throwable;

	public Object invokeWithArguments(final Object... arguments) throws Throwable {
		throw new RuntimeException("Stub!");
	}

	public Object invokeWithArguments(final List<?> arguments) throws Throwable {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asType(final MethodType newType) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asSpreader(final Class<?> arrayType, final int arrayLength) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asSpreader(final int spreadArgPos, final Class<?> arrayType, final int arrayLength) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle withVarargs(final boolean makeVarargs) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asCollector(final Class<?> arrayType, final int arrayLength) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asCollector(final int collectArgPos, final Class<?> arrayType, final int arrayLength) {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asVarargsCollector(final Class<?> arrayType) {
		throw new RuntimeException("Stub!");
	}

	public boolean isVarargsCollector() {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle asFixedArity() {
		throw new RuntimeException("Stub!");
	}

	public MethodHandle bindTo(final Object x) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
