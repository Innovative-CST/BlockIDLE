package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class Method extends Executable {
	Method() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Class<?> getDeclaringClass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getModifiers() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public TypeVariable<Method>[] getTypeParameters() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?> getReturnType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type getGenericReturnType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Class<?>[] getParameterTypes() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getParameterCount() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Type[] getGenericParameterTypes() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public native Class<?>[] getExceptionTypes();

	@RecentlyNonNull
	@Override
	public Type[] getGenericExceptionTypes() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toGenericString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public native Object invoke(@RecentlyNullable final Object p0, @RecentlyNullable final Object... p1)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;

	public boolean isBridge() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isVarArgs() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSynthetic() {
		throw new RuntimeException("Stub!");
	}

	public boolean isDefault() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public native Object getDefaultValue();

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[][] getParameterAnnotations() {
		throw new RuntimeException("Stub!");
	}
}
