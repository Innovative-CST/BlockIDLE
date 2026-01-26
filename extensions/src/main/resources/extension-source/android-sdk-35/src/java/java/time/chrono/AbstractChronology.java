package java.time.chrono;

import java.time.format.ResolverStyle;
import java.time.temporal.TemporalField;
import java.util.Map;

public abstract class AbstractChronology implements Chronology {
	protected AbstractChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoLocalDate resolveDate(final Map<TemporalField, Long> fieldValues, final ResolverStyle resolverStyle) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Chronology other) {
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
}
