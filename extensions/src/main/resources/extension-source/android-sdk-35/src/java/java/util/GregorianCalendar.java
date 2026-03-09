package java.util;

import java.time.ZonedDateTime;

public class GregorianCalendar extends Calendar {
	public static final int AD = 1;
	public static final int BC = 0;

	public GregorianCalendar() {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final TimeZone zone) {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final TimeZone zone, final Locale aLocale) {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final int year, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final int year, final int month, final int dayOfMonth, final int hourOfDay,
			final int minute) {
		throw new RuntimeException("Stub!");
	}

	public GregorianCalendar(final int year, final int month, final int dayOfMonth, final int hourOfDay,
			final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public void setGregorianChange(final Date date) {
		throw new RuntimeException("Stub!");
	}

	public final Date getGregorianChange() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLeapYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getCalendarType() {
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
	public void add(final int field, final int amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void roll(final int field, final boolean up) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void roll(final int field, final int amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMinimum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMaximum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getGreatestMinimum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getLeastMaximum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getActualMinimum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getActualMaximum(final int field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public TimeZone getTimeZone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setTimeZone(final TimeZone zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isWeekDateSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getWeekYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setWeekDate(final int weekYear, final int weekOfYear, final int dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getWeeksInWeekYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void computeFields() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void computeTime() {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime toZonedDateTime() {
		throw new RuntimeException("Stub!");
	}

	public static GregorianCalendar from(final ZonedDateTime zdt) {
		throw new RuntimeException("Stub!");
	}
}
