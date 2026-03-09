package java.lang.invoke;

import java.lang.reflect.Member;

public interface MethodHandleInfo {
	int REF_getField = 1;
	int REF_getStatic = 2;
	int REF_invokeInterface = 9;
	int REF_invokeSpecial = 7;
	int REF_invokeStatic = 6;
	int REF_invokeVirtual = 5;
	int REF_newInvokeSpecial = 8;
	int REF_putField = 3;
	int REF_putStatic = 4;

	int getReferenceKind();

	Class<?> getDeclaringClass();

	String getName();

	MethodType getMethodType();

	<T extends Member> T reflectAs(final Class<T> p0, final MethodHandles.Lookup p1);

	int getModifiers();

	default boolean isVarArgs() {
		throw new RuntimeException("Stub!");
	}

	default String referenceKindToString(final int referenceKind) {
		throw new RuntimeException("Stub!");
	}

	default String toString(final int kind, final Class<?> defc, final String name, final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	default boolean refKindIsValid(final int refKind) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	default boolean refKindIsField(final int refKind) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	default String refKindName(final int refKind) {
		throw new RuntimeException("Stub!");
	}
}
