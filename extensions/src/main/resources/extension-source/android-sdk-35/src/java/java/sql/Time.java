package java.sql;

import java.util.Date;

public class Time extends Date {
	@Deprecated
	public Time(final int hour, final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public Time(final long time) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setTime(final long time) {
		throw new RuntimeException("Stub!");
	}

	public static Time valueOf(final String s) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public int getYear() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public int getMonth() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public int getDay() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public int getDate() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public void setYear(final int i) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public void setMonth(final int i) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public void setDate(final int i) {
		throw new RuntimeException("Stub!");
	}
}
