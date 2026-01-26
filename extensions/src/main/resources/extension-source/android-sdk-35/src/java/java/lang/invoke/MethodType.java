package java.lang.invoke;

import java.io.Serializable;
import java.util.List;

public final class MethodType implements TypeDescriptor.OfMethod<Class<?>, MethodType>, Serializable {
	MethodType() {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype, final Class<?>[] ptypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype, final List<Class<?>> ptypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype, final Class<?> ptype0, final Class<?>... ptypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype, final Class<?> ptype0) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType methodType(final Class<?> rtype, final MethodType ptypes) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType genericMethodType(final int objectArgCount, final boolean finalArray) {
		throw new RuntimeException("Stub!");
	}

	public static MethodType genericMethodType(final int objectArgCount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MethodType changeParameterType(final int num, final Class<?> nptype) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MethodType insertParameterTypes(final int num, final Class<?>... ptypesToInsert) {
		throw new RuntimeException("Stub!");
	}

	public MethodType appendParameterTypes(final Class<?>... ptypesToInsert) {
		throw new RuntimeException("Stub!");
	}

	public MethodType insertParameterTypes(final int num, final List<Class<?>> ptypesToInsert) {
		throw new RuntimeException("Stub!");
	}

	public MethodType appendParameterTypes(final List<Class<?>> ptypesToInsert) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MethodType dropParameterTypes(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MethodType changeReturnType(final Class<?> nrtype) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasPrimitives() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasWrappers() {
		throw new RuntimeException("Stub!");
	}

	public MethodType erase() {
		throw new RuntimeException("Stub!");
	}

	public MethodType generic() {
		throw new RuntimeException("Stub!");
	}

	public MethodType wrap() {
		throw new RuntimeException("Stub!");
	}

	public MethodType unwrap() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Class<?> parameterType(final int num) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int parameterCount() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Class<?> returnType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public List<Class<?>> parameterList() {
		throw new RuntimeException("Stub!");
	}

	public Class<?> lastParameterType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Class<?>[] parameterArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object x) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public static MethodType fromMethodDescriptorString(final String descriptor, final ClassLoader loader)
			throws IllegalArgumentException, TypeNotPresentException {
		throw new RuntimeException("Stub!");
	}

	public String toMethodDescriptorString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String descriptorString() {
		throw new RuntimeException("Stub!");
	}
}
