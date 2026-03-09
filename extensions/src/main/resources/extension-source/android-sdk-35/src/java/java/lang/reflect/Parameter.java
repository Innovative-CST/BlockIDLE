package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class Parameter implements AnnotatedElement {
	Parameter() {
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

	public boolean isNamePresent() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Executable getDeclaringExecutable() {
		throw new RuntimeException("Stub!");
	}

	public int getModifiers() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type getParameterizedType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?> getType() {
		throw new RuntimeException("Stub!");
	}

	public boolean isImplicit() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSynthetic() {
		throw new RuntimeException("Stub!");
	}

	public boolean isVarArgs() {
		throw new RuntimeException("Stub!");
	}

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

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getDeclaredAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getDeclaredAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getAnnotations() {
		throw new RuntimeException("Stub!");
	}
}
