package java.sql;

import java.util.Map;

public class SQLClientInfoException extends SQLException {
	public SQLClientInfoException() {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final Map<String, ClientInfoStatus> failedProperties) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final Map<String, ClientInfoStatus> failedProperties, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final Map<String, ClientInfoStatus> failedProperties) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final Map<String, ClientInfoStatus> failedProperties,
			final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final String SQLState,
			final Map<String, ClientInfoStatus> failedProperties) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final String SQLState,
			final Map<String, ClientInfoStatus> failedProperties, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final String SQLState, final int vendorCode,
			final Map<String, ClientInfoStatus> failedProperties) {
		throw new RuntimeException("Stub!");
	}

	public SQLClientInfoException(final String reason, final String SQLState, final int vendorCode,
			final Map<String, ClientInfoStatus> failedProperties, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public Map<String, ClientInfoStatus> getFailedProperties() {
		throw new RuntimeException("Stub!");
	}
}
