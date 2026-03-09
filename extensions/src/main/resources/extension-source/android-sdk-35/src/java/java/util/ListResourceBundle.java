package java.util;

public abstract class ListResourceBundle extends ResourceBundle {
	public ListResourceBundle() {
		throw new RuntimeException("Stub!");
	}

	public final Object handleGetObject(final String key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Enumeration<String> getKeys() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected Set<String> handleKeySet() {
		throw new RuntimeException("Stub!");
	}

	protected abstract Object[][] getContents();
}
