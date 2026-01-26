package java.time.format;

import java.time.DateTimeException;

public class DateTimeParseException extends DateTimeException {
	public DateTimeParseException(final String message, final CharSequence parsedData, final int errorIndex) {
		super((String) null);
		throw new RuntimeException("Stub!");
	}

	public DateTimeParseException(final String message, final CharSequence parsedData, final int errorIndex,
			final Throwable cause) {
		super((String) null);
		throw new RuntimeException("Stub!");
	}

	public String getParsedString() {
		throw new RuntimeException("Stub!");
	}

	public int getErrorIndex() {
		throw new RuntimeException("Stub!");
	}
}
