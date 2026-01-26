package java.lang;

import java.io.Serializable;
import java.util.stream.IntStream;

public final class StringBuffer implements Appendable, CharSequence, Serializable, Comparable<StringBuffer> {
	public StringBuffer() {
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(@RecentlyNonNull final CharSequence seq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int compareTo(@RecentlyNonNull final StringBuffer another) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int length() {
		throw new RuntimeException("Stub!");
	}

	public synchronized int capacity() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void ensureCapacity(final int minimumCapacity) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void trimToSize() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLength(final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized char charAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointBefore(final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointCount(final int beginIndex, final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int offsetByCodePoints(final int index, final int codePointOffset) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void getChars(final int srcBegin, final int srcEnd, final char[] dst, final int dstBegin) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCharAt(final int index, final char ch) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(@RecentlyNullable final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(@RecentlyNullable final StringBuffer sb) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized StringBuffer append(@RecentlyNullable final CharSequence s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized StringBuffer append(@RecentlyNullable final CharSequence s, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final char[] str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final char[] str, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized StringBuffer append(final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer appendCodePoint(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final long lng) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer append(final double d) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer delete(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer deleteCharAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer replace(final int start, final int end, @RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized String substring(final int start) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized CharSequence subSequence(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized String substring(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int index, final char[] str, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int offset, @RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int offset, @RecentlyNullable final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int offset, final char[] str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int dstOffset, @RecentlyNullable final CharSequence s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int dstOffset, @RecentlyNullable final CharSequence s,
			final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int offset, final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer insert(final int offset, final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int offset, final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int offset, final long l) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int offset, final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer insert(final int offset, final double d) {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int indexOf(@RecentlyNonNull final String str, final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int lastIndexOf(@RecentlyNonNull final String str, final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized StringBuffer reverse() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public IntStream chars() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public IntStream codePoints() {
		throw new RuntimeException("Stub!");
	}
}
