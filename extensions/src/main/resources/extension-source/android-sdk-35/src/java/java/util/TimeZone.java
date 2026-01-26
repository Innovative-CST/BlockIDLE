package java.util;

import java.io.Serializable;
import java.time.ZoneId;

public abstract class TimeZone implements Serializable, Cloneable {
	public static final int LONG = 1;
	public static final int SHORT = 0;

	public TimeZone() {
		throw new RuntimeException("Stub!");
	}

	public abstract int getOffset(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);

	public int getOffset(final long date) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setRawOffset(final int p0);

	public abstract int getRawOffset();

	public String getID() {
		throw new RuntimeException("Stub!");
	}

	public void setID(final String ID) {
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName() {
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName(final boolean daylight, final int style) {
		throw new RuntimeException("Stub!");
	}

	public String getDisplayName(final boolean daylightTime, final int style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public int getDSTSavings() {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean useDaylightTime();

	public boolean observesDaylightTime() {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean inDaylightTime(final Date p0);

	public static synchronized TimeZone getTimeZone(final String id) {
		throw new RuntimeException("Stub!");
	}

	public static TimeZone getTimeZone(final ZoneId zoneId) {
		throw new RuntimeException("Stub!");
	}

	public ZoneId toZoneId() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized String[] getAvailableIDs(final int rawOffset) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized String[] getAvailableIDs() {
		throw new RuntimeException("Stub!");
	}

	public static TimeZone getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(final TimeZone timeZone) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasSameRules(final TimeZone other) {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
