package java.beans;

import java.util.EventObject;

public class PropertyChangeEvent extends EventObject {
	public PropertyChangeEvent(final Object source, final String propertyName, final Object oldValue,
			final Object newValue) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public String getPropertyName() {
		throw new RuntimeException("Stub!");
	}

	public Object getNewValue() {
		throw new RuntimeException("Stub!");
	}

	public Object getOldValue() {
		throw new RuntimeException("Stub!");
	}

	public void setPropagationId(final Object propagationId) {
		throw new RuntimeException("Stub!");
	}

	public Object getPropagationId() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
