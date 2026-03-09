package java.time;

import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.time.zone.ZoneRules;

public final class ZoneOffset extends ZoneId
		implements TemporalAccessor, TemporalAdjuster, Comparable<ZoneOffset>, Serializable {
	public static final ZoneOffset MAX;
	public static final ZoneOffset MIN;
	public static final ZoneOffset UTC;

	ZoneOffset() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset of(final String offsetId) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset ofHours(final int hours) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset ofHoursMinutes(final int hours, final int minutes) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset ofHoursMinutesSeconds(final int hours, final int minutes, final int seconds) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffset ofTotalSeconds(final int totalSeconds) {
		throw new RuntimeException("Stub!");
	}

	public int getTotalSeconds() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getId() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZoneRules getRules() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Temporal adjustInto(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final ZoneOffset other) {
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
		MAX = null;
		MIN = null;
		UTC = null;
	}
}
