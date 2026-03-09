package java.util;

import java.io.Serializable;
import java.time.Instant;

public class Date implements Serializable, Cloneable, Comparable<Date> {
	public Date() {
		throw new RuntimeException("Stub!");
	}

	public Date(final long date) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Date(final int year, final int month, final int date) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Date(final int year, final int month, final int date, final int hrs, final int min) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Date(final int year, final int month, final int date, final int hrs, final int min, final int sec) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Date(final String s) {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static long UTC(final int year, final int month, final int date, final int hrs, final int min,
			final int sec) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static long parse(final String s) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getYear() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getMonth() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getDate() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setDate(final int date) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getDay() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getHours() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setHours(final int hours) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getMinutes() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setMinutes(final int minutes) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getSeconds() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setSeconds(final int seconds) {
		throw new RuntimeException("Stub!");
	}

	public long getTime() {
		throw new RuntimeException("Stub!");
	}

	public void setTime(final long time) {
		throw new RuntimeException("Stub!");
	}

	public boolean before(final Date when) {
		throw new RuntimeException("Stub!");
	}

	public boolean after(final Date when) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Date anotherDate) {
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

	@Deprecated
	public String toLocaleString() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public String toGMTString() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int getTimezoneOffset() {
		throw new RuntimeException("Stub!");
	}

	public static Date from(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public Instant toInstant() {
		throw new RuntimeException("Stub!");
	}
}
