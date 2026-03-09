package java.lang.reflect;

import java.lang.annotation.Annotation;

public abstract class Executable extends AccessibleObject implements Member, GenericDeclaration {
	Executable() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public abstract Class<?> getDeclaringClass();

	@RecentlyNonNull
	@Override
	public abstract String getName();

	@Override
	public abstract int getModifiers();

	@RecentlyNonNull
	@Override
	public abstract TypeVariable<?>[] getTypeParameters();

	@RecentlyNonNull
	public abstract Class<?>[] getParameterTypes();

	public int getParameterCount() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type[] getGenericParameterTypes() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Parameter[] getParameters() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract Class<?>[] getExceptionTypes();

	@RecentlyNonNull
	public Type[] getGenericExceptionTypes() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract String toGenericString();

	public boolean isVarArgs() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSynthetic() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract Annotation[][] getParameterAnnotations();

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isAnnotationPresent(@RecentlyNonNull final Class<? extends Annotation> annotationType) {
		throw new RuntimeException("Stub!");
	}
}
