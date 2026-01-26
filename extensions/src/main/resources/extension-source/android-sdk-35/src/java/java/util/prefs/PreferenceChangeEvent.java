package java.util.prefs;

import java.util.EventObject;

public class PreferenceChangeEvent extends EventObject {
	public PreferenceChangeEvent(final Preferences node, final String key, final String newValue) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public Preferences getNode() {
		throw new RuntimeException("Stub!");
	}

	public String getKey() {
		throw new RuntimeException("Stub!");
	}

	public String getNewValue() {
		throw new RuntimeException("Stub!");
	}
}
