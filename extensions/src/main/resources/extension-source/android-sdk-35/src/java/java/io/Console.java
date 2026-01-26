package java.io;

import java.nio.charset.Charset;

public final class Console implements Flushable {
	Console() {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter writer() {
		throw new RuntimeException("Stub!");
	}

	public Reader reader() {
		throw new RuntimeException("Stub!");
	}

	public Console format(final String fmt, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public Console printf(final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public String readLine(final String fmt, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public String readLine() {
		throw new RuntimeException("Stub!");
	}

	public char[] readPassword(final String fmt, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public char[] readPassword() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() {
		throw new RuntimeException("Stub!");
	}

	public Charset charset() {
		throw new RuntimeException("Stub!");
	}
}
