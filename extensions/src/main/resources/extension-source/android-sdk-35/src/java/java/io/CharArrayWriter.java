package java.io;

public class CharArrayWriter extends Writer {
	protected char[] buf;
	protected int count;

	public CharArrayWriter() {
		throw new RuntimeException("Stub!");
	}

	public CharArrayWriter(final int initialSize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final char[] c, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final String str, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public void writeTo(final Writer out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CharArrayWriter append(final CharSequence csq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CharArrayWriter append(final CharSequence csq, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CharArrayWriter append(final char c) {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	public char[] toCharArray() {
		throw new RuntimeException("Stub!");
	}

	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() {
		throw new RuntimeException("Stub!");
	}
}
