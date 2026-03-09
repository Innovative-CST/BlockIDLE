package java.lang;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class String implements Serializable, Comparable<String>, CharSequence {
	public static final Comparator<String> CASE_INSENSITIVE_ORDER;

	public String() {
		throw new RuntimeException("Stub!");
	}

	public String(@RecentlyNonNull final String original) {
		throw new RuntimeException("Stub!");
	}

	public String(final char[] value) {
		throw new RuntimeException("Stub!");
	}

	public String(final char[] value, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	public String(final int[] codePoints, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public String(final byte[] ascii, final int hibyte, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public String(final byte[] ascii, final int hibyte) {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes, final int offset, final int length, @RecentlyNonNull final String charsetName)
			throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes, final int offset, final int length, @RecentlyNonNull final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes, @RecentlyNonNull final String charsetName) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes, @RecentlyNonNull final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public String(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	public String(@RecentlyNonNull final StringBuffer buffer) {
		throw new RuntimeException("Stub!");
	}

	public String(@RecentlyNonNull final StringBuilder builder) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int length() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public native char charAt(final int p0);

	public int codePointAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public int codePointBefore(final int index) {
		throw new RuntimeException("Stub!");
	}

	public int codePointCount(final int beginIndex, final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	public int offsetByCodePoints(final int index, final int codePointOffset) {
		throw new RuntimeException("Stub!");
	}

	public void getChars(final int srcBegin, final int srcEnd, final char[] dst, final int dstBegin) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void getBytes(final int srcBegin, final int srcEnd, final byte[] dst, final int dstBegin) {
		throw new RuntimeException("Stub!");
	}

	public byte[] getBytes(@RecentlyNonNull final String charsetName) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public byte[] getBytes(@RecentlyNonNull final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public byte[] getBytes() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object anObject) {
		throw new RuntimeException("Stub!");
	}

	public boolean contentEquals(@RecentlyNonNull final StringBuffer sb) {
		throw new RuntimeException("Stub!");
	}

	public boolean contentEquals(@RecentlyNonNull final CharSequence cs) {
		throw new RuntimeException("Stub!");
	}

	public boolean equalsIgnoreCase(@RecentlyNullable final String anotherString) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public native int compareTo(@RecentlyNonNull final String p0);

	public int compareToIgnoreCase(@RecentlyNonNull final String str) {
		throw new RuntimeException("Stub!");
	}

	public boolean regionMatches(final int toffset, @RecentlyNonNull final String other, final int ooffset,
			final int len) {
		throw new RuntimeException("Stub!");
	}

	public boolean regionMatches(final boolean ignoreCase, final int toffset, @RecentlyNonNull final String other,
			final int ooffset, final int len) {
		throw new RuntimeException("Stub!");
	}

	public boolean startsWith(@RecentlyNonNull final String prefix, final int toffset) {
		throw new RuntimeException("Stub!");
	}

	public boolean startsWith(@RecentlyNonNull final String prefix) {
		throw new RuntimeException("Stub!");
	}

	public boolean endsWith(@RecentlyNonNull final String suffix) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(final int ch) {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(final int ch, final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(final int ch) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(final int ch, final int fromIndex) {
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
	public String substring(final int beginIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String substring(final int beginIndex, final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public CharSequence subSequence(final int beginIndex, final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public native String concat(@RecentlyNonNull final String p0);

	@RecentlyNonNull
	public String replace(final char oldChar, final char newChar) {
		throw new RuntimeException("Stub!");
	}

	public boolean matches(@RecentlyNonNull final String regex) {
		throw new RuntimeException("Stub!");
	}

	public boolean contains(@RecentlyNonNull final CharSequence s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceFirst(@RecentlyNonNull final String regex, @RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceAll(@RecentlyNonNull final String regex, @RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replace(@RecentlyNonNull final CharSequence target, @RecentlyNonNull final CharSequence replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String[] split(@RecentlyNonNull final String regex, final int limit) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String[] split(@RecentlyNonNull final String regex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String join(@RecentlyNonNull final CharSequence delimiter,
			@RecentlyNullable final CharSequence... elements) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String join(@RecentlyNonNull final CharSequence delimiter,
			@RecentlyNonNull final Iterable<? extends CharSequence> elements) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toLowerCase(@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toLowerCase() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toUpperCase(@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toUpperCase() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String trim() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String strip() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String stripLeading() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String stripTrailing() {
		throw new RuntimeException("Stub!");
	}

	public boolean isBlank() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Stream<String> lines() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String indent(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String stripIndent() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String translateEscapes() {
		throw new RuntimeException("Stub!");
	}

	public <R> R transform(@RecentlyNonNull final Function<? super String, ? extends R> f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
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

	public native char[] toCharArray();

	@RecentlyNonNull
	public static String format(@RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String format(@RecentlyNonNull final Locale l, @RecentlyNonNull final String format,
			@RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String formatted(@RecentlyNonNull final Object... args) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final char[] data) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final char[] data, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String copyValueOf(final char[] data, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String copyValueOf(final char[] data) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final long l) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String valueOf(final double d) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public native String intern();

	@RecentlyNonNull
	public String repeat(final int count) {
		throw new RuntimeException("Stub!");
	}

	static {
		CASE_INSENSITIVE_ORDER = null;
	}
}
