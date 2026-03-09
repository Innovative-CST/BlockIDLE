package java.lang.invoke;

import java.util.List;

public abstract class VarHandle {
	VarHandle() {
		throw new RuntimeException("Stub!");
	}

	public final native Object get(final Object... p0);

	public final native void set(final Object... p0);

	public final native Object getVolatile(final Object... p0);

	public final native void setVolatile(final Object... p0);

	public final native Object getOpaque(final Object... p0);

	public final native void setOpaque(final Object... p0);

	public final native Object getAcquire(final Object... p0);

	public final native void setRelease(final Object... p0);

	public final native boolean compareAndSet(final Object... p0);

	public final native Object compareAndExchange(final Object... p0);

	public final native Object compareAndExchangeAcquire(final Object... p0);

	public final native Object compareAndExchangeRelease(final Object... p0);

	public final native boolean weakCompareAndSetPlain(final Object... p0);

	public final native boolean weakCompareAndSet(final Object... p0);

	public final native boolean weakCompareAndSetAcquire(final Object... p0);

	public final native boolean weakCompareAndSetRelease(final Object... p0);

	public final native Object getAndSet(final Object... p0);

	public final native Object getAndSetAcquire(final Object... p0);

	public final native Object getAndSetRelease(final Object... p0);

	public final native Object getAndAdd(final Object... p0);

	public final native Object getAndAddAcquire(final Object... p0);

	public final native Object getAndAddRelease(final Object... p0);

	public final native Object getAndBitwiseOr(final Object... p0);

	public final native Object getAndBitwiseOrAcquire(final Object... p0);

	public final native Object getAndBitwiseOrRelease(final Object... p0);

	public final native Object getAndBitwiseAnd(final Object... p0);

	public final native Object getAndBitwiseAndAcquire(final Object... p0);

	public final native Object getAndBitwiseAndRelease(final Object... p0);

	public final native Object getAndBitwiseXor(final Object... p0);

	public final native Object getAndBitwiseXorAcquire(final Object... p0);

	public final native Object getAndBitwiseXorRelease(final Object... p0);

	@Override
	public final String toString() {
		throw new RuntimeException("Stub!");
	}

	public final Class<?> varType() {
		throw new RuntimeException("Stub!");
	}

	public final List<Class<?>> coordinateTypes() {
		throw new RuntimeException("Stub!");
	}

	public final MethodType accessModeType(final AccessMode accessMode) {
		throw new RuntimeException("Stub!");
	}

	public final boolean isAccessModeSupported(final AccessMode accessMode) {
		throw new RuntimeException("Stub!");
	}

	public final MethodHandle toMethodHandle(final AccessMode accessMode) {
		throw new RuntimeException("Stub!");
	}

	public static void fullFence() {
		throw new RuntimeException("Stub!");
	}

	public static void acquireFence() {
		throw new RuntimeException("Stub!");
	}

	public static void releaseFence() {
		throw new RuntimeException("Stub!");
	}

	public static void loadLoadFence() {
		throw new RuntimeException("Stub!");
	}

	public static void storeStoreFence() {
		throw new RuntimeException("Stub!");
	}

	public enum AccessMode {
		GET, SET, GET_VOLATILE, SET_VOLATILE, GET_ACQUIRE, SET_RELEASE, GET_OPAQUE, SET_OPAQUE, COMPARE_AND_SET, COMPARE_AND_EXCHANGE, COMPARE_AND_EXCHANGE_ACQUIRE, COMPARE_AND_EXCHANGE_RELEASE, WEAK_COMPARE_AND_SET_PLAIN, WEAK_COMPARE_AND_SET, WEAK_COMPARE_AND_SET_ACQUIRE, WEAK_COMPARE_AND_SET_RELEASE, GET_AND_SET, GET_AND_SET_ACQUIRE, GET_AND_SET_RELEASE, GET_AND_ADD, GET_AND_ADD_ACQUIRE, GET_AND_ADD_RELEASE, GET_AND_BITWISE_OR, GET_AND_BITWISE_OR_RELEASE, GET_AND_BITWISE_OR_ACQUIRE, GET_AND_BITWISE_AND, GET_AND_BITWISE_AND_RELEASE, GET_AND_BITWISE_AND_ACQUIRE, GET_AND_BITWISE_XOR, GET_AND_BITWISE_XOR_RELEASE, GET_AND_BITWISE_XOR_ACQUIRE;

		public String methodName() {
			throw new RuntimeException("Stub!");
		}

		public static AccessMode valueFromMethodName(final String methodName) {
			throw new RuntimeException("Stub!");
		}
	}
}
