package java.sql;

import java.util.Date;

public class Timestamp extends Date {
	@Deprecated
	public Timestamp(final int year, final int month, final int date, final int hour, final int minute,
			final int second, final int nano) {
		throw new RuntimeException("Stub!");
	}

	public Timestamp(final long time) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setTime(final long time) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getTime() {
		throw new RuntimeException("Stub!");
	}

	public static Timestamp valueOf(final String s) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public int getNanos() {
		throw new RuntimeException("Stub!");
	}

	public void setNanos(final int n) {
		throw new RuntimeException("Stub!");
	}

	public boolean equals(final Timestamp ts) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object ts) {
		throw new RuntimeException("Stub!");
	}

	public boolean before(final Timestamp ts) {
		throw new RuntimeException("Stub!");
	}

	public boolean after(final Timestamp ts) {
		throw new RuntimeException("Stub!");
	}

	public int compareTo(final Timestamp ts) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Date o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}
}
