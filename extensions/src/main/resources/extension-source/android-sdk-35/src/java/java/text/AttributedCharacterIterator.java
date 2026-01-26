package java.text;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public interface AttributedCharacterIterator extends CharacterIterator {
	int getRunStart();

	int getRunStart(final Attribute p0);

	int getRunStart(final Set<? extends Attribute> p0);

	int getRunLimit();

	int getRunLimit(final Attribute p0);

	int getRunLimit(final Set<? extends Attribute> p0);

	Map<Attribute, Object> getAttributes();

	Object getAttribute(final Attribute p0);

	Set<Attribute> getAllAttributeKeys();

	class Attribute implements Serializable {
		public static final Attribute INPUT_METHOD_SEGMENT;
		public static final Attribute LANGUAGE;
		public static final Attribute READING;

		protected Attribute(final String name) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean equals(final Object obj) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final int hashCode() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}

		protected String getName() {
			throw new RuntimeException("Stub!");
		}

		protected Object readResolve() throws InvalidObjectException {
			throw new RuntimeException("Stub!");
		}

		static {
			INPUT_METHOD_SEGMENT = null;
			LANGUAGE = null;
			READING = null;
		}
	}
}
