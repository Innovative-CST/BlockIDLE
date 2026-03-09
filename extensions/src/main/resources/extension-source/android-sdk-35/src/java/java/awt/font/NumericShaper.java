package java.awt.font;

import java.io.Serializable;
import java.util.Set;

public final class NumericShaper implements Serializable {
	public static final int ALL_RANGES = 524287;
	public static final int ARABIC = 2;
	public static final int BENGALI = 16;
	public static final int DEVANAGARI = 8;
	public static final int EASTERN_ARABIC = 4;
	public static final int ETHIOPIC = 65536;
	public static final int EUROPEAN = 1;
	public static final int GUJARATI = 64;
	public static final int GURMUKHI = 32;
	public static final int KANNADA = 1024;
	public static final int KHMER = 131072;
	public static final int LAO = 8192;
	public static final int MALAYALAM = 2048;
	public static final int MONGOLIAN = 262144;
	public static final int MYANMAR = 32768;
	public static final int ORIYA = 128;
	public static final int TAMIL = 256;
	public static final int TELUGU = 512;
	public static final int THAI = 4096;
	public static final int TIBETAN = 16384;

	NumericShaper() {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getShaper(final int singleRange) {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getShaper(final Range singleRange) {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(final int ranges) {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(final Set<Range> ranges) {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(final int ranges, final int defaultContext) {
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(final Set<Range> ranges, final Range defaultContext) {
		throw new RuntimeException("Stub!");
	}

	public void shape(final char[] text, final int start, final int count) {
		throw new RuntimeException("Stub!");
	}

	public void shape(final char[] text, final int start, final int count, final int context) {
		throw new RuntimeException("Stub!");
	}

	public void shape(final char[] text, final int start, final int count, final Range context) {
		throw new RuntimeException("Stub!");
	}

	public boolean isContextual() {
		throw new RuntimeException("Stub!");
	}

	public int getRanges() {
		throw new RuntimeException("Stub!");
	}

	public Set<Range> getRangeSet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public enum Range {
		EUROPEAN, ARABIC, EASTERN_ARABIC, DEVANAGARI, BENGALI, GURMUKHI, GUJARATI, ORIYA, TAMIL, TELUGU, KANNADA, MALAYALAM, THAI, LAO, TIBETAN, MYANMAR, ETHIOPIC, KHMER, MONGOLIAN, NKO, MYANMAR_SHAN, LIMBU, NEW_TAI_LUE, BALINESE, SUNDANESE, LEPCHA, OL_CHIKI, VAI, SAURASHTRA, KAYAH_LI, CHAM, TAI_THAM_HORA, TAI_THAM_THAM, JAVANESE, MEETEI_MAYEK;
	}
}
