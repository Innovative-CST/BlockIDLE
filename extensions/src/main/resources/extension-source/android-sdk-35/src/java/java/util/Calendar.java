package java.util;

import java.io.Serializable;
import java.time.Instant;

public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
	public static final int ALL_STYLES = 0;
	public static final int AM = 0;
	public static final int AM_PM = 9;
	public static final int APRIL = 3;
	public static final int AUGUST = 7;
	public static final int DATE = 5;
	public static final int DAY_OF_MONTH = 5;
	public static final int DAY_OF_WEEK = 7;
	public static final int DAY_OF_WEEK_IN_MONTH = 8;
	public static final int DAY_OF_YEAR = 6;
	public static final int DECEMBER = 11;
	public static final int DST_OFFSET = 16;
	public static final int ERA = 0;
	public static final int FEBRUARY = 1;
	public static final int FIELD_COUNT = 17;
	public static final int FRIDAY = 6;
	public static final int HOUR = 10;
	public static final int HOUR_OF_DAY = 11;
	public static final int JANUARY = 0;
	public static final int JULY = 6;
	public static final int JUNE = 5;
	public static final int LONG = 2;
	public static final int LONG_FORMAT = 2;
	public static final int LONG_STANDALONE = 32770;
	public static final int MARCH = 2;
	public static final int MAY = 4;
	public static final int MILLISECOND = 14;
	public static final int MINUTE = 12;
	public static final int MONDAY = 2;
	public static final int MONTH = 2;
	public static final int NARROW_FORMAT = 4;
	public static final int NARROW_STANDALONE = 32772;
	public static final int NOVEMBER = 10;
	public static final int OCTOBER = 9;
	public static final int PM = 1;
	public static final int SATURDAY = 7;
	public static final int SECOND = 13;
	public static final int SEPTEMBER = 8;
	public static final int SHORT = 1;
	public static final int SHORT_FORMAT = 1;
	public static final int SHORT_STANDALONE = 32769;
	public static final int SUNDAY = 1;
	public static final int THURSDAY = 5;
	public static final int TUESDAY = 3;
	public static final int UNDECIMBER = 12;
	public static final int WEDNESDAY = 4;
	public static final int WEEK_OF_MONTH = 4;
	public static final int WEEK_OF_YEAR = 3;
	public static final int YEAR = 1;
	public static final int ZONE_OFFSET = 15;
	protected boolean areFieldsSet;
	@RecentlyNonNull
	protected int[] fields;
	@RecentlyNonNull
	protected boolean[] isSet;
	protected boolean isTimeSet;
	protected long time;

	protected Calendar() {
		throw new RuntimeException("Stub!");
	}

	protected Calendar(@RecentlyNonNull final TimeZone zone, @RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Calendar getInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Calendar getInstance(@RecentlyNonNull final TimeZone zone) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Calendar getInstance(@RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Calendar getInstance(@RecentlyNonNull final TimeZone zone, @RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static synchronized Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void computeTime();

	protected abstract void computeFields();

	@RecentlyNonNull
	public final Date getTime() {
		throw new RuntimeException("Stub!");
	}

	public final void setTime(@RecentlyNonNull final Date date) {
		throw new RuntimeException("Stub!");
	}

	public long getTimeInMillis() {
		throw new RuntimeException("Stub!");
	}

	public void setTimeInMillis(final long millis) {
		throw new RuntimeException("Stub!");
	}

	public int get(final int field) {
		throw new RuntimeException("Stub!");
	}

	protected final int internalGet(final int field) {
		throw new RuntimeException("Stub!");
	}

	public void set(final int field, final int value) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int year, final int month, final int date) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int year, final int month, final int date, final int hourOfDay, final int minute) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int year, final int month, final int date, final int hourOfDay, final int minute,
			final int second) {
		throw new RuntimeException("Stub!");
	}

	public final void clear() {
		throw new RuntimeException("Stub!");
	}

	public final void clear(final int field) {
		throw new RuntimeException("Stub!");
	}

	public final boolean isSet(final int field) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getDisplayName(final int field, final int style, @RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Map<String, Integer> getDisplayNames(final int field, final int style,
			@RecentlyNonNull final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	protected void complete() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Set<String> getAvailableCalendarTypes() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getCalendarType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public boolean before(@RecentlyNullable final Object when) {
		throw new RuntimeException("Stub!");
	}

	public boolean after(@RecentlyNullable final Object when) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Calendar anotherCalendar) {
		throw new RuntimeException("Stub!");
	}

	public abstract void add(final int p0, final int p1);

	public abstract void roll(final int p0, final boolean p1);

	public void roll(final int field, final int amount) {
		throw new RuntimeException("Stub!");
	}

	public void setTimeZone(@RecentlyNonNull final TimeZone value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public TimeZone getTimeZone() {
		throw new RuntimeException("Stub!");
	}

	public void setLenient(final boolean lenient) {
		throw new RuntimeException("Stub!");
	}

	public boolean isLenient() {
		throw new RuntimeException("Stub!");
	}

	public void setFirstDayOfWeek(final int value) {
		throw new RuntimeException("Stub!");
	}

	public int getFirstDayOfWeek() {
		throw new RuntimeException("Stub!");
	}

	public void setMinimalDaysInFirstWeek(final int value) {
		throw new RuntimeException("Stub!");
	}

	public int getMinimalDaysInFirstWeek() {
		throw new RuntimeException("Stub!");
	}

	public boolean isWeekDateSupported() {
		throw new RuntimeException("Stub!");
	}

	public int getWeekYear() {
		throw new RuntimeException("Stub!");
	}

	public void setWeekDate(final int weekYear, final int weekOfYear, final int dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public int getWeeksInWeekYear() {
		throw new RuntimeException("Stub!");
	}

	public abstract int getMinimum(final int p0);

	public abstract int getMaximum(final int p0);

	public abstract int getGreatestMinimum(final int p0);

	public abstract int getLeastMaximum(final int p0);

	public int getActualMinimum(final int field) {
		throw new RuntimeException("Stub!");
	}

	public int getActualMaximum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final Instant toInstant() {
		throw new RuntimeException("Stub!");
	}

	public static class Builder {
		public Builder() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setInstant(final long instant) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setInstant(@RecentlyNonNull final Date instant) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder set(final int field, final int value) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setFields(@RecentlyNonNull final int... fieldValuePairs) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setDate(final int year, final int month, final int dayOfMonth) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setTimeOfDay(final int hourOfDay, final int minute, final int second) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setTimeOfDay(final int hourOfDay, final int minute, final int second, final int millis) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setWeekDate(final int weekYear, final int weekOfYear, final int dayOfWeek) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setTimeZone(@RecentlyNonNull final TimeZone zone) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setLenient(final boolean lenient) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setCalendarType(@RecentlyNonNull final String type) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setLocale(@RecentlyNonNull final Locale locale) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Builder setWeekDefinition(final int firstDayOfWeek, final int minimalDaysInFirstWeek) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public Calendar build() {
			throw new RuntimeException("Stub!");
		}
	}
}
