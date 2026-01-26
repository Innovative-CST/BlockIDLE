package java.time;

import java.io.Serializable;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.time.zone.ZoneRules;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class ZoneId implements Serializable {
	public static final Map<String, String> SHORT_IDS;

	ZoneId() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneId systemDefault() {
		throw new RuntimeException("Stub!");
	}

	public static Set<String> getAvailableZoneIds() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneId of(final String zoneId, final Map<String, String> aliasMap) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneId of(final String zoneId) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneId ofOffset(final String prefix, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneId from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public abstract String getId();

	public String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public abstract ZoneRules getRules();

	public ZoneId normalized() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		SHORT_IDS = null;
	}
}
