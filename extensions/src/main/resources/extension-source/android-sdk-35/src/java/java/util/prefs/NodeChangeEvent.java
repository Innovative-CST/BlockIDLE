package java.util.prefs;

import java.util.EventObject;

public class NodeChangeEvent extends EventObject {
	public NodeChangeEvent(final Preferences parent, final Preferences child) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public Preferences getParent() {
		throw new RuntimeException("Stub!");
	}

	public Preferences getChild() {
		throw new RuntimeException("Stub!");
	}
}
