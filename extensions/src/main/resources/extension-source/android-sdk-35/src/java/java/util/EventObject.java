package java.util;

import java.io.Serializable;

public class EventObject implements Serializable {
	protected transient Object source;

	public EventObject(final Object source) {
		throw new RuntimeException("Stub!");
	}

	public Object getSource() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
