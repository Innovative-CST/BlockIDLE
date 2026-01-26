package java.nio.file;

public class FileSystemLoopException extends FileSystemException {
	public FileSystemLoopException(final String file) {
		super((String) null);
		throw new RuntimeException("Stub!");
	}
}
