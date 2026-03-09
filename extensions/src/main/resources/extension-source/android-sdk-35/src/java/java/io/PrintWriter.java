package java.io;

import java.nio.charset.Charset;
import java.util.Locale;

public class PrintWriter extends Writer {
	protected Writer out;

	public PrintWriter(@RecentlyNonNull final Writer out) {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final Writer out, final boolean autoFlush) {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final OutputStream out) {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final OutputStream out, final boolean autoFlush) {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final OutputStream out, final boolean autoFlush,
			@RecentlyNonNull final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final String fileName) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final String fileName, @RecentlyNonNull final String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final String fileName, @RecentlyNonNull final Charset charset)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final File file) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final File file, @RecentlyNonNull final String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(@RecentlyNonNull final File file, @RecentlyNonNull final Charset charset) throws IOException {
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
	public void write(final int c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final char[] buf, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final char[] buf) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(@RecentlyNonNull final String s, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(@RecentlyNonNull final String s) {
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

	public void print(@RecentlyNullable final String s) {
		throw new RuntimeException("Stub!");
	}

	public void print(@RecentlyNullable final Object obj) {
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

	public void println(@RecentlyNullable final String x) {
		throw new RuntimeException("Stub!");
	}

	public void println(@RecentlyNullable final Object x) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public PrintWriter printf(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public PrintWriter printf(@RecentlyNullable final Locale l, @RecentlyNonNull final String format,
			@RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public PrintWriter format(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public PrintWriter format(@RecentlyNullable final Locale l, @RecentlyNonNull final String format,
			@RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public PrintWriter append(@RecentlyNullable final CharSequence csq) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public PrintWriter append(@RecentlyNullable final CharSequence csq, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public PrintWriter append(final char c) {
		throw new RuntimeException("Stub!");
	}
}
