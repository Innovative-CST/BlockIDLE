package java.nio.channels;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public final class Channels {
	Channels() {
		throw new RuntimeException("Stub!");
	}

	public static InputStream newInputStream(final ReadableByteChannel ch) {
		throw new RuntimeException("Stub!");
	}

	public static OutputStream newOutputStream(final WritableByteChannel ch) {
		throw new RuntimeException("Stub!");
	}

	public static InputStream newInputStream(final AsynchronousByteChannel ch) {
		throw new RuntimeException("Stub!");
	}

	public static OutputStream newOutputStream(final AsynchronousByteChannel ch) {
		throw new RuntimeException("Stub!");
	}

	public static ReadableByteChannel newChannel(final InputStream in) {
		throw new RuntimeException("Stub!");
	}

	public static WritableByteChannel newChannel(final OutputStream out) {
		throw new RuntimeException("Stub!");
	}

	public static Reader newReader(final ReadableByteChannel ch, final CharsetDecoder dec, final int minBufferCap) {
		throw new RuntimeException("Stub!");
	}

	public static Reader newReader(final ReadableByteChannel ch, final String csName) {
		throw new RuntimeException("Stub!");
	}

	public static Reader newReader(final ReadableByteChannel ch, final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public static Writer newWriter(final WritableByteChannel ch, final CharsetEncoder enc, final int minBufferCap) {
		throw new RuntimeException("Stub!");
	}

	public static Writer newWriter(final WritableByteChannel ch, final String csName) {
		throw new RuntimeException("Stub!");
	}

	public static Writer newWriter(final WritableByteChannel ch, final Charset charset) {
		throw new RuntimeException("Stub!");
	}
}
