package java.time.chrono;

import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.Locale;

public enum HijrahEra implements Era {
	AH;

	public static HijrahEra of(final int hijrahEra) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}
}
