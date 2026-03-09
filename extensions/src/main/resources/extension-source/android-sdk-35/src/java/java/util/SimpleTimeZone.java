package java.util;

public class SimpleTimeZone extends TimeZone {
	public static final int STANDARD_TIME = 1;
	public static final int UTC_TIME = 2;
	public static final int WALL_TIME = 0;

	public SimpleTimeZone(final int rawOffset, final String ID) {
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(final int rawOffset, final String ID, final int startMonth, final int startDay,
			final int startDayOfWeek, final int startTime, final int endMonth, final int endDay, final int endDayOfWeek,
			final int endTime) {
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(final int rawOffset, final String ID, final int startMonth, final int startDay,
			final int startDayOfWeek, final int startTime, final int endMonth, final int endDay, final int endDayOfWeek,
			final int endTime, final int dstSavings) {
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(final int rawOffset, final String ID, final int startMonth, final int startDay,
			final int startDayOfWeek, final int startTime, final int startTimeMode, final int endMonth,
			final int endDay, final int endDayOfWeek, final int endTime, final int endTimeMode, final int dstSavings) {
		throw new RuntimeException("Stub!");
	}

	public void setStartYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(final int startMonth, final int startDay, final int startDayOfWeek, final int startTime) {
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(final int startMonth, final int startDay, final int startTime) {
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(final int startMonth, final int startDay, final int startDayOfWeek, final int startTime,
			final boolean after) {
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(final int endMonth, final int endDay, final int endDayOfWeek, final int endTime) {
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(final int endMonth, final int endDay, final int endTime) {
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(final int endMonth, final int endDay, final int endDayOfWeek, final int endTime,
			final boolean after) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getOffset(final long date) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getOffset(final int era, final int year, final int month, final int day, final int dayOfWeek,
			final int millis) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getRawOffset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setRawOffset(final int offsetMillis) {
		throw new RuntimeException("Stub!");
	}

	public void setDSTSavings(final int millisSavedDuringDST) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getDSTSavings() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean useDaylightTime() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean observesDaylightTime() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean inDaylightTime(final Date date) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean hasSameRules(final TimeZone other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
