package java.time.chrono;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;

public interface Era extends TemporalAccessor, TemporalAdjuster {
	int getValue();

	default boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	default Temporal adjustInto(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	default String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}
}
