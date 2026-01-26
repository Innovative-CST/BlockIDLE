package java.time.format;

public enum TextStyle {
	FULL, FULL_STANDALONE, SHORT, SHORT_STANDALONE, NARROW, NARROW_STANDALONE;

	public boolean isStandalone() {
		throw new RuntimeException("Stub!");
	}

	public TextStyle asStandalone() {
		throw new RuntimeException("Stub!");
	}

	public TextStyle asNormal() {
		throw new RuntimeException("Stub!");
	}
}
