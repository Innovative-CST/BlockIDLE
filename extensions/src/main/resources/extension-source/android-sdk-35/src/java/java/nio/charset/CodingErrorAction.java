package java.nio.charset;

public class CodingErrorAction {
	public static final CodingErrorAction IGNORE;
	public static final CodingErrorAction REPLACE;
	public static final CodingErrorAction REPORT;

	CodingErrorAction() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		IGNORE = null;
		REPLACE = null;
		REPORT = null;
	}
}
