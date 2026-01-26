package java.io;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class OutputStreamWriter extends Writer {
	public OutputStreamWriter(final OutputStream out, final String charsetName) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(final OutputStream out) {
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(final OutputStream out, final Charset cs) {
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(final OutputStream out, final CharsetEncoder enc) {
		throw new RuntimeException("Stub!");
	}

	public String getEncoding() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int c) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final char[] cbuf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final String str, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Writer append(final CharSequence csq, final int start, final int end) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Writer append(final CharSequence csq) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
