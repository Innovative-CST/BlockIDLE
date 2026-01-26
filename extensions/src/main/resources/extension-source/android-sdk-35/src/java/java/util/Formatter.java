package java.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class Formatter implements Closeable, Flushable {
	public Formatter() {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final Appendable a) {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final Locale l) {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final Appendable a, final Locale l) {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final String fileName) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final String fileName, final String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final String fileName, final String csn, final Locale l)
			throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final String fileName, final Charset charset, final Locale l) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final File file) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final File file, final String csn) throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final File file, final String csn, final Locale l)
			throws FileNotFoundException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final File file, final Charset charset, final Locale l) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final PrintStream ps) {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final OutputStream os) {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final OutputStream os, final String csn) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final OutputStream os, final String csn, final Locale l) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public Formatter(final OutputStream os, final Charset charset, final Locale l) {
		throw new RuntimeException("Stub!");
	}

	public Locale locale() {
		throw new RuntimeException("Stub!");
	}

	public Appendable out() {
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

	public IOException ioException() {
		throw new RuntimeException("Stub!");
	}

	public Formatter format(final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public Formatter format(final Locale l, final String format, final Object... args) {
		throw new RuntimeException("Stub!");
	}

	public enum BigDecimalLayoutForm {
		SCIENTIFIC, DECIMAL_FLOAT;
	}
}
