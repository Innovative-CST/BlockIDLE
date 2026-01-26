package java.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Base64 {
	Base64() {
		throw new RuntimeException("Stub!");
	}

	public static Encoder getEncoder() {
		throw new RuntimeException("Stub!");
	}

	public static Encoder getUrlEncoder() {
		throw new RuntimeException("Stub!");
	}

	public static Encoder getMimeEncoder() {
		throw new RuntimeException("Stub!");
	}

	public static Encoder getMimeEncoder(final int lineLength, final byte[] lineSeparator) {
		throw new RuntimeException("Stub!");
	}

	public static Decoder getDecoder() {
		throw new RuntimeException("Stub!");
	}

	public static Decoder getUrlDecoder() {
		throw new RuntimeException("Stub!");
	}

	public static Decoder getMimeDecoder() {
		throw new RuntimeException("Stub!");
	}

	public static class Decoder {
		Decoder() {
			throw new RuntimeException("Stub!");
		}

		public byte[] decode(final byte[] src) {
			throw new RuntimeException("Stub!");
		}

		public byte[] decode(final String src) {
			throw new RuntimeException("Stub!");
		}

		public int decode(final byte[] src, final byte[] dst) {
			throw new RuntimeException("Stub!");
		}

		public ByteBuffer decode(final ByteBuffer buffer) {
			throw new RuntimeException("Stub!");
		}

		public InputStream wrap(final InputStream is) {
			throw new RuntimeException("Stub!");
		}
	}

	public static class Encoder {
		Encoder() {
			throw new RuntimeException("Stub!");
		}

		public byte[] encode(final byte[] src) {
			throw new RuntimeException("Stub!");
		}

		public int encode(final byte[] src, final byte[] dst) {
			throw new RuntimeException("Stub!");
		}

		public String encodeToString(final byte[] src) {
			throw new RuntimeException("Stub!");
		}

		public ByteBuffer encode(final ByteBuffer buffer) {
			throw new RuntimeException("Stub!");
		}

		public OutputStream wrap(final OutputStream os) {
			throw new RuntimeException("Stub!");
		}

		public Encoder withoutPadding() {
			throw new RuntimeException("Stub!");
		}
	}
}
