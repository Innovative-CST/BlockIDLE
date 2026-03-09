package java.beans;

import java.io.Serializable;

public class PropertyChangeSupport implements Serializable {
	public PropertyChangeSupport(final Object sourceBean) {
		throw new RuntimeException("Stub!");
	}

	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		throw new RuntimeException("Stub!");
	}

	public PropertyChangeListener[] getPropertyChangeListeners() {
		throw new RuntimeException("Stub!");
	}

	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		throw new RuntimeException("Stub!");
	}

	public PropertyChangeListener[] getPropertyChangeListeners(final String propertyName) {
		throw new RuntimeException("Stub!");
	}

	public void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
		throw new RuntimeException("Stub!");
	}

	public void firePropertyChange(final String propertyName, final int oldValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public void firePropertyChange(final String propertyName, final boolean oldValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public void firePropertyChange(final PropertyChangeEvent event) {
		throw new RuntimeException("Stub!");
	}

	public void fireIndexedPropertyChange(final String propertyName, final int index, final Object oldValue,
			final Object newValue) {
		throw new RuntimeException("Stub!");
	}

	public void fireIndexedPropertyChange(final String propertyName, final int index, final int oldValue,
			final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public void fireIndexedPropertyChange(final String propertyName, final int index, final boolean oldValue,
			final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasListeners(final String propertyName) {
		throw new RuntimeException("Stub!");
	}
}
