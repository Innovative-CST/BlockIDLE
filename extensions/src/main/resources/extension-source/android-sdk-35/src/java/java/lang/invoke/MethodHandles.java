package java.lang.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.util.List;

public class MethodHandles {
	MethodHandles() {
		throw new RuntimeException("Stub!");
	}

	public static Lookup lookup() {
		throw new RuntimeException("Stub!");
	}

	public static Lookup publicLookup() {
		throw new RuntimeException("Stub!");
	}

	public static Lookup privateLookupIn(final Class<?> targetClass, final Lookup lookup)
			throws IllegalAccessException {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Member> T reflectAs(final Class<T> expected, final MethodHandle target) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle arrayConstructor(final Class<?> arrayClass) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle arrayLength(final Class<?> arrayClass) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle arrayElementGetter(final Class<?> arrayClass) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle arrayElementSetter(final Class<?> arrayClass) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static VarHandle arrayElementVarHandle(final Class<?> arrayClass) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static VarHandle byteArrayViewVarHandle(final Class<?> viewArrayClass, final ByteOrder byteOrder)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static VarHandle byteBufferViewVarHandle(final Class<?> viewArrayClass, final ByteOrder byteOrder)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle spreadInvoker(final MethodType type, final int leadingArgCount) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle exactInvoker(final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle invoker(final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle varHandleExactInvoker(final VarHandle.AccessMode accessMode, final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle varHandleInvoker(final VarHandle.AccessMode accessMode, final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle explicitCastArguments(final MethodHandle target, final MethodType newType) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle permuteArguments(final MethodHandle target, final MethodType newType,
			final int... reorder) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle constant(final Class<?> type, final Object value) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle identity(final Class<?> type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle zero(final Class<?> type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle empty(final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle insertArguments(final MethodHandle target, final int pos, final Object... values) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle dropArguments(final MethodHandle target, final int pos,
			final List<Class<?>> valueTypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle dropArguments(final MethodHandle target, final int pos, final Class<?>... valueTypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle dropArgumentsToMatch(final MethodHandle target, final int skip,
			final List<Class<?>> newTypes, final int pos) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle dropReturn(final MethodHandle target) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle filterArguments(final MethodHandle target, final int pos,
			final MethodHandle... filters) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle collectArguments(final MethodHandle target, final int pos, final MethodHandle filter) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle filterReturnValue(final MethodHandle target, final MethodHandle filter) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle foldArguments(final MethodHandle target, final MethodHandle combiner) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle foldArguments(final MethodHandle target, final int pos, final MethodHandle combiner) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle guardWithTest(final MethodHandle test, final MethodHandle target,
			final MethodHandle fallback) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle catchException(final MethodHandle target, final Class<? extends Throwable> exType,
			final MethodHandle handler) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle throwException(final Class<?> returnType, final Class<? extends Throwable> exType) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle loop(final MethodHandle[]... clauses) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle whileLoop(final MethodHandle init, final MethodHandle pred, final MethodHandle body) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle doWhileLoop(final MethodHandle init, final MethodHandle body, final MethodHandle pred) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle countedLoop(final MethodHandle iterations, final MethodHandle init,
			final MethodHandle body) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle countedLoop(final MethodHandle start, final MethodHandle end, final MethodHandle init,
			final MethodHandle body) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle iteratedLoop(final MethodHandle iterator, final MethodHandle init,
			final MethodHandle body) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle tryFinally(final MethodHandle target, final MethodHandle cleanup) {
		throw new RuntimeException("Stub!");
	}

	public static MethodHandle tableSwitch(final MethodHandle fallback, final MethodHandle... targets) {
		throw new RuntimeException("Stub!");
	}

	public static final class Lookup {
		public static final int PACKAGE = 8;
		public static final int PRIVATE = 2;
		public static final int PROTECTED = 4;
		public static final int PUBLIC = 1;

		Lookup() {
			throw new RuntimeException("Stub!");
		}

		public Class<?> lookupClass() {
			throw new RuntimeException("Stub!");
		}

		public int lookupModes() {
			throw new RuntimeException("Stub!");
		}

		public Lookup in(final Class<?> requestedLookupClass) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findStatic(final Class<?> refc, final String name, final MethodType type)
				throws IllegalAccessException, NoSuchMethodException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findVirtual(final Class<?> refc, final String name, final MethodType type)
				throws IllegalAccessException, NoSuchMethodException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findConstructor(final Class<?> refc, final MethodType type)
				throws IllegalAccessException, NoSuchMethodException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findSpecial(final Class<?> refc, final String name, final MethodType type,
				final Class<?> specialCaller) throws IllegalAccessException, NoSuchMethodException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findGetter(final Class<?> refc, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findSetter(final Class<?> refc, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public VarHandle findVarHandle(final Class<?> recv, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findStaticGetter(final Class<?> refc, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle findStaticSetter(final Class<?> refc, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public VarHandle findStaticVarHandle(final Class<?> decl, final String name, final Class<?> type)
				throws IllegalAccessException, NoSuchFieldException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle bind(final Object receiver, final String name, final MethodType type)
				throws IllegalAccessException, NoSuchMethodException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle unreflect(final Method m) throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle unreflectSpecial(final Method m, final Class<?> specialCaller)
				throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle unreflectConstructor(final Constructor<?> c) throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle unreflectGetter(final Field f) throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandle unreflectSetter(final Field f) throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public VarHandle unreflectVarHandle(final Field f) throws IllegalAccessException {
			throw new RuntimeException("Stub!");
		}

		public MethodHandleInfo revealDirect(final MethodHandle target) {
			throw new RuntimeException("Stub!");
		}
	}
}
