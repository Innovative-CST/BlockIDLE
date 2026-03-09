package java.lang;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.net.URL;

public class Package implements AnnotatedElement {
	Package() {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public String getSpecificationTitle() {
		throw new RuntimeException("Stub!");
	}

	public String getSpecificationVersion() {
		throw new RuntimeException("Stub!");
	}

	public String getSpecificationVendor() {
		throw new RuntimeException("Stub!");
	}

	public String getImplementationTitle() {
		throw new RuntimeException("Stub!");
	}

	public String getImplementationVersion() {
		throw new RuntimeException("Stub!");
	}

	public String getImplementationVendor() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSealed() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSealed(final URL url) {
		throw new RuntimeException("Stub!");
	}

	public boolean isCompatibleWith(final String desired) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static Package getPackage(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static Package[] getPackages() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <A extends Annotation> A getAnnotation(final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnnotationPresent(final Class<? extends Annotation> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <A extends Annotation> A[] getAnnotationsByType(final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Annotation[] getAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <A extends Annotation> A getDeclaredAnnotation(final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <A extends Annotation> A[] getDeclaredAnnotationsByType(final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}
}
