package java.lang.annotation;

public class IncompleteAnnotationException extends RuntimeException {
	public IncompleteAnnotationException(final Class<? extends Annotation> annotationType, final String elementName) {
		throw new RuntimeException("Stub!");
	}

	public Class<? extends Annotation> annotationType() {
		throw new RuntimeException("Stub!");
	}

	public String elementName() {
		throw new RuntimeException("Stub!");
	}
}
