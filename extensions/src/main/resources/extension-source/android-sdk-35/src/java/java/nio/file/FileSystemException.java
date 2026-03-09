package java.nio.file;

import java.io.IOException;

public class FileSystemException extends IOException {
	public FileSystemException(final String file) {
		throw new RuntimeException("Stub!");
	}

	public FileSystemException(final String file, final String other, final String reason) {
		throw new RuntimeException("Stub!");
	}

	public String getFile() {
		throw new RuntimeException("Stub!");
	}

	public String getOtherFile() {
		throw new RuntimeException("Stub!");
	}

	public String getReason() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}
}
