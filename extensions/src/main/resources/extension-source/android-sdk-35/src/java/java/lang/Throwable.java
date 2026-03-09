package java.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Throwable implements Serializable {
	public Throwable() {
		throw new RuntimeException("Stub!");
	}

	public Throwable(@RecentlyNullable final String message) {
		throw new RuntimeException("Stub!");
	}

	public Throwable(@RecentlyNullable final String message, @RecentlyNullable final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public Throwable(@RecentlyNullable final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	protected Throwable(@RecentlyNullable final String message, @RecentlyNullable final Throwable cause,
			final boolean enableSuppression, final boolean writableStackTrace) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getLocalizedMessage() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public synchronized Throwable getCause() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized Throwable initCause(@RecentlyNullable final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public void printStackTrace() {
		throw new RuntimeException("Stub!");
	}

	public void printStackTrace(@RecentlyNonNull final PrintStream s) {
		throw new RuntimeException("Stub!");
	}

	public void printStackTrace(@RecentlyNonNull final PrintWriter s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized Throwable fillInStackTrace() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StackTraceElement[] getStackTrace() {
		throw new RuntimeException("Stub!");
	}

	public void setStackTrace(@RecentlyNonNull final StackTraceElement[] stackTrace) {
		throw new RuntimeException("Stub!");
	}

	public final synchronized void addSuppressed(@RecentlyNonNull final Throwable exception) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final synchronized Throwable[] getSuppressed() {
		throw new RuntimeException("Stub!");
	}
}
