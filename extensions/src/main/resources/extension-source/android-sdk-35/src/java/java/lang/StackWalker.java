package java.lang;

import java.lang.invoke.MethodType;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public final class StackWalker {
	StackWalker() {
		throw new RuntimeException("Stub!");
	}

	public static StackWalker getInstance() {
		throw new RuntimeException("Stub!");
	}

	public static StackWalker getInstance(final Option option) {
		throw new RuntimeException("Stub!");
	}

	public static StackWalker getInstance(final Set<Option> options) {
		throw new RuntimeException("Stub!");
	}

	public static StackWalker getInstance(final Set<Option> options, final int estimateDepth) {
		throw new RuntimeException("Stub!");
	}

	public <T> T walk(final Function<? super Stream<StackFrame>, ? extends T> function) {
		throw new RuntimeException("Stub!");
	}

	public void forEach(final Consumer<? super StackFrame> action) {
		throw new RuntimeException("Stub!");
	}

	public Class<?> getCallerClass() {
		throw new RuntimeException("Stub!");
	}

	public enum Option {
		RETAIN_CLASS_REFERENCE, SHOW_REFLECT_FRAMES, SHOW_HIDDEN_FRAMES;
	}

	public interface StackFrame {
		String getClassName();

		String getMethodName();

		Class<?> getDeclaringClass();

		default MethodType getMethodType() {
			throw new RuntimeException("Stub!");
		}

		default String getDescriptor() {
			throw new RuntimeException("Stub!");
		}

		int getByteCodeIndex();

		String getFileName();

		int getLineNumber();

		boolean isNativeMethod();

		StackTraceElement toStackTraceElement();
	}
}
