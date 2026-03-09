package java.text;

public final class Bidi {
	public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;
	public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;
	public static final int DIRECTION_LEFT_TO_RIGHT = 0;
	public static final int DIRECTION_RIGHT_TO_LEFT = 1;

	public Bidi(final String paragraph, final int flags) {
		throw new RuntimeException("Stub!");
	}

	public Bidi(final AttributedCharacterIterator paragraph) {
		throw new RuntimeException("Stub!");
	}

	public Bidi(final char[] text, final int textStart, final byte[] embeddings, final int embStart,
			final int paragraphLength, final int flags) {
		throw new RuntimeException("Stub!");
	}

	public Bidi createLineBidi(final int lineStart, final int lineLimit) {
		throw new RuntimeException("Stub!");
	}

	public boolean isMixed() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLeftToRight() {
		throw new RuntimeException("Stub!");
	}

	public boolean isRightToLeft() {
		throw new RuntimeException("Stub!");
	}

	public int getLength() {
		throw new RuntimeException("Stub!");
	}

	public boolean baseIsLeftToRight() {
		throw new RuntimeException("Stub!");
	}

	public int getBaseLevel() {
		throw new RuntimeException("Stub!");
	}

	public int getLevelAt(final int offset) {
		throw new RuntimeException("Stub!");
	}

	public int getRunCount() {
		throw new RuntimeException("Stub!");
	}

	public int getRunLevel(final int run) {
		throw new RuntimeException("Stub!");
	}

	public int getRunStart(final int run) {
		throw new RuntimeException("Stub!");
	}

	public int getRunLimit(final int run) {
		throw new RuntimeException("Stub!");
	}

	public static boolean requiresBidi(final char[] text, final int start, final int limit) {
		throw new RuntimeException("Stub!");
	}

	public static void reorderVisually(final byte[] levels, final int levelStart, final Object[] objects,
			final int objectStart, final int count) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
