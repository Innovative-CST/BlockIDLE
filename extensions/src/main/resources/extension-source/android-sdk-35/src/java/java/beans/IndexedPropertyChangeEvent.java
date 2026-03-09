package java.beans;

public class IndexedPropertyChangeEvent extends PropertyChangeEvent {
	public IndexedPropertyChangeEvent(final Object source, final String propertyName, final Object oldValue,
			final Object newValue, final int index) {
		super(null, null, null, null);
		throw new RuntimeException("Stub!");
	}

	public int getIndex() {
		throw new RuntimeException("Stub!");
	}
}
