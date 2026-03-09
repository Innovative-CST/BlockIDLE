package java.io;

import java.nio.charset.Charset;
import java.util.Locale;

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
	public PrintStream(final OutputStream out) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final OutputStream out, final boolean autoFlush) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final OutputStream out, final boolean autoFlush, final String encoding)
			throws UnsupportedEncodingException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final OutputStream out, final boolean autoFlush, final Charset charset) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final String fileName) throws FileNotFoundException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final String fileName, final String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final String fileName, final Charset charset) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final File file) throws FileNotFoundException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final File file, final String csn) throws FileNotFoundException, UnsupportedEncodingException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(final File file, final Charset charset) throws IOException {
		super(null);
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

	public boolean checkError() {
		throw new RuntimeException("Stub!");
	}

	protected void setError() {
		throw new RuntimeException("Stub!");
	}

	protected void clearError() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int b) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] buf, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] buf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void writeBytes(final byte[] buf) {
		throw new RuntimeException("Stub!");
	}

	public void print(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	public void print(final char c) {
		throw new RuntimeException("Stub!");
	}

	public void print(final int i) {
		throw new RuntimeException("Stub!");
	}

	public void print(final long l) {
		throw new RuntimeException("Stub!");
	}

	public void print(final float f) {
		throw new RuntimeException("Stub!");
	}

	public void print(final double d) {
		throw new RuntimeException("Stub!");
	}

	public void print(final char[] s) {
		throw new RuntimeException("Stub!");
	}

	public void print(final String s) {
		throw new RuntimeException("Stub!");
	}

	public void print(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public void println() {
		throw new RuntimeException("Stub!");
	}

	public void println(final boolean x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final char x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final int x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final long x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final float x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final double x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final char[] x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final String x) {
		throw new RuntimeException("Stub!");
	}

	public void println(final Object x) {
		throw new RuntimeException("Stub!");
	}

	public PrintStream printf(final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public PrintStream printf(final Locale l, final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public PrintStream format(final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public PrintStream format(final Locale l, final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public PrintStream append(final CharSequence csq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public PrintStream append(final CharSequence csq, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public PrintStream append(final char c) {
		throw new RuntimeException("Stub!");
	}
}
