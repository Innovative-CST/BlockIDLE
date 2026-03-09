package java.util;

import java.io.IOException;

public abstract class ResourceBundle {
	protected ResourceBundle parent;

	public ResourceBundle() {
		throw new RuntimeException("Stub!");
	}

	public String getBaseBundleName() {
		throw new RuntimeException("Stub!");
	}

	public final String getString(final String key) {
		throw new RuntimeException("Stub!");
	}

	public final String[] getStringArray(final String key) {
		throw new RuntimeException("Stub!");
	}

	public final Object getObject(final String key) {
		throw new RuntimeException("Stub!");
	}

	public Locale getLocale() {
		throw new RuntimeException("Stub!");
	}

	protected void setParent(final ResourceBundle parent) {
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(final String baseName) {
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(final String baseName, final Control control) {
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(final String baseName, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(final String baseName, final Locale targetLocale,
			final Control control) {
		throw new RuntimeException("Stub!");
	}

	public static ResourceBundle getBundle(final String baseName, final Locale locale, final ClassLoader loader) {
		throw new RuntimeException("Stub!");
	}

	public static ResourceBundle getBundle(final String baseName, final Locale targetLocale, final ClassLoader loader,
			final Control control) {
		throw new RuntimeException("Stub!");
	}

	public static final void clearCache() {
		throw new RuntimeException("Stub!");
	}

	public static final void clearCache(final ClassLoader loader) {
		throw new RuntimeException("Stub!");
	}

	protected abstract Object handleGetObject(final String p0);

	public abstract Enumeration<String> getKeys();

	public boolean containsKey(final String key) {
		throw new RuntimeException("Stub!");
	}

	public Set<String> keySet() {
		throw new RuntimeException("Stub!");
	}

	protected Set<String> handleKeySet() {
		throw new RuntimeException("Stub!");
	}

	public static class Control {
		public static final List<String> FORMAT_CLASS;
		public static final List<String> FORMAT_DEFAULT;
		public static final List<String> FORMAT_PROPERTIES;
		public static final long TTL_DONT_CACHE = -1L;
		public static final long TTL_NO_EXPIRATION_CONTROL = -2L;

		protected Control() {
			throw new RuntimeException("Stub!");
		}

		public static final Control getControl(final List<String> formats) {
			throw new RuntimeException("Stub!");
		}

		public static final Control getNoFallbackControl(final List<String> formats) {
			throw new RuntimeException("Stub!");
		}

		public List<String> getFormats(final String baseName) {
			throw new RuntimeException("Stub!");
		}

		public List<Locale> getCandidateLocales(final String baseName, final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		public Locale getFallbackLocale(final String baseName, final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		public ResourceBundle newBundle(final String baseName, final Locale locale, final String format,
				final ClassLoader loader, final boolean reload)
				throws IOException, IllegalAccessException, InstantiationException {
			throw new RuntimeException("Stub!");
		}

		public long getTimeToLive(final String baseName, final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		public boolean needsReload(final String baseName, final Locale locale, final String format,
				final ClassLoader loader, final ResourceBundle bundle, final long loadTime) {
			throw new RuntimeException("Stub!");
		}

		public String toBundleName(final String baseName, final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		public final String toResourceName(final String bundleName, final String suffix) {
			throw new RuntimeException("Stub!");
		}

		static {
			FORMAT_CLASS = null;
			FORMAT_DEFAULT = null;
			FORMAT_PROPERTIES = null;
		}
	}
}
