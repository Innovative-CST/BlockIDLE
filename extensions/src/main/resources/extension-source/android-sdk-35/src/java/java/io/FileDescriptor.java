package java.io;

public final class FileDescriptor {
	public static final FileDescriptor err;
	public static final FileDescriptor in;
	public static final FileDescriptor out;

	public FileDescriptor() {
		throw new RuntimeException("Stub!");
	}

	public boolean valid() {
		throw new RuntimeException("Stub!");
	}

	public native void sync() throws SyncFailedException;

	static {
		err = null;
		in = null;
		out = null;
	}
}
