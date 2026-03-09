package android.icu.lang;

import android.icu.util.ValueIterator;
import android.icu.util.RangeValueIterator;
import android.icu.util.ULocale;
import java.util.Locale;
import android.icu.text.BreakIterator;
import android.icu.util.VersionInfo;

public final class UCharacter implements UCharacterEnums.ECharacterCategory, UCharacterEnums.ECharacterDirection
{
    public static final int FOLD_CASE_DEFAULT = 0;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
    public static final int MAX_CODE_POINT = 1114111;
    public static final char MAX_HIGH_SURROGATE = '\udbff';
    public static final char MAX_LOW_SURROGATE = '\udfff';
    public static final int MAX_RADIX = 36;
    public static final char MAX_SURROGATE = '\udfff';
    public static final int MAX_VALUE = 1114111;
    public static final int MIN_CODE_POINT = 0;
    public static final char MIN_HIGH_SURROGATE = '\ud800';
    public static final char MIN_LOW_SURROGATE = '\udc00';
    public static final int MIN_RADIX = 2;
    public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
    public static final char MIN_SURROGATE = '\ud800';
    public static final int MIN_VALUE = 0;
    public static final double NO_NUMERIC_VALUE = -1.23456789E8;
    public static final int REPLACEMENT_CHAR = 65533;
    public static final int SUPPLEMENTARY_MIN_VALUE = 65536;
    public static final int TITLECASE_NO_BREAK_ADJUSTMENT = 512;
    public static final int TITLECASE_NO_LOWERCASE = 256;
    
    UCharacter() {
        throw new RuntimeException("Stub!");
    }
    
    public static int digit(final int ch, final int radix) {
        throw new RuntimeException("Stub!");
    }
    
