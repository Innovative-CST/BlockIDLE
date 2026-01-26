package java.util;

import java.io.Serializable;

public final class Locale implements Cloneable, Serializable {
	@RecentlyNonNull
	public static final Locale CANADA;
	@RecentlyNonNull
	public static final Locale CANADA_FRENCH;
	@RecentlyNonNull
	public static final Locale CHINA;
	@RecentlyNonNull
	public static final Locale CHINESE;
	@RecentlyNonNull
	public static final Locale ENGLISH;
	@RecentlyNonNull
	public static final Locale FRANCE;
	@RecentlyNonNull
	public static final Locale FRENCH;
	@RecentlyNonNull
	public static final Locale GERMAN;
	@RecentlyNonNull
	public static final Locale GERMANY;
	@RecentlyNonNull
	public static final Locale ITALIAN;
	@RecentlyNonNull
	public static final Locale ITALY;
	@RecentlyNonNull
	public static final Locale JAPAN;
	@RecentlyNonNull
	public static final Locale JAPANESE;
	@RecentlyNonNull
	public static final Locale KOREA;
	@RecentlyNonNull
	public static final Locale KOREAN;
	@RecentlyNonNull
	public static final Locale PRC;
	public static final char PRIVATE_USE_EXTENSION = 'x';
	@RecentlyNonNull
	public static final Locale ROOT;
	@RecentlyNonNull
	public static final Locale SIMPLIFIED_CHINESE;
	@RecentlyNonNull
	public static final Locale TAIWAN;
	@RecentlyNonNull
	public static final Locale TRADITIONAL_CHINESE;
	@RecentlyNonNull
	public static final Locale UK;
	public static final char UNICODE_LOCALE_EXTENSION = 'u';
	@RecentlyNonNull
	public static final Locale US;

	public Locale(@RecentlyNonNull final String language, @RecentlyNonNull final String country,
			@RecentlyNonNull final String variant) {
		throw new RuntimeException("Stub!");
	}

	public Locale(@RecentlyNonNull final String language, @RecentlyNonNull final String country) {
		throw new RuntimeException("Stub!");
	}

	public Locale(@RecentlyNonNull final String language) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale getDefault() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale getDefault(@RecentlyNonNull final Category category) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(@RecentlyNonNull final Locale newLocale) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(@RecentlyNonNull final Category category,
			@RecentlyNonNull final Locale newLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String[] getISOCountries() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Set<String> getISOCountries(@RecentlyNonNull final IsoCountryCode type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String[] getISOLanguages() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getLanguage() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getScript() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getCountry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getVariant() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasExtensions() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Locale stripExtensions() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getExtension(final char key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Set<Character> getExtensionKeys() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Set<String> getUnicodeLocaleAttributes() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getUnicodeLocaleType(@RecentlyNonNull final String key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Set<String> getUnicodeLocaleKeys() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toLanguageTag() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale forLanguageTag(@RecentlyNonNull final String languageTag) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getISO3Language() throws MissingResourceException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getISO3Country() throws MissingResourceException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayLanguage() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayLanguage(@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayScript() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayScript(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayCountry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayCountry(@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayVariant() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayVariant(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getDisplayName(@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static List<Locale> filter(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<Locale> locales, @RecentlyNonNull final FilteringMode mode) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static List<Locale> filter(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<Locale> locales) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static List<String> filterTags(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<String> tags, @RecentlyNonNull final FilteringMode mode) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static List<String> filterTags(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<String> tags) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Locale lookup(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<Locale> locales) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String lookupTag(@RecentlyNonNull final List<LanguageRange> priorityList,
			@RecentlyNonNull final Collection<String> tags) {
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

	public static final class Builder {
		public Builder() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setLocale(@RecentlyNonNull final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setLanguageTag(@RecentlyNonNull final String languageTag) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setLanguage(@RecentlyNullable final String language) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setScript(@RecentlyNullable final String script) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setRegion(@RecentlyNullable final String region) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setVariant(@RecentlyNullable final String variant) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setExtension(final char key, @RecentlyNullable final String value) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setUnicodeLocaleKeyword(@RecentlyNonNull final String key, @RecentlyNullable final String type) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder addUnicodeLocaleAttribute(@RecentlyNonNull final String attribute) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder removeUnicodeLocaleAttribute(@RecentlyNonNull final String attribute) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder clear() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder clearExtensions() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Locale build() {
			throw new RuntimeException("Stub!");
		}
	}

	public enum Category {
		DISPLAY, FORMAT;
	}

	public enum FilteringMode {
		AUTOSELECT_FILTERING, EXTENDED_FILTERING, IGNORE_EXTENDED_RANGES, MAP_EXTENDED_RANGES, REJECT_EXTENDED_RANGES;
	}

	public enum IsoCountryCode {
		PART1_ALPHA2, PART1_ALPHA3, PART3;
	}

	public static final class LanguageRange {
		public static final double MAX_WEIGHT = 1.0;
		public static final double MIN_WEIGHT = 0.0;

		public LanguageRange(@RecentlyNonNull final String range) {
			throw new RuntimeException("Stub!");
		}

		public LanguageRange(@RecentlyNonNull final String range, final double weight) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public String getRange() {
			throw new RuntimeException("Stub!");
		}

		public double getWeight() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static List<LanguageRange> parse(@RecentlyNonNull final String ranges) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static List<LanguageRange> parse(@RecentlyNonNull final String ranges,
				@RecentlyNonNull final Map<String, List<String>> map) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static List<LanguageRange> mapEquivalents(@RecentlyNonNull final List<LanguageRange> priorityList,
				@RecentlyNonNull final Map<String, List<String>> map) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int hashCode() {
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
	}
}
