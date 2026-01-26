package java.beans;

import java.util.EventListenerProxy;

public class PropertyChangeListenerProxy extends EventListenerProxy<PropertyChangeListener>
		implements PropertyChangeListener {
	public PropertyChangeListenerProxy(final String propertyName, final PropertyChangeListener listener) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public void propertyChange(final PropertyChangeEvent event) {
		throw new RuntimeException("Stub!");
	}

	public String getPropertyName() {
		throw new RuntimeException("Stub!");
	}
}
