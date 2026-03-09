package java.sql;

import java.util.Iterator;

public class SQLException extends Exception implements Iterable<Throwable> {
	public SQLException(final String reason, final String SQLState, final int vendorCode) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final String reason, final String SQLState) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final String reason) {
		throw new RuntimeException("Stub!");
	}

	public SQLException() {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final String reason, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final String reason, final String sqlState, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final String reason, final String sqlState, final int vendorCode, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public String getSQLState() {
		throw new RuntimeException("Stub!");
	}

	public int getErrorCode() {
		throw new RuntimeException("Stub!");
	}

	public SQLException getNextException() {
		throw new RuntimeException("Stub!");
	}

	public void setNextException(final SQLException ex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<Throwable> iterator() {
		throw new RuntimeException("Stub!");
	}
}
