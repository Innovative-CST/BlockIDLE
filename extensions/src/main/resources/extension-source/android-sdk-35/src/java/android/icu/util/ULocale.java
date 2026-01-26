package android.icu.util;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Locale;
import java.io.Serializable;

public final class ULocale implements Serializable, Comparable<ULocale>
{
    public static final ULocale CANADA;
    public static final ULocale CANADA_FRENCH;
    public static final ULocale CHINA;
    public static final ULocale CHINESE;
    public static final ULocale ENGLISH;
    public static final ULocale FRANCE;
    public static final ULocale FRENCH;
    public static final ULocale GERMAN;
    public static final ULocale GERMANY;
    public static final ULocale ITALIAN;
    public static final ULocale ITALY;
    public static final ULocale JAPAN;
    public static final ULocale JAPANESE;
    public static final ULocale KOREA;
    public static final ULocale KOREAN;
    public static final ULocale PRC;
    public static final char PRIVATE_USE_EXTENSION = 'x';
    public static final ULocale ROOT;
    public static final ULocale SIMPLIFIED_CHINESE;
    public static final ULocale TAIWAN;
    public static final ULocale TRADITIONAL_CHINESE;
    public static final ULocale UK;
    public static final char UNICODE_LOCALE_EXTENSION = 'u';
    public static final ULocale US;
    
    public ULocale(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale(final String a, final String b) {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale(final String a, final String b, final String c) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale forLocale(final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale createCanonical(final String nonCanonicalID) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale createCanonical(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public Locale toLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale getDefault(final Category category) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final ULocale other) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static Collection<ULocale> getAvailableLocalesByType(final AvailableType type) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getISOCountries() {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getISOLanguages() {
        throw new RuntimeException("Stub!");
    }
    
    public String getLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getLanguage(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getScript() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getScript(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCountry() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getCountry(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getVariant() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getVariant(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getFallback(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale getFallback() {
        throw new RuntimeException("Stub!");
    }
    
    public String getBaseName() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getBaseName(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getName(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator<String> getKeywords() {
        throw new RuntimeException("Stub!");
    }
    
    public static Iterator<String> getKeywords(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getKeywordValue(final String keywordName) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getKeywordValue(final String localeID, final String keywordName) {
        throw new RuntimeException("Stub!");
    }
    
    public static String canonicalize(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale setKeywordValue(final String keyword, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public static String setKeywordValue(final String localeID, final String keyword, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public String getISO3Language() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getISO3Language(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public String getISO3Country() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getISO3Country(final String localeID) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRightToLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayLanguage(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayLanguage(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayLanguage(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayLanguageWithDialect() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayLanguageWithDialect(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayLanguageWithDialect(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayLanguageWithDialect(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayScript() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayScript(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayScript(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayScript(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayCountry() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayCountry(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayCountry(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayCountry(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayVariant() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayVariant(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayVariant(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayVariant(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayKeyword(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayKeyword(final String keyword, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayKeyword(final String keyword, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayKeywordValue(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayKeywordValue(final String keyword, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayKeywordValue(final String localeID, final String keyword, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayKeywordValue(final String localeID, final String keyword, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayNameWithDialect() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayNameWithDialect(final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayNameWithDialect(final String localeID, final String displayLocaleID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayNameWithDialect(final String localeID, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCharacterOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public String getLineOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale acceptLanguage(final String acceptLanguageList, final ULocale[] availableLocales, final boolean[] fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale acceptLanguage(final ULocale[] acceptLanguageList, final ULocale[] availableLocales, final boolean[] fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale acceptLanguage(final String acceptLanguageList, final boolean[] fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale acceptLanguage(final ULocale[] acceptLanguageList, final boolean[] fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale addLikelySubtags(final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale minimizeSubtags(final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public String getExtension(final char key) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Character> getExtensionKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getUnicodeLocaleAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public String getUnicodeLocaleType(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getUnicodeLocaleKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public String toLanguageTag() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale forLanguageTag(final String languageTag) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toUnicodeLocaleKey(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toUnicodeLocaleType(final String keyword, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toLegacyKey(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toLegacyType(final String keyword, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CANADA = null;
        CANADA_FRENCH = null;
        CHINA = null;
        CHINESE = null;
        ENGLISH = null;
        FRANCE = null;
        FRENCH = null;
        GERMAN = null;
        GERMANY = null;
        ITALIAN = null;
        ITALY = null;
        JAPAN = null;
        JAPANESE = null;
        KOREA = null;
        KOREAN = null;
        PRC = null;
        ROOT = null;
        SIMPLIFIED_CHINESE = null;
        TAIWAN = null;
        TRADITIONAL_CHINESE = null;
        UK = null;
        US = null;
    }
    
    public enum AvailableType
    {
        DEFAULT, 
        ONLY_LEGACY_ALIASES, 
        WITH_LEGACY_ALIASES;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLocale(final ULocale locale) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLanguageTag(final String languageTag) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLanguage(final String language) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setScript(final String script) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRegion(final String region) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setVariant(final String variant) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtension(final char key, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setUnicodeLocaleKeyword(final String key, final String type) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addUnicodeLocaleAttribute(final String attribute) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder removeUnicodeLocaleAttribute(final String attribute) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder clear() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder clearExtensions() {
            throw new RuntimeException("Stub!");
        }
        
        public ULocale build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum Category
    {
        DISPLAY, 
        FORMAT;
    }
}
