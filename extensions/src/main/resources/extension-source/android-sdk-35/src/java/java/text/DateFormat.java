package java.text;

import java.io.InvalidObjectException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateFormat extends Format {
	public static final int AM_PM_FIELD = 14;
	public static final int DATE_FIELD = 3;
	public static final int DAY_OF_WEEK_FIELD = 9;
	public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
	public static final int DAY_OF_YEAR_FIELD = 10;
	public static final int DEFAULT = 2;
	public static final int ERA_FIELD = 0;
	public static final int FULL = 0;
	public static final int HOUR0_FIELD = 16;
	public static final int HOUR1_FIELD = 15;
	public static final int HOUR_OF_DAY0_FIELD = 5;
	public static final int HOUR_OF_DAY1_FIELD = 4;
	public static final int LONG = 1;
	public static final int MEDIUM = 2;
	public static final int MILLISECOND_FIELD = 8;
	public static final int MINUTE_FIELD = 6;
	public static final int MONTH_FIELD = 2;
	public static final int SECOND_FIELD = 7;
	public static final int SHORT = 3;
	public static final int TIMEZONE_FIELD = 17;
	public static final int WEEK_OF_MONTH_FIELD = 13;
	public static final int WEEK_OF_YEAR_FIELD = 12;
	public static final int YEAR_FIELD = 1;
	@RecentlyNonNull
	protected Calendar calendar;
	@RecentlyNonNull
	protected NumberFormat numberFormat;

	protected DateFormat() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public final StringBuffer format(@RecentlyNonNull final Object obj, @RecentlyNonNull final StringBuffer toAppendTo,
			@RecentlyNonNull final FieldPosition fieldPosition) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract StringBuffer format(@RecentlyNonNull final Date p0, @RecentlyNonNull final StringBuffer p1,
			@RecentlyNonNull final FieldPosition p2);

	@RecentlyNonNull
	public final String format(@RecentlyNonNull final Date date) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Date parse(@RecentlyNonNull final String source) throws ParseException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public abstract Date parse(@RecentlyNonNull final String p0, @RecentlyNonNull final ParsePosition p1);

	@RecentlyNullable
	@Override
	public Object parseObject(@RecentlyNonNull final String source, @RecentlyNonNull final ParsePosition pos) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getTimeInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getTimeInstance(final int style) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getTimeInstance(final int style, @RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateInstance(final int style) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateInstance(final int style, @RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateTimeInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle,
			@RecentlyNonNull final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final DateFormat getInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}

	public void setCalendar(@RecentlyNonNull final Calendar newCalendar) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Calendar getCalendar() {
		throw new RuntimeException("Stub!");
	}

	public void setNumberFormat(@RecentlyNonNull final NumberFormat newNumberFormat) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public NumberFormat getNumberFormat() {
		throw new RuntimeException("Stub!");
	}

	public void setTimeZone(@RecentlyNonNull final TimeZone zone) {
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

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	public static class Field extends Format.Field {
		@RecentlyNonNull
		public static final Field AM_PM;
		@RecentlyNonNull
		public static final Field DAY_OF_MONTH;
		@RecentlyNonNull
		public static final Field DAY_OF_WEEK;
		@RecentlyNonNull
		public static final Field DAY_OF_WEEK_IN_MONTH;
		@RecentlyNonNull
		public static final Field DAY_OF_YEAR;
		@RecentlyNonNull
		public static final Field ERA;
		@RecentlyNonNull
		public static final Field HOUR0;
		@RecentlyNonNull
		public static final Field HOUR1;
		@RecentlyNonNull
		public static final Field HOUR_OF_DAY0;
		@RecentlyNonNull
		public static final Field HOUR_OF_DAY1;
		@RecentlyNonNull
		public static final Field MILLISECOND;
		@RecentlyNonNull
		public static final Field MINUTE;
		@RecentlyNonNull
		public static final Field MONTH;
		@RecentlyNonNull
		public static final Field SECOND;
		@RecentlyNonNull
		public static final Field TIME_ZONE;
		@RecentlyNonNull
		public static final Field WEEK_OF_MONTH;
		@RecentlyNonNull
		public static final Field WEEK_OF_YEAR;
		@RecentlyNonNull
		public static final Field YEAR;

		protected Field(@RecentlyNonNull final String name, final int calendarField) {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public static Field ofCalendarField(final int calendarField) {
			throw new RuntimeException("Stub!");
		}

		public int getCalendarField() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		protected Object readResolve() throws InvalidObjectException {
			throw new RuntimeException("Stub!");
		}

		static {
			AM_PM = null;
			DAY_OF_MONTH = null;
			DAY_OF_WEEK = null;
			DAY_OF_WEEK_IN_MONTH = null;
			DAY_OF_YEAR = null;
			ERA = null;
			HOUR0 = null;
			HOUR1 = null;
			HOUR_OF_DAY0 = null;
			HOUR_OF_DAY1 = null;
			MILLISECOND = null;
			MINUTE = null;
			MONTH = null;
			SECOND = null;
			TIME_ZONE = null;
			WEEK_OF_MONTH = null;
			WEEK_OF_YEAR = null;
			YEAR = null;
		}
	}
}
