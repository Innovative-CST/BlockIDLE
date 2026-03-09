package java.lang.reflect;

import java.lang.annotation.Annotation;

public interface AnnotatedElement {
	default boolean isAnnotationPresent(@RecentlyNonNull final Class<? extends Annotation> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	<T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> p0);

	@RecentlyNonNull
	Annotation[] getAnnotations();

	default <T extends Annotation> T[] getAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default <T extends Annotation> T getDeclaredAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	default <T extends Annotation> T[] getDeclaredAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	Annotation[] getDeclaredAnnotations();
}
