package java.lang.annotation;

import java.lang.reflect.Method;

public class AnnotationTypeMismatchException extends RuntimeException {
	public AnnotationTypeMismatchException(final Method element, final String foundType) {
		throw new RuntimeException("Stub!");
	}

	public Method element() {
		throw new RuntimeException("Stub!");
	}

	public String foundType() {
		throw new RuntimeException("Stub!");
	}
}
