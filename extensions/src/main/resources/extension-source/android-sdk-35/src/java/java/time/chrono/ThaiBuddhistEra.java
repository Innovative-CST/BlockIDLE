package java.time.chrono;

import java.time.format.TextStyle;
import java.util.Locale;

public enum ThaiBuddhistEra implements Era {
	BEFORE_BE, BE;

	public static ThaiBuddhistEra of(final int thaiBuddhistEra) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}
}
