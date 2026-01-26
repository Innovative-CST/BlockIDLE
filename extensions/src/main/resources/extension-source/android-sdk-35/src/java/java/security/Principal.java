package java.security;

import javax.security.auth.Subject;

public interface Principal {
	boolean equals(final Object p0);

	String toString();

	int hashCode();

	String getName();

	default boolean implies(final Subject subject) {
		throw new RuntimeException("Stub!");
	}
}
