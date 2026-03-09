package java.nio.file;

public final class StandardWatchEventKinds {
	public static final WatchEvent.Kind<Path> ENTRY_CREATE;
	public static final WatchEvent.Kind<Path> ENTRY_DELETE;
	public static final WatchEvent.Kind<Path> ENTRY_MODIFY;
	public static final WatchEvent.Kind<Object> OVERFLOW;

	StandardWatchEventKinds() {
		throw new RuntimeException("Stub!");
	}

	static {
		ENTRY_CREATE = null;
		ENTRY_DELETE = null;
		ENTRY_MODIFY = null;
		OVERFLOW = null;
	}
}
