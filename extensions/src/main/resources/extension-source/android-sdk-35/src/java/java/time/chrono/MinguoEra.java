package java.time.chrono;

import java.time.format.TextStyle;
import java.util.Locale;

public enum MinguoEra implements Era {
	BEFORE_ROC, ROC;

	public static MinguoEra of(final int minguoEra) {
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
