package java.lang;

import java.io.Serializable;

public final class Character implements Serializable, Comparable<Character> {
	public static final int BYTES = 2;
	public static final byte COMBINING_SPACING_MARK = 8;
	public static final byte CONNECTOR_PUNCTUATION = 23;
	public static final byte CONTROL = 15;
	public static final byte CURRENCY_SYMBOL = 26;
	public static final byte DASH_PUNCTUATION = 20;
	public static final byte DECIMAL_DIGIT_NUMBER = 9;
	public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;
	public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;
	public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;
	public static final byte DIRECTIONALITY_FIRST_STRONG_ISOLATE = 21;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE = 19;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;
	public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;
	public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;
	public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;
	public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;
	public static final byte DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE = 22;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE = 20;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;
	public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;
	public static final byte DIRECTIONALITY_UNDEFINED = -1;
	public static final byte DIRECTIONALITY_WHITESPACE = 12;
	public static final byte ENCLOSING_MARK = 7;
	public static final byte END_PUNCTUATION = 22;
	public static final byte FINAL_QUOTE_PUNCTUATION = 30;
	public static final byte FORMAT = 16;
	public static final byte INITIAL_QUOTE_PUNCTUATION = 29;
	public static final byte LETTER_NUMBER = 10;
	public static final byte LINE_SEPARATOR = 13;
	public static final byte LOWERCASE_LETTER = 2;
	public static final byte MATH_SYMBOL = 25;
	public static final int MAX_CODE_POINT = 1114111;
	public static final char MAX_HIGH_SURROGATE = '\udbff';
	public static final char MAX_LOW_SURROGATE = '\udfff';
	public static final int MAX_RADIX = 36;
	public static final char MAX_SURROGATE = '\udfff';
	public static final char MAX_VALUE = '\uffff';
	public static final int MIN_CODE_POINT = 0;
	public static final char MIN_HIGH_SURROGATE = '\ud800';
	public static final char MIN_LOW_SURROGATE = '\udc00';
	public static final int MIN_RADIX = 2;
	public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
	public static final char MIN_SURROGATE = '\ud800';
	public static final char MIN_VALUE = '\0';
	public static final byte MODIFIER_LETTER = 4;
	public static final byte MODIFIER_SYMBOL = 27;
	public static final byte NON_SPACING_MARK = 6;
	public static final byte OTHER_LETTER = 5;
	public static final byte OTHER_NUMBER = 11;
	public static final byte OTHER_PUNCTUATION = 24;
	public static final byte OTHER_SYMBOL = 28;
	public static final byte PARAGRAPH_SEPARATOR = 14;
	public static final byte PRIVATE_USE = 18;
	public static final int SIZE = 16;
	public static final byte SPACE_SEPARATOR = 12;
	public static final byte START_PUNCTUATION = 21;
	public static final byte SURROGATE = 19;
	public static final byte TITLECASE_LETTER = 3;
	public static final Class<Character> TYPE;
	public static final byte UNASSIGNED = 0;
	public static final byte UPPERCASE_LETTER = 1;

