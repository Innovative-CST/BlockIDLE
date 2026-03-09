package java.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class PropertyResourceBundle extends ResourceBundle {
	public PropertyResourceBundle(final InputStream stream) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PropertyResourceBundle(final Reader reader) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Object handleGetObject(final String key) {
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
}
