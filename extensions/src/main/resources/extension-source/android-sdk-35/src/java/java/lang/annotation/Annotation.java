package java.lang.annotation;

public interface Annotation {
	boolean equals(final Object p0);

	int hashCode();

	String toString();

	Class<? extends Annotation> annotationType();
}
