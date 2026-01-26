package java.security;

import java.io.Serializable;

public class GuardedObject implements Serializable {
	public GuardedObject(final Object object, final Guard guard) {
		throw new RuntimeException("Stub!");
	}

	public Object getObject() throws SecurityException {
		throw new RuntimeException("Stub!");
	}
}
