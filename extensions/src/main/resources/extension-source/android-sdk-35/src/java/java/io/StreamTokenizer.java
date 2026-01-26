package java.io;

public class StreamTokenizer {
	public static final int TT_EOF = -1;
	public static final int TT_EOL = 10;
	public static final int TT_NUMBER = -2;
	public static final int TT_WORD = -3;
	public double nval;
	public String sval;
	public int ttype;

	@Deprecated
	public StreamTokenizer(final InputStream is) {
		this.ttype = -4;
		throw new RuntimeException("Stub!");
	}

	public StreamTokenizer(final Reader r) {
		this.ttype = -4;
		throw new RuntimeException("Stub!");
	}

	public void resetSyntax() {
		throw new RuntimeException("Stub!");
	}

	public void wordChars(final int low, final int hi) {
		throw new RuntimeException("Stub!");
	}

	public void whitespaceChars(final int low, final int hi) {
		throw new RuntimeException("Stub!");
	}

	public void ordinaryChars(final int low, final int hi) {
		throw new RuntimeException("Stub!");
	}

	public void ordinaryChar(final int ch) {
		throw new RuntimeException("Stub!");
	}

	public void commentChar(final int ch) {
		throw new RuntimeException("Stub!");
	}

	public void quoteChar(final int ch) {
		throw new RuntimeException("Stub!");
	}

	public void parseNumbers() {
		throw new RuntimeException("Stub!");
	}

	public void eolIsSignificant(final boolean flag) {
		throw new RuntimeException("Stub!");
	}

	public void slashStarComments(final boolean flag) {
		throw new RuntimeException("Stub!");
	}

	public void slashSlashComments(final boolean flag) {
		throw new RuntimeException("Stub!");
	}

	public void lowerCaseMode(final boolean fl) {
		throw new RuntimeException("Stub!");
	}

	public int nextToken() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void pushBack() {
		throw new RuntimeException("Stub!");
	}

	public int lineno() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
