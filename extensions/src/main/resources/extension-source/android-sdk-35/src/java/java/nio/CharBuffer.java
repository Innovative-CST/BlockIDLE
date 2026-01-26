package java.nio;

import java.io.IOException;
import java.util.stream.IntStream;

public abstract class CharBuffer extends Buffer implements Comparable<CharBuffer>, Appendable, CharSequence, Readable {
	CharBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(final char[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(final char[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final CharBuffer target) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(final CharSequence csq, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(final CharSequence csq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract CharBuffer slice();

	@Override
	public abstract CharBuffer slice(final int p0, final int p1);

	@Override
	public abstract CharBuffer duplicate();

	public abstract CharBuffer asReadOnlyBuffer();

	public abstract char get();

	public abstract CharBuffer put(final char p0);

	public abstract char get(final int p0);

	public abstract CharBuffer put(final int p0, final char p1);

	public CharBuffer get(final char[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer get(final char[] dst) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer get(final int index, final char[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer get(final int index, final char[] dst) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final CharBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final int index, final CharBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final char[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final CharBuffer put(final char[] src) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final int index, final char[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final int index, final char[] src) {
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(final String src, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	public final CharBuffer put(final String src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final char[] array() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int arrayOffset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer position(final int newPosition) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer limit(final int newLimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer mark() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer reset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer flip() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer rewind() {
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer compact();

	@Override
	public abstract boolean isDirect();

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final CharBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final CharBuffer that) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int length() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final char charAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract CharBuffer subSequence(final int p0, final int p1);

	@Override
	public CharBuffer append(final CharSequence csq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CharBuffer append(final CharSequence csq, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CharBuffer append(final char c) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();

	@Override
	public IntStream chars() {
		throw new RuntimeException("Stub!");
	}
}
