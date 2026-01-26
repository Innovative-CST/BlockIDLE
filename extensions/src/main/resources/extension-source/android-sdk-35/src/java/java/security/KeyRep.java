package java.security;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class KeyRep implements Serializable {
	public KeyRep(final Type type, final String algorithm, final String format, final byte[] encoded) {
		throw new RuntimeException("Stub!");
	}

	protected Object readResolve() throws ObjectStreamException {
		throw new RuntimeException("Stub!");
	}

	public enum Type {
		SECRET, PUBLIC, PRIVATE;
	}
}
