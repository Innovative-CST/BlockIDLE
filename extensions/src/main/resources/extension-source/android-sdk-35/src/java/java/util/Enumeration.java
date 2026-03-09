package java.util;

public interface Enumeration<E> {
	boolean hasMoreElements();

	E nextElement();

	default Iterator<E> asIterator() {
		throw new RuntimeException("Stub!");
	}
}
