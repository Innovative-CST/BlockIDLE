package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public abstract class CharsetEncoder {
	protected CharsetEncoder(final Charset cs, final float averageBytesPerChar, final float maxBytesPerChar,
			final byte[] replacement) {
		throw new RuntimeException("Stub!");
	}

	protected CharsetEncoder(final Charset cs, final float averageBytesPerChar, final float maxBytesPerChar) {
		throw new RuntimeException("Stub!");
	}

	public final Charset charset() {
		throw new RuntimeException("Stub!");
	}

	public final byte[] replacement() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder replaceWith(final byte[] newReplacement) {
		throw new RuntimeException("Stub!");
	}

	protected void implReplaceWith(final byte[] newReplacement) {
		throw new RuntimeException("Stub!");
	}

	public boolean isLegalReplacement(final byte[] repl) {
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction malformedInputAction() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder onMalformedInput(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	protected void implOnMalformedInput(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction unmappableCharacterAction() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder onUnmappableCharacter(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	protected void implOnUnmappableCharacter(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	public final float averageBytesPerChar() {
		throw new RuntimeException("Stub!");
	}

	public final float maxBytesPerChar() {
		throw new RuntimeException("Stub!");
	}

	public final CoderResult encode(final CharBuffer in, final ByteBuffer out, final boolean endOfInput) {
		throw new RuntimeException("Stub!");
	}

	public final CoderResult flush(final ByteBuffer out) {
		throw new RuntimeException("Stub!");
	}

	protected CoderResult implFlush(final ByteBuffer out) {
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder reset() {
		throw new RuntimeException("Stub!");
	}

	protected void implReset() {
		throw new RuntimeException("Stub!");
	}

	protected abstract CoderResult encodeLoop(final CharBuffer p0, final ByteBuffer p1);

	public final ByteBuffer encode(final CharBuffer in) throws CharacterCodingException {
		throw new RuntimeException("Stub!");
	}

	public boolean canEncode(final char c) {
		throw new RuntimeException("Stub!");
	}

	public boolean canEncode(final CharSequence cs) {
		throw new RuntimeException("Stub!");
	}
}
