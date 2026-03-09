package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class RecordComponent implements AnnotatedElement {
	RecordComponent() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?> getType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getGenericSignature() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type getGenericType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Method getAccessor() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?> getDeclaringRecord() {
		throw new RuntimeException("Stub!");
	}
}
