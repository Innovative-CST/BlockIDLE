package java.time.chrono;

import java.io.Serializable;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.Locale;

public final class JapaneseEra implements Era, Serializable {
	public static final JapaneseEra HEISEI;
	public static final JapaneseEra MEIJI;
	public static final JapaneseEra REIWA;
	public static final JapaneseEra SHOWA;
	public static final JapaneseEra TAISHO;

	JapaneseEra() {
		throw new RuntimeException("Stub!");
	}

	public static JapaneseEra of(final int japaneseEra) {
		throw new RuntimeException("Stub!");
	}

	public static JapaneseEra valueOf(final String japaneseEra) {
		throw new RuntimeException("Stub!");
	}

	public static JapaneseEra[] values() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getDisplayName(final TextStyle style, final Locale locale) {
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
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		HEISEI = null;
		MEIJI = null;
		REIWA = null;
		SHOWA = null;
		TAISHO = null;
	}
}
