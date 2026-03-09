package java.lang;

import java.io.Serializable;
import java.util.stream.IntStream;

public final class StringBuilder implements Appendable, CharSequence, Serializable, Comparable<StringBuilder> {
	public StringBuilder() {
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(@RecentlyNonNull final CharSequence seq) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final StringBuilder another) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(@RecentlyNullable final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(@RecentlyNullable final StringBuffer sb) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public StringBuilder append(@RecentlyNullable final CharSequence s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public StringBuilder append(@RecentlyNullable final CharSequence s, final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final char[] str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final char[] str, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public StringBuilder append(final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final long lng) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder append(final double d) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder appendCodePoint(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder delete(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder deleteCharAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder replace(final int start, final int end, @RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int index, final char[] str, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, @RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, @RecentlyNullable final String str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final char[] str) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int dstOffset, @RecentlyNullable final CharSequence s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int dstOffset, @RecentlyNullable final CharSequence s, final int start,
			final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final long l) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder insert(final int offset, final double d) {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(@RecentlyNonNull final String str, final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(@RecentlyNonNull final String str, final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder reverse() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public void trimToSize() {
		throw new RuntimeException("Stub!");
	}

	public int codePointAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public void getChars(final int srcBegin, final int srcEnd, final char[] dst, final int dstBegin) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int length() {
		throw new RuntimeException("Stub!");
	}

	public void setCharAt(final int index, final char ch) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public CharSequence subSequence(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String substring(final int start) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String substring(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	public int capacity() {
		throw new RuntimeException("Stub!");
	}

	public void setLength(final int newLength) {
		throw new RuntimeException("Stub!");
	}

	public void ensureCapacity(final int minimumCapacity) {
		throw new RuntimeException("Stub!");
	}

	public int codePointBefore(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public char charAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public int codePointCount(final int beginIndex, final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	public int offsetByCodePoints(final int index, final int codePointOffset) {
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
