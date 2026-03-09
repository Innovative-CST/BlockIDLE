package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class Constructor<T> extends Executable {
	Constructor() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Class<T> getDeclaringClass() {
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

	@Override
	public TypeVariable<Constructor<T>>[] getTypeParameters() {
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

	@Override
	public Type[] getGenericParameterTypes() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public native Class<?>[] getExceptionTypes();

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

	@RecentlyNonNull
	public T newInstance(final Object... initargs)
			throws IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException {
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

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Annotation[][] getParameterAnnotations() {
		throw new RuntimeException("Stub!");
	}
}