	@Deprecated
	public Character(final char value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Character valueOf(final char c) {
		throw new RuntimeException("Stub!");
	}

	public char charValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(final char value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final char c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isValidCodePoint(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isBmpCodePoint(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSupplementaryCodePoint(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isHighSurrogate(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLowSurrogate(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSurrogate(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSurrogatePair(final char high, final char low) {
		throw new RuntimeException("Stub!");
	}

	public static int charCount(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int toCodePoint(final char high, final char low) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointAt(@RecentlyNonNull final CharSequence seq, final int index) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointAt(final char[] a, final int index) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointAt(final char[] a, final int index, final int limit) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointBefore(@RecentlyNonNull final CharSequence seq, final int index) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointBefore(final char[] a, final int index) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointBefore(final char[] a, final int index, final int start) {
		throw new RuntimeException("Stub!");
	}

	public static char highSurrogate(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static char lowSurrogate(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int toChars(final int codePoint, final char[] dst, final int dstIndex) {
		throw new RuntimeException("Stub!");
	}

	public static char[] toChars(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointCount(@RecentlyNonNull final CharSequence seq, final int beginIndex,
			final int endIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointCount(final char[] a, final int offset, final int count) {
		throw new RuntimeException("Stub!");
	}

	public static int offsetByCodePoints(@RecentlyNonNull final CharSequence seq, final int index,
			final int codePointOffset) {
		throw new RuntimeException("Stub!");
	}

	public static int offsetByCodePoints(final char[] a, final int start, final int count, final int index,
			final int codePointOffset) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLowerCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLowerCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUpperCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUpperCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isTitleCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isTitleCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isDigit(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isDigit(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isDefined(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isDefined(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLetter(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLetter(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLetterOrDigit(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLetterOrDigit(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static boolean isJavaLetter(final char ch) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static boolean isJavaLetterOrDigit(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isAlphabetic(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isIdeographic(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isJavaIdentifierStart(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isJavaIdentifierStart(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isJavaIdentifierPart(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isJavaIdentifierPart(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUnicodeIdentifierStart(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUnicodeIdentifierStart(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUnicodeIdentifierPart(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isUnicodeIdentifierPart(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isIdentifierIgnorable(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isIdentifierIgnorable(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static char toLowerCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static int toLowerCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static char toUpperCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static int toUpperCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static char toTitleCase(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static int toTitleCase(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int digit(final char ch, final int radix) {
		throw new RuntimeException("Stub!");
	}

	public static int digit(final int codePoint, final int radix) {
		throw new RuntimeException("Stub!");
	}

	public static int getNumericValue(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static int getNumericValue(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static boolean isSpace(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSpaceChar(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSpaceChar(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isWhitespace(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isWhitespace(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isISOControl(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isISOControl(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int getType(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static int getType(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static char forDigit(final int digit, final int radix) {
		throw new RuntimeException("Stub!");
	}

	public static byte getDirectionality(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static byte getDirectionality(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isMirrored(final char ch) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isMirrored(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Character anotherCharacter) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final char x, final char y) {
		throw new RuntimeException("Stub!");
	}

	public static char reverseBytes(final char ch) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String getName(final int codePoint) {
		throw new RuntimeException("Stub!");
	}

	public static int codePointOf(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}

	public static class Subset {
		protected Subset(@RecentlyNonNull final String name) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean equals(@RecentlyNullable final Object obj) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final int hashCode() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public final String toString() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class UnicodeBlock extends Subset {
		public static final UnicodeBlock ADLAM;
		public static final UnicodeBlock AEGEAN_NUMBERS;
		public static final UnicodeBlock AHOM;
		public static final UnicodeBlock ALCHEMICAL_SYMBOLS;
		public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
		public static final UnicodeBlock ANATOLIAN_HIEROGLYPHS;
		public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION;
		public static final UnicodeBlock ANCIENT_GREEK_NUMBERS;
		public static final UnicodeBlock ANCIENT_SYMBOLS;
		public static final UnicodeBlock ARABIC;
		public static final UnicodeBlock ARABIC_EXTENDED_A;
		public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS;
		public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
		public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
		public static final UnicodeBlock ARABIC_SUPPLEMENT;
		public static final UnicodeBlock ARMENIAN;
		public static final UnicodeBlock ARROWS;
		public static final UnicodeBlock AVESTAN;
		public static final UnicodeBlock BALINESE;
		public static final UnicodeBlock BAMUM;
		public static final UnicodeBlock BAMUM_SUPPLEMENT;
		public static final UnicodeBlock BASIC_LATIN;
		public static final UnicodeBlock BASSA_VAH;
		public static final UnicodeBlock BATAK;
		public static final UnicodeBlock BENGALI;
		public static final UnicodeBlock BHAIKSUKI;
		public static final UnicodeBlock BLOCK_ELEMENTS;
		public static final UnicodeBlock BOPOMOFO;
		public static final UnicodeBlock BOPOMOFO_EXTENDED;
		public static final UnicodeBlock BOX_DRAWING;
		public static final UnicodeBlock BRAHMI;
		public static final UnicodeBlock BRAILLE_PATTERNS;
		public static final UnicodeBlock BUGINESE;
		public static final UnicodeBlock BUHID;
		public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS;
		public static final UnicodeBlock CARIAN;
		public static final UnicodeBlock CAUCASIAN_ALBANIAN;
		public static final UnicodeBlock CHAKMA;
		public static final UnicodeBlock CHAM;
		public static final UnicodeBlock CHEROKEE;
		public static final UnicodeBlock CHEROKEE_SUPPLEMENT;
		public static final UnicodeBlock CHESS_SYMBOLS;
		public static final UnicodeBlock CHORASMIAN;
		public static final UnicodeBlock CJK_COMPATIBILITY;
		public static final UnicodeBlock CJK_COMPATIBILITY_FORMS;
		public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
		public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
		public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT;
		public static final UnicodeBlock CJK_STROKES;
		public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F;
		public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G;
		public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS;
		public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED;
		public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT;
		public static final UnicodeBlock COMBINING_HALF_MARKS;
		public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
		public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS;
		public static final UnicodeBlock CONTROL_PICTURES;
		public static final UnicodeBlock COPTIC;
		public static final UnicodeBlock COPTIC_EPACT_NUMBERS;
		public static final UnicodeBlock COUNTING_ROD_NUMERALS;
		public static final UnicodeBlock CUNEIFORM;
		public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION;
		public static final UnicodeBlock CURRENCY_SYMBOLS;
		public static final UnicodeBlock CYPRIOT_SYLLABARY;
		public static final UnicodeBlock CYRILLIC;
		public static final UnicodeBlock CYRILLIC_EXTENDED_A;
		public static final UnicodeBlock CYRILLIC_EXTENDED_B;
		public static final UnicodeBlock CYRILLIC_EXTENDED_C;
		public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY;
		public static final UnicodeBlock DESERET;
		public static final UnicodeBlock DEVANAGARI;
		public static final UnicodeBlock DEVANAGARI_EXTENDED;
		public static final UnicodeBlock DINGBATS;
		public static final UnicodeBlock DIVES_AKURU;
		public static final UnicodeBlock DOGRA;
		public static final UnicodeBlock DOMINO_TILES;
		public static final UnicodeBlock DUPLOYAN;
		public static final UnicodeBlock EARLY_DYNASTIC_CUNEIFORM;
		public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS;
		public static final UnicodeBlock EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS;
		public static final UnicodeBlock ELBASAN;
		public static final UnicodeBlock ELYMAIC;
		public static final UnicodeBlock EMOTICONS;
		public static final UnicodeBlock ENCLOSED_ALPHANUMERICS;
		public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT;
		public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
		public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT;
		public static final UnicodeBlock ETHIOPIC;
		public static final UnicodeBlock ETHIOPIC_EXTENDED;
		public static final UnicodeBlock ETHIOPIC_EXTENDED_A;
		public static final UnicodeBlock ETHIOPIC_SUPPLEMENT;
		public static final UnicodeBlock GENERAL_PUNCTUATION;
		public static final UnicodeBlock GEOMETRIC_SHAPES;
		public static final UnicodeBlock GEOMETRIC_SHAPES_EXTENDED;
		public static final UnicodeBlock GEORGIAN;
		public static final UnicodeBlock GEORGIAN_EXTENDED;
		public static final UnicodeBlock GEORGIAN_SUPPLEMENT;
		public static final UnicodeBlock GLAGOLITIC;
		public static final UnicodeBlock GLAGOLITIC_SUPPLEMENT;
		public static final UnicodeBlock GOTHIC;
		public static final UnicodeBlock GRANTHA;
		public static final UnicodeBlock GREEK;
		public static final UnicodeBlock GREEK_EXTENDED;
		public static final UnicodeBlock GUJARATI;
		public static final UnicodeBlock GUNJALA_GONDI;
		public static final UnicodeBlock GURMUKHI;
		public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
		public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
		public static final UnicodeBlock HANGUL_JAMO;
		public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A;
		public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B;
		public static final UnicodeBlock HANGUL_SYLLABLES;
		public static final UnicodeBlock HANIFI_ROHINGYA;
		public static final UnicodeBlock HANUNOO;
		public static final UnicodeBlock HATRAN;
		public static final UnicodeBlock HEBREW;
		public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES;
		public static final UnicodeBlock HIGH_SURROGATES;
		public static final UnicodeBlock HIRAGANA;
		public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
		public static final UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION;
		public static final UnicodeBlock IMPERIAL_ARAMAIC;
		public static final UnicodeBlock INDIC_SIYAQ_NUMBERS;
		public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI;
		public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN;
		public static final UnicodeBlock IPA_EXTENSIONS;
		public static final UnicodeBlock JAVANESE;
		public static final UnicodeBlock KAITHI;
		public static final UnicodeBlock KANA_EXTENDED_A;
		public static final UnicodeBlock KANA_SUPPLEMENT;
		public static final UnicodeBlock KANBUN;
		public static final UnicodeBlock KANGXI_RADICALS;
		public static final UnicodeBlock KANNADA;
		public static final UnicodeBlock KATAKANA;
		public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS;
		public static final UnicodeBlock KAYAH_LI;
		public static final UnicodeBlock KHAROSHTHI;
		public static final UnicodeBlock KHITAN_SMALL_SCRIPT;
		public static final UnicodeBlock KHMER;
		public static final UnicodeBlock KHMER_SYMBOLS;
		public static final UnicodeBlock KHOJKI;
		public static final UnicodeBlock KHUDAWADI;
		public static final UnicodeBlock LAO;
		public static final UnicodeBlock LATIN_1_SUPPLEMENT;
		public static final UnicodeBlock LATIN_EXTENDED_A;
		public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
		public static final UnicodeBlock LATIN_EXTENDED_B;
		public static final UnicodeBlock LATIN_EXTENDED_C;
		public static final UnicodeBlock LATIN_EXTENDED_D;
		public static final UnicodeBlock LATIN_EXTENDED_E;
		public static final UnicodeBlock LEPCHA;
		public static final UnicodeBlock LETTERLIKE_SYMBOLS;
		public static final UnicodeBlock LIMBU;
		public static final UnicodeBlock LINEAR_A;
		public static final UnicodeBlock LINEAR_B_IDEOGRAMS;
		public static final UnicodeBlock LINEAR_B_SYLLABARY;
		public static final UnicodeBlock LISU;
		public static final UnicodeBlock LISU_SUPPLEMENT;
		public static final UnicodeBlock LOW_SURROGATES;
		public static final UnicodeBlock LYCIAN;
		public static final UnicodeBlock LYDIAN;
		public static final UnicodeBlock MAHAJANI;
		public static final UnicodeBlock MAHJONG_TILES;
		public static final UnicodeBlock MAKASAR;
		public static final UnicodeBlock MALAYALAM;
		public static final UnicodeBlock MANDAIC;
		public static final UnicodeBlock MANICHAEAN;
		public static final UnicodeBlock MARCHEN;
		public static final UnicodeBlock MASARAM_GONDI;
		public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS;
		public static final UnicodeBlock MATHEMATICAL_OPERATORS;
		public static final UnicodeBlock MAYAN_NUMERALS;
		public static final UnicodeBlock MEDEFAIDRIN;
		public static final UnicodeBlock MEETEI_MAYEK;
		public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS;
		public static final UnicodeBlock MENDE_KIKAKUI;
		public static final UnicodeBlock MEROITIC_CURSIVE;
		public static final UnicodeBlock MEROITIC_HIEROGLYPHS;
		public static final UnicodeBlock MIAO;
		public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A;
		public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B;
		public static final UnicodeBlock MISCELLANEOUS_SYMBOLS;
		public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS;
		public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS;
		public static final UnicodeBlock MISCELLANEOUS_TECHNICAL;
		public static final UnicodeBlock MODI;
		public static final UnicodeBlock MODIFIER_TONE_LETTERS;
		public static final UnicodeBlock MONGOLIAN;
		public static final UnicodeBlock MONGOLIAN_SUPPLEMENT;
		public static final UnicodeBlock MRO;
		public static final UnicodeBlock MULTANI;
		public static final UnicodeBlock MUSICAL_SYMBOLS;
		public static final UnicodeBlock MYANMAR;
		public static final UnicodeBlock MYANMAR_EXTENDED_A;
		public static final UnicodeBlock MYANMAR_EXTENDED_B;
		public static final UnicodeBlock NABATAEAN;
		public static final UnicodeBlock NANDINAGARI;
		public static final UnicodeBlock NEWA;
		public static final UnicodeBlock NEW_TAI_LUE;
		public static final UnicodeBlock NKO;
		public static final UnicodeBlock NUMBER_FORMS;
		public static final UnicodeBlock NUSHU;
		public static final UnicodeBlock NYIAKENG_PUACHUE_HMONG;
		public static final UnicodeBlock OGHAM;
		public static final UnicodeBlock OLD_HUNGARIAN;
		public static final UnicodeBlock OLD_ITALIC;
		public static final UnicodeBlock OLD_NORTH_ARABIAN;
		public static final UnicodeBlock OLD_PERMIC;
		public static final UnicodeBlock OLD_PERSIAN;
		public static final UnicodeBlock OLD_SOGDIAN;
		public static final UnicodeBlock OLD_SOUTH_ARABIAN;
		public static final UnicodeBlock OLD_TURKIC;
		public static final UnicodeBlock OL_CHIKI;
		public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
		public static final UnicodeBlock ORIYA;
		public static final UnicodeBlock ORNAMENTAL_DINGBATS;
		public static final UnicodeBlock OSAGE;
		public static final UnicodeBlock OSMANYA;
		public static final UnicodeBlock OTTOMAN_SIYAQ_NUMBERS;
		public static final UnicodeBlock PAHAWH_HMONG;
		public static final UnicodeBlock PALMYRENE;
		public static final UnicodeBlock PAU_CIN_HAU;
		public static final UnicodeBlock PHAGS_PA;
		public static final UnicodeBlock PHAISTOS_DISC;
		public static final UnicodeBlock PHOENICIAN;
		public static final UnicodeBlock PHONETIC_EXTENSIONS;
		public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT;
		public static final UnicodeBlock PLAYING_CARDS;
		public static final UnicodeBlock PRIVATE_USE_AREA;
		public static final UnicodeBlock PSALTER_PAHLAVI;
		public static final UnicodeBlock REJANG;
		public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS;
		public static final UnicodeBlock RUNIC;
		public static final UnicodeBlock SAMARITAN;
		public static final UnicodeBlock SAURASHTRA;
		public static final UnicodeBlock SHARADA;
		public static final UnicodeBlock SHAVIAN;
		public static final UnicodeBlock SHORTHAND_FORMAT_CONTROLS;
		public static final UnicodeBlock SIDDHAM;
		public static final UnicodeBlock SINHALA;
		public static final UnicodeBlock SINHALA_ARCHAIC_NUMBERS;
		public static final UnicodeBlock SMALL_FORM_VARIANTS;
		public static final UnicodeBlock SMALL_KANA_EXTENSION;
		public static final UnicodeBlock SOGDIAN;
		public static final UnicodeBlock SORA_SOMPENG;
		public static final UnicodeBlock SOYOMBO;
		public static final UnicodeBlock SPACING_MODIFIER_LETTERS;
		public static final UnicodeBlock SPECIALS;
		public static final UnicodeBlock SUNDANESE;
		public static final UnicodeBlock SUNDANESE_SUPPLEMENT;
		public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
		public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A;
		public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B;
		public static final UnicodeBlock SUPPLEMENTAL_ARROWS_C;
		public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS;
		public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION;
		public static final UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS;
		public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A;
		public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B;
		@Deprecated
		public static final UnicodeBlock SURROGATES_AREA;
		public static final UnicodeBlock SUTTON_SIGNWRITING;
		public static final UnicodeBlock SYLOTI_NAGRI;
		public static final UnicodeBlock SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A;
		public static final UnicodeBlock SYMBOLS_FOR_LEGACY_COMPUTING;
		public static final UnicodeBlock SYRIAC;
		public static final UnicodeBlock SYRIAC_SUPPLEMENT;
		public static final UnicodeBlock TAGALOG;
		public static final UnicodeBlock TAGBANWA;
		public static final UnicodeBlock TAGS;
		public static final UnicodeBlock TAI_LE;
		public static final UnicodeBlock TAI_THAM;
		public static final UnicodeBlock TAI_VIET;
		public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS;
		public static final UnicodeBlock TAKRI;
		public static final UnicodeBlock TAMIL;
		public static final UnicodeBlock TAMIL_SUPPLEMENT;
		public static final UnicodeBlock TANGUT;
		public static final UnicodeBlock TANGUT_COMPONENTS;
		public static final UnicodeBlock TANGUT_SUPPLEMENT;
		public static final UnicodeBlock TELUGU;
		public static final UnicodeBlock THAANA;
		public static final UnicodeBlock THAI;
		public static final UnicodeBlock TIBETAN;
		public static final UnicodeBlock TIFINAGH;
		public static final UnicodeBlock TIRHUTA;
		public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS;
		public static final UnicodeBlock UGARITIC;
		public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
		public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED;
		public static final UnicodeBlock VAI;
		public static final UnicodeBlock VARIATION_SELECTORS;
		public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT;
		public static final UnicodeBlock VEDIC_EXTENSIONS;
		public static final UnicodeBlock VERTICAL_FORMS;
		public static final UnicodeBlock WANCHO;
		public static final UnicodeBlock WARANG_CITI;
		public static final UnicodeBlock YEZIDI;
		public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS;
		public static final UnicodeBlock YI_RADICALS;
		public static final UnicodeBlock YI_SYLLABLES;
		public static final UnicodeBlock ZANABAZAR_SQUARE;

		UnicodeBlock() {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@RecentlyNullable
		public static UnicodeBlock of(final char c) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNullable
		public static UnicodeBlock of(final int codePoint) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static UnicodeBlock forName(@RecentlyNonNull final String blockName) {
			throw new RuntimeException("Stub!");
		}

		static {
			ADLAM = null;
			AEGEAN_NUMBERS = null;
			AHOM = null;
			ALCHEMICAL_SYMBOLS = null;
			ALPHABETIC_PRESENTATION_FORMS = null;
			ANATOLIAN_HIEROGLYPHS = null;
			ANCIENT_GREEK_MUSICAL_NOTATION = null;
			ANCIENT_GREEK_NUMBERS = null;
			ANCIENT_SYMBOLS = null;
			ARABIC = null;
			ARABIC_EXTENDED_A = null;
			ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null;
			ARABIC_PRESENTATION_FORMS_A = null;
			ARABIC_PRESENTATION_FORMS_B = null;
			ARABIC_SUPPLEMENT = null;
			ARMENIAN = null;
			ARROWS = null;
			AVESTAN = null;
			BALINESE = null;
			BAMUM = null;
			BAMUM_SUPPLEMENT = null;
			BASIC_LATIN = null;
			BASSA_VAH = null;
			BATAK = null;
			BENGALI = null;
			BHAIKSUKI = null;
			BLOCK_ELEMENTS = null;
			BOPOMOFO = null;
			BOPOMOFO_EXTENDED = null;
			BOX_DRAWING = null;
			BRAHMI = null;
			BRAILLE_PATTERNS = null;
			BUGINESE = null;
			BUHID = null;
			BYZANTINE_MUSICAL_SYMBOLS = null;
			CARIAN = null;
			CAUCASIAN_ALBANIAN = null;
			CHAKMA = null;
			CHAM = null;
			CHEROKEE = null;
			CHEROKEE_SUPPLEMENT = null;
			CHESS_SYMBOLS = null;
			CHORASMIAN = null;
			CJK_COMPATIBILITY = null;
			CJK_COMPATIBILITY_FORMS = null;
			CJK_COMPATIBILITY_IDEOGRAPHS = null;
			CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null;
			CJK_RADICALS_SUPPLEMENT = null;
			CJK_STROKES = null;
			CJK_SYMBOLS_AND_PUNCTUATION = null;
			CJK_UNIFIED_IDEOGRAPHS = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F = null;
			CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G = null;
			COMBINING_DIACRITICAL_MARKS = null;
			COMBINING_DIACRITICAL_MARKS_EXTENDED = null;
			COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null;
			COMBINING_HALF_MARKS = null;
			COMBINING_MARKS_FOR_SYMBOLS = null;
			COMMON_INDIC_NUMBER_FORMS = null;
			CONTROL_PICTURES = null;
			COPTIC = null;
			COPTIC_EPACT_NUMBERS = null;
			COUNTING_ROD_NUMERALS = null;
			CUNEIFORM = null;
			CUNEIFORM_NUMBERS_AND_PUNCTUATION = null;
			CURRENCY_SYMBOLS = null;
			CYPRIOT_SYLLABARY = null;
			CYRILLIC = null;
			CYRILLIC_EXTENDED_A = null;
			CYRILLIC_EXTENDED_B = null;
			CYRILLIC_EXTENDED_C = null;
			CYRILLIC_SUPPLEMENTARY = null;
			DESERET = null;
			DEVANAGARI = null;
			DEVANAGARI_EXTENDED = null;
			DINGBATS = null;
			DIVES_AKURU = null;
			DOGRA = null;
			DOMINO_TILES = null;
			DUPLOYAN = null;
			EARLY_DYNASTIC_CUNEIFORM = null;
			EGYPTIAN_HIEROGLYPHS = null;
			EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS = null;
			ELBASAN = null;
			ELYMAIC = null;
			EMOTICONS = null;
			ENCLOSED_ALPHANUMERICS = null;
			ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null;
			ENCLOSED_CJK_LETTERS_AND_MONTHS = null;
			ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null;
			ETHIOPIC = null;
			ETHIOPIC_EXTENDED = null;
			ETHIOPIC_EXTENDED_A = null;
			ETHIOPIC_SUPPLEMENT = null;
			GENERAL_PUNCTUATION = null;
			GEOMETRIC_SHAPES = null;
			GEOMETRIC_SHAPES_EXTENDED = null;
			GEORGIAN = null;
			GEORGIAN_EXTENDED = null;
			GEORGIAN_SUPPLEMENT = null;
			GLAGOLITIC = null;
			GLAGOLITIC_SUPPLEMENT = null;
			GOTHIC = null;
			GRANTHA = null;
			GREEK = null;
			GREEK_EXTENDED = null;
			GUJARATI = null;
			GUNJALA_GONDI = null;
			GURMUKHI = null;
			HALFWIDTH_AND_FULLWIDTH_FORMS = null;
			HANGUL_COMPATIBILITY_JAMO = null;
			HANGUL_JAMO = null;
			HANGUL_JAMO_EXTENDED_A = null;
			HANGUL_JAMO_EXTENDED_B = null;
			HANGUL_SYLLABLES = null;
			HANIFI_ROHINGYA = null;
			HANUNOO = null;
			HATRAN = null;
			HEBREW = null;
			HIGH_PRIVATE_USE_SURROGATES = null;
			HIGH_SURROGATES = null;
			HIRAGANA = null;
			IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null;
			IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION = null;
			IMPERIAL_ARAMAIC = null;
			INDIC_SIYAQ_NUMBERS = null;
			INSCRIPTIONAL_PAHLAVI = null;
			INSCRIPTIONAL_PARTHIAN = null;
			IPA_EXTENSIONS = null;
			JAVANESE = null;
			KAITHI = null;
			KANA_EXTENDED_A = null;
			KANA_SUPPLEMENT = null;
			KANBUN = null;
			KANGXI_RADICALS = null;
			KANNADA = null;
			KATAKANA = null;
			KATAKANA_PHONETIC_EXTENSIONS = null;
			KAYAH_LI = null;
			KHAROSHTHI = null;
			KHITAN_SMALL_SCRIPT = null;
			KHMER = null;
			KHMER_SYMBOLS = null;
			KHOJKI = null;
			KHUDAWADI = null;
			LAO = null;
			LATIN_1_SUPPLEMENT = null;
			LATIN_EXTENDED_A = null;
			LATIN_EXTENDED_ADDITIONAL = null;
			LATIN_EXTENDED_B = null;
			LATIN_EXTENDED_C = null;
			LATIN_EXTENDED_D = null;
			LATIN_EXTENDED_E = null;
			LEPCHA = null;
			LETTERLIKE_SYMBOLS = null;
			LIMBU = null;
			LINEAR_A = null;
			LINEAR_B_IDEOGRAMS = null;
			LINEAR_B_SYLLABARY = null;
			LISU = null;
			LISU_SUPPLEMENT = null;
			LOW_SURROGATES = null;
			LYCIAN = null;
			LYDIAN = null;
			MAHAJANI = null;
			MAHJONG_TILES = null;
			MAKASAR = null;
			MALAYALAM = null;
			MANDAIC = null;
			MANICHAEAN = null;
			MARCHEN = null;
			MASARAM_GONDI = null;
			MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null;
			MATHEMATICAL_OPERATORS = null;
			MAYAN_NUMERALS = null;
			MEDEFAIDRIN = null;
			MEETEI_MAYEK = null;
			MEETEI_MAYEK_EXTENSIONS = null;
			MENDE_KIKAKUI = null;
			MEROITIC_CURSIVE = null;
			MEROITIC_HIEROGLYPHS = null;
			MIAO = null;
			MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null;
			MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null;
			MISCELLANEOUS_SYMBOLS = null;
			MISCELLANEOUS_SYMBOLS_AND_ARROWS = null;
			MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null;
			MISCELLANEOUS_TECHNICAL = null;
			MODI = null;
			MODIFIER_TONE_LETTERS = null;
			MONGOLIAN = null;
			MONGOLIAN_SUPPLEMENT = null;
			MRO = null;
			MULTANI = null;
			MUSICAL_SYMBOLS = null;
			MYANMAR = null;
			MYANMAR_EXTENDED_A = null;
			MYANMAR_EXTENDED_B = null;
			NABATAEAN = null;
			NANDINAGARI = null;
			NEWA = null;
			NEW_TAI_LUE = null;
			NKO = null;
			NUMBER_FORMS = null;
			NUSHU = null;
			NYIAKENG_PUACHUE_HMONG = null;
			OGHAM = null;
			OLD_HUNGARIAN = null;
			OLD_ITALIC = null;
			OLD_NORTH_ARABIAN = null;
			OLD_PERMIC = null;
			OLD_PERSIAN = null;
			OLD_SOGDIAN = null;
			OLD_SOUTH_ARABIAN = null;
			OLD_TURKIC = null;
			OL_CHIKI = null;
			OPTICAL_CHARACTER_RECOGNITION = null;
			ORIYA = null;
			ORNAMENTAL_DINGBATS = null;
			OSAGE = null;
			OSMANYA = null;
			OTTOMAN_SIYAQ_NUMBERS = null;
			PAHAWH_HMONG = null;
			PALMYRENE = null;
			PAU_CIN_HAU = null;
			PHAGS_PA = null;
			PHAISTOS_DISC = null;
			PHOENICIAN = null;
			PHONETIC_EXTENSIONS = null;
			PHONETIC_EXTENSIONS_SUPPLEMENT = null;
			PLAYING_CARDS = null;
			PRIVATE_USE_AREA = null;
			PSALTER_PAHLAVI = null;
			REJANG = null;
			RUMI_NUMERAL_SYMBOLS = null;
			RUNIC = null;
			SAMARITAN = null;
			SAURASHTRA = null;
			SHARADA = null;
			SHAVIAN = null;
			SHORTHAND_FORMAT_CONTROLS = null;
			SIDDHAM = null;
			SINHALA = null;
			SINHALA_ARCHAIC_NUMBERS = null;
			SMALL_FORM_VARIANTS = null;
			SMALL_KANA_EXTENSION = null;
			SOGDIAN = null;
			SORA_SOMPENG = null;
			SOYOMBO = null;
			SPACING_MODIFIER_LETTERS = null;
			SPECIALS = null;
			SUNDANESE = null;
			SUNDANESE_SUPPLEMENT = null;
			SUPERSCRIPTS_AND_SUBSCRIPTS = null;
			SUPPLEMENTAL_ARROWS_A = null;
			SUPPLEMENTAL_ARROWS_B = null;
			SUPPLEMENTAL_ARROWS_C = null;
			SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null;
			SUPPLEMENTAL_PUNCTUATION = null;
			SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS = null;
			SUPPLEMENTARY_PRIVATE_USE_AREA_A = null;
			SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;
			SURROGATES_AREA = null;
			SUTTON_SIGNWRITING = null;
			SYLOTI_NAGRI = null;
			SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A = null;
			SYMBOLS_FOR_LEGACY_COMPUTING = null;
			SYRIAC = null;
			SYRIAC_SUPPLEMENT = null;
			TAGALOG = null;
			TAGBANWA = null;
			TAGS = null;
			TAI_LE = null;
			TAI_THAM = null;
			TAI_VIET = null;
			TAI_XUAN_JING_SYMBOLS = null;
			TAKRI = null;
			TAMIL = null;
			TAMIL_SUPPLEMENT = null;
			TANGUT = null;
			TANGUT_COMPONENTS = null;
			TANGUT_SUPPLEMENT = null;
			TELUGU = null;
			THAANA = null;
			THAI = null;
			TIBETAN = null;
			TIFINAGH = null;
			TIRHUTA = null;
			TRANSPORT_AND_MAP_SYMBOLS = null;
			UGARITIC = null;
			UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;
			UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null;
			VAI = null;
			VARIATION_SELECTORS = null;
			VARIATION_SELECTORS_SUPPLEMENT = null;
			VEDIC_EXTENSIONS = null;
			VERTICAL_FORMS = null;
			WANCHO = null;
			WARANG_CITI = null;
			YEZIDI = null;
			YIJING_HEXAGRAM_SYMBOLS = null;
			YI_RADICALS = null;
			YI_SYLLABLES = null;
			ZANABAZAR_SQUARE = null;
		}
	}

	public enum UnicodeScript {
		COMMON, LATIN, GREEK, CYRILLIC, ARMENIAN, HEBREW, ARABIC, SYRIAC, THAANA, DEVANAGARI, BENGALI, GURMUKHI, GUJARATI, ORIYA, TAMIL, TELUGU, KANNADA, MALAYALAM, SINHALA, THAI, LAO, TIBETAN, MYANMAR, GEORGIAN, HANGUL, ETHIOPIC, CHEROKEE, CANADIAN_ABORIGINAL, OGHAM, RUNIC, KHMER, MONGOLIAN, HIRAGANA, KATAKANA, BOPOMOFO, HAN, YI, OLD_ITALIC, GOTHIC, DESERET, INHERITED, TAGALOG, HANUNOO, BUHID, TAGBANWA, LIMBU, TAI_LE, LINEAR_B, UGARITIC, SHAVIAN, OSMANYA, CYPRIOT, BRAILLE, BUGINESE, COPTIC, NEW_TAI_LUE, GLAGOLITIC, TIFINAGH, SYLOTI_NAGRI, OLD_PERSIAN, KHAROSHTHI, BALINESE, CUNEIFORM, PHOENICIAN, PHAGS_PA, NKO, SUNDANESE, BATAK, LEPCHA, OL_CHIKI, VAI, SAURASHTRA, KAYAH_LI, REJANG, LYCIAN, CARIAN, LYDIAN, CHAM, TAI_THAM, TAI_VIET, AVESTAN, EGYPTIAN_HIEROGLYPHS, SAMARITAN, MANDAIC, LISU, BAMUM, JAVANESE, MEETEI_MAYEK, IMPERIAL_ARAMAIC, OLD_SOUTH_ARABIAN, INSCRIPTIONAL_PARTHIAN, INSCRIPTIONAL_PAHLAVI, OLD_TURKIC, BRAHMI, KAITHI, MEROITIC_HIEROGLYPHS, MEROITIC_CURSIVE, SORA_SOMPENG, CHAKMA, SHARADA, TAKRI, MIAO, CAUCASIAN_ALBANIAN, BASSA_VAH, DUPLOYAN, ELBASAN, GRANTHA, PAHAWH_HMONG, KHOJKI, LINEAR_A, MAHAJANI, MANICHAEAN, MENDE_KIKAKUI, MODI, MRO, OLD_NORTH_ARABIAN, NABATAEAN, PALMYRENE, PAU_CIN_HAU, OLD_PERMIC, PSALTER_PAHLAVI, SIDDHAM, KHUDAWADI, TIRHUTA, WARANG_CITI, AHOM, ANATOLIAN_HIEROGLYPHS, HATRAN, MULTANI, OLD_HUNGARIAN, SIGNWRITING, ADLAM, BHAIKSUKI, MARCHEN, NEWA, OSAGE, TANGUT, MASARAM_GONDI, NUSHU, SOYOMBO, ZANABAZAR_SQUARE, HANIFI_ROHINGYA, OLD_SOGDIAN, SOGDIAN, DOGRA, GUNJALA_GONDI, MAKASAR, MEDEFAIDRIN, ELYMAIC, NANDINAGARI, NYIAKENG_PUACHUE_HMONG, WANCHO, YEZIDI, CHORASMIAN, DIVES_AKURU, KHITAN_SMALL_SCRIPT, UNKNOWN;

		@RecentlyNonNull
		public static UnicodeScript of(final int codePoint) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static UnicodeScript forName(@RecentlyNonNull final String scriptName) {
			throw new RuntimeException("Stub!");
		}
	}
}
