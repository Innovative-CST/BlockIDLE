package java.net;

import java.io.InterruptedIOException;

public class SocketTimeoutException extends InterruptedIOException {
	public SocketTimeoutException(final String msg) {
		throw new RuntimeException("Stub!");
	}

	public SocketTimeoutException() {
		throw new RuntimeException("Stub!");
	}
}
