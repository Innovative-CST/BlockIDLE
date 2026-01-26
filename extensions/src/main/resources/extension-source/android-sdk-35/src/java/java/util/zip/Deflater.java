package java.util.zip;

import java.nio.ByteBuffer;

public class Deflater {
	public static final int BEST_COMPRESSION = 9;
	public static final int BEST_SPEED = 1;
	public static final int DEFAULT_COMPRESSION = -1;
	public static final int DEFAULT_STRATEGY = 0;
	public static final int DEFLATED = 8;
	public static final int FILTERED = 1;
	public static final int FULL_FLUSH = 3;
	public static final int HUFFMAN_ONLY = 2;
	public static final int NO_COMPRESSION = 0;
	public static final int NO_FLUSH = 0;
	public static final int SYNC_FLUSH = 2;

	public Deflater(final int level, final boolean nowrap) {
		throw new RuntimeException("Stub!");
	}

	public Deflater(final int level) {
		throw new RuntimeException("Stub!");
	}

	public Deflater() {
		throw new RuntimeException("Stub!");
	}

	public void setInput(final byte[] input, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public void setInput(final byte[] input) {
		throw new RuntimeException("Stub!");
	}

	public void setInput(final ByteBuffer input) {
		throw new RuntimeException("Stub!");
	}

	public void setDictionary(final byte[] dictionary, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public void setDictionary(final byte[] dictionary) {
		throw new RuntimeException("Stub!");
	}

	public void setDictionary(final ByteBuffer dictionary) {
		throw new RuntimeException("Stub!");
	}

	public void setStrategy(final int strategy) {
		throw new RuntimeException("Stub!");
	}

	public void setLevel(final int level) {
		throw new RuntimeException("Stub!");
	}

	public boolean needsInput() {
		throw new RuntimeException("Stub!");
	}

	public void finish() {
		throw new RuntimeException("Stub!");
	}

	public boolean finished() {
		throw new RuntimeException("Stub!");
	}

	public int deflate(final byte[] output, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public int deflate(final byte[] output) {
		throw new RuntimeException("Stub!");
	}

	public int deflate(final ByteBuffer output) {
		throw new RuntimeException("Stub!");
	}

	public int deflate(final byte[] output, final int off, final int len, final int flush) {
		throw new RuntimeException("Stub!");
	}

	public int deflate(final ByteBuffer output, final int flush) {
		throw new RuntimeException("Stub!");
	}

	public int getAdler() {
		throw new RuntimeException("Stub!");
	}

	public int getTotalIn() {
		throw new RuntimeException("Stub!");
	}

	public long getBytesRead() {
		throw new RuntimeException("Stub!");
	}

	public int getTotalOut() {
		throw new RuntimeException("Stub!");
	}

	public long getBytesWritten() {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	public void end() {
		throw new RuntimeException("Stub!");
	}
}
