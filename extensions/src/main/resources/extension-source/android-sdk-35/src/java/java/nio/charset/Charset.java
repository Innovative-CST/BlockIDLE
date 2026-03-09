package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;

public abstract class Charset implements Comparable<Charset> {
	protected Charset(final String canonicalName, final String[] aliases) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSupported(final String charsetName) {
		throw new RuntimeException("Stub!");
	}

	public static Charset forName(final String charsetName) {
		throw new RuntimeException("Stub!");
	}

	public static SortedMap<String, Charset> availableCharsets() {
		throw new RuntimeException("Stub!");
	}

	public static Charset defaultCharset() {
		throw new RuntimeException("Stub!");
	}

	public final String name() {
		throw new RuntimeException("Stub!");
	}

	public final Set<String> aliases() {
		throw new RuntimeException("Stub!");
	}

	public String displayName() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isRegistered() {
		throw new RuntimeException("Stub!");
	}

	public String displayName(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean contains(final Charset p0);

	public abstract CharsetDecoder newDecoder();

	public abstract CharsetEncoder newEncoder();

	public boolean canEncode() {
		throw new RuntimeException("Stub!");
	}

	public final CharBuffer decode(final ByteBuffer bb) {
		throw new RuntimeException("Stub!");
	}

	public final ByteBuffer encode(final CharBuffer cb) {
		throw new RuntimeException("Stub!");
	}

	public final ByteBuffer encode(final String str) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int compareTo(final Charset that) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean equals(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String toString() {
		throw new RuntimeException("Stub!");
	}
}
