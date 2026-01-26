package java.io;

public class InterruptedIOException extends IOException {
	public int bytesTransferred;

	public InterruptedIOException() {
		this.bytesTransferred = 0;
		throw new RuntimeException("Stub!");
	}

	public InterruptedIOException(final String s) {
		this.bytesTransferred = 0;
		throw new RuntimeException("Stub!");
	}
}
