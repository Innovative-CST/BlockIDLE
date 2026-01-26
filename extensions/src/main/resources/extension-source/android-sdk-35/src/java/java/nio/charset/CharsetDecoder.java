package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public abstract class CharsetDecoder {
	protected CharsetDecoder(final Charset cs, final float averageCharsPerByte, final float maxCharsPerByte) {
		throw new RuntimeException("Stub!");
	}

	public final Charset charset() {
		throw new RuntimeException("Stub!");
	}

	public final String replacement() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetDecoder replaceWith(final String newReplacement) {
		throw new RuntimeException("Stub!");
	}

	protected void implReplaceWith(final String newReplacement) {
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction malformedInputAction() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetDecoder onMalformedInput(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	protected void implOnMalformedInput(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction unmappableCharacterAction() {
		throw new RuntimeException("Stub!");
	}

	public final CharsetDecoder onUnmappableCharacter(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	protected void implOnUnmappableCharacter(final CodingErrorAction newAction) {
		throw new RuntimeException("Stub!");
	}

	public final float averageCharsPerByte() {
		throw new RuntimeException("Stub!");
	}

	public final float maxCharsPerByte() {
		throw new RuntimeException("Stub!");
	}

	public final CoderResult decode(final ByteBuffer in, final CharBuffer out, final boolean endOfInput) {
		throw new RuntimeException("Stub!");
	}

	public final CoderResult flush(final CharBuffer out) {
		throw new RuntimeException("Stub!");
	}

	protected CoderResult implFlush(final CharBuffer out) {
		throw new RuntimeException("Stub!");
	}

	public final CharsetDecoder reset() {
		throw new RuntimeException("Stub!");
	}

	protected void implReset() {
		throw new RuntimeException("Stub!");
	}

	protected abstract CoderResult decodeLoop(final ByteBuffer p0, final CharBuffer p1);

	public final CharBuffer decode(final ByteBuffer in) throws CharacterCodingException {
		throw new RuntimeException("Stub!");
	}

	public boolean isAutoDetecting() {
		throw new RuntimeException("Stub!");
	}

	public boolean isCharsetDetected() {
		throw new RuntimeException("Stub!");
	}

	public Charset detectedCharset() {
		throw new RuntimeException("Stub!");
	}
}