    public static int digit(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getNumericValue(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static double getUnicodeNumericValue(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getType(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDefined(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDigit(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isISOControl(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLetter(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLetterOrDigit(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isJavaIdentifierStart(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isJavaIdentifierPart(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLowerCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isWhitespace(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSpaceChar(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isTitleCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUnicodeIdentifierPart(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUnicodeIdentifierStart(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isIdentifierIgnorable(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUpperCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toLowerCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toString(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toTitleCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toUpperCase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupplementary(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isBMP(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isPrintable(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isBaseForm(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDirection(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isMirrored(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMirror(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getBidiPairedBracket(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCombiningClass(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLegal(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLegal(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static VersionInfo getUnicodeVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getName(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getName(final String s, final String separator) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getExtendedName(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getNameAlias(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCharFromName(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCharFromExtendedName(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCharFromNameAlias(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getPropertyName(final int property, final int nameChoice) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPropertyEnum(final CharSequence propertyAlias) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getPropertyValueName(final int property, final int value, final int nameChoice) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPropertyValueEnum(final int property, final CharSequence valueAlias) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCodePoint(final int lead, final int trail) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCodePoint(final char lead, final char trail) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCodePoint(final char char16) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toUpperCase(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toLowerCase(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toTitleCase(final String str, final BreakIterator breakiter) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toUpperCase(final Locale locale, final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toUpperCase(final ULocale locale, final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toLowerCase(final Locale locale, final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toLowerCase(final ULocale locale, final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toTitleCase(final Locale locale, final String str, final BreakIterator breakiter) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toTitleCase(final ULocale locale, final String str, final BreakIterator titleIter) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toTitleCase(final ULocale locale, final String str, final BreakIterator titleIter, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toTitleCase(final Locale locale, final String str, final BreakIterator titleIter, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int foldCase(final int ch, final boolean defaultmapping) {
        throw new RuntimeException("Stub!");
    }
    
    public static String foldCase(final String str, final boolean defaultmapping) {
        throw new RuntimeException("Stub!");
    }
    
    public static int foldCase(final int ch, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static String foldCase(final String str, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getHanNumericValue(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static RangeValueIterator getTypeIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueIterator getNameIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public static ValueIterator getExtendedNameIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public static VersionInfo getAge(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean hasBinaryProperty(final int ch, final int property) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean hasBinaryProperty(final CharSequence s, final int property) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUAlphabetic(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isULowercase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUUppercase(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUWhiteSpace(final int ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getIntPropertyValue(final int ch, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getIntPropertyMinValue(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getIntPropertyMaxValue(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static char forDigit(final int digit, final int radix) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isValidCodePoint(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupplementaryCodePoint(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isHighSurrogate(final int codePoint) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isHighSurrogate(final char ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLowSurrogate(final int codePoint) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isLowSurrogate(final char ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSurrogatePair(final int high, final int low) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSurrogatePair(final char high, final char low) {
        throw new RuntimeException("Stub!");
    }
    
    public static int charCount(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toCodePoint(final int high, final int low) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toCodePoint(final char high, final char low) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointAt(final CharSequence seq, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointAt(final char[] text, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointAt(final char[] text, final int index, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointBefore(final CharSequence seq, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointBefore(final char[] text, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointBefore(final char[] text, final int index, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toChars(final int cp, final char[] dst, final int dstIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public static char[] toChars(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static byte getDirectionality(final int cp) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointCount(final CharSequence text, final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static int codePointCount(final char[] text, final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static int offsetByCodePoints(final CharSequence text, final int index, final int codePointOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static int offsetByCodePoints(final char[] text, final int start, final int count, final int index, final int codePointOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class UnicodeBlock extends Character.Subset
    {
        public static final UnicodeBlock ADLAM;
        public static final int ADLAM_ID = 263;
        public static final UnicodeBlock AEGEAN_NUMBERS;
        public static final int AEGEAN_NUMBERS_ID = 119;
        public static final UnicodeBlock AHOM;
        public static final int AHOM_ID = 253;
        public static final UnicodeBlock ALCHEMICAL_SYMBOLS;
        public static final int ALCHEMICAL_SYMBOLS_ID = 208;
        public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
        public static final int ALPHABETIC_PRESENTATION_FORMS_ID = 80;
        public static final UnicodeBlock ANATOLIAN_HIEROGLYPHS;
        public static final int ANATOLIAN_HIEROGLYPHS_ID = 254;
        public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION;
        public static final int ANCIENT_GREEK_MUSICAL_NOTATION_ID = 126;
        public static final UnicodeBlock ANCIENT_GREEK_NUMBERS;
        public static final int ANCIENT_GREEK_NUMBERS_ID = 127;
        public static final UnicodeBlock ANCIENT_SYMBOLS;
        public static final int ANCIENT_SYMBOLS_ID = 165;
        public static final UnicodeBlock ARABIC;
        public static final UnicodeBlock ARABIC_EXTENDED_A;
        public static final int ARABIC_EXTENDED_A_ID = 210;
        public static final UnicodeBlock ARABIC_EXTENDED_B;
        public static final int ARABIC_EXTENDED_B_ID = 309;
        public static final UnicodeBlock ARABIC_EXTENDED_C;
        public static final int ARABIC_EXTENDED_C_ID = 321;
        public static final int ARABIC_ID = 12;
        public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS;
        public static final int ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS_ID = 211;
        public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
        public static final int ARABIC_PRESENTATION_FORMS_A_ID = 81;
        public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
        public static final int ARABIC_PRESENTATION_FORMS_B_ID = 85;
        public static final UnicodeBlock ARABIC_SUPPLEMENT;
        public static final int ARABIC_SUPPLEMENT_ID = 128;
        public static final UnicodeBlock ARMENIAN;
        public static final int ARMENIAN_ID = 10;
        public static final UnicodeBlock ARROWS;
        public static final int ARROWS_ID = 46;
        public static final UnicodeBlock AVESTAN;
        public static final int AVESTAN_ID = 188;
        public static final UnicodeBlock BALINESE;
        public static final int BALINESE_ID = 147;
        public static final UnicodeBlock BAMUM;
        public static final int BAMUM_ID = 177;
        public static final UnicodeBlock BAMUM_SUPPLEMENT;
        public static final int BAMUM_SUPPLEMENT_ID = 202;
        public static final UnicodeBlock BASIC_LATIN;
        public static final int BASIC_LATIN_ID = 1;
        public static final UnicodeBlock BASSA_VAH;
        public static final int BASSA_VAH_ID = 221;
        public static final UnicodeBlock BATAK;
        public static final int BATAK_ID = 199;
        public static final UnicodeBlock BENGALI;
        public static final int BENGALI_ID = 16;
        public static final UnicodeBlock BHAIKSUKI;
        public static final int BHAIKSUKI_ID = 264;
        public static final UnicodeBlock BLOCK_ELEMENTS;
        public static final int BLOCK_ELEMENTS_ID = 53;
        public static final UnicodeBlock BOPOMOFO;
        public static final UnicodeBlock BOPOMOFO_EXTENDED;
        public static final int BOPOMOFO_EXTENDED_ID = 67;
        public static final int BOPOMOFO_ID = 64;
        public static final UnicodeBlock BOX_DRAWING;
        public static final int BOX_DRAWING_ID = 52;
        public static final UnicodeBlock BRAHMI;
        public static final int BRAHMI_ID = 201;
        public static final UnicodeBlock BRAILLE_PATTERNS;
        public static final int BRAILLE_PATTERNS_ID = 57;
        public static final UnicodeBlock BUGINESE;
        public static final int BUGINESE_ID = 129;
        public static final UnicodeBlock BUHID;
        public static final int BUHID_ID = 100;
        public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS;
        public static final int BYZANTINE_MUSICAL_SYMBOLS_ID = 91;
        public static final UnicodeBlock CARIAN;
        public static final int CARIAN_ID = 168;
        public static final UnicodeBlock CAUCASIAN_ALBANIAN;
        public static final int CAUCASIAN_ALBANIAN_ID = 222;
        public static final UnicodeBlock CHAKMA;
        public static final int CHAKMA_ID = 212;
        public static final UnicodeBlock CHAM;
        public static final int CHAM_ID = 164;
        public static final UnicodeBlock CHEROKEE;
        public static final int CHEROKEE_ID = 32;
        public static final UnicodeBlock CHEROKEE_SUPPLEMENT;
        public static final int CHEROKEE_SUPPLEMENT_ID = 255;
        public static final UnicodeBlock CHESS_SYMBOLS;
        public static final int CHESS_SYMBOLS_ID = 281;
        public static final UnicodeBlock CHORASMIAN;
        public static final int CHORASMIAN_ID = 301;
        public static final UnicodeBlock CJK_COMPATIBILITY;
        public static final UnicodeBlock CJK_COMPATIBILITY_FORMS;
        public static final int CJK_COMPATIBILITY_FORMS_ID = 83;
        public static final int CJK_COMPATIBILITY_ID = 69;
        public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
        public static final int CJK_COMPATIBILITY_IDEOGRAPHS_ID = 79;
        public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
        public static final int CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT_ID = 95;
        public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT;
        public static final int CJK_RADICALS_SUPPLEMENT_ID = 58;
        public static final UnicodeBlock CJK_STROKES;
        public static final int CJK_STROKES_ID = 130;
        public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
        public static final int CJK_SYMBOLS_AND_PUNCTUATION_ID = 61;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A_ID = 70;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B_ID = 94;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C_ID = 197;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D_ID = 209;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E_ID = 256;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F_ID = 274;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G_ID = 302;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_H;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_H_ID = 322;
        public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_I;
        public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_I_ID = 328;
        public static final int CJK_UNIFIED_IDEOGRAPHS_ID = 71;
        public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS;
        public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED;
        public static final int COMBINING_DIACRITICAL_MARKS_EXTENDED_ID = 224;
        public static final int COMBINING_DIACRITICAL_MARKS_ID = 7;
        public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT;
        public static final int COMBINING_DIACRITICAL_MARKS_SUPPLEMENT_ID = 131;
        public static final UnicodeBlock COMBINING_HALF_MARKS;
        public static final int COMBINING_HALF_MARKS_ID = 82;
        public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
        public static final int COMBINING_MARKS_FOR_SYMBOLS_ID = 43;
        public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS;
        public static final int COMMON_INDIC_NUMBER_FORMS_ID = 178;
        public static final UnicodeBlock CONTROL_PICTURES;
        public static final int CONTROL_PICTURES_ID = 49;
        public static final UnicodeBlock COPTIC;
        public static final UnicodeBlock COPTIC_EPACT_NUMBERS;
        public static final int COPTIC_EPACT_NUMBERS_ID = 223;
        public static final int COPTIC_ID = 132;
        public static final UnicodeBlock COUNTING_ROD_NUMERALS;
        public static final int COUNTING_ROD_NUMERALS_ID = 154;
        public static final UnicodeBlock CUNEIFORM;
        public static final int CUNEIFORM_ID = 152;
        public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION;
        public static final int CUNEIFORM_NUMBERS_AND_PUNCTUATION_ID = 153;
        public static final UnicodeBlock CURRENCY_SYMBOLS;
        public static final int CURRENCY_SYMBOLS_ID = 42;
        public static final UnicodeBlock CYPRIOT_SYLLABARY;
        public static final int CYPRIOT_SYLLABARY_ID = 123;
        public static final UnicodeBlock CYPRO_MINOAN;
        public static final int CYPRO_MINOAN_ID = 310;
        public static final UnicodeBlock CYRILLIC;
        public static final UnicodeBlock CYRILLIC_EXTENDED_A;
        public static final int CYRILLIC_EXTENDED_A_ID = 158;
        public static final UnicodeBlock CYRILLIC_EXTENDED_B;
        public static final int CYRILLIC_EXTENDED_B_ID = 160;
        public static final UnicodeBlock CYRILLIC_EXTENDED_C;
        public static final int CYRILLIC_EXTENDED_C_ID = 265;
        public static final UnicodeBlock CYRILLIC_EXTENDED_D;
        public static final int CYRILLIC_EXTENDED_D_ID = 323;
        public static final int CYRILLIC_ID = 9;
        public static final UnicodeBlock CYRILLIC_SUPPLEMENT;
        public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY;
        public static final int CYRILLIC_SUPPLEMENTARY_ID = 97;
        public static final int CYRILLIC_SUPPLEMENT_ID = 97;
        public static final UnicodeBlock DESERET;
        public static final int DESERET_ID = 90;
        public static final UnicodeBlock DEVANAGARI;
        public static final UnicodeBlock DEVANAGARI_EXTENDED;
        public static final UnicodeBlock DEVANAGARI_EXTENDED_A;
        public static final int DEVANAGARI_EXTENDED_A_ID = 324;
        public static final int DEVANAGARI_EXTENDED_ID = 179;
        public static final int DEVANAGARI_ID = 15;
        public static final UnicodeBlock DINGBATS;
        public static final int DINGBATS_ID = 56;
        public static final UnicodeBlock DIVES_AKURU;
        public static final int DIVES_AKURU_ID = 303;
        public static final UnicodeBlock DOGRA;
        public static final int DOGRA_ID = 282;
        public static final UnicodeBlock DOMINO_TILES;
        public static final int DOMINO_TILES_ID = 171;
        public static final UnicodeBlock DUPLOYAN;
        public static final int DUPLOYAN_ID = 225;
        public static final UnicodeBlock EARLY_DYNASTIC_CUNEIFORM;
        public static final int EARLY_DYNASTIC_CUNEIFORM_ID = 257;
        public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS;
        public static final int EGYPTIAN_HIEROGLYPHS_ID = 194;
        public static final UnicodeBlock EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS;
        public static final int EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS_ID = 292;
        public static final UnicodeBlock ELBASAN;
        public static final int ELBASAN_ID = 226;
        public static final UnicodeBlock ELYMAIC;
        public static final int ELYMAIC_ID = 293;
        public static final UnicodeBlock EMOTICONS;
        public static final int EMOTICONS_ID = 206;
        public static final UnicodeBlock ENCLOSED_ALPHANUMERICS;
        public static final int ENCLOSED_ALPHANUMERICS_ID = 51;
        public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT;
        public static final int ENCLOSED_ALPHANUMERIC_SUPPLEMENT_ID = 195;
        public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
        public static final int ENCLOSED_CJK_LETTERS_AND_MONTHS_ID = 68;
        public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT;
        public static final int ENCLOSED_IDEOGRAPHIC_SUPPLEMENT_ID = 196;
        public static final UnicodeBlock ETHIOPIC;
        public static final UnicodeBlock ETHIOPIC_EXTENDED;
        public static final UnicodeBlock ETHIOPIC_EXTENDED_A;
        public static final int ETHIOPIC_EXTENDED_A_ID = 200;
        public static final UnicodeBlock ETHIOPIC_EXTENDED_B;
        public static final int ETHIOPIC_EXTENDED_B_ID = 311;
        public static final int ETHIOPIC_EXTENDED_ID = 133;
        public static final int ETHIOPIC_ID = 31;
        public static final UnicodeBlock ETHIOPIC_SUPPLEMENT;
        public static final int ETHIOPIC_SUPPLEMENT_ID = 134;
        public static final UnicodeBlock GENERAL_PUNCTUATION;
        public static final int GENERAL_PUNCTUATION_ID = 40;
        public static final UnicodeBlock GEOMETRIC_SHAPES;
        public static final UnicodeBlock GEOMETRIC_SHAPES_EXTENDED;
        public static final int GEOMETRIC_SHAPES_EXTENDED_ID = 227;
        public static final int GEOMETRIC_SHAPES_ID = 54;
        public static final UnicodeBlock GEORGIAN;
        public static final UnicodeBlock GEORGIAN_EXTENDED;
        public static final int GEORGIAN_EXTENDED_ID = 283;
        public static final int GEORGIAN_ID = 29;
        public static final UnicodeBlock GEORGIAN_SUPPLEMENT;
        public static final int GEORGIAN_SUPPLEMENT_ID = 135;
        public static final UnicodeBlock GLAGOLITIC;
        public static final int GLAGOLITIC_ID = 136;
        public static final UnicodeBlock GLAGOLITIC_SUPPLEMENT;
        public static final int GLAGOLITIC_SUPPLEMENT_ID = 266;
        public static final UnicodeBlock GOTHIC;
        public static final int GOTHIC_ID = 89;
        public static final UnicodeBlock GRANTHA;
        public static final int GRANTHA_ID = 228;
        public static final UnicodeBlock GREEK;
        public static final UnicodeBlock GREEK_EXTENDED;
        public static final int GREEK_EXTENDED_ID = 39;
        public static final int GREEK_ID = 8;
        public static final UnicodeBlock GUJARATI;
        public static final int GUJARATI_ID = 18;
        public static final UnicodeBlock GUNJALA_GONDI;
        public static final int GUNJALA_GONDI_ID = 284;
        public static final UnicodeBlock GURMUKHI;
        public static final int GURMUKHI_ID = 17;
        public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
        public static final int HALFWIDTH_AND_FULLWIDTH_FORMS_ID = 87;
        public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
        public static final int HANGUL_COMPATIBILITY_JAMO_ID = 65;
        public static final UnicodeBlock HANGUL_JAMO;
        public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A;
        public static final int HANGUL_JAMO_EXTENDED_A_ID = 180;
        public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B;
        public static final int HANGUL_JAMO_EXTENDED_B_ID = 185;
        public static final int HANGUL_JAMO_ID = 30;
        public static final UnicodeBlock HANGUL_SYLLABLES;
        public static final int HANGUL_SYLLABLES_ID = 74;
        public static final UnicodeBlock HANIFI_ROHINGYA;
        public static final int HANIFI_ROHINGYA_ID = 285;
        public static final UnicodeBlock HANUNOO;
        public static final int HANUNOO_ID = 99;
        public static final UnicodeBlock HATRAN;
        public static final int HATRAN_ID = 258;
        public static final UnicodeBlock HEBREW;
        public static final int HEBREW_ID = 11;
        public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES;
        public static final int HIGH_PRIVATE_USE_SURROGATES_ID = 76;
        public static final UnicodeBlock HIGH_SURROGATES;
        public static final int HIGH_SURROGATES_ID = 75;
        public static final UnicodeBlock HIRAGANA;
        public static final int HIRAGANA_ID = 62;
        public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
        public static final int IDEOGRAPHIC_DESCRIPTION_CHARACTERS_ID = 60;
        public static final UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION;
        public static final int IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION_ID = 267;
        public static final UnicodeBlock IMPERIAL_ARAMAIC;
        public static final int IMPERIAL_ARAMAIC_ID = 186;
        public static final UnicodeBlock INDIC_SIYAQ_NUMBERS;
        public static final int INDIC_SIYAQ_NUMBERS_ID = 286;
        public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI;
        public static final int INSCRIPTIONAL_PAHLAVI_ID = 190;
        public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN;
        public static final int INSCRIPTIONAL_PARTHIAN_ID = 189;
        public static final UnicodeBlock INVALID_CODE;
        public static final int INVALID_CODE_ID = -1;
        public static final UnicodeBlock IPA_EXTENSIONS;
        public static final int IPA_EXTENSIONS_ID = 5;
        public static final UnicodeBlock JAVANESE;
        public static final int JAVANESE_ID = 181;
        public static final UnicodeBlock KAITHI;
        public static final int KAITHI_ID = 193;
        public static final UnicodeBlock KAKTOVIK_NUMERALS;
        public static final int KAKTOVIK_NUMERALS_ID = 325;
        public static final UnicodeBlock KANA_EXTENDED_A;
        public static final int KANA_EXTENDED_A_ID = 275;
        public static final UnicodeBlock KANA_EXTENDED_B;
        public static final int KANA_EXTENDED_B_ID = 312;
        public static final UnicodeBlock KANA_SUPPLEMENT;
        public static final int KANA_SUPPLEMENT_ID = 203;
        public static final UnicodeBlock KANBUN;
        public static final int KANBUN_ID = 66;
        public static final UnicodeBlock KANGXI_RADICALS;
        public static final int KANGXI_RADICALS_ID = 59;
        public static final UnicodeBlock KANNADA;
        public static final int KANNADA_ID = 22;
        public static final UnicodeBlock KATAKANA;
        public static final int KATAKANA_ID = 63;
        public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS;
        public static final int KATAKANA_PHONETIC_EXTENSIONS_ID = 107;
        public static final UnicodeBlock KAWI;
        public static final int KAWI_ID = 326;
        public static final UnicodeBlock KAYAH_LI;
        public static final int KAYAH_LI_ID = 162;
        public static final UnicodeBlock KHAROSHTHI;
        public static final int KHAROSHTHI_ID = 137;
        public static final UnicodeBlock KHITAN_SMALL_SCRIPT;
        public static final int KHITAN_SMALL_SCRIPT_ID = 304;
        public static final UnicodeBlock KHMER;
        public static final int KHMER_ID = 36;
        public static final UnicodeBlock KHMER_SYMBOLS;
        public static final int KHMER_SYMBOLS_ID = 113;
        public static final UnicodeBlock KHOJKI;
        public static final int KHOJKI_ID = 229;
        public static final UnicodeBlock KHUDAWADI;
        public static final int KHUDAWADI_ID = 230;
        public static final UnicodeBlock LAO;
        public static final int LAO_ID = 26;
        public static final UnicodeBlock LATIN_1_SUPPLEMENT;
        public static final int LATIN_1_SUPPLEMENT_ID = 2;
        public static final UnicodeBlock LATIN_EXTENDED_A;
        public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
        public static final int LATIN_EXTENDED_ADDITIONAL_ID = 38;
        public static final int LATIN_EXTENDED_A_ID = 3;
        public static final UnicodeBlock LATIN_EXTENDED_B;
        public static final int LATIN_EXTENDED_B_ID = 4;
        public static final UnicodeBlock LATIN_EXTENDED_C;
        public static final int LATIN_EXTENDED_C_ID = 148;
        public static final UnicodeBlock LATIN_EXTENDED_D;
        public static final int LATIN_EXTENDED_D_ID = 149;
        public static final UnicodeBlock LATIN_EXTENDED_E;
        public static final int LATIN_EXTENDED_E_ID = 231;
        public static final UnicodeBlock LATIN_EXTENDED_F;
        public static final int LATIN_EXTENDED_F_ID = 313;
        public static final UnicodeBlock LATIN_EXTENDED_G;
        public static final int LATIN_EXTENDED_G_ID = 314;
        public static final UnicodeBlock LEPCHA;
        public static final int LEPCHA_ID = 156;
        public static final UnicodeBlock LETTERLIKE_SYMBOLS;
        public static final int LETTERLIKE_SYMBOLS_ID = 44;
        public static final UnicodeBlock LIMBU;
        public static final int LIMBU_ID = 111;
        public static final UnicodeBlock LINEAR_A;
        public static final int LINEAR_A_ID = 232;
        public static final UnicodeBlock LINEAR_B_IDEOGRAMS;
        public static final int LINEAR_B_IDEOGRAMS_ID = 118;
        public static final UnicodeBlock LINEAR_B_SYLLABARY;
        public static final int LINEAR_B_SYLLABARY_ID = 117;
        public static final UnicodeBlock LISU;
        public static final int LISU_ID = 176;
        public static final UnicodeBlock LISU_SUPPLEMENT;
        public static final int LISU_SUPPLEMENT_ID = 305;
        public static final UnicodeBlock LOW_SURROGATES;
        public static final int LOW_SURROGATES_ID = 77;
        public static final UnicodeBlock LYCIAN;
        public static final int LYCIAN_ID = 167;
        public static final UnicodeBlock LYDIAN;
        public static final int LYDIAN_ID = 169;
        public static final UnicodeBlock MAHAJANI;
        public static final int MAHAJANI_ID = 233;
        public static final UnicodeBlock MAHJONG_TILES;
        public static final int MAHJONG_TILES_ID = 170;
        public static final UnicodeBlock MAKASAR;
        public static final int MAKASAR_ID = 287;
        public static final UnicodeBlock MALAYALAM;
        public static final int MALAYALAM_ID = 23;
        public static final UnicodeBlock MANDAIC;
        public static final int MANDAIC_ID = 198;
        public static final UnicodeBlock MANICHAEAN;
        public static final int MANICHAEAN_ID = 234;
        public static final UnicodeBlock MARCHEN;
        public static final int MARCHEN_ID = 268;
        public static final UnicodeBlock MASARAM_GONDI;
        public static final int MASARAM_GONDI_ID = 276;
        public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS;
        public static final int MATHEMATICAL_ALPHANUMERIC_SYMBOLS_ID = 93;
        public static final UnicodeBlock MATHEMATICAL_OPERATORS;
        public static final int MATHEMATICAL_OPERATORS_ID = 47;
        public static final UnicodeBlock MAYAN_NUMERALS;
        public static final int MAYAN_NUMERALS_ID = 288;
        public static final UnicodeBlock MEDEFAIDRIN;
        public static final int MEDEFAIDRIN_ID = 289;
        public static final UnicodeBlock MEETEI_MAYEK;
        public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS;
        public static final int MEETEI_MAYEK_EXTENSIONS_ID = 213;
        public static final int MEETEI_MAYEK_ID = 184;
        public static final UnicodeBlock MENDE_KIKAKUI;
        public static final int MENDE_KIKAKUI_ID = 235;
        public static final UnicodeBlock MEROITIC_CURSIVE;
        public static final int MEROITIC_CURSIVE_ID = 214;
        public static final UnicodeBlock MEROITIC_HIEROGLYPHS;
        public static final int MEROITIC_HIEROGLYPHS_ID = 215;
        public static final UnicodeBlock MIAO;
        public static final int MIAO_ID = 216;
        public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A;
        public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A_ID = 102;
        public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B;
        public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B_ID = 105;
        public static final UnicodeBlock MISCELLANEOUS_SYMBOLS;
        public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS;
        public static final int MISCELLANEOUS_SYMBOLS_AND_ARROWS_ID = 115;
        public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS;
        public static final int MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS_ID = 205;
        public static final int MISCELLANEOUS_SYMBOLS_ID = 55;
        public static final UnicodeBlock MISCELLANEOUS_TECHNICAL;
        public static final int MISCELLANEOUS_TECHNICAL_ID = 48;
        public static final UnicodeBlock MODI;
        public static final UnicodeBlock MODIFIER_TONE_LETTERS;
        public static final int MODIFIER_TONE_LETTERS_ID = 138;
        public static final int MODI_ID = 236;
        public static final UnicodeBlock MONGOLIAN;
        public static final int MONGOLIAN_ID = 37;
        public static final UnicodeBlock MONGOLIAN_SUPPLEMENT;
        public static final int MONGOLIAN_SUPPLEMENT_ID = 269;
        public static final UnicodeBlock MRO;
        public static final int MRO_ID = 237;
        public static final UnicodeBlock MULTANI;
        public static final int MULTANI_ID = 259;
        public static final UnicodeBlock MUSICAL_SYMBOLS;
        public static final int MUSICAL_SYMBOLS_ID = 92;
        public static final UnicodeBlock MYANMAR;
        public static final UnicodeBlock MYANMAR_EXTENDED_A;
        public static final int MYANMAR_EXTENDED_A_ID = 182;
        public static final UnicodeBlock MYANMAR_EXTENDED_B;
        public static final int MYANMAR_EXTENDED_B_ID = 238;
        public static final int MYANMAR_ID = 28;
        public static final UnicodeBlock NABATAEAN;
        public static final int NABATAEAN_ID = 239;
        public static final UnicodeBlock NAG_MUNDARI;
        public static final int NAG_MUNDARI_ID = 327;
        public static final UnicodeBlock NANDINAGARI;
        public static final int NANDINAGARI_ID = 294;
        public static final UnicodeBlock NEWA;
        public static final int NEWA_ID = 270;
        public static final UnicodeBlock NEW_TAI_LUE;
        public static final int NEW_TAI_LUE_ID = 139;
        public static final UnicodeBlock NKO;
        public static final int NKO_ID = 146;
        public static final UnicodeBlock NO_BLOCK;
        public static final UnicodeBlock NUMBER_FORMS;
        public static final int NUMBER_FORMS_ID = 45;
        public static final UnicodeBlock NUSHU;
        public static final int NUSHU_ID = 277;
        public static final UnicodeBlock NYIAKENG_PUACHUE_HMONG;
        public static final int NYIAKENG_PUACHUE_HMONG_ID = 295;
        public static final UnicodeBlock OGHAM;
        public static final int OGHAM_ID = 34;
        public static final UnicodeBlock OLD_HUNGARIAN;
        public static final int OLD_HUNGARIAN_ID = 260;
        public static final UnicodeBlock OLD_ITALIC;
        public static final int OLD_ITALIC_ID = 88;
        public static final UnicodeBlock OLD_NORTH_ARABIAN;
        public static final int OLD_NORTH_ARABIAN_ID = 240;
        public static final UnicodeBlock OLD_PERMIC;
        public static final int OLD_PERMIC_ID = 241;
        public static final UnicodeBlock OLD_PERSIAN;
        public static final int OLD_PERSIAN_ID = 140;
        public static final UnicodeBlock OLD_SOGDIAN;
        public static final int OLD_SOGDIAN_ID = 290;
        public static final UnicodeBlock OLD_SOUTH_ARABIAN;
        public static final int OLD_SOUTH_ARABIAN_ID = 187;
        public static final UnicodeBlock OLD_TURKIC;
        public static final int OLD_TURKIC_ID = 191;
        public static final UnicodeBlock OLD_UYGHUR;
        public static final int OLD_UYGHUR_ID = 315;
        public static final UnicodeBlock OL_CHIKI;
        public static final int OL_CHIKI_ID = 157;
        public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
        public static final int OPTICAL_CHARACTER_RECOGNITION_ID = 50;
        public static final UnicodeBlock ORIYA;
        public static final int ORIYA_ID = 19;
        public static final UnicodeBlock ORNAMENTAL_DINGBATS;
        public static final int ORNAMENTAL_DINGBATS_ID = 242;
        public static final UnicodeBlock OSAGE;
        public static final int OSAGE_ID = 271;
        public static final UnicodeBlock OSMANYA;
        public static final int OSMANYA_ID = 122;
        public static final UnicodeBlock OTTOMAN_SIYAQ_NUMBERS;
        public static final int OTTOMAN_SIYAQ_NUMBERS_ID = 296;
        public static final UnicodeBlock PAHAWH_HMONG;
        public static final int PAHAWH_HMONG_ID = 243;
        public static final UnicodeBlock PALMYRENE;
        public static final int PALMYRENE_ID = 244;
        public static final UnicodeBlock PAU_CIN_HAU;
        public static final int PAU_CIN_HAU_ID = 245;
        public static final UnicodeBlock PHAGS_PA;
        public static final int PHAGS_PA_ID = 150;
        public static final UnicodeBlock PHAISTOS_DISC;
        public static final int PHAISTOS_DISC_ID = 166;
        public static final UnicodeBlock PHOENICIAN;
        public static final int PHOENICIAN_ID = 151;
        public static final UnicodeBlock PHONETIC_EXTENSIONS;
        public static final int PHONETIC_EXTENSIONS_ID = 114;
        public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT;
        public static final int PHONETIC_EXTENSIONS_SUPPLEMENT_ID = 141;
        public static final UnicodeBlock PLAYING_CARDS;
        public static final int PLAYING_CARDS_ID = 204;
        public static final UnicodeBlock PRIVATE_USE;
        public static final UnicodeBlock PRIVATE_USE_AREA;
        public static final int PRIVATE_USE_AREA_ID = 78;
        public static final int PRIVATE_USE_ID = 78;
        public static final UnicodeBlock PSALTER_PAHLAVI;
        public static final int PSALTER_PAHLAVI_ID = 246;
        public static final UnicodeBlock REJANG;
        public static final int REJANG_ID = 163;
        public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS;
        public static final int RUMI_NUMERAL_SYMBOLS_ID = 192;
        public static final UnicodeBlock RUNIC;
        public static final int RUNIC_ID = 35;
        public static final UnicodeBlock SAMARITAN;
        public static final int SAMARITAN_ID = 172;
        public static final UnicodeBlock SAURASHTRA;
        public static final int SAURASHTRA_ID = 161;
        public static final UnicodeBlock SHARADA;
        public static final int SHARADA_ID = 217;
        public static final UnicodeBlock SHAVIAN;
        public static final int SHAVIAN_ID = 121;
        public static final UnicodeBlock SHORTHAND_FORMAT_CONTROLS;
        public static final int SHORTHAND_FORMAT_CONTROLS_ID = 247;
        public static final UnicodeBlock SIDDHAM;
        public static final int SIDDHAM_ID = 248;
        public static final UnicodeBlock SINHALA;
        public static final UnicodeBlock SINHALA_ARCHAIC_NUMBERS;
        public static final int SINHALA_ARCHAIC_NUMBERS_ID = 249;
        public static final int SINHALA_ID = 24;
        public static final UnicodeBlock SMALL_FORM_VARIANTS;
        public static final int SMALL_FORM_VARIANTS_ID = 84;
        public static final UnicodeBlock SMALL_KANA_EXTENSION;
        public static final int SMALL_KANA_EXTENSION_ID = 297;
        public static final UnicodeBlock SOGDIAN;
        public static final int SOGDIAN_ID = 291;
        public static final UnicodeBlock SORA_SOMPENG;
        public static final int SORA_SOMPENG_ID = 218;
        public static final UnicodeBlock SOYOMBO;
        public static final int SOYOMBO_ID = 278;
        public static final UnicodeBlock SPACING_MODIFIER_LETTERS;
        public static final int SPACING_MODIFIER_LETTERS_ID = 6;
        public static final UnicodeBlock SPECIALS;
        public static final int SPECIALS_ID = 86;
        public static final UnicodeBlock SUNDANESE;
        public static final int SUNDANESE_ID = 155;
        public static final UnicodeBlock SUNDANESE_SUPPLEMENT;
        public static final int SUNDANESE_SUPPLEMENT_ID = 219;
        public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
        public static final int SUPERSCRIPTS_AND_SUBSCRIPTS_ID = 41;
        public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A;
        public static final int SUPPLEMENTAL_ARROWS_A_ID = 103;
        public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B;
        public static final int SUPPLEMENTAL_ARROWS_B_ID = 104;
        public static final UnicodeBlock SUPPLEMENTAL_ARROWS_C;
        public static final int SUPPLEMENTAL_ARROWS_C_ID = 250;
        public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS;
        public static final int SUPPLEMENTAL_MATHEMATICAL_OPERATORS_ID = 106;
        public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION;
        public static final int SUPPLEMENTAL_PUNCTUATION_ID = 142;
        public static final UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS;
        public static final int SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS_ID = 261;
        public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A;
        public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_A_ID = 109;
        public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B;
        public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_B_ID = 110;
        public static final UnicodeBlock SUTTON_SIGNWRITING;
        public static final int SUTTON_SIGNWRITING_ID = 262;
        public static final UnicodeBlock SYLOTI_NAGRI;
        public static final int SYLOTI_NAGRI_ID = 143;
        public static final UnicodeBlock SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A;
        public static final int SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A_ID = 298;
        public static final UnicodeBlock SYMBOLS_FOR_LEGACY_COMPUTING;
        public static final int SYMBOLS_FOR_LEGACY_COMPUTING_ID = 306;
        public static final UnicodeBlock SYRIAC;
        public static final int SYRIAC_ID = 13;
        public static final UnicodeBlock SYRIAC_SUPPLEMENT;
        public static final int SYRIAC_SUPPLEMENT_ID = 279;
        public static final UnicodeBlock TAGALOG;
        public static final int TAGALOG_ID = 98;
        public static final UnicodeBlock TAGBANWA;
        public static final int TAGBANWA_ID = 101;
        public static final UnicodeBlock TAGS;
        public static final int TAGS_ID = 96;
        public static final UnicodeBlock TAI_LE;
        public static final int TAI_LE_ID = 112;
        public static final UnicodeBlock TAI_THAM;
        public static final int TAI_THAM_ID = 174;
        public static final UnicodeBlock TAI_VIET;
        public static final int TAI_VIET_ID = 183;
        public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS;
        public static final int TAI_XUAN_JING_SYMBOLS_ID = 124;
        public static final UnicodeBlock TAKRI;
        public static final int TAKRI_ID = 220;
        public static final UnicodeBlock TAMIL;
        public static final int TAMIL_ID = 20;
        public static final UnicodeBlock TAMIL_SUPPLEMENT;
        public static final int TAMIL_SUPPLEMENT_ID = 299;
        public static final UnicodeBlock TANGSA;
        public static final int TANGSA_ID = 316;
        public static final UnicodeBlock TANGUT;
        public static final UnicodeBlock TANGUT_COMPONENTS;
        public static final int TANGUT_COMPONENTS_ID = 273;
        public static final int TANGUT_ID = 272;
        public static final UnicodeBlock TANGUT_SUPPLEMENT;
        public static final int TANGUT_SUPPLEMENT_ID = 307;
        public static final UnicodeBlock TELUGU;
        public static final int TELUGU_ID = 21;
        public static final UnicodeBlock THAANA;
        public static final int THAANA_ID = 14;
        public static final UnicodeBlock THAI;
        public static final int THAI_ID = 25;
        public static final UnicodeBlock TIBETAN;
        public static final int TIBETAN_ID = 27;
        public static final UnicodeBlock TIFINAGH;
        public static final int TIFINAGH_ID = 144;
        public static final UnicodeBlock TIRHUTA;
        public static final int TIRHUTA_ID = 251;
        public static final UnicodeBlock TOTO;
        public static final int TOTO_ID = 317;
        public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS;
        public static final int TRANSPORT_AND_MAP_SYMBOLS_ID = 207;
        public static final UnicodeBlock UGARITIC;
        public static final int UGARITIC_ID = 120;
        public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
        public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED;
        public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_A;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_A_ID = 318;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_ID = 173;
        public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_ID = 33;
        public static final UnicodeBlock VAI;
        public static final int VAI_ID = 159;
        public static final UnicodeBlock VARIATION_SELECTORS;
        public static final int VARIATION_SELECTORS_ID = 108;
        public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT;
        public static final int VARIATION_SELECTORS_SUPPLEMENT_ID = 125;
        public static final UnicodeBlock VEDIC_EXTENSIONS;
        public static final int VEDIC_EXTENSIONS_ID = 175;
        public static final UnicodeBlock VERTICAL_FORMS;
        public static final int VERTICAL_FORMS_ID = 145;
        public static final UnicodeBlock VITHKUQI;
        public static final int VITHKUQI_ID = 319;
        public static final UnicodeBlock WANCHO;
        public static final int WANCHO_ID = 300;
        public static final UnicodeBlock WARANG_CITI;
        public static final int WARANG_CITI_ID = 252;
        public static final UnicodeBlock YEZIDI;
        public static final int YEZIDI_ID = 308;
        public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS;
        public static final int YIJING_HEXAGRAM_SYMBOLS_ID = 116;
        public static final UnicodeBlock YI_RADICALS;
        public static final int YI_RADICALS_ID = 73;
        public static final UnicodeBlock YI_SYLLABLES;
        public static final int YI_SYLLABLES_ID = 72;
        public static final UnicodeBlock ZANABAZAR_SQUARE;
        public static final int ZANABAZAR_SQUARE_ID = 280;
        public static final UnicodeBlock ZNAMENNY_MUSICAL_NOTATION;
        public static final int ZNAMENNY_MUSICAL_NOTATION_ID = 320;
        
        UnicodeBlock() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public static UnicodeBlock getInstance(final int id) {
            throw new RuntimeException("Stub!");
        }
        
        public static UnicodeBlock of(final int ch) {
            throw new RuntimeException("Stub!");
        }
        
        public static UnicodeBlock forName(final String blockName) {
            throw new RuntimeException("Stub!");
        }
        
        public int getID() {
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
            ARABIC_EXTENDED_B = null;
            ARABIC_EXTENDED_C = null;
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
            CJK_UNIFIED_IDEOGRAPHS_EXTENSION_H = null;
            CJK_UNIFIED_IDEOGRAPHS_EXTENSION_I = null;
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
            CYPRO_MINOAN = null;
            CYRILLIC = null;
            CYRILLIC_EXTENDED_A = null;
            CYRILLIC_EXTENDED_B = null;
            CYRILLIC_EXTENDED_C = null;
            CYRILLIC_EXTENDED_D = null;
            CYRILLIC_SUPPLEMENT = null;
            CYRILLIC_SUPPLEMENTARY = null;
            DESERET = null;
            DEVANAGARI = null;
            DEVANAGARI_EXTENDED = null;
            DEVANAGARI_EXTENDED_A = null;
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
            ETHIOPIC_EXTENDED_B = null;
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
            INVALID_CODE = null;
            IPA_EXTENSIONS = null;
            JAVANESE = null;
            KAITHI = null;
            KAKTOVIK_NUMERALS = null;
            KANA_EXTENDED_A = null;
            KANA_EXTENDED_B = null;
            KANA_SUPPLEMENT = null;
            KANBUN = null;
            KANGXI_RADICALS = null;
            KANNADA = null;
            KATAKANA = null;
            KATAKANA_PHONETIC_EXTENSIONS = null;
            KAWI = null;
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
            LATIN_EXTENDED_F = null;
            LATIN_EXTENDED_G = null;
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
            NAG_MUNDARI = null;
            NANDINAGARI = null;
            NEWA = null;
            NEW_TAI_LUE = null;
            NKO = null;
            NO_BLOCK = null;
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
            OLD_UYGHUR = null;
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
            PRIVATE_USE = null;
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
            TANGSA = null;
            TANGUT = null;
            TANGUT_COMPONENTS = null;
            TANGUT_SUPPLEMENT = null;
            TELUGU = null;
            THAANA = null;
            THAI = null;
            TIBETAN = null;
            TIFINAGH = null;
            TIRHUTA = null;
            TOTO = null;
            TRANSPORT_AND_MAP_SYMBOLS = null;
            UGARITIC = null;
            UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;
            UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null;
            UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_A = null;
            VAI = null;
            VARIATION_SELECTORS = null;
            VARIATION_SELECTORS_SUPPLEMENT = null;
            VEDIC_EXTENSIONS = null;
            VERTICAL_FORMS = null;
            VITHKUQI = null;
            WANCHO = null;
            WARANG_CITI = null;
            YEZIDI = null;
            YIJING_HEXAGRAM_SYMBOLS = null;
            YI_RADICALS = null;
            YI_SYLLABLES = null;
            ZANABAZAR_SQUARE = null;
            ZNAMENNY_MUSICAL_NOTATION = null;
        }
    }
    
    public interface WordBreak
    {
        public static final int ALETTER = 1;
        public static final int CR = 8;
        public static final int DOUBLE_QUOTE = 16;
        public static final int EXTEND = 9;
        public static final int EXTENDNUMLET = 7;
        public static final int E_BASE = 17;
        public static final int E_BASE_GAZ = 18;
        public static final int E_MODIFIER = 19;
        public static final int FORMAT = 2;
        public static final int GLUE_AFTER_ZWJ = 20;
        public static final int HEBREW_LETTER = 14;
        public static final int KATAKANA = 3;
        public static final int LF = 10;
        public static final int MIDLETTER = 4;
        public static final int MIDNUM = 5;
        public static final int MIDNUMLET = 11;
        public static final int NEWLINE = 12;
        public static final int NUMERIC = 6;
        public static final int OTHER = 0;
        public static final int REGIONAL_INDICATOR = 13;
        public static final int SINGLE_QUOTE = 15;
        public static final int WSEGSPACE = 22;
        public static final int ZWJ = 21;
    }
    
    public interface VerticalOrientation
    {
        public static final int ROTATED = 0;
        public static final int TRANSFORMED_ROTATED = 1;
        public static final int TRANSFORMED_UPRIGHT = 2;
        public static final int UPRIGHT = 3;
    }
    
    public interface SentenceBreak
    {
        public static final int ATERM = 1;
        public static final int CLOSE = 2;
        public static final int CR = 11;
        public static final int EXTEND = 12;
        public static final int FORMAT = 3;
        public static final int LF = 13;
        public static final int LOWER = 4;
        public static final int NUMERIC = 5;
        public static final int OLETTER = 6;
        public static final int OTHER = 0;
        public static final int SCONTINUE = 14;
        public static final int SEP = 7;
        public static final int SP = 8;
        public static final int STERM = 9;
        public static final int UPPER = 10;
    }
    
    public interface NumericType
    {
        public static final int DECIMAL = 1;
        public static final int DIGIT = 2;
        public static final int NONE = 0;
        public static final int NUMERIC = 3;
    }
    
    public interface LineBreak
    {
        public static final int AKSARA = 43;
        public static final int AKSARA_PREBASE = 44;
        public static final int AKSARA_START = 45;
        public static final int ALPHABETIC = 2;
        public static final int AMBIGUOUS = 1;
        public static final int BREAK_AFTER = 4;
        public static final int BREAK_BEFORE = 5;
        public static final int BREAK_BOTH = 3;
        public static final int BREAK_SYMBOLS = 27;
        public static final int CARRIAGE_RETURN = 10;
        public static final int CLOSE_PARENTHESIS = 36;
        public static final int CLOSE_PUNCTUATION = 8;
        public static final int COMBINING_MARK = 9;
        public static final int COMPLEX_CONTEXT = 24;
        public static final int CONDITIONAL_JAPANESE_STARTER = 37;
        public static final int CONTINGENT_BREAK = 7;
        public static final int EXCLAMATION = 11;
        public static final int E_BASE = 40;
        public static final int E_MODIFIER = 41;
        public static final int GLUE = 12;
        public static final int H2 = 31;
        public static final int H3 = 32;
        public static final int HEBREW_LETTER = 38;
        public static final int HYPHEN = 13;
        public static final int IDEOGRAPHIC = 14;
        public static final int INFIX_NUMERIC = 16;
        public static final int INSEPARABLE = 15;
        public static final int INSEPERABLE = 15;
        public static final int JL = 33;
        public static final int JT = 34;
        public static final int JV = 35;
        public static final int LINE_FEED = 17;
        public static final int MANDATORY_BREAK = 6;
        public static final int NEXT_LINE = 29;
        public static final int NONSTARTER = 18;
        public static final int NUMERIC = 19;
        public static final int OPEN_PUNCTUATION = 20;
        public static final int POSTFIX_NUMERIC = 21;
        public static final int PREFIX_NUMERIC = 22;
        public static final int QUOTATION = 23;
        public static final int REGIONAL_INDICATOR = 39;
        public static final int SPACE = 26;
        public static final int SURROGATE = 25;
        public static final int UNKNOWN = 0;
        public static final int VIRAMA = 47;
        public static final int VIRAMA_FINAL = 46;
        public static final int WORD_JOINER = 30;
        public static final int ZWJ = 42;
        public static final int ZWSPACE = 28;
    }
    
    public interface JoiningType
    {
        public static final int DUAL_JOINING = 2;
        public static final int JOIN_CAUSING = 1;
        public static final int LEFT_JOINING = 3;
        public static final int NON_JOINING = 0;
        public static final int RIGHT_JOINING = 4;
        public static final int TRANSPARENT = 5;
    }
    
    public interface JoiningGroup
    {
        public static final int AFRICAN_FEH = 86;
        public static final int AFRICAN_NOON = 87;
        public static final int AFRICAN_QAF = 88;
        public static final int AIN = 1;
        public static final int ALAPH = 2;
        public static final int ALEF = 3;
        public static final int BEH = 4;
        public static final int BETH = 5;
        public static final int BURUSHASKI_YEH_BARREE = 54;
        public static final int DAL = 6;
        public static final int DALATH_RISH = 7;
        public static final int E = 8;
        public static final int FARSI_YEH = 55;
        public static final int FE = 51;
        public static final int FEH = 9;
        public static final int FINAL_SEMKATH = 10;
        public static final int GAF = 11;
        public static final int GAMAL = 12;
        public static final int HAH = 13;
        public static final int HAMZA_ON_HEH_GOAL = 14;
        public static final int HANIFI_ROHINGYA_KINNA_YA = 100;
        public static final int HANIFI_ROHINGYA_PA = 101;
        public static final int HE = 15;
        public static final int HEH = 16;
        public static final int HEH_GOAL = 17;
        public static final int HETH = 18;
        public static final int KAF = 19;
        public static final int KAPH = 20;
        public static final int KHAPH = 52;
        public static final int KNOTTED_HEH = 21;
        public static final int LAM = 22;
        public static final int LAMADH = 23;
        public static final int MALAYALAM_BHA = 89;
        public static final int MALAYALAM_JA = 90;
        public static final int MALAYALAM_LLA = 91;
        public static final int MALAYALAM_LLLA = 92;
        public static final int MALAYALAM_NGA = 93;
        public static final int MALAYALAM_NNA = 94;
        public static final int MALAYALAM_NNNA = 95;
        public static final int MALAYALAM_NYA = 96;
        public static final int MALAYALAM_RA = 97;
        public static final int MALAYALAM_SSA = 98;
        public static final int MALAYALAM_TTA = 99;
        public static final int MANICHAEAN_ALEPH = 58;
        public static final int MANICHAEAN_AYIN = 59;
        public static final int MANICHAEAN_BETH = 60;
        public static final int MANICHAEAN_DALETH = 61;
        public static final int MANICHAEAN_DHAMEDH = 62;
        public static final int MANICHAEAN_FIVE = 63;
        public static final int MANICHAEAN_GIMEL = 64;
        public static final int MANICHAEAN_HETH = 65;
        public static final int MANICHAEAN_HUNDRED = 66;
        public static final int MANICHAEAN_KAPH = 67;
        public static final int MANICHAEAN_LAMEDH = 68;
        public static final int MANICHAEAN_MEM = 69;
        public static final int MANICHAEAN_NUN = 70;
        public static final int MANICHAEAN_ONE = 71;
        public static final int MANICHAEAN_PE = 72;
        public static final int MANICHAEAN_QOPH = 73;
        public static final int MANICHAEAN_RESH = 74;
        public static final int MANICHAEAN_SADHE = 75;
        public static final int MANICHAEAN_SAMEKH = 76;
        public static final int MANICHAEAN_TAW = 77;
        public static final int MANICHAEAN_TEN = 78;
        public static final int MANICHAEAN_TETH = 79;
        public static final int MANICHAEAN_THAMEDH = 80;
        public static final int MANICHAEAN_TWENTY = 81;
        public static final int MANICHAEAN_WAW = 82;
        public static final int MANICHAEAN_YODH = 83;
        public static final int MANICHAEAN_ZAYIN = 84;
        public static final int MEEM = 24;
        public static final int MIM = 25;
        public static final int NOON = 26;
        public static final int NO_JOINING_GROUP = 0;
        public static final int NUN = 27;
        public static final int NYA = 56;
        public static final int PE = 28;
        public static final int QAF = 29;
        public static final int QAPH = 30;
        public static final int REH = 31;
        public static final int REVERSED_PE = 32;
        public static final int ROHINGYA_YEH = 57;
        public static final int SAD = 33;
        public static final int SADHE = 34;
        public static final int SEEN = 35;
        public static final int SEMKATH = 36;
        public static final int SHIN = 37;
        public static final int STRAIGHT_WAW = 85;
        public static final int SWASH_KAF = 38;
        public static final int SYRIAC_WAW = 39;
        public static final int TAH = 40;
        public static final int TAW = 41;
        public static final int TEH_MARBUTA = 42;
        public static final int TEH_MARBUTA_GOAL = 14;
        public static final int TETH = 43;
        public static final int THIN_YEH = 102;
        public static final int VERTICAL_TAIL = 103;
        public static final int WAW = 44;
        public static final int YEH = 45;
        public static final int YEH_BARREE = 46;
        public static final int YEH_WITH_TAIL = 47;
        public static final int YUDH = 48;
        public static final int YUDH_HE = 49;
        public static final int ZAIN = 50;
        public static final int ZHAIN = 53;
    }
    
    public interface IndicSyllabicCategory
    {
        public static final int AVAGRAHA = 1;
        public static final int BINDU = 2;
        public static final int BRAHMI_JOINING_NUMBER = 3;
        public static final int CANTILLATION_MARK = 4;
        public static final int CONSONANT = 5;
        public static final int CONSONANT_DEAD = 6;
        public static final int CONSONANT_FINAL = 7;
        public static final int CONSONANT_HEAD_LETTER = 8;
        public static final int CONSONANT_INITIAL_POSTFIXED = 9;
        public static final int CONSONANT_KILLER = 10;
        public static final int CONSONANT_MEDIAL = 11;
        public static final int CONSONANT_PLACEHOLDER = 12;
        public static final int CONSONANT_PRECEDING_REPHA = 13;
        public static final int CONSONANT_PREFIXED = 14;
        public static final int CONSONANT_SUBJOINED = 15;
        public static final int CONSONANT_SUCCEEDING_REPHA = 16;
        public static final int CONSONANT_WITH_STACKER = 17;
        public static final int GEMINATION_MARK = 18;
        public static final int INVISIBLE_STACKER = 19;
        public static final int JOINER = 20;
        public static final int MODIFYING_LETTER = 21;
        public static final int NON_JOINER = 22;
        public static final int NUKTA = 23;
        public static final int NUMBER = 24;
        public static final int NUMBER_JOINER = 25;
        public static final int OTHER = 0;
        public static final int PURE_KILLER = 26;
        public static final int REGISTER_SHIFTER = 27;
        public static final int SYLLABLE_MODIFIER = 28;
        public static final int TONE_LETTER = 29;
        public static final int TONE_MARK = 30;
        public static final int VIRAMA = 31;
        public static final int VISARGA = 32;
        public static final int VOWEL = 33;
        public static final int VOWEL_DEPENDENT = 34;
        public static final int VOWEL_INDEPENDENT = 35;
    }
    
    public interface IndicPositionalCategory
    {
        public static final int BOTTOM = 1;
        public static final int BOTTOM_AND_LEFT = 2;
        public static final int BOTTOM_AND_RIGHT = 3;
        public static final int LEFT = 4;
        public static final int LEFT_AND_RIGHT = 5;
        public static final int NA = 0;
        public static final int OVERSTRUCK = 6;
        public static final int RIGHT = 7;
        public static final int TOP = 8;
        public static final int TOP_AND_BOTTOM = 9;
        public static final int TOP_AND_BOTTOM_AND_LEFT = 15;
        public static final int TOP_AND_BOTTOM_AND_RIGHT = 10;
        public static final int TOP_AND_LEFT = 11;
        public static final int TOP_AND_LEFT_AND_RIGHT = 12;
        public static final int TOP_AND_RIGHT = 13;
        public static final int VISUAL_ORDER_LEFT = 14;
    }
    
    public interface HangulSyllableType
    {
        public static final int LEADING_JAMO = 1;
        public static final int LVT_SYLLABLE = 5;
        public static final int LV_SYLLABLE = 4;
        public static final int NOT_APPLICABLE = 0;
        public static final int TRAILING_JAMO = 3;
        public static final int VOWEL_JAMO = 2;
    }
    
    public interface GraphemeClusterBreak
    {
        public static final int CONTROL = 1;
        public static final int CR = 2;
        public static final int EXTEND = 3;
        public static final int E_BASE = 13;
        public static final int E_BASE_GAZ = 14;
        public static final int E_MODIFIER = 15;
        public static final int GLUE_AFTER_ZWJ = 16;
        public static final int L = 4;
        public static final int LF = 5;
        public static final int LV = 6;
        public static final int LVT = 7;
        public static final int OTHER = 0;
        public static final int PREPEND = 11;
        public static final int REGIONAL_INDICATOR = 12;
        public static final int SPACING_MARK = 10;
        public static final int T = 8;
        public static final int V = 9;
        public static final int ZWJ = 17;
    }
    
    public interface EastAsianWidth
    {
        public static final int AMBIGUOUS = 1;
        public static final int FULLWIDTH = 3;
        public static final int HALFWIDTH = 2;
        public static final int NARROW = 4;
        public static final int NEUTRAL = 0;
        public static final int WIDE = 5;
    }
    
    public interface DecompositionType
    {
        public static final int CANONICAL = 1;
        public static final int CIRCLE = 3;
        public static final int COMPAT = 2;
        public static final int FINAL = 4;
        public static final int FONT = 5;
        public static final int FRACTION = 6;
        public static final int INITIAL = 7;
        public static final int ISOLATED = 8;
        public static final int MEDIAL = 9;
        public static final int NARROW = 10;
        public static final int NOBREAK = 11;
        public static final int NONE = 0;
        public static final int SMALL = 12;
        public static final int SQUARE = 13;
        public static final int SUB = 14;
        public static final int SUPER = 15;
        public static final int VERTICAL = 16;
        public static final int WIDE = 17;
    }
    
    public interface BidiPairedBracketType
    {
        public static final int CLOSE = 2;
        public static final int NONE = 0;
        public static final int OPEN = 1;
    }
}
