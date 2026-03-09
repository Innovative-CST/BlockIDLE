package java.lang.reflect;

import java.lang.annotation.Annotation;

public class AccessibleObject implements AnnotatedElement {
	protected AccessibleObject() {
		throw new RuntimeException("Stub!");
	}

	public static void setAccessible(final AccessibleObject[] array, final boolean flag) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public void setAccessible(final boolean flag) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public boolean isAccessible() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnnotationPresent(@RecentlyNonNull final Class<? extends Annotation> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getAnnotations() {
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
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}
}
