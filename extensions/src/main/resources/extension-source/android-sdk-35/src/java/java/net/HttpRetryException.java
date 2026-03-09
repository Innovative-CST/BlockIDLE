package java.net;

import java.io.IOException;

public class HttpRetryException extends IOException {
	public HttpRetryException(final String detail, final int code) {
		throw new RuntimeException("Stub!");
	}

	public HttpRetryException(final String detail, final int code, final String location) {
		throw new RuntimeException("Stub!");
	}

	public int responseCode() {
		throw new RuntimeException("Stub!");
	}

	public String getReason() {
		throw new RuntimeException("Stub!");
	}

	public String getLocation() {
		throw new RuntimeException("Stub!");
	}
}
