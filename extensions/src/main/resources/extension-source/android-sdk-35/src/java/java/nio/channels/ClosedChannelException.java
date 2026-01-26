package java.nio.channels;

import java.io.IOException;

public class ClosedChannelException extends IOException {
	public ClosedChannelException() {
		throw new RuntimeException("Stub!");
	}
}
