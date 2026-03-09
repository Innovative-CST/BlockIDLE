package java.nio.file;

public class AtomicMoveNotSupportedException extends FileSystemException {
	public AtomicMoveNotSupportedException(final String source, final String target, final String reason) {
		super((String) null);
		throw new RuntimeException("Stub!");
	}
}
